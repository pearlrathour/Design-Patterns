public class EmpFactory {
    public static Employee getEmployee(String empType){
        if(empType.equalsIgnoreCase("ANDROID DEV"))
            return new AndroidDev();
        else if(empType.equalsIgnoreCase("WEB DEV"))
            return new WebDev();
        else
            return null;
    }
}
