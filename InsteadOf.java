package java_ex01;

public class InsteadOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pw = new Children();
		
		System.out.println(pw instanceof Parent); // 객체의 클래스타입을 묻는게 맞음.자식객체는 부모클래스를 상속받았기때문에 트루가 되는거 같음 
		System.out.println(pw instanceof Children); // 
	}

}

class Children extends Parent{
	
}

class Parent{
	
}
