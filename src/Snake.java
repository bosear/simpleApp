/**
 * Created by Артём on 07.05.2017.
 */
public class Snake extends Pet {
    public static int count = 1;

    public Snake() {

    }
    @Override
    void voice() {
        System.out.println("snake!");
    }
}
