package Week1.exceptionHandling;

public class Student {
    private String firstName;
    private String lastName;

    public Student(){
    }

    public String getInitials(){
        return "" + firstName.charAt(0) + lastName.charAt(0);
    }
}
