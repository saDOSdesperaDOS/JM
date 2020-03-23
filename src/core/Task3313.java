package core;

public class Task3313 {

	public static void main(String[] args) {
		// TODO Auto-generate method stub
		Robot robot = new Robot(7, 10, Direction.UP);
		moveRobot(robot, 3, 4);
	}
	
	public static void moveRobot(Robot robot, int toX, int toY) {
		
		int currentX = robot.getX();	 
		int currentY = robot.getY();	 
		Direction currentDirection = robot.getDirection();
		
		if(currentX < toX) {
			while(currentDirection != Direction.RIGHT) {
				robot.turnRight();
				
			}
			while(currentX != toX) {
				robot.stepForward();
				currentX++;
			}
		} else if(currentX > toX) {
			while(currentDirection != Direction.LEFT) {
				robot.turnLeft();
			}
			while(currentX != toX) {
				robot.stepForward();
				currentX--;
			}
		}
		
		
		
		if(currentY <= toY) {
			while(currentDirection != Direction.UP) {
				robot.turnRight();
			}
			while(currentY != toY) {
				robot.stepForward();
				currentX++;currentY++;
			}
		} else {
			while(currentDirection != Direction.DOWN) {
				robot.turnLeft();
			}
			while(currentY != toY) {
				robot.stepForward();
				currentY--;
			}
		}
		
		
	}
	
	public static class Robot {
		
		private int x,y;
		private Direction direction;
		
		public Robot(int x, int y, Direction direction) {
			this.x = x;
			this.y = y;
			this.direction = direction;
		}

	    public Direction getDirection() {
			return null;
	        // текущее направление взгляда
	    }

	    public int getX() {
			return 0;
	        // текущая координата X
	    }

	    public int getY() {
			return 0;
	        // текущая координата Y
	    }

	    public void turnLeft() {
	        // повернуться на 90 градусов против часовой стрелки
	    	 System.out.println("Поворот против часовой стрелки");
	         if (direction == Direction.DOWN){
	             this.direction = Direction.RIGHT;
	             return;
	         }

	         if (direction == Direction.UP){
	             this.direction = Direction.LEFT;
	             return;
	         }

	         if (direction == Direction.LEFT){
	             this.direction = Direction.DOWN;
	             return;
	         }

	         if (direction == Direction.RIGHT){
	             this.direction = Direction.UP;
	             return;
	         }
	    }

	    public void turnRight() {
	        // повернуться на 90 градусов по часовой стрелке
	    	 System.out.println("поворот по часовой стрелке");
	         if (this.direction == Direction.DOWN){
	             System.out.println("Вниз -> влево");
	             this.direction = Direction.LEFT;
	         }

	         else if (this.direction == Direction.UP){
	             System.out.println("Вверх -> вправо");
	             this.direction = Direction.RIGHT;
	         }

	         else if (this.direction == Direction.LEFT){
	             System.out.println("Влево -> вверх");
	             this.direction = Direction.UP;
	         }

	         else{
	             System.out.println("Вправо -> вниз");
	             this.direction = Direction.DOWN;
	         }
	    }

	    public void stepForward() {
	        // шаг в направлении взгляда
	        // за один шаг робот изменяет одну свою координату на единицу
	    	 System.out.println("движение");
	         if (direction == Direction.DOWN){
	             System.out.println("вниз");
	             this.y--;
	         }

	         if (direction == Direction.UP){
	             System.out.println("вверх");
	             this.y++;
	         }

	         if (direction == Direction.LEFT){
	             System.out.println("налево");
	             this.x--;
	         }

	         if (direction == Direction.RIGHT){
	             System.out.println("направо");
	             this.x++;
	         }
	     }
	    }

	
	public enum Direction {
	    UP,
	    DOWN,
	    LEFT,
	    RIGHT
	}
	}
