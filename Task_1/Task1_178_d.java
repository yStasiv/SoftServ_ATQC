import java.util.Random;
import java.util.Scanner;

public class Task1_178_d {
	static int Factorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i ++){
			result = result*i;}
		return result;
		}	
	public static void main(String args[]) {
		System.out.println("Дані натуральні числа n,A1,...,An. Визначити кількість членів Ak послідовності\nA1,...,An задовільняючих умову Ak<Ak-1+Ak+1/2");
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("\nEnter the number of members in the sequence : ");
        int n=scan.nextInt(); int count = 0;
        int[] arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(100);
          //  System.out.println(rand.nextInt(100));
        }
        for(int k = 1; k<n-1; k++){
            if( Math.pow(2, k) < (arr[k]) && (arr[k]) < Factorial(k)){
                count++;
              //  System.out.println(count);
             //   System.out.println(k);
                }
        }
        System.out.println("К-ть членів ak = " + count);
        scan.close();
    }
}
