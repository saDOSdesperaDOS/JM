package core;

/**
 * �������� ����� Cat � ����� Dog. � ������ Cat ������ ���� ����� sayHello(), 
 * ������� ������� � ������� "���!", ���������� � �������, �� ������� "���!". 
 * ��� ��, � ������ ������ ���� ����� catchCat (������� �����), ������� ��������� ����� � 
 * ������ ������ ���������:
 
1) ������� � ������� ��������� "����� �������"
2) � ������, ������� ������� ����� ������ ���� ������ ����� sayHello()
3) � �����, ������� ������� ������ ������ ���� ������ ����� sayHello()
 
����������:
1. ������ ���� ����� public static class Cat 
2. ������ ���� ����� public static class Dog
3. ��� ������ ������ ���� public
4. ����� ������ �������� ����!�
5. ������ ������ �������� ����!�
6. ������ ������ ������ �����

**/

public class Task3311 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.catchCat(cat);
	}
	
	public static class Cat {
		
		public void sayHallo() {
			System.out.println("���!");
		}
	}
	
	public static class Dog {
		
		public void sayHallo() {
			System.out.println("���!");
		}
		
		public void catchCat(Cat cat) {
			System.out.println("����� �������");
			this.sayHallo();
			cat.sayHallo();
		}
		
	}

}
