package core.task_4_1_7;

public class Solution_4_1_7 {

	public static void main(String[] args) {
			try {
				Solution_4_1_7 s = new Solution_4_1_7();
				s.testExp();
			} catch (MyNewException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
	}

	public  void testExp() throws MyNewException {
	  throw new MyNewException();
	}
	
	 class MyNewException extends Exception {

		}
	 }
