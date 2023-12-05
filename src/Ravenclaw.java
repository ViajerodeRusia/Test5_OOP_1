public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String name,String surname, int transgression, int witchcraft, int intelligence, int wisdom,
                     int wit, int creativity) {
        super(name, surname, transgression, witchcraft);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public static void compareHogwartsHouse(Ravenclaw[] ravenclaws,int first, int second){
        if(ravenclaws[first].getTransgression()>ravenclaws[second].getTransgression()) {
            System.out.println("Transgression (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "transgression (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getTransgression()<ravenclaws[second].getTransgression()){
            System.out.println("Transgression (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "transgression (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getTransgression()==ravenclaws[second].getTransgression()){
            System.out.println("Transgression (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "transgression (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getWitchcraft()>ravenclaws[second].getWitchcraft()) {
            System.out.println("Witchcraft (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Witchcraft (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWitchcraft()<ravenclaws[second].getWitchcraft()){
            System.out.println("Witchcraft (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Witchcraft (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWitchcraft()==ravenclaws[second].getWitchcraft()){
            System.out.println("Witchcraft (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Witchcraft (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getIntelligence()>ravenclaws[second].getIntelligence()) {
            System.out.println("Intelligence (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Intelligence (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getIntelligence()<ravenclaws[second].getIntelligence()){
            System.out.println("Intelligence (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Intelligence (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getIntelligence()==ravenclaws[second].getIntelligence()){
            System.out.println("Intelligence (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Intelligence (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getWisdom()>ravenclaws[second].getWisdom()) {
            System.out.println("Wisdom (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Wisdom (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWisdom()<ravenclaws[second].getWisdom()){
            System.out.println("Wisdom (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Wisdom (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWisdom()==ravenclaws[second].getWisdom()){
            System.out.println("Wisdom (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Wisdom (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getWit()>ravenclaws[second].getWit()) {
            System.out.println("Wit (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Wit (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWit()<ravenclaws[second].getWit()){
            System.out.println("Wit (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Wit (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWit()==ravenclaws[second].getWit()){
            System.out.println("Wit (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Wit (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        System.out.println("_____________");
        int sum1 = ravenclaws[first].getIntelligence()+ravenclaws[first].getWisdom()+ravenclaws[first].getWit()+ravenclaws[first].getCreativity();
        int sum2 = ravenclaws[second].getIntelligence()+ravenclaws[second].getWisdom()+ravenclaws[second].getWit()+ravenclaws[second].getCreativity();
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        System.out.println("**************");
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
