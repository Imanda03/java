package practice;


public class SumOfNaturalNum {
	public int add() {
		int n=1, sum = 0;
		while(n < 51) {
			sum = sum + n;
			n++;
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfNaturalNum nn = new SumOfNaturalNum();
		System.out.println("The sum is "+nn.add());
	}

	}
	


