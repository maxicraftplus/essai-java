package cours;

public class Main {

	public static void main(String[] args) {
		int maison[][] = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,6,0,0,0,0,0,0,0},
			{0,0,0,0,0,4,5,2,0,0,0,0,0,0},
			{0,0,0,0,4,5,5,5,2,0,0,0,0,0},
			{0,0,0,4,5,5,5,5,5,2,0,0,0,0},
			{0,0,4,5,5,5,5,5,5,5,2,0,0,0},
			{0,4,5,5,5,5,5,5,5,5,5,2,0,0},
			{0,0,1,0,0,0,0,0,7,7,1,0,0,0},
			{0,0,1,0,0,0,0,0,7,7,1,0,0,0},
			{0,0,1,0,0,0,0,0,7,7,1,0,0,0},
			{0,0,1,0,0,3,3,0,7,7,1,0,0,0},
			{0,0,1,0,0,3,3,0,7,7,1,0,0,0},
			{0,0,1,0,0,3,3,0,7,7,1,0,0,0}
		};
		
		for (int[] row : maison ) {
			for (int column : row) {
				switch (column) {
					case 0: System.out.print(" "); break;
					case 1: System.out.print("||"); break;
					case 2: System.out.print("\\"); break;
					case 3: System.out.print("H"); break;
					case 4: System.out.print("/"); break;
					case 5: System.out.print("▄"); break;
					case 6: System.out.print("▲"); break;
					case 7: System.out.print(""); break;
				}
			}
			System.out.println("");
		}
		System.out.println("c'est une maison");
	}

}
