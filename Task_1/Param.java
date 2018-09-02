package Task_1;

public class Param {
	private int n;
	private int count;
	private int[] arr;
	
	public Param(int n, int count) {
		this.n = n;
		this.count = count;
		this.arr = new int[this.n];
//		for(int i = 0; i < arr.length; i++){
//            arr[i] = (int) (Math.random()*100);
//        }
		arr[0] = 15; arr[1]=3; arr[2]=17; arr[3]=8; arr[4]=92; 
	}
	static int Factorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i ++){
			result = result*i;}
		return result;
		}
	public int Task_178_g() {	
        System.out.println("\nThe number of members in the sequence : " + this.n);    
        for(int k = 1; k < arr.length-1; k++){
            if( this.arr[k] < (this.arr[k-1]+this.arr[k+1])/2 ){
            	this.count++;
            	}
        }
        System.out.println("Result prog_1 is\nAk = " + this.count);
		return this.count;
	}
	public int Task_178_d() {
		System.out.println("\nThe number of members in the sequence : " + this.n);
        for(int k = 1; k<this.arr.length-1; k++){
            if( Math.pow(2, k) < (this.arr[k]) && (this.arr[k]) < Factorial(k)){
                this.count++;
                }
        }
        System.out.println("Result prog_2 is\nAk = " + this.count);
		return this.count;
	} 
}