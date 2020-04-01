package core.task_4_1_8;

public class Test {

	public static void main(String[] args) {
		 System.out.println(getCallerClassAndMethodName());
	     anotherMethod();
	}
	
	 private static void anotherMethod() {
	        System.out.println(getCallerClassAndMethodName());
	    }
	 
	 public static String getCallerClassAndMethodName() {
	        // ...
		 return null;
	    }

}
