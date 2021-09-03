import java.util.List;

public interface Fahrzeug {

    void fahren(boolean winter);
    boolean kannFahren(boolean winter);
    void reifenWechsel(boolean winter, List sommerraeder, List winterraeder);
}
