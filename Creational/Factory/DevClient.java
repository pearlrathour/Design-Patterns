public class DevClient {
    public static void main(String[] args) {
        Employee emp= EmpFactory.getEmployee("ANDROID DEV");
        System.out.println(emp.salary());
    }
}
