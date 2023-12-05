public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry", "Potter", 5, 7, 8, 8, 10),
                new Gryffindor("Hermione", "Granger", 8, 10, 8, 10, 10),
                new Gryffindor("Ron", "Weasley", 3, 6, 6, 8, 10)};
        Slytherin[] slytherins = {
                new Slytherin("Draco", "Malfoy", 5, 7, 8, 5, 5, 7),
                new Slytherin("Graham", "Montague", 7, 9, 6, 7, 6, 10),
                new Slytherin("Gregory", "Goyle", 3, 4, 3, 5, 6, 4)};
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou", "Chang", 7, 6, 6, 8, 7, 10),
                new Ravenclaw("Padma", "Patil", 9, 10, 8, 10, 8, 8),
                new Ravenclaw("Marcus", "Belby", 7, 6, 8, 6, 9, 6)};
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah", "Smith", 7, 6, 6, 8, 7),
                new Hufflepuff("Cedric", "Diggory", 9, 10, 8, 10, 8),
                new Hufflepuff("Justin", "Finch-Fletchley", 7, 6, 8, 6, 9)};
        Hogwarts[] hogwarts = {
                gryffindors[0], gryffindors[1], gryffindors[2],
                slytherins[0], slytherins[1], slytherins[2],
                ravenclaws[0], ravenclaws[1], ravenclaws[2],
                hufflepuffs[0], hufflepuffs[1], hufflepuffs[2]};

        HogwartsServiceImpl hogwartsService = new HogwartsServiceImpl();
        hogwartsService.compareHogwartsImpl(hogwarts, 1, 6);
        hogwartsService.compareHogwartsHouseImpl(gryffindors, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(slytherins, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(ravenclaws, 1, 2);
        hogwartsService.compareHogwartsHouseImpl(hufflepuffs, 1, 2);

    }
}