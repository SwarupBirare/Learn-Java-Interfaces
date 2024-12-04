interface A{
	void read();
}
interface B{
	void write();
}
class Learn implements A,B{
	@Override
	public void read(){
		System.out.println("Learn - read");
	}
	@Override
	public void write(){
		System.out.println("Learn - write");
	}
}
class App{
	public static void main(String[] args) {
		Learn l=new Learn();
	l.read();
	l.write();	
	}
}