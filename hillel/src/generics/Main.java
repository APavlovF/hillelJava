package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by APavlov on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        //pairExample();
        //List<Employee> employeeList = simpleExamples();
        //rawTypeExample();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ivan", 4500));
        employeeList.add(new Manager("petro", 5500));
        print(employeeList);

        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("ivan", 4500));
        managerList.add(new Manager("petro", 5500));
        print(managerList);

        addEmployee(employeeList);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("alex"));

        addEmployee(personList);

        List<Employee> copyEmployeeList = new ArrayList<>();

        copy(employeeList, copyEmployeeList);
        System.out.println(copyEmployeeList.size());

        //managerList = copy(employeeList, managerList); not possible
        //copy(managerList, employeeList);
        employeeList = copyFunction(managerList);

    }

    /*public static void overloadedMethod(List<String> strings){

    }*/
    public static void overloadedMethod(List<Integer> integers) {

    }

    public static <K, V> void copy(Pair<K, V> source, Pair<K, V> target) {
        K key = source.key;
        V value = source.value;
        target.key = source.key;
        target.value = source.value;
    }

    public static <T> List<T> copyFunction(List<? extends T> source) {
        List<T> target = new ArrayList<>();
        target.addAll(source);
        //T element;
        //element = new T(); not working
        return target;
    }

    public static <T> List<? super T> copy(List<? extends T> source, List<? super T> target) {  //not good practice: entering parameter target is changed after this method
        target.addAll(source);
        return target;
    }

    public static void addEmployee(List<? super Employee> list) { //all types which are superclasses for Employee
        list.add(new Employee("Ivan", 500));
        //Employee e = list.get(0);  cannot get any object from such collection - possible to get only Object type: Object o = list.get(0)
    }


    public static void print(List<? extends Employee> list) {  //list of any type which extends Employee
        for (Employee e : list) {
            System.out.println(e);
        }
        //list.add(new Employee("a", 1));  cannot add Employee because somebody can also add Manager
    }

    private static void rawTypeExample() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ivan", 4500));
        employeeList.add(new Manager("petro", 5500));

        printEmployees(employeeList);

        List personList = employeeList;

        printPersons(personList);

        personList.add(new Person("anatoliy"));

        printPersons(personList);

        printEmployees(employeeList); //java.lang.ClassCastException: generics.Person cannot be cast to generics.Employee
    }

    private static void printEmployees(List<Employee> employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    private static void printPersons(List personList) {
        for (Object o : personList) {
            Person p = (Person) o;
            System.out.println(p);
        }
    }

    private static List<Employee> simpleExamples() {
        Employee e = new Manager("ivan", 500);

        ArrayList<Employee> arrayList = new ArrayList<>();
        List<Employee> employeeList = arrayList;
        Collection<Employee> collection = employeeList;

        //list.add(new Person("ivan"));
        employeeList.add(new Employee("ivan", 500));
        employeeList.add(new Manager("petro", 1000));

        Person p = new Employee("ivan", 500);
        return employeeList;
    }

    private static void pairExample() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vasya"));
        //list.add(new Object());

        Person vasya = list.get(0);
        Object o = list.get(1);

        list.add(new Employee("Petr", 10));

        Pair<Employee, Manager> pair = new Pair<>();

        Employee e = pair.key;

        Manager m = pair.value;
    }

}
