public class CompareService {
    public static void compare(Gryffindor[] gryffindors,int first, int second){
        System.out.println("**************");
        if(gryffindors[first].getTransgression()>gryffindors[second].getTransgression()) {
            System.out.println("Transgression (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "transgression (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getTransgression()<gryffindors[second].getTransgression()){
            System.out.println("Transgression (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "transgression (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getTransgression()==gryffindors[second].getTransgression()){
            System.out.println("Transgression (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "transgression (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        if(gryffindors[first].getWitchcraft()>gryffindors[second].getWitchcraft()) {
            System.out.println("Witchcraft (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "Witchcraft (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getWitchcraft()<gryffindors[second].getWitchcraft()){
            System.out.println("Witchcraft (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "Witchcraft (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getWitchcraft()==gryffindors[second].getWitchcraft()){
            System.out.println("Witchcraft (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "Witchcraft (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        if(gryffindors[first].getNobility()>gryffindors[second].getNobility()) {
            System.out.println("Nobility (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "Nobility (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getNobility()<gryffindors[second].getNobility()){
            System.out.println("Nobility (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "Nobility (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getNobility()==gryffindors[second].getNobility()){
            System.out.println("Nobility (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "Nobility (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        if(gryffindors[first].getHonor()>gryffindors[second].getHonor()) {
            System.out.println("Honor (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "Honor (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getHonor()<gryffindors[second].getHonor()){
            System.out.println("Honor (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "Honor (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getHonor()==gryffindors[second].getHonor()){
            System.out.println("Honor (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "Honor (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        if(gryffindors[first].getBravery()>gryffindors[second].getBravery()) {
            System.out.println("Bravery (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "Bravery (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getBravery()<gryffindors[second].getBravery()){
            System.out.println("Bravery (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "Bravery (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (gryffindors[first].getBravery()==gryffindors[second].getBravery()){
            System.out.println("Bravery (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "Bravery (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        System.out.println("_____________");
        int sum1 = gryffindors[first].getTransgression()+gryffindors[first].getWitchcraft()+gryffindors[first].getWitchcraft()+
                gryffindors[first].getBravery()+gryffindors[first].getHonor()+gryffindors[first].getNobility();
        int sum2 = gryffindors[second].getTransgression()+gryffindors[second].getWitchcraft()+gryffindors[second].getWitchcraft()+
                gryffindors[second].getBravery()+gryffindors[second].getHonor()+gryffindors[second].getNobility();
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + gryffindors[first].getName() + " " + gryffindors[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + gryffindors[second].getName() + " " + gryffindors[second].getSurname() + ")");
        }
        System.out.println("**************");
    }
    public static void compare(Slytherin[] slytherins,int first, int second){
        System.out.println("**************");
        if(slytherins[first].getTransgression()>slytherins[second].getTransgression()) {
            System.out.println("Transgression (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " > " +
                    "transgression (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getTransgression()<slytherins[second].getTransgression()){
            System.out.println("Transgression (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " < " +
                    "transgression (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getTransgression()==slytherins[second].getTransgression()){
            System.out.println("Transgression (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " = " +
                    "transgression (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        }
        if(slytherins[first].getWitchcraft()>slytherins[second].getWitchcraft()) {
            System.out.println("Witchcraft (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " > " +
                    "Witchcraft (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getWitchcraft()<slytherins[second].getWitchcraft()){
            System.out.println("Witchcraft (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " < " +
                    "Witchcraft (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getWitchcraft()==slytherins[second].getWitchcraft()){
            System.out.println("Witchcraft (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " = " +
                    "Witchcraft (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        }
        if(slytherins[first].getCunning()>slytherins[second].getCunning()) {
            System.out.println("Cunning (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " > " +
                    "Cunning (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getCunning()<slytherins[second].getCunning()){
            System.out.println("Cunning (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " < " +
                    "Cunning (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getCunning()==slytherins[second].getCunning()){
            System.out.println("Cunning (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " = " +
                    "Cunning (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        }
        if(slytherins[first].getDetermination()>slytherins[second].getDetermination()) {
            System.out.println("Determination (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " > " +
                    "Determination (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getDetermination()<slytherins[second].getDetermination()){
            System.out.println("Determination (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " < " +
                    "Determination (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getDetermination()==slytherins[second].getDetermination()){
            System.out.println("Determination (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " = " +
                    "Determination (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        }
        if(slytherins[first].getAmbition()>slytherins[second].getAmbition()) {
            System.out.println("Ambition (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " > " +
                    "Ambition (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getAmbition()<slytherins[second].getAmbition()){
            System.out.println("Ambition (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " < " +
                    "Ambition (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        } else if (slytherins[first].getAmbition()==slytherins[second].getAmbition()){
            System.out.println("Ambition (" + slytherins[first].getName() + " " + slytherins[first].getSurname() + ")" + " = " +
                    "Ambition (" + slytherins[second].getName() + " " + slytherins[second].getSurname() + ")");
        }
        System.out.println("_____________");
        int sum1 = slytherins[first].getTransgression()+slytherins[first].getWitchcraft()+slytherins[first].getWitchcraft()+
                slytherins[first].getCunning()+slytherins[first].getDetermination()+slytherins[first].getAmbition()+slytherins[first].getLastForPower();
        int sum2 = slytherins[second].getTransgression()+slytherins[second].getWitchcraft()+slytherins[second].getWitchcraft()+
                slytherins[second].getCunning()+slytherins[second].getDetermination()+slytherins[second].getAmbition()+slytherins[second].getLastForPower();
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
    public static void compare(Ravenclaw[] ravenclaws,int first, int second){
        System.out.println("**************");
        if(ravenclaws[first].getTransgression()>ravenclaws[second].getTransgression()) {
            System.out.println("Transgression (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "transgression (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getTransgression()<ravenclaws[second].getTransgression()){
            System.out.println("Transgression (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "transgression (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getTransgression()==ravenclaws[second].getTransgression()){
            System.out.println("Transgression (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "transgression (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getWitchcraft()>ravenclaws[second].getWitchcraft()) {
            System.out.println("Witchcraft (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Witchcraft (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWitchcraft()<ravenclaws[second].getWitchcraft()){
            System.out.println("Witchcraft (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Witchcraft (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWitchcraft()==ravenclaws[second].getWitchcraft()){
            System.out.println("Witchcraft (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Witchcraft (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getIntelligence()>ravenclaws[second].getIntelligence()) {
            System.out.println("Intelligence (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Intelligence (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getIntelligence()<ravenclaws[second].getIntelligence()){
            System.out.println("Intelligence (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Intelligence (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getIntelligence()==ravenclaws[second].getIntelligence()){
            System.out.println("Intelligence (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Intelligence (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getWisdom()>ravenclaws[second].getWisdom()) {
            System.out.println("Wisdom (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Wisdom (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWisdom()<ravenclaws[second].getWisdom()){
            System.out.println("Wisdom (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Wisdom (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWisdom()==ravenclaws[second].getWisdom()){
            System.out.println("Wisdom (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Wisdom (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        if(ravenclaws[first].getWit()>ravenclaws[second].getWit()) {
            System.out.println("Wit (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Wit (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWit()<ravenclaws[second].getWit()){
            System.out.println("Wit (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Wit (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (ravenclaws[first].getWit()==ravenclaws[second].getWit()){
            System.out.println("Wit (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Wit (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        System.out.println("_____________");
        int sum1 = ravenclaws[first].getTransgression()+ravenclaws[first].getWitchcraft()+ravenclaws[first].getWitchcraft()+
                ravenclaws[first].getIntelligence()+ravenclaws[first].getWisdom()+ravenclaws[first].getWit()+ravenclaws[first].getCreativity();
        int sum2 = ravenclaws[second].getTransgression()+ravenclaws[second].getWitchcraft()+ravenclaws[second].getWitchcraft()+
                ravenclaws[second].getIntelligence()+ravenclaws[second].getWisdom()+ravenclaws[second].getWit()+ravenclaws[second].getCreativity();
        if (sum1>sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " > " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (sum1<sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " < " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        } else if (sum1==sum2) {
            System.out.println("Total "+sum1+ " (" + ravenclaws[first].getName() + " " + ravenclaws[first].getSurname() + ")" + " = " +
                    "Total "+sum2+ " (" + ravenclaws[second].getName() + " " + ravenclaws[second].getSurname() + ")");
        }
        System.out.println("**************");
    }
    public static void compare(Hufflepuff[] hufflepuffs,int first, int second){
        System.out.println("**************");
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
        int sum1 = hufflepuffs[first].getTransgression()+hufflepuffs[first].getWitchcraft()+hufflepuffs[first].getWitchcraft()+
                hufflepuffs[first].getDiligence()+hufflepuffs[first].getLoyalty()+hufflepuffs[first].getHonesty();
        int sum2 = hufflepuffs[second].getTransgression()+hufflepuffs[second].getWitchcraft()+hufflepuffs[second].getWitchcraft()+
                hufflepuffs[second].getDiligence()+hufflepuffs[second].getLoyalty()+hufflepuffs[second].getHonesty();
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
}
