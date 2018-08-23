import java.util.Scanner;

public class Task1_178_g {
	public static void main(String args[]) {
		System.out.println("Дані натуральні числа n,A1,...,An. Визначити кількість членів Ak послідовності\nA1,...,An задовільняючих умову Ak<Ak-1+Ak+1/2");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number of members in the sequenceі : ");
        int n=scan.nextInt(); int count = 0;
        int[] arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int) (Math.random()*100);//тут я забиваю масив від 0 до 100
        }
        for(int k = 1; k<n-1; k++){
            if( arr[k] < (arr[k-1]+arr[k+1])/2 ){
                count++;
            }
        }
        System.out.println("К-ть членів ak = " + count);
        scan.close();
    }
}