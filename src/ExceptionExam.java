import java.io.IOException;

class Parent {
    public void msg() throws Exception {
        System.out.println("Hi");
    }
}

class Child extends Parent {
    public void msg() throws IOException {

        System.out.println("Hello");
    }
}

public class ExceptionExam {

    public static void main(String[] args) throws IOException {
        Child ch = new Child();
        ch.msg();
    }
}
