
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Schraube schraube1 = new Schraube();
        ArrayList<Schraube> schrauben = new ArrayList();

        Rad rad1 = new Rad();
        Rad rad2 = new Rad();
        Rad rad3 = new Rad();
        Rad rad4 = new Rad();
        Rad rad5 = new Rad(4, schrauben, false);

        ArrayList<Rad> winterraeder = new ArrayList();
        ArrayList<Rad> sommerraeder = new ArrayList();
        Auto auto = new Auto(schrauben, winterraeder, 100);
        Fahrrad alex = new Fahrrad(45);

        if(auto.maxGeschwindigkeit < alex.maxGeschwindgkeit){
            System.out.println("Das Fahrrad gewinnt");
        } else{
            System.out.println("Das Auto gewinnt");
        }

        winterraeder.add(rad1);
        winterraeder.add(rad2);
        winterraeder.add(rad3);
        winterraeder.add(rad4);
        winterraeder.add(rad5);

        sommerraeder.add(new Rad(4, schrauben, true));
        sommerraeder.add(new Rad(4, schrauben, true));
        sommerraeder.add(new Rad(4, schrauben, true));
        sommerraeder.add(new Rad(4, schrauben, true));

        schrauben.add(schraube1);
        schrauben.add(new Schraube());
        schrauben.add(new Schraube());
        schrauben.add(new Schraube());
        schrauben.add(new Schraube());

        auto.fahren(false);
        auto.reifenWechsel(true, sommerraeder, winterraeder);
        auto.fahren(true);
        auto.reifenWechsel(false, sommerraeder, winterraeder);
        auto.fahren(false);

    }
}
