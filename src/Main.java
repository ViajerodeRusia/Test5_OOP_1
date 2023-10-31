public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gryffindor [] gryffindors = new Gryffindor[3];
        gryffindors[0] = new Gryffindor("Harry", "Potter", 5, 7, 8, 8, 10);
        gryffindors[1] = new Gryffindor("Hermione", "Granger", 8, 10, 8, 10, 10);
        gryffindors[2] = new Gryffindor("Ron", "Weasley", 3, 6, 6, 8, 10);

        Slytherin [] slytherins = new Slytherin[3];
        slytherins[0] = new Slytherin("Draco", "Malfoy",5, 7,8, 5, 5, 7 );
        slytherins[1] = new Slytherin("Graham","Montague", 7, 9, 6, 7, 6, 10);
        slytherins[2] = new Slytherin("Gregory", "Goyle", 3, 4,3, 5,6,4);

        Ravenclaw [] ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = new Ravenclaw("Zhou", "Chang", 7, 6, 6, 8, 7,10);
        ravenclaws[1] = new Ravenclaw("Padma", "Patil", 9, 10, 8, 10, 8, 8);
        ravenclaws[2] = new Ravenclaw("Marcus", "Belbyy", 7, 6, 8, 6, 9, 6);

        Hufflepuff [] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = new Hufflepuff("Zachariah", "Smith", 7, 6, 6, 8, 7);
        hufflepuffs[1] = new Hufflepuff("Cedric", "Diggory", 9, 10, 8, 10, 8);
        hufflepuffs[2] = new Hufflepuff("Justin", "Finch-Fletchley", 7, 6, 8, 6, 9);
    }
}