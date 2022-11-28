package java_ex01;

public class InsteadOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pw = new Children();
		
		System.out.println(pw instanceof Parent); // 부모클래스는 자식클래스를 포함한다. 
		System.out.println(pw instanceof Children); //
	}

}

class Children extends Parent{
	
}

class Parent{
	
}
