package javaTester;

public class Topic_04_String {
    public static void main(String[] args) {
        String firstName ="Automation";
        String lastName="FC";
        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

        fullName= firstName.concat(" ").concat(lastName);
        System.out.println(fullName);


        String hotelMsg="Welcome "+ fullName + " to Intercontinental Hotel";
        System.out.println(hotelMsg);


    }
}
