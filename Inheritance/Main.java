Main.java

public class Main{
	public static void main(String[] args) {
		Employee employee = new Employee("John", 900000, 2020, "2018838837f");
		System.out.println(employee);
	}

}

Person.java:

public class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Person [name=" + name + "]";
	}		
}

Employee.java:

public class Employee extends Person {
        double annualSalary;
	int year;
	String InsuranceNo;	
	public Employee(String name, double annualSalary, int year, String InsuranceNo) {
		super(name);
		this.annualSalary=annualSalary;
		this.year= year;
		this.InsuranceNo =InsuranceNo;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public int getYear() {
		return year;
	}
	public String getInsuranceNo() {
		return InsuranceNo;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", year=" + year+ ", InsuranceNo="
				+ InsuranceNo + ", name=" + name + "]";
	}
	
	
}