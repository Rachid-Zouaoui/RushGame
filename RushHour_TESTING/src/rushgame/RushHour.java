package rushgame;

public class RushHour {
	public int[][] griglia = new int[6][6];
	
	public RushHour() {
		griglia[2][2] = 1;
		griglia[4][1] = 5;
		griglia[0][3] = 6;
		griglia[1][5] = 2;
		griglia[2][5] = 3;
		griglia[3][5] = 4;
	}
	
	/**
	 * Metodo per muovere una macchina sulla griglia.
	 * @param row = riga
	 * @param col = colonna
	 * @param dir = 1)alto, 2)destra, 3) basso, 4)sinistra
	 * @return
	 */
	
	public boolean moveCar(int row, int col, int dir) {
		
		if (row > 5 || row < 0 || col > 5 || col < 0 || griglia[row][col] == 0 ) return false;
		
		switch(dir){
			//Caso in cui spostiamo la macchina in avanti.
			case 1:
				//nuova posizione occupata o limite di matrice sopra
				if(row == 0 || griglia[row-1][col] != 0) return false;
				griglia[row-1][col] = griglia[row][col];
				griglia[row][col] = 0;
				return true;
			
			case 2:
				//nuova posizione occupato o limite matrice destra
				if(col == 5 || griglia[row][col+1] != 0 ) return false;
				griglia[row][col+1] = griglia[row][col];
				griglia[row][col] = 0;
				return true;
				
			case 3:
				//nuova posizione occupata o limite matrice sotto.
				if( row == 5 || griglia[row+1][col] != 0 ) return false;
				griglia[row+1][col] = griglia[row][col];
				griglia[row][col] = 0;
				return true;
				
			case 4:
				//nuova posizione occupata o limite matrice sinistra
				if( col == 0 || griglia[row][col-1] != 0 ) return false;
				griglia[row][col-1] = griglia[row][col];
				griglia[row][col] = 0;
				return true;
				
			default: return false; //caso in cui dir > 4
					
		}		
	}
	
	public boolean redCarAtExit(){
		
		if(griglia[2][5]==1)return true;
		return false;
	}
	
	
	/*
	public void stampaGriglia() {
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				System.out.print(griglia[i][j] + " | ");
			}
		System.out.println();
		}
	}

public static void main(String[] args) {
	RushHour rh = new RushHour();
	if(!rh.moveCar(0, 3, 7)) System.out.println("ERRORE COGLIONE");
	rh.stampaGriglia();
} */

}

