public class Student {

	private String name;
	private int id;
	private int grade;
	private int age;
	private String status;

	public Student(String name, int id, int grade, int age, String status) {
	this.name = name;
	this.id = id;
	this.grade = grade;
	this.age = age;
	this.status = status;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int newId) {
		this.id = newId;
	}

	public static void main(String[] args) {
		Student a = new Student("Momin", 1, 99, 21, "Active");
		Student b = new Student("Mo", 2, 100, 19, "Passive");

		System.out.println(a.getName());
		a.setName("Yahoodi!");
		System.out.println(a.getName());

		System.out.println(b.getId());
		b.setId(007);
		System.out.println(b.getId());
		
	}
}


	
