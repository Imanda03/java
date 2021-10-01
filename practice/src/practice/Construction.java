package practice;
// Example of construction and construction overloading
public class Construction {
	
	int age;
	String name;
	
	public Construction() {
		
		age = 20;
		name = "die";
		
	}
	public Construction(String name) {
		
		age = 12;
		name = "Anish";
		
	}
	public String getNamee() { return name;}
	public void setNamee(String n) { this.name = n;}
	public int getAgee() { return age;}
	public void setAgee(int i) { this.age = i;}

	public static void main(String[] args) {
		
		Construction cns = new Construction();
		
		System.out.println(cns.getNamee());
		System.out.println(cns.getAgee());

	}

}
