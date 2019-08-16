package inheritancesingle;

public class Child extends Parent{
	private int a = 30;
	private int b = 40;
	public void dislpay() {
		System.out.println("Child a = "+a+"\t b = "+b);
	}
	public void show() {
		super.display();
		this.dislpay();
		display();
		System.out.println("Process Stop");
	}
}