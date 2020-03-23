package core;
/**
 * �������� ����� Human � ������ ������� (age), ��� (name), ������� (secondName) � 
 * ������� ��� ������ (favoriteSport).

�������� 3 ������������ � ������ Human, 1-�� - ������, 2-��, ������� ������������ Human�a 
�� ���� ����� � ������, ������� ������������ Human�a, �� ���� �����, ����� �������� ���� ������. 
��� ��������� ������������ ������� ����� ��������� ��������� � ������������� ������ � ��� �������, 
� ������� ��� �������� � ������ �������� (������� (age), ��� (name), ������� (secondName) � 
������� ��� ������ (favoriteSport))

� ������ main �������� 3 ���������� �������� ��������� 3 ���� ������ ������������. 
���� ������ ������ ����� �����������, �� ����������� �����������. 
����� ������ ���� �������� �����������, ����� main �� ������ ���������� � ������, 
���� ������ ������ ����� ������ ������ ������ ������

����������:
1. ������ ���� ����� public static void main(String[] args)
2. ������ ���� public static class Human
3. � ����� Human ������ ���� ����
4. ����� Human ������ ����� 3 ������������
5. � ������ main ����� ������� ��� ������� ������ Human ����� ���������

**/
public class Task3312 {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human((byte) 37, "Vasia", "Pupkin", "Box");
		Human h3 = new Human((byte)37, "Vasia", "Pupkin");
		
	}
	
	public static class Human {
		
		private byte age;
		private String name, secondName, favoriteSport;
		
		public Human() {
			super();
		}

		public Human(byte age, String name, String secondName, String favoriteSport) {
			super();
			this.age = age;
			this.name = name;
			this.secondName = secondName;
			this.favoriteSport = favoriteSport;
		}

		public Human(byte age, String name, String secondName) {
			super();
			this.age = age;
			this.name = name;
			this.secondName = secondName;
		}
		
		
		
		
	}
}
