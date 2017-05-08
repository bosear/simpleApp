/**
 * Created by Артём on 08.05.2017.
 */
public interface Test {
    void lol();
    void lolec();
    public default int llol(int p) {
        return p*45;
    }
}
