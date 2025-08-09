

class Student
{
	private int roll;
	private String name;
	private String email;
		Student(int roll,String name,String email) {
		super();
		
		this.roll = roll;
		this.name=name;
		this.email = email;
	}
	Student(String email) {
		super();
		
		
		this.email = email;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [ roll=" + roll + ",name=" + name + ", email=" + email + "]";
	}
}
	