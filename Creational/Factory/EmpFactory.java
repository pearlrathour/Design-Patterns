package Creational.Factory;

public class EmpFactory {
    public static Employee getEmployee(String empType){
        if(empType.trim().equals("ANDROID DEV"))
            return new AndroidDev();
        else if(empType.trim().equalsIgnoreCase("WEB DEV"))
            return new WebDev();
        else
            return null;
    }
}
