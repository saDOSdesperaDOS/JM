package core.task_4_2_7;


public class Main {
	static RobotConnectionManager robotCM;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moveRobot(robotCM, 10, 12);

	}
	
	public class RobotConnectionManagerImpl implements RobotConnectionManager {

		@Override
		public RobotConnection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}
		
	} 
	
	public interface RobotConnection extends AutoCloseable {
	    void moveRobotTo(int x, int y);
	    @Override
	    void close();
	}
	
	public interface RobotConnectionManager {
	    RobotConnection getConnection();
	}
	
	public class RobotConnectionException extends RuntimeException {

	    public RobotConnectionException(String message) {
	        super(message);

	    }

	    public RobotConnectionException(String message, Throwable cause) {
	        super(message, cause);
	    }
	}
	
	/**
	 * При этом:

		- Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить метод RobotConnection.moveRobotTo() без исключений.
		  Ошибка закрытия соединения не важна и должна игнорироваться.
		
		- Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем вторую попытку. 
		  Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен бросить исключение RobotConnectionException.
		  
		- Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно должно быть закрыто несмотря на возможные исключения, 
		  случившиеся в дальнейшем во время работы метода.
		  
		- Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException, метод должен завершиться и выбросить это исключение, 
		  не выполняя повторных попыток пообщаться с роботом. Единственное, что метод должен сделать перед выбросом этого исключения — закрыть открытое 
		  соединение RobotConnection.
 */
	
	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
	    //Твой код здесь
		int count = 0;
			
			try(RobotConnection rConn = robotConnectionManager.getConnection()) {
				rConn.moveRobotTo(toX, toY);
				count++;
				
			}
			
	
	   if(count == 3) {
		throw new RobotConnectionException("Estabilish connection failed.");
	}
	}
}

