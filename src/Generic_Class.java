public class Generic_Class<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }

	   public static void main(String[] args) {
	      Generic_Class<Integer> integerBox = new Generic_Class<Integer>();
	      Generic_Class<String> stringBox = new Generic_Class<String>();
	    
	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));

	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	   }
	}