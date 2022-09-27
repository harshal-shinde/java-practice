package dynamic.programming.memoization;

public class Fibbonacci {
	final int MAX = 100;
	final int  NIL = -1;
	
	int lookup[] = new int[MAX];
	
	//Function to initialize NIL values in lookup table
	void _initialize(){
		for(int i=0; i < MAX; i++){
			lookup[i] = NIL;
		}
	}
	
	int fibo(int n) {
		if(lookup[n] == NIL) {
			if(n <=1) {
				lookup[n] =n;
			} else {
				lookup[n] = fibo(n-1)+fibo(n-2);
			}
		}
		return lookup[n];
	}
	
	public static void main(String[] args) {
		Fibbonacci f = new Fibbonacci();
		int n = 40;
		f._initialize();
		System.out.println("Fibbonacci number is " + " "+f.fibo(n));
	}

}
