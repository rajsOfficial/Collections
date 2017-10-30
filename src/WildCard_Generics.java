import java.util.*;  
	

	abstract class WildCard_Generics{  
		abstract void draw();  
		}  
 class Rectangle extends WildCard_Generics{  
		
		void draw(){System.out.println("drawing rectangle");}  
	}  
	
	class Circle extends WildCard_Generics{  
		void draw(){System.out.println("drawing circle");}  
	}  
	  
	  
	class GenericTest{  
																				//creating a method that accepts only child class of wildcard_generics  
	public static void drawShapes(List<? extends WildCard_Generics> lists){  
	for(WildCard_Generics s:lists){  
	s.draw();																	//calling method of Shape class by child class instance  
	}  
	}  
	public static void main(String args[]){  
	List<Rectangle> list1=new ArrayList<Rectangle>();  
	list1.add(new Rectangle());  
	  
	List<Circle> list2=new ArrayList<Circle>();  
	list2.add(new Circle());  
	list2.add(new Circle());  
	  
	drawShapes(list1);  
	drawShapes(list2);  
	}}  