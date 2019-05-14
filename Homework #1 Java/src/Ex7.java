
public class Ex7 {

	public static void palindromeNumber(int n) {
		int remainder=0;
		int reverse=0;
		int sum=0;
		for (int i = 0; i < n; i++) {
			if(i>0 && i<10)
				System.out.println("Palindrom number "+i);
			if(i>10 && i%10==i/10 && i<100)
				System.out.println("Palindrom number "+i);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeNumber(200);
	}

}
