package week4.lab12.prog1closedcurve.good;

public class IllegalTriangleException extends IllegalClosedCurveException {
	public IllegalTriangleException(){
		super();
	}
	public IllegalTriangleException(String msg) {
		super(msg);
	}
	
	
	private static final long serialVersionUID = 3258132448972648755L;
}
