
 class Employee{
int employeeId;
String employeeName;
boolean empStatus;

Employee(){
	System.out.println("Non Parameterized Constructor");
}


Employee(int empid,String empname){
	System.out.println("Parameterized constructor");
	employeeId=empid;
	employeeName=empname;
}

Employee(int empid){
	System.out.println("Parameterized constructor with one parameter");
	employeeId=empid;
	System.out.println("id:"+empid);
}

Employee(String empid,String empname){
	System.out.println("Parameterized constructor with two string type parameters");
	employeeName=empname;
	System.out.println(" String id:"+empid);
	System.out.println("id:"+empname);
}

void displayemployeedetails() {
	System.out.println("id:"+employeeId);
	System.out.println("Name:"+employeeName);
	System.out.println("Status:"+empStatus);
}

 }


public class EmployeeMain{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1=new Employee();
       Employee e2=new Employee(1,"Sumera");
       Employee e3=new Employee(1);
       Employee e4=new Employee("1","Sumera");
       e1.displayemployeedetails();
       e2.displayemployeedetails();
	}
}