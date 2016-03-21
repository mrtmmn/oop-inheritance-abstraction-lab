/**
 * Created by maratmamin on 3/21/16.
 */
public class Turtle implements Pet {
    @Override
    public void petFed() {
        System.out.println("Turtle fed");
    }

    @Override
    public void petGroomed() {
        System.out.println("Turtle groomed");
    }

    @Override
    public void petPlayedWith() {
        System.out.println("Turtle played with");
    }
}
