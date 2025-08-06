package Utils;

public class Person {
    // Declare attributes:
    private String name;
    private final String cpf;
    private int age;

    // Methods, builder:
    public Person(String name, String cpf, int age){
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    // Methods, getters:
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }

    // Methods, Setters:
    public void setName(String name) {
        this.name = name;
    }

    // Methods, toString()

    @Override
    public String toString() {
        return "{\n" +
                "   name=" + name +
                "\n   cpf=" + cpf +
                "\n   age="+ age +
                "\n}";
    }
}
