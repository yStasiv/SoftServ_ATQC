import java.util.Scanner;

public class Task1_555 {

		public static int pascal(int i, int j) {
		   if(j == 0 || j == i) return  1;
		   else return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number of floors : ");
			int count = scan.nextInt()-1;
		    for (int i = 0; i <= count; i++) {
		        for (int j = 0; j <= i; j++) {
		            System.out.print(pascal(i, j) + " ");
		        }
		        System.out.println();
		    }
		    scan.close();

		}
		
}
