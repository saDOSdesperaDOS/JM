
public class MainTest {
 
	public static void main(String[] args) {
		 StackTraceElement[] strElements = Thread.currentThread().getStackTrace();
		 System.out.println(strElements.length);
		 for (StackTraceElement stackTraceElement : strElements) {
			System.out.println(stackTraceElement);
			System.out.println("внизу stacktraceel.getclass");
			System.out.println(stackTraceElement.getClassName());
			System.out.println("один элемент");
		}
	}
}