interface MyInterface{
	void iMethod();
}
class MyClass1 implements MyInterface{
	public void iMethod(){
		System.out.ptintln("Method interface yang pertama ada MyClass1.");
	}
	void myMethod(){
		System.out.println("Method lain punya MyClass1.");
	}
}
class MyClass2 implements MyInterface{
	public void iMethod(){
		System.out.println("Method interface yang pertama pada MyClass2.");
	}
}
class InterfaceDemo{
	public static void main(String args[]){
		MyClass1 mc1=new MyClass1();
		MyClass2 mc2=new MyClass2();
		mc1.iMethod();
		mc1.myMethod();
		mc2.iMethod();
	}
}