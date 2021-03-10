package oop.exercise.lesson1;

public class Staff extends Manager {

	private String task;

	public Staff(String fullName, int age, String gender, String address, String task) {
		super(fullName, age, gender, address);
		// TODO Auto-generated constructor stub
		this.setTask(task);
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	
}
