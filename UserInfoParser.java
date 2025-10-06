public class UserInfoParser {
    public static void main(String[] args) {
        String userData = "USERID:abhi | FULLNAME:Abhijit Mophare | ROLE:Admin";

        int nameStart = userData.indexOf("FULLNAME:") + "FULLNAME:".length();
        int nameEnd = userData.indexOf("|", nameStart);
        String fullName = userData.substring(nameStart, nameEnd).trim();

        int roleStart = userData.indexOf("ROLE:") + "ROLE:".length();
        String role = userData.substring(roleStart).trim();

        System.out.println("Full Name: " + fullName);
        System.out.println("Role: " + role);

        System.out.println("Role (lowercase): " + role.toLowerCase());
    }
}
