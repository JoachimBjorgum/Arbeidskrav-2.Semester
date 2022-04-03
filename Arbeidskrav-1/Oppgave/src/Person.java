public class Person {
    private int id;
    private final String name;
    private final int yearOfBirth;

    static int nextId = 1;

    public Person(String name, int yearOfBirth) {
        this.id = nextId++;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void show() {
        System.out.println("Person");
        System.out.println("\t Id: " + getId());
        System.out.println("\t Name: " + getName());
        System.out.println("\t Year of Birth: " + getYearOfBirth());
        System.out.println("\t Cars: ");
    }
}
