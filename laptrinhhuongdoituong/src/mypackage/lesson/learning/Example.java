package mypackage.lesson.learning;

public class Example {
	private int[] array;
	private Person person;
	public int[] getArray() {
		return this.array.clone();
	}
	public void setArray(int[] array) {
		this.array = array.clone();
	}
	public Person getPerson() {
		return this.person.clone();
	}
	public void setPerson(Person person) {
		this.person = person.clone();
	}
	
	public void displayArray() {
		for (int a : this.array) {
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
