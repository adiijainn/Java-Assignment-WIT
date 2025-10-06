
abstract class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract String getRole();
}

interface Login {
    boolean login(String username, String password);
}

class Student extends Person implements Login {
    Student(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean login(String username, String password) {

        return username.equals("student") && password.equals("1234");
    }

    @Override
    String getRole() {
        return "Student";
    }
}

class Faculty extends Person implements Login {
    Faculty(String name, String id) {
        super(name, id);
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals("faculty") && password.equals("abcd");
    }

    @Override
    String getRole() {
        return "Faculty";
    }
}

public class Details {
    public static void main(String[] args) {
        Login user = new Student("Abhijit", "S101");

        if (user.login("student", "1234")) {
            System.out.println("Student Login Successful");

            Person p = (Person) user;
            System.out.println("Role: " + p.getRole());
            System.out.println("Name: " + p.name);
            System.out.println("ID: " + p.id);
        } else {
            System.out.println("Login Failed");
        }
    }
}
