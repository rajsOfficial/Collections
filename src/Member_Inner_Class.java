
class Member_Inner_Class{  
	 private int data=30;  
	protected class Inner{  
	  void msg(){System.out.println("data is "+data);}  		// Accessing private data of outer class
	  
	 }  
	 public static void main(String args[]){  
		 Member_Inner_Class obj=new Member_Inner_Class();  
		 Member_Inner_Class.Inner in=obj.new Inner();  				//Creating inner class object by outer class object
	  in.msg();  
	 }  
	}  