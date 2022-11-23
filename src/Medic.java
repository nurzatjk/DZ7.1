public class Medic  extends  Hero{

    @Override

     public void applySuperAbility(){
        setTypeOfSuperpower( "CRITICAL DAMAGE ");

        System.out.println("WARRIOR ПРИМЕНИЛ:" + getTypeOfSuperpower());
    }


    }

