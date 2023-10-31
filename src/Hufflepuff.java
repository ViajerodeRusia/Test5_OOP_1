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
