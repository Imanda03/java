package interfaceExample;

interface Bicycle {
	int a = 45;
	void applyBreak();
	void speedUp();
}
	
	interface BlowHorn{
		void horn();
		void horn2();
}
	
	class AvonCycle implements Bicycle, BlowHorn{
		public void applyBreak() {
			System.out.println("Applying break....");
		}
		public void speedUp() {
			System.out.println("Speed should be higher...");
		}
		
		public void horn() {
			System.out.println("Please blow a smooth horn..");
		}
		public void horn2() {
			System.out.println("Blow a louder horn");
		}
	

	public static void main(String[] args) {
		AvonCycle av = new AvonCycle();
		av.applyBreak();
		av.speedUp();
		av.horn();
		av.horn2();
		
//		av.a= 445; 						// We cannot modifies the value after giving the final value

	}

}
