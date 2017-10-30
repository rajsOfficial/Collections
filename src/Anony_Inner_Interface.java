
interface Eatable{  
	 void eat();  
	}  
	class Anony_Inner_Interface{  
	 public static void main(String args[]){  
	 Eatable e=new Eatable(){  
	  public void eat(){System.out.println("nice fruits");}  // New class is created by javacompiler which implements Eatable interface
	 };  
	 e.eat();  
	 }  
	}  