/**
 * Created by maratmamin on 3/21/16.
 */
public abstract class Household {
    public int mIncome;
    public int taxes;
    public int alreadyPaidTaxes;
//    public Pet pet;

    public abstract void getPaid(int income);

    public int payTaxes (){
        taxes = mIncome / 5;
        alreadyPaidTaxes = mIncome - taxes;
        return alreadyPaidTaxes;
    }

    public abstract Pet addPet(Pet type);
}
