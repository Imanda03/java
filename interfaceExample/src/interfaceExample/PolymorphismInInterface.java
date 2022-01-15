package interfaceExample;
 
//example of polymorphism in interface 

	interface video{
		
		void in4k();
	
	}

	interface camera {
		
		void takingPhoto();
		
	}
	
	class SmartPhone implements camera,video{
		public void in4k() {
			System.out.println("4K video is playing....");
		}
		
		public void takingPhoto() {
			System.out.println("Taking photo....");
		}
		
	} 
	
	
public class PolymorphismInInterface {

	public static void main(String[] args) {
	
		video sp = new SmartPhone();
//		sp.takingPhoto(); --> not allowed.!
		
		sp.in4k();
	}

}
