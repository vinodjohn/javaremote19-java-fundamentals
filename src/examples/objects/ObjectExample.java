package examples.objects;

public class ObjectExample {
    public String name;
    public int a;

    // Non-parameterized constructor or Normal constructor
    public ObjectExample() {
        System.out.println("Constructing Object Example..");
        name = "Vinod John";
        a = 6;
    }

    // Parameterized Constructor
    public ObjectExample(int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }

}
