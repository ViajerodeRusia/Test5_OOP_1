public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name,String surname, int transgression, int witchcraft, int diligence,
                      int loyalty, int honesty) {
        super(name, surname, transgression, witchcraft);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public static void compareHogwartsHouse(Hufflepuff[] hufflepuffs,int first, int second){
        int sum1 = hufflepuffs[first].getDiligence()+hufflepuffs[first].getLoyalty()+hufflepuffs[first].getHonesty();
        int sum2 = hufflepuffs[second].getDiligence()+hufflepuffs[second].getLoyalty()+hufflepuffs[second].getHonesty();
            System.out.println("Comparison of two Hufflepuff students:");
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        }
        System.out.println("**************");
    }
    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
