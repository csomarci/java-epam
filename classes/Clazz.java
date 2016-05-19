
public class Clazz {
	int variable;
	
	public static void main(String[] args) {
		// inner class 
		Clazz a = new Clazz();
		Inner inner = a.new Inner();
		
		// static
		StaticInner staticInner = new StaticInner();
	}
	
	class Inner {
		void method1() {
			Clazz.this.variable = 5;
		}
	}
	
	static class StaticInner {
			
	}
}

class B { // cannot be public
	
}