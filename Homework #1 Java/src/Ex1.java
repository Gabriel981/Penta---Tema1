
public class Ex1 {
	
	public static int areaRectangle(int L, int l) {
		int area = L*l;
		return area;
	}
	
	public static int areaHexagon(int s) {
		int area = (int) ((3*Math.sqrt(3)/2)*Math.pow(s,2));
		return area;
	}
	
	public static int perimeterRectangle(int w, int l ) {
		int perimeter = 2*(w+l);
		return perimeter;
	}
	
	public static int perimeterHexagon(int l) {
		int perimeter = 6*l;
		return perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area_rectangle = areaRectangle(6, 7);
		System.out.println("The area of the rectangle is: "+ area_rectangle+"\n");
		
		int area_hexagon = areaHexagon(6);
		System.out.println("The area of the hexagon is: "+area_hexagon+"\n");
		
		int perimeter_rectangle = perimeterRectangle(6, 7);
		System.out.println("The perimeter of the rectangle is: "+perimeter_rectangle+"\n");
		
		int perimeter_hexagon = perimeterHexagon(6);
		System.out.println("The perimeter of the hexagon is: "+perimeter_hexagon);
	}

}
