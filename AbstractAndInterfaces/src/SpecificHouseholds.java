/**
 * Created by maratmamin on 3/21/16.
 */
public class SpecificHouseholds extends Household {
    private int mIncome;
    //can't use more defined class so to conjure a polymorphism =>
    //same method originating from an abstract class that act differently (but
    //accomplish the same objective) based on the needs of the class who instantiated
    //the pet
    @Override
    public void getPaid(int income) {
        mIncome = income;
    }

    @Override
    public int payTaxes() {
        return taxes;
    }

    @Override
    public Pet addPet(Pet housePet) {
        return housePet;
    }
}
