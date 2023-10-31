public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name,String surname, int transgression, int witchcraft, int nobility,
                      int honor, int bravery) {
        super(name, surname, transgression, witchcraft);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
