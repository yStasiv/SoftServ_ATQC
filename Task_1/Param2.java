package Task_1;

public class Param2 {
	private int count;
	private int q;
	
	public Param2(int count, int q) {
		this.count = count;
		this.q = q;
	}

	static int pascal(int i, int j) {
		   if(j == 0 || j == i) return  1;
		   else return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
		
		public int Piramida(){
			System.out.print("\nThe number of floors : " + this.count +"\n");
		    for (int i = 0; i <= this.count-1; i++) {
		        for (int j = 0; j <= i; j++) {
		            System.out.print(pascal(i, j) + " ");
		        }
		        System.out.println();
		    }int d=0;
		    if(this.q > this.count) {System.out.println("Number of row must be < then count");}
		    else{
		    for(int z=0;z<=this.q-1;++z) {
		    	d += (pascal(this.q-1,z));
		    }}
		    System.out.println("Sum " + (q) + " row = "+ d);
			return d;
		}
		public int getQ() {return q;}
}
