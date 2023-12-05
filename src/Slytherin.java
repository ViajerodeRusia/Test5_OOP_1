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
   public static void compareHogwartsHouse(Slytherin[] slytherins,int first, int second){
      int sum1 = slytherins[first].getCunning()+slytherins[first].getDetermination()+slytherins[first].getAmbition()+slytherins[first].getLastForPower();
      int sum2 = slytherins[second].getCunning()+slytherins[second].getDetermination()+slytherins[second].getAmbition()+slytherins[second].getLastForPower();
      System.out.println("Comparison of two Slytherin students:");
      if (sum1>sum2) {
         System.out.println("Total "+sum1+ " (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " > " +
                 "Total "+sum2+ " (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
      } else if (sum1<sum2) {
         System.out.println("Total "+sum1+ " (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " < " +
                 "Total "+sum2+ " (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
      } else if (sum1==sum2) {
         System.out.println("Total "+sum1+ " (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " = " +
                 "Total "+sum2+ " (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
      }
      System.out.println("**************");
   }

   @Override
   public String toString() {
      return "Slytherin student \n" + "Name: " + getName() + " Surname: " + getSurname() + "\n" +
              "Transgression=" + getTransgression() + "\n" +
              "Witchcraft=" + getWitchcraft() + "\n" +
              "Cunning=" + cunning + "\n" +
              "Determination=" + determination + "\n" +
              "Ambition=" + ambition + "\n";
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
