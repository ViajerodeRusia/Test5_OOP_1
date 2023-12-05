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
        if(hufflepuffs[first].getTransgression()>hufflepuffs[second].getTransgression()) {
            System.out.println("Transgression (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " > " +
                    "transgression (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getTransgression()<hufflepuffs[second].getTransgression()){
            System.out.println("Transgression (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " < " +
                    "transgression (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getTransgression()==hufflepuffs[second].getTransgression()){
            System.out.println("Transgression (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " = " +
                    "transgression (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        }
        if(hufflepuffs[first].getWitchcraft()>hufflepuffs[second].getWitchcraft()) {
            System.out.println("Witchcraft (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " > " +
                    "Witchcraft (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getWitchcraft()<hufflepuffs[second].getWitchcraft()){
            System.out.println("Witchcraft (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " < " +
                    "Witchcraft (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getWitchcraft()==hufflepuffs[second].getWitchcraft()){
            System.out.println("Witchcraft (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " = " +
                    "Witchcraft (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        }
        if(hufflepuffs[first].getDiligence()>hufflepuffs[second].getDiligence()) {
            System.out.println("Diligence (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " > " +
                    "Diligence (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getDiligence()<hufflepuffs[second].getDiligence()){
            System.out.println("Diligence (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " < " +
                    "Diligence (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getDiligence()==hufflepuffs[second].getDiligence()){
            System.out.println("Diligence (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " = " +
                    "Diligence (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        }
        if(hufflepuffs[first].getLoyalty()>hufflepuffs[second].getLoyalty()) {
            System.out.println("Loyalty (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " > " +
                    "Loyalty (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getLoyalty()<hufflepuffs[second].getLoyalty()){
            System.out.println("Loyalty (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " < " +
                    "Loyalty (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getLoyalty()==hufflepuffs[second].getLoyalty()){
            System.out.println("Loyalty (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " = " +
                    "Loyalty (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        }
        if(hufflepuffs[first].getHonesty()>hufflepuffs[second].getHonesty()) {
            System.out.println("Honesty (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " > " +
                    "Honesty (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getHonesty()<hufflepuffs[second].getHonesty()){
            System.out.println("Honesty (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " < " +
                    "Honesty (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        } else if (hufflepuffs[first].getHonesty()==hufflepuffs[second].getHonesty()){
            System.out.println("Honesty (" + hufflepuffs[first].getName() + " " + hufflepuffs[first].getSurname() + ")" + " = " +
                    "Honesty (" + hufflepuffs[second].getName() + " " + hufflepuffs[second].getSurname() + ")");
        }
        System.out.println("_____________");
        int sum1 = hufflepuffs[first].getDiligence()+hufflepuffs[first].getLoyalty()+hufflepuffs[first].getHonesty();
        int sum2 = hufflepuffs[second].getDiligence()+hufflepuffs[second].getLoyalty()+hufflepuffs[second].getHonesty();
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
