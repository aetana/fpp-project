package week4.lab11.prog2;

import java.util.Objects;

public class PairedSum {

	Integer sum;

	public PairedSum(Integer x, Integer y) {  //(f,s)
			sum = x + y;
		}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != getClass())
			return false;
		PairedSum p = (PairedSum) ob;
		return p.sum.equals(sum);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sum);
	}

}
