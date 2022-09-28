package week4.lab12.closedcurve.good;

import java.util.logging.Logger;

public class Circle extends ClosedCurve {
	double radius;
	Logger log = Logger.getLogger("lab12.closedcurveimproved");
	
	public Circle(Double radius) throws IllegalClosedCurveException{
		if(radius < 0 ) {
			log.warning("A negative number width-> ("+radius+") can not be used for radius of Circle!");
			throw new IllegalClosedCurveException("A negative number width-> ("+radius+") can not be used for radius of Circle!");
		}
		this.radius = radius.doubleValue();
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
