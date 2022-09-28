package week4.lab12.prog1closedcurve.good;

import java.util.logging.Logger;

public class Square extends ClosedCurve {
	double side;
	Logger log = Logger.getLogger("lab12.closedcurveimproved");
	
	public Square(Double side) throws IllegalClosedCurveException{
		if(side < 0) {
			log.warning("A negative number side -> ("+side+") can not be used for side of Square!");
			throw new IllegalClosedCurveException("A negative number side -> ("+side+") can not be used for side of Square!");
		}
		this.side = side.doubleValue();
	}
	
	public Square(double side) {
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}
