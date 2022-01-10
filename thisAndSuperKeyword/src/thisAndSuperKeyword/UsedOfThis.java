package thisAndSuperKeyword;

public class UsedOfThis {
 int a;
	
	public int getA() {
	return a;
}

	UsedOfThis(int num){
		this.a = num;
	}

	public static void main(String[] args) {
		
		UsedOfThis cl = new UsedOfThis(65);
		System.out.println(cl.getA());

	}

}
