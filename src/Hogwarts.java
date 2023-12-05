public abstract class Hogwarts {
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
    public static void compareHogwarts(Hogwarts[] hogwarts, int first, int second) {
        if(hogwarts[first].getTransgression() > hogwarts[second].getTransgression()) {
            System.out.println("Transgression (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " > " +
                    "transgression (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        } else if (hogwarts[first].getTransgression()<hogwarts[second].getTransgression()){
            System.out.println("Transgression (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " < " +
                    "transgression (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        } else if (hogwarts[first].getTransgression()==hogwarts[second].getTransgression()){
            System.out.println("Transgression (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " = " +
                    "transgression (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        }
        if(hogwarts[first].getWitchcraft()>hogwarts[second].getWitchcraft()) {
            System.out.println("Witchcraft (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " > " +
                    "Witchcraft (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        } else if (hogwarts[first].getWitchcraft()<hogwarts[second].getWitchcraft()){
            System.out.println("Witchcraft (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " < " +
                    "Witchcraft (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        } else if (hogwarts[first].getWitchcraft()==hogwarts[second].getWitchcraft()){
            System.out.println("Witchcraft (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " = " +
                    "Witchcraft (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        }
        System.out.println("_____________");
        int sum1 = hogwarts[first].getTransgression() + hogwarts[first].getWitchcraft();
        int sum2 = hogwarts[second].getTransgression() + hogwarts[second].getWitchcraft();
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + hogwarts[first].getName() + " " + hogwarts[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + hogwarts[second].getName() + " " + hogwarts[second].getSurname() + ")");
        }
        System.out.println("**************");
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
