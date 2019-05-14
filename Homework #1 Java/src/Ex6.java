
public class Ex6 {

	public static void returnMultiplesOfThree(int n) {
		for (int i = 1; i <= n; i++) {
			if(i%3==0)
				System.out.println("Fizz"+" "+i);
			else if(i%5==0)
				System.out.println("Buzz"+" "+i);
			if (i%3==0 && i%5==0)
				System.out.println("Fizz and Buzz"+" "+i);
			else
				System.out.println("Nothing to see");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnMultiplesOfThree(100);
	}

}
