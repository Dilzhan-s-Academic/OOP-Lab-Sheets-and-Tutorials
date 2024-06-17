
public class ex05 {
	public static void main(String arg[]) {
		int i = 0;
		while(i < 4) {
			int j = 0;
			while(j < 4) {
				System.out.print("* ");
				j++;
				}
			System.out.println("");
			i++;
		}

        System.out.println();
        
		int totalRows = 5;
        for (int x = 1; x <= totalRows; x++) {
            // Print leading spaces
            for (int space = 1; space <= totalRows - x; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
