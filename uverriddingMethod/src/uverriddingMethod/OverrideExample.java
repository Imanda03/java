package uverriddingMethod;

public class OverrideExample {
	void zooFirst() {
		System.out.println("I am animal of first zoo");
	}
}
	class Exmple extends OverrideExample{
		@Override
		void zooFirst() {
			System.out.println("I am animal of second zoo");
		}
		
		void zooSecond() {
			System.out.println("I am animal of second zoo");
		}

	public static void main(String[] args) {
		OverrideExample ex = new OverrideExample();
		ex.zooFirst();
		Exmple em = new Exmple();
		em.zooFirst();

	}

}
