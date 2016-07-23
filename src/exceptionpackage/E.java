package exceptionpackage;

public class E extends D {
	public void catchThis() throws Exception {
		try {
			exceptionTest();
		}
		catch (RuntimeException e) {
			
		}
	}
}