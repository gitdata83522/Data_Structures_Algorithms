package ass.q4;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	double sal;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@SuppressWarnings("resource")
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter employee id :");
		id = sc.nextInt();
		System.out.print("enter employee name :");
		name = sc.next();
		System.out.print("enter employee salary :");
		sal = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class sortEmployee {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Employee arr[] = new Employee[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Employee();
			arr[i].add();
			System.out.println("------------------");
		}
		
		System.out.println("Employee list :");
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		
		int empid,i;
		System.out.print("Enter employee id to be searched : ");
		empid = sc.nextInt();
		for(i = 0; i < arr.length; i++) {
			if(arr[i].getId()==empid) {
				System.out.println("Employee found : "+arr[i].toString());
				break;
			}
			if(i == arr.length)
				System.out.println("Employee not found");
		}
		
		String name;
		System.out.print("Enter employee name to be searched : ");
		name = sc.next();
		for(i = 0; i<arr.length; i++) {
			if(arr[i].getName().compareTo(name)==0) {
				System.out.print("Employee found : "+arr[i].toString());
				break;
			}
			if(i == arr.length)
				System.out.println("Employee not found");
		}
		
		double sal;
		System.out.print("Enter salary of employee to be searched : ");
		sal = sc.nextDouble();
		for(i = 0; i < arr.length; i++) {
			if(Double.compare(arr[i].getSal(), sal) == 0) {
				System.out.println("Employee found : "+arr[i].toString());
			}
			if(i == arr.length)
				System.out.println("Employee not found");
		}	
		sc.close();
	}

}
