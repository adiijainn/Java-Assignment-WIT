
interface Message {
    void showMessage();
}

class Outer {

    class Inner {
        void display() {
            System.out.println("This is inner class.");
        }
    }

    void accessInner() {
        Inner in = new Inner();
        in.display();
    }

    void anonymousDemo() {
        Message msg = new Message() {
            public void showMessage() {
                System.out.println("This is anonymous class.");
            }
        };
        msg.showMessage();
    }
}

public class Messages {
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.accessInner();

        outer.anonymousDemo();
    }
}
