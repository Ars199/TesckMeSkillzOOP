public class Main {
    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        SecondChild secondChild = new SecondChild();

        System.out.println(firstChild.getfName() + " " + firstChild.getAge());
        System.out.println(secondChild.getfName() + " " + secondChild.getAge());
    }
}
