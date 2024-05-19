package assignment.q3;

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
	 
	    public static void insertionSort(Employee arr[]) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            Employee key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j].getSal() > key.getSal()) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	

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
		
		insertionSort(arr);
		
		for (Employee employee : arr) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
