package week1.lab4.prog1;

public class Secretary extends DeptEmployee {

	private double overtimeHours = 200;

	public Secretary() {

	}

	public Secretary(String name) {
		super(name);
	}

	public Secretary(String name, float salary) {
		super(name, salary);
	}

	public Secretary(String name, float salary, double overtimeHours) {
		super(name, salary);
		this.overtimeHours = overtimeHours;
	}

	public Secretary(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double computeSalary() {
		return salary + overtimeHours * 12;
	}
}
