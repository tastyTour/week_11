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
public class InnerClassTest{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}