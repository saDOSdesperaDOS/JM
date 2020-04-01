package core.task_4_1_7;

class MyNewException extends Exception {

	String message;
	
	public MyNewException(String message) {
		this.message = message;
		System.out.println("Greated instance myNewException");
	}
	
	public void myNewExceptionMessage() {
		System.out.println("Exception message of MyNewException");
	}

}
