
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First I defined 2 vectors that has the values 5,4 for point1
		//and 6,7 for point2
		int[] point1 = new int[] {5,4};
		int[] point2 = new int[] {6,7};
		//I made the difference between x2-x1=x and y2-y1 = y
		int x = point2[0]-point1[0];
		int y = point2[1]-point1[1];
		
		float distance = distance2points(x, y);
		System.out.println("The distance between point1 and point2 is: "+distance);
		//Verify vector point1
		/*for (int i = 0; i < point1.length; i++) {
			System.out.println(point1[i]);
		}*/
		
		
		//float distanceBetween2Points = distance2points(a, b)
	}
	
	//the distance between 2 points is the radical of a^2+b^2
	
	public static float distance2points(int x, int y) {
		//I have applied the formula Square from a^2+b^2 and obtained the distance;
		float distance = (float) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		return distance;
	}
	
	

}
