
public class Ex3 {
	
	public static void reverseString(String s) {
		byte [] BityArray = s.getBytes();
		byte [] result = new byte [BityArray.length];
		
		for (int i = 0; i < BityArray.length; i++) {
			result[i]=BityArray[BityArray.length-i-1];
		}
		
		System.out.println(new String(result));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Geonas Brothers");
	}

}
