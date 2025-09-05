package Creational.Factory;

public class DevClient {
    public static void main(String[] args) {
        Employee emp= EmpFactory.getEmployee("ANDROID DEV");
        int salary= emp.salary();
        System.out.println(salary);
    }
}
