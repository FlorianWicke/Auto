import java.util.ArrayList;
import java.util.List;

public class Auto implements Fahrzeug{

    private List<Rad> raeder = new ArrayList<>();
    private List<Schraube> schrauben = new ArrayList<>();
    int maxGeschwindigkeit;

    public Auto(List<Schraube> schrauben, List<Rad> raeder, int maxGeschwindigkeit) {
        this.schrauben = schrauben;
        this.raeder = raeder;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    /*    public void reifenWechsel(boolean winter, List sommerraeder, List winterraeder) {
           if (winter == true) {
               raeder = winterraeder;
           } else {
               raeder = sommerraeder;
           }
       }

       public void fahren(boolean winter) {
           if (kannFahren(winter) == true) {
               System.out.println("Das Auto fährt ole.....");
           }
       }

      public boolean kannFahren(boolean winter) {
           if (raeder.size() < 4) {
               System.out.println("Das Auto hat zu wenig Räder!!");
               return false;
           } else {
               for (Rad aktuellesRad : raeder) {
                   aktuellesRad.hatSchrauben();
                   if (aktuellesRad.hatSchrauben() == false){
                       return false;
                   } else{
                       return true;
                   }
               }
               if (schrauben.size() < 2) {
                   System.out.println("Das Auto hat zu wenig Schrauben!!");
                   return false;
               }
               if (winter == true) {
                   for (Rad aktuellesRad : raeder) {
                       if (aktuellesRad.getSommerreifen() == true) {
                           System.out.println("Das Auto darf nicht fahren");
                           return false;
                       }
                   }
               } else {
                   for (Rad aktuellesRad : raeder) {
                       if (aktuellesRad.getSommerreifen() == false) {
                           System.out.println("Das Auto darf nicht fahren");
                           return false;
                       }
                   }
               }
               return true;
           }
       }
   */
    @Override
    public void fahren(boolean winter) {
        if (kannFahren(winter) == true) {
            System.out.println("Das Auto fährt ole.....");
        }
    }

    @Override
    public boolean kannFahren(boolean winter) {
        if (raeder.size() < 4) {
            System.out.println("Das Auto hat zu wenig Räder!!");
            return false;
        } else {
            for (Rad aktuellesRad : raeder) {
                aktuellesRad.hatSchrauben();
                if (aktuellesRad.hatSchrauben() == false){
                    return false;
                } else{
                    return true;
                }
            }
            if (schrauben.size() < 2) {
                System.out.println("Das Auto hat zu wenig Schrauben!!");
                return false;
            }
            if (winter == true) {
                for (Rad aktuellesRad : raeder) {
                    if (aktuellesRad.getSommerreifen() == true) {
                        System.out.println("Das Auto darf nicht fahren");
                        return false;
                    }
                }
            } else {
                for (Rad aktuellesRad : raeder) {
                    if (aktuellesRad.getSommerreifen() == false) {
                        System.out.println("Das Auto darf nicht fahren");
                        return false;
                    }
                }
            }
            return true;
        }
    }
    @Override
    public void reifenWechsel(boolean winter, List sommerraeder, List winterraeder) {
        if (winter == true) {
            raeder = winterraeder;
        } else {
            raeder = sommerraeder;
        }
    }
}