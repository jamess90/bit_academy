package example.main;

public class main07 {

	public static void main(String[] args) {
		Shape [] arr_shape = new Shape[5];
		
		arr_shape[0] = new Circle();   // 0번째 Shape = new Circle();
		arr_shape[1] = new Square(); // 1번째 Shape = new Square();
		arr_shape[2] = new Square(); 
		arr_shape[3] = new Circle();  
		arr_shape[4] = new Square(); 
		
		arr_shape[5] = new Square();
		
		for(Shape s : arr_shape){
			if(s instanceof Circle){
				Circle c = (Circle)s;
				System.out.println(c);
			}else{
				Square sq = (Square)s;
				System.out.println(sq);
			}
		}
		System.out.println();
		
		for(Shape s : arr_shape){
			System.out.println(s);
		}
		
		
	}
}

abstract class Shape{
	
}
class Circle extends Shape{
	@Override
	public String toString() {
		return "원 입니다.";
	}
}

class Square extends Shape{
	@Override
	public String toString() {
		return "사각형 입니다.";
	}
}
