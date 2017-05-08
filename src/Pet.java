/**
 * Created by Артём on 07.05.2017.
 */
public abstract class Pet {
    public String name;
    public int age;
    public boolean hungry;
    abstract void voice();
    void food() {
        hungry = false;
    }
}
