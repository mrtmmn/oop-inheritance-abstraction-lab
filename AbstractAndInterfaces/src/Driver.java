/**
 * Created by maratmamin on 3/21/16.
 */
public class Driver {

    public static void main(String[] args) {

        //Create households and add to list or array
        SpecificHouseholds maminHouse = new SpecificHouseholds() {
            @Override
            public void getPaid(int income) {
                System.out.println("Still not enough");
            }

            @Override
            public int payTaxes() {
                return taxes;
            }

            @Override
            public Pet addPet(Pet housePet) {
                return housePet;
            }
        };
        maminHouse.addPet(new Cat());

        SpecificHouseholds lateHouse = new SpecificHouseholds() {
            @Override
            public void getPaid(int income) {
                System.out.println("Let's Donate");
            }

            @Override
            public int payTaxes() {
                return taxes;
            }

            @Override
            public Pet addPet(Pet housePet) {
                return housePet;
            }
        };
        lateHouse.addPet(new Turtle());

        SpecificHouseholds shh [] = new SpecificHouseholds[1];
        shh[0] = maminHouse;
        shh[1] = lateHouse;

        for (int i = 0; i < shh.length; i++) {
            shh[i].getPaid(((int)(Math.random()*1000000)));
            shh[i].payTaxes();
            shh[i].addPet(new Turtle());
//            Cat kitty = (Cat) shh[i].addPet(new Cat());
//            kitty.petFed();
//            kitty.petGroomed();
//            kitty.petPlayedWith();




        }



        //iterate through list or array and perform required actions
    }

}
