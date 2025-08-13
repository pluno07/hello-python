interface showable{
	void show();
	interface message{
		void msg();
	}
}
class hello implements showable,showable.message{
	public void show(){
			System.out.println("Outer interface");
	}
	public void msg(){
		System.out.println("Inner Interface");
	}
	public static void main(String []args){
		hello obj = new hello();
		obj.msg();
		obj.show();
	}
}
