package week4.lab12.closedcurve.good;

import java.util.logging.Logger;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	Logger log = Logger.getLogger("lab12.closedcurveimproved");
	
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		if(width < 0 || length < 0) {
			log.warning("A negative number width-> ("+width+") or length-> ("+length+") can not be used for sides of Rectangle!");
			throw new IllegalClosedCurveException("A negative number width-> ("+width+") or length-> ("+length+") can not be used for sides of Rectangle!");
		}
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
