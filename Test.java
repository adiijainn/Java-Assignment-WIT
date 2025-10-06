
class Student {
    public String name = "Rahul";
    protected int roll = 101;
    private double marks = 89.5;

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class Test extends Student {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println("Accessing public and protected members of Student:");
        System.out.println("Name: " + t.name);
        System.out.println("Roll No: " + t.roll);

        t.showDetails();
    }
}
