package core.task_4_2_7;


public class Main {
	
	public static void main(String[] args) {
	    
	    try(Car car = new Car()) {
	        car.drive();
	    }
        catch(Throwable e) {
            
        }
    }
    
    public static class Car implements AutoCloseable {

	    @Override
	    public void close() throws Exception {
		            System.out.println("Машина закрывается...");
	    }

	    void drive() {
            System.out.println("Машина поехала.");
        }
    	}
    }

