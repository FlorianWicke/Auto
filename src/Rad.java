import java.util.ArrayList;
import java.util.List;

public class Rad {
    int groesse;
    public List<Schraube> schrauben = new ArrayList();
    boolean sommerreifen;


    public Rad(int groesse, List<Schraube> schrauben, boolean sommerreifen) {
        this.groesse = groesse;
        this.schrauben = schrauben;
        this.sommerreifen = sommerreifen;
    }

    public Rad() {
    }

    public boolean hatSchrauben() {
        if (schrauben.size() < 2) {
            System.out.println("Das Auto hat zu wenig Schrauben!!");
            return false;
        }
        return true;
    }

    public boolean getSommerreifen(){
        return sommerreifen;
    }

    private void setSommerreifen(boolean sommerreifen){
        this.sommerreifen = sommerreifen;
    }
}
