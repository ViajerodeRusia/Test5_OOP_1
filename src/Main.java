public class Main {
    public static int generateRandomNumber() {
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry", "Potter", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Gryffindor("Hermione", "Granger", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Gryffindor("Ron", "Weasley", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Slytherin[] slytherins = {
                new Slytherin("Draco", "Malfoy", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Slytherin("Graham", "Montague", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Slytherin("Gregory", "Goyle", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou", "Chang", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Ravenclaw("Padma", "Patil", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Ravenclaw("Marcus", "Belby", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah", "Smith", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Hufflepuff("Cedric", "Diggory", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber()),
                new Hufflepuff("Justin", "Finch-Fletchley", generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber(), generateRandomNumber())};
        Hogwarts[] hogwarts = {
                gryffindors[0], gryffindors[1], gryffindors[2],
                slytherins[0], slytherins[1], slytherins[2],
                ravenclaws[0], ravenclaws[1], ravenclaws[2],
                hufflepuffs[0], hufflepuffs[1], hufflepuffs[2]};

        HogwartsServiceImpl hogwartsService = new HogwartsServiceImpl();
        hogwartsService.compareHogwartsImpl(hogwarts, 0, 10);
        hogwartsService.compareHogwartsHouseImpl(gryffindors, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(slytherins, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(ravenclaws, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(hufflepuffs, 1, 2);
        System.out.println(gryffindors[0].toString());
        System.out.println(slytherins[0].toString());
        System.out.println(ravenclaws[0].toString());
        System.out.println(hufflepuffs[0].toString());
    }
}