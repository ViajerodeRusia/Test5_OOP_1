public class PrintService {
    public static void print(Gryffindor[] gryffindors){
        for (int i = 0; i < gryffindors.length; i++) {
            System.out.println(gryffindors[i].getName() + " " + gryffindors[i].getSurname());
            System.out.println("_____________");
            System.out.println("Transgression = "+ gryffindors[i].getWitchcraft());
            System.out.println("Witchcraft = " + gryffindors[i].getWitchcraft());
            System.out.println("Nobility = " + gryffindors[i].getNobility());
            System.out.println("Honor = " + gryffindors[i].getHonor());
            System.out.println("Bravery = " + gryffindors[i].getBravery());
            System.out.println();
        }
    }
    public static void print(Slytherin[] slytherins){
        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i].getName() + " " + slytherins[i].getSurname());
            System.out.println("_____________");
            System.out.println("Transgression = " + slytherins[i].getWitchcraft());
            System.out.println("Witchcraft = " + slytherins[i].getWitchcraft());
            System.out.println("Cunning = " + slytherins[i].getCunning());
            System.out.println("Determination = " + slytherins[i].getDetermination());
            System.out.println("Ambition = " + slytherins[i].getAmbition());
            System.out.println("LastForPower = " + slytherins[i].getLastForPower());
            System.out.println();
        }
    }
    public static void print(Ravenclaw[] ravenclaws){
        for (int i = 0; i < ravenclaws.length; i++) {
            System.out.println(ravenclaws[i].getName() + " " + ravenclaws[i].getSurname());
            System.out.println("_____________");
            System.out.println("Transgression = " + ravenclaws[i].getWitchcraft());
            System.out.println("Witchcraft = " + ravenclaws[i].getWitchcraft());
            System.out.println("Intelligence = " + ravenclaws[i].getIntelligence());
            System.out.println("Wisdom = " + ravenclaws[i].getWisdom());
            System.out.println("Wit = " + ravenclaws[i].getWit());
            System.out.println("Creativity = " + ravenclaws[i].getCreativity());
            System.out.println();
        }
    }
    public static void print(Hufflepuff[] hufflepuffs){
        for (int i = 0; i < hufflepuffs.length; i++) {
            System.out.println(hufflepuffs[i].getName() + " " + hufflepuffs[i].getSurname());
            System.out.println("_____________");
            System.out.println("Transgression = " + hufflepuffs[i].getTransgression());
            System.out.println("Witchcraft = " + hufflepuffs[i].getWitchcraft());
            System.out.println("Diligence = " + hufflepuffs[i].getDiligence());
            System.out.println("Loyalty = " + hufflepuffs[i].getLoyalty());
            System.out.println("Honesty = " + hufflepuffs[i].getHonesty());
            System.out.println();
        }
    }
}
