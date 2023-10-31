public class Hogwarts {
    private String name;
    private String surname;
    private int transgression;
    private int witchcraft;

    public Hogwarts(String name, String surname, int transgression, int witchcraft) {
        this.name = name;
        this.surname = surname;
        this.transgression = transgression;
        this.witchcraft = witchcraft;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getWitchcraft() {
        return witchcraft;
    }
}
