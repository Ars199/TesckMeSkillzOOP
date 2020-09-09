public class FirstChild extends AbstrClass {
    int a = 5;
    private String fName = "Petr";
    private int age = 33;
    private String lName = "Johnson";


    public void say() {
        System.out.println("gav");
    }

    public void walk() {
        System.out.println("Overrided");
    }

    public void walk(int a) {
        System.out.println("Reloaded");
    }

    @Override
    public String getfName() {
        return fName;
    }

    public int getAge() {
        return age;
    }
}
