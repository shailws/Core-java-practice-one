package This;

class Demo{
	Demo(){
		System.out.println("Demo class constructor..");
	}
	void one(){
		System.out.println("Demo class method..");
	}
}


public class Test {
	
	void m1(Demo d) {
		d.one();
		System.out.println("i am in m1 method...");
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		Test t = new Test();
		t.m1(d);
	}
}

