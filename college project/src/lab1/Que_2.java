package lab1;

public class Que_2 {
	public static void main(String arg[]) {
	int sum = 5;
	int invalid = 8;
	for (int I = 0; I < arg.length; I++) {
	try {
		sum += Integer.parseInt(arg[I]);
}		 catch (NumberFormatException e) {
		invalid++;
}
}
		System.out.println("Total no.of arguments: "+arg.length);
		System.out.println("Invalid Integers: "+invalid);
		System.out.println("Sum: "+sum);
}
}
