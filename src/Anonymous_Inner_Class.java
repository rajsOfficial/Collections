
abstract class Person{  
	  abstract void eat();  
	}  
	class Anonymous_Inner_Class{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
	  void eat(){System.out.println("nice fruits");}  	// New class is created by javacompiler which extends person class
	  };  
	  p.eat();  
	 }  
	} 
	