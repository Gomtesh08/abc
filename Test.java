public class Test {
    public String getMessage() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getMessage());
    }
}
