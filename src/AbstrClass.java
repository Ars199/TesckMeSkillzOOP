abstract class AbstrClass {
    private String fName = "Sasha";
    private String lName = "Stevenson";
    private int age;
    private String BillingAddress;
    private String ShippingAddress;

    abstract public void say();

    public void walk(){
        System.out.println("123");
    }




    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getBillingAddress() {
        return BillingAddress;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }
}
