/**
 * Created by maratmamin on 3/21/16.
 */
public class Cat implements Pet {
    @Override
    public void petFed() {
        System.out.println("Cat was fed");
    }

    @Override
    public void petGroomed() {
        System.out.println("Cat was groomed");
    }

    @Override
    public void petPlayedWith() {
        System.out.println("Cat was played with");
    }
}
