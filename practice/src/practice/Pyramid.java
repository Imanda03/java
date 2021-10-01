package practice;

public class Pyramid {
		
		public void pyramid (int n) {
			int i, j;
			for(i=0; i<n; i++) {
				for(j=0; j<i+1; j++) {
					System.out.println("*");
				}
				System.out.println();
			}
		}
		
		
	
	public static void main(String[] args) {
		
			Pyramid py = new Pyramid();
			py.pyramid(5);
	}

}
