package pattern1;

public class Pattern1 {

	public static void main(String[] args) {
		pattern8(4);
	}
	
	static void pattern1(int n) {
		for(int rows=1;rows<=n;rows++) {
			for(int cols=1;cols<=rows;cols++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int rows=1;rows<=n;rows++) {
			for(int cols=1;cols<=n;cols++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int rows=0;rows<=n;rows++) {
			for(int cols=n-rows;cols>=1;cols--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for(int rows=1;rows<=n;rows++) {
			for(int cols=1;cols<=rows;cols++) {
				System.out.print(cols+" ");
			}
		System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for(int rows=1;rows<=2*n;rows++) {
			if(rows<=n) {
			for(int cols=1;cols<=rows;cols++) {
				System.out.print("* ");
			}
			}
			else {
				for(int cols=2*n-rows;cols>=1;cols--) {
					System.out.print("*");
				}
			}
		System.out.println();
		}
	}
	
	//if else condition can be written as  line no 67
	
	static void pattern6(int n) {
		for(int rows=0;rows<2*n;rows++) {
			int totalColsInRow=rows>n?2*n-rows:rows;
			
			int noOfSpaces=n-totalColsInRow;
			
			for(int s=0;s<noOfSpaces;s++) {
				System.out.print(" ");
			}
		    
			for(int cols=0;cols<totalColsInRow;cols++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		
		}
	
	static void pattern7(int n) {
		for(int rows=1;rows<=n;rows++) {
			
			for(int space=0;space<n-rows+1;space++) {
				System.out.print("  ");
			}
			for(int cols=rows;cols>=1;cols--) {
				System.out.print(cols+" ");
			}
			for(int cols=2;cols<=rows;cols++) {
				System.out.print(cols+" ");
			}
		System.out.println();
		}
	}
	
	static void pattern8(int n) {
		int originalN=n;
		n=2*n-2;
		for(int rows=0;rows<=n;rows++) {
			for(int cols=0;cols<=n;cols++) {
				int atEveryIndex=originalN-Math.min(Math.min(rows, cols), Math.min(n-rows, n-cols));
				System.out.print(atEveryIndex+" ");
			}
		System.out.println();
		}
	}
	
	
}
