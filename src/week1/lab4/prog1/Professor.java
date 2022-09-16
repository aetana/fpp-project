package week1.lab4.prog1;

public class Professor extends DeptEmployee {

	private int numberOfPublications = 10;

	public Professor() {

	}

	public Professor(String name) {
		super(name);
	}
	public Professor(String name, float salary) {
		super(name, salary);
	}
	public Professor(String name, float salary, int numberOfPublications) {
		super(name, salary);
		this.numberOfPublications = numberOfPublications;
	}

	public Professor(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
