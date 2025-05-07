

public class Employee {
    String name;
    int id;
    double salary;
    int phno;
    public Employee(String name,int id,double salary, int phno){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.phno=phno;
    }
    public void displayInfo(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("salary: " +salary); 
        System.out.println(" Ph.no : " + phno);
        


    }

    public static void main(String[] args){
        Employee emp1 = new Employee("Ram" , 101, 50000.0, 1234566789);
        emp1.displayInfo();

    }

    
}
