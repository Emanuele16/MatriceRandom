package matriceRandom;
import java.io.*;

public class MatriceRandom {
	private int[][] matrice; 
	private int valoreMat; 
	private int scambio;
	
	public MatriceRandom() {
		matrice = new int [4][4];
		valoreMat = setValoreMat();
		
	}
	
	private int setValoreMat() {
		return (int) (Math.random()*30)+1;
		
	}
	
	
	public void setSomma() {		
		for(int i = 0; i<matrice.length; ++i) {
			for(int j = 0; j<matrice.length; ++j) {
				verify();
				matrice[i][j]= valoreMat*2;
				valoreMat = setValoreMat();
				
			}
		}
	}
	
	private void verify() {
		while(valoreMat*2<20) {
			valoreMat = (int) (Math.random()*30)+1;
			
		}
		
	}
	
	public void getSomma() {
		for(int i = 0; i<matrice.length; ++i) {
			for(int j = 0; j<matrice.length; ++j) {
				System.out.print("|");
				System.out.print(matrice[i][j]);
			}
			
			System.out.println("|");	
			
		}
		
	}
	
	public void setMovRight() {
		for(int i = 0; i<matrice.length; ++i) {
			for(int j = 3; j>=matrice.length-3;--j) {
				scambio = matrice[i][j];
				matrice[i][j] = matrice[i][j-1];
				matrice[i][j-1] = scambio;
				
				
				
			}
			
			
		}
			
	}
	
	public void setMovDown() {
		for(int i = 3; i>=matrice.length-3; --i) {
			for(int j = 0; j<matrice.length;++j) {
				scambio = matrice[i][j];
				matrice[i][j] = matrice[i-1][j];
				matrice[i-1][j] = scambio;
				
				
				
			}
			
			
		}
			
	}
	
	public void setMovLeft() {
		for(int i = 0; i<matrice.length; ++i) {
			for(int j = 0; j<=matrice.length-2;++j) {
				scambio = matrice[i][j];
				matrice[i][j] = matrice[i][j+1];
				matrice[i][j+1] = scambio;
				
				
				
			}
			
			
		}
			
	}
	
	public void setMovUp() {
		for(int i = 0; i<=matrice.length-2; ++i) {
			for(int j = 0; j<matrice.length;++j) {
				scambio = matrice[i][j];
				matrice[i][j] = matrice[i+1][j];
				matrice[i+1][j] = scambio;
				
				
			}
			
		}
			
	}
	
	public void salva(String path) {
		try {
			File fp = new File(path+"/matrice.txt");
			FileWriter fw = new FileWriter(fp);
			BufferedWriter fb = new BufferedWriter(fw);
			for(int i = 0; i<matrice.length; ++i) {
				for(int j = 0; j<matrice.length;++j) {
					fb.write("|");
					fb.write(Integer.toString(matrice[i][j]));
				}
				
				fb.write("|\n");

			}
				fb.close();
		}
		
		catch(IOException e1){
			return;
			
		}
	}
	
}