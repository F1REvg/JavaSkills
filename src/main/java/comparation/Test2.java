package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(28, "Zhenya", "Saraev", 40);
        Employee emp2 = new Employee(18, "Dima", "Saraev", 240);
        Employee emp3 = new Employee(10, "Dima", "Gusev", 40);
        Employee emp4 = new Employee (5, "Lera", "Kaverina", 65);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);

    }
}

class Employee implements Comparable <Employee>{

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id){
//            return 0;
//        }else if (this.id < anotherEmp.id){
//            return -1;
//        }else {
//            return 1;
//        }

//        return this.id-anotherEmp.id;

//        return this.name.compareTo(anotherEmp.name);

        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0){
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
