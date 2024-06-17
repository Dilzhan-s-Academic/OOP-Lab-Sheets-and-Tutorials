
public class ex06 {
	public static void main(String arg[]) {
		int i = 0;
		while(i <= 4) {
			int j = 0;
			while(j <= 4) {
				System.out.print("* ");
				j++;
				}

	        System.out.print("   ");
	        
			int totalRows = 5;
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= i; y++) {
                System.out.print("* ");
            }
	        
			System.out.println("");
			i++;
		}

        
		
	}
}
