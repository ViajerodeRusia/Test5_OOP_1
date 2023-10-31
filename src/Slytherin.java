public class Slytherin extends Hogwarts {
   private int cunning;
   private int determination;
   private int ambition;
   private int lastForPower;
   public Slytherin(String name,String surname, int transgression, int witchcraft, int cunning, int determination,
                    int ambition, int lastForPower) {
      super(name, surname, transgression, witchcraft);
      this.cunning = cunning;
      this.determination = determination;
      this.ambition = ambition;
      this.lastForPower = lastForPower;
   }

   public int getCunning() {
      return cunning;
   }

   public int getDetermination() {
      return determination;
   }

   public int getAmbition() {
      return ambition;
   }

   public int getLastForPower() {
      return lastForPower;
   }
}
