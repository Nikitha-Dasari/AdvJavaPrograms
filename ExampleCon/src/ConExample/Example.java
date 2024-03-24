package ConExample;
class Employee
{
	int empid;
	String empname;
	double empsalary;
	public Employee(int empid, String empname, double empsalary) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(1001,"Nikitha",9000);
		System.out.println(employee);
		

	}

}
