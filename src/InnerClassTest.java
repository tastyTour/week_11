

class OuterClass {
    private String outerField = "outerField";

    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }

    void createInner(){
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
public class InnerClassTest {
    public static void main(String[] args) {
        //OuterClass outer = new OuterClass();
        //OuterClass.InnerClass inner = outer.new InnerClass();
        //inner.display();

        checkAge(15);
    }

    public static void checkAge(int age) throws InvalidAheException{
        if (age < 18) {
            throw new InvalidAheException("나이는 18세 이상이어야 합니다.");
        }
    }
    public static void methodA() throws Exception {
        try {
            methodB();
        }catch (Exception e) {
            System.out.println("예외 처리 후 다시 던지기");
            throw e;
        }
    }
    public static void methodB() throws Exception {

    }

}
class InvalidAheException extends RuntimeException {
    public InvalidAheException(String message) {
        super(message);
    }
}