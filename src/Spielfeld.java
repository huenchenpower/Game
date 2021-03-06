public class Spielfeld {
	public int[] hintergrund_Farbe = {0,0,0};
	public int[] farbe_Punkte = {255,255,255};
	public int[] farbe_Waende = {24,30,182};
	public int[] farbe_Geister_Waende = {182,30,24};
	public int[] farbe_Kirsche = {255,0,0};
	public int raster_Groesse = 30;
	

	//Spielfeld1 	
	// 0 = leeres Feld; 1 = Wand; 2 = Punkt; 3 = Rote Linie; 4 = Warpfeld 5 = Kirsche
	protected static int[][] spielfeld = {
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,1,1,2,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,2,2,5,2,2,2,2,2,1,2,1,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,1,1,1,1,1,1,2,1,2,1,2,1,1,2,1,2,1,1,1,1,2,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,5,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,2,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,2,1},
			       {1,2,1,2,1,1,2,1,2,1,2,2,2,2,2,2,2,2,2,1,1,2,1,2,2,2,2,2,2,2,1},
			       {1,2,1,2,2,2,2,1,2,2,2,2,1,1,3,3,1,1,2,2,2,2,1,2,1,1,1,2,1,2,1},
			       {1,2,1,2,1,1,2,1,2,1,1,2,1,0,0,0,0,1,2,1,1,2,1,2,1,1,1,2,1,2,1},
			       {1,2,1,2,2,2,2,1,2,1,1,2,1,1,1,1,1,1,2,1,1,2,1,2,2,2,2,2,2,2,1},
			       {1,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,1},
			       {1,2,2,2,2,2,2,2,1,2,1,1,1,1,1,1,2,2,2,2,2,2,2,1,1,1,1,1,1,2,1},
			       {1,2,1,1,1,1,1,1,1,2,2,2,2,2,1,1,2,1,1,1,1,1,2,2,5,1,2,2,2,2,1},
			       {1,2,2,2,5,2,2,2,2,2,1,1,1,2,1,1,2,1,1,1,1,1,2,1,2,1,2,1,1,1,1},
			       {1,2,1,1,2,1,2,1,1,2,2,2,2,2,2,2,2,1,1,2,2,2,2,1,2,2,2,2,2,2,1},
			       {1,2,1,1,2,1,2,1,1,2,1,1,1,2,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,1,1,2,1,2,1,1,2,1,1,1,2,2,2,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1},
			       {1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},
			       {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			       {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	}; 
// Spielfeld 2	
	protected static int[][] spielfeld2 = {
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,1,1,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,1},
					{1,2,1,2,1,1,2,1,2,1,2,1,1,1,1,2,1,1,2,1,1,1,1,2,1,2,1,2,1,1,2,1,2,1},
					{1,2,2,2,2,1,2,2,2,1,2,2,2,2,1,2,1,1,2,1,2,2,2,2,1,2,2,2,1,2,2,2,2,1},
					{1,1,1,1,2,1,1,1,2,1,1,1,1,2,1,2,2,2,2,1,2,1,1,1,1,2,1,1,1,2,1,1,1,1},
					{1,2,2,2,2,1,2,2,2,2,2,1,2,2,1,2,1,1,2,1,2,2,1,2,2,2,2,2,1,2,2,2,2,1},
					{1,2,1,1,1,1,2,1,2,1,2,1,2,2,2,2,2,2,2,2,2,2,1,2,1,2,1,2,1,1,1,1,2,1},
					{1,2,2,2,2,1,2,2,2,1,2,1,2,1,2,1,1,1,1,2,1,2,1,2,1,2,2,2,1,2,2,2,2,1},
					{1,2,1,1,2,1,2,1,2,1,2,2,2,1,2,2,2,2,2,2,1,2,2,2,1,2,1,2,1,2,1,1,2,1},
					{1,2,2,2,2,2,2,2,2,1,1,1,2,1,1,1,1,1,1,1,1,2,1,1,1,2,2,2,2,2,2,2,2,1},
					{1,1,1,1,1,2,1,1,2,2,2,1,2,2,2,2,2,2,2,2,2,2,1,2,2,2,1,1,2,1,1,1,1,1},
					{1,1,1,2,2,2,1,1,1,1,2,1,1,1,1,2,1,1,2,1,1,1,1,2,1,1,1,1,2,2,2,1,1,1},
					{4,2,1,2,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,2,1,2,4},
					{1,2,1,2,2,2,1,2,1,1,1,1,1,2,1,1,3,3,1,1,2,1,1,1,1,1,2,1,2,2,2,1,2,1},
					{1,2,1,2,1,2,2,2,2,2,2,2,1,2,1,2,2,2,2,1,2,1,2,2,2,2,2,2,2,1,2,1,2,1},
					{1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,1,1,1,1,1,2,1,2,1,2,1,1,1,2,1,2,1,2,1},
					{1,2,2,2,1,2,1,1,1,2,1,2,1,2,2,2,2,2,2,2,2,1,2,1,2,1,1,1,2,1,2,2,2,1},
					{1,1,1,2,1,2,2,2,2,2,2,2,1,2,1,1,1,1,1,1,2,1,2,2,2,2,2,2,2,1,2,1,1,1},
					{1,1,1,2,1,2,1,2,1,1,1,1,1,2,2,2,2,2,2,2,2,1,1,1,1,1,2,1,2,1,2,1,1,1},
					{1,2,2,2,1,2,2,2,2,2,2,2,2,2,1,2,1,1,2,1,2,2,2,2,2,2,2,2,2,1,2,2,2,1},
					{1,2,1,2,1,2,1,1,1,1,2,1,2,1,1,2,1,1,2,1,1,2,1,2,1,1,1,1,2,1,2,1,2,1},
					{1,2,1,2,2,2,1,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,1,2,2,2,1,2,1},
					{1,2,1,1,1,1,1,2,1,2,1,1,1,2,1,1,1,1,1,1,2,1,1,1,2,1,2,1,1,1,1,1,2,1},
					{1,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
					
	};
// Spielfeld 3 
/*	protected static int[][] spielfeld3 = {
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,1,1,2,2,2,2,1},
					{1,2,1,1,2,1,1,2,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,2,1,1,2,1,1,2,1},
					{1,2,2,2,2,2,2,2,1,1,2,2,2,2,1,2,2,2,2,2,2,2,1,2,2,2,2,1,1,2,2,2,2,2,2,2,1},
					{1,1,1,1,1,2,1,1,1,1,2,1,1,2,1,2,1,1,1,1,1,2,1,2,2,2,2,1,1,1,1,2,1,1,1,1,1},
					{4,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,1,1,1,1,1,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,4},						{1,2,1,1,2,1,1,2,1,1,2,2,2,2,1,1,1,2,2,2,1,1,1,2,2,2,2,1,1,2,1,1,2,1,1,2,1},
					{1,2,1,1,2,2,2,2,1,1,2,1,1,2,2,2,2,2,1,2,2,2,2,2,1,1,2,1,1,2,2,2,2,1,1,2,1},
					{1,2,2,2,2,1,1,2,2,2,2,2,2,2,1,1,1,2,2,2,1,1,1,2,2,2,2,2,2,2,1,1,2,2,2,2,1},
					{1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,2,2,2,1,2,2,2,1,1,1,2,1,2,1,1,1,1,2,1,2,1,1},						{1,1,2,1,2,2,2,2,1,1,2,2,2,1,1,2,1,2,2,2,1,2,2,2,2,2,1,2,2,2,2,2,2,1,2,1,1},
					{1,2,2,1,1,2,1,2,2,2,2,1,2,1,1,2,1,2,2,2,2,2,2,1,1,2,1,1,1,1,1,1,1,2,2,2,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,2,2,2,1,1,1,1,1,1,1,1,1,1,1,2,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1,2,2,2,1,2,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,2,1,2,2,2,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,2,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1,1,2,2,2,1,1,1,1,1,1,2,2,2,1,1,1},
					{4,1,1,1,1,1,1,1,1,1,1,1,2,2,2,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,4},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},						{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
					{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}

						
		};	*/
	
	
	public int punkte_zaehlen(int[][] spielfeld) {
		
		int anzahl_punkte = 0;
		
		 for(int zeilen = 0; zeilen < spielfeld.length; zeilen++) {
		 
			for(int spalten = 0; spalten < spielfeld[zeilen].length; spalten++) {
				
				if(spielfeld[zeilen][spalten] == 2) {
				
					anzahl_punkte++;
				}
			}
		}
		
		return anzahl_punkte;
	}
	
	public int kirschen_zaehlen(int[][] spielfeld) {
		int anzahl_kirschen = 0;
		
		 for(int zeilen = 0; zeilen < spielfeld.length; zeilen++) {
		 
			for(int spalten = 0; spalten < spielfeld[zeilen].length; spalten++) {
				
				if(spielfeld[zeilen][spalten] == 5) {
				
					anzahl_kirschen++;
					
				}
			}
		 }
		 return anzahl_kirschen;
	}
	
				
	// Getter Methoden unnötig wenn Variablen eh public sind
	public int[] get_Hintergrundfarbe() {return hintergrund_Farbe;}
	public int[] get_farbe_Punkte() {return farbe_Punkte;}
	public int[] get_farbe_Waende() {return farbe_Waende;}
	public int[] get_farbe_Geister_Waende() {return farbe_Geister_Waende;}
	public int[] get_farbe_Kirsche() {return farbe_Kirsche;}
}
