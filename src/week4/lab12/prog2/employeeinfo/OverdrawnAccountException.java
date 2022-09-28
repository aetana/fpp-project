package week4.lab12.prog2.employeeinfo;

public class OverdrawnAccountException extends Exception {
	public OverdrawnAccountException(){
		super();
	}
	public OverdrawnAccountException(String msg) {
		super(msg);
	}
	
	
	private static final long serialVersionUID = 3258132448972648755L;


}
