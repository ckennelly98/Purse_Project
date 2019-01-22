public class PurseTester {
    public static void main(String[] args){

        //testing addCoin and toString
        Purse purseA = new Purse();
        purseA.addCoin("Quarter");
        purseA.addCoin("Dime");
        purseA.addCoin("Nickel");

        System.out.println(purseA.toString());

        //testing reverse
        System.out.println("Before reverse: " + purseA);
        System.out.println("After reverse: " + purseA.reverse());

        Purse purseB = new Purse();
        purseB.addCoin("Penny");
        purseB.addCoin("Nickel");
        purseB.addCoin("Dime");
        purseB.addCoin("Quarter");

        System.out.println(purseB.toString());

        //testing sameContents with false return
        System.out.println(purseA.sameContents(purseB));


        //testing transfer
        System.out.println("Before transfer: " + "\n" + purseA.toString() + "\n" + purseB.toString());

        purseA.transfer(purseB);

        System.out.println("After transfer: " + "\n" + purseA.toString() + "\n" + purseB.toString());

        //testing sameContents with true return
        Purse purseC = new Purse();
        purseC.addCoin("Quarter");
        purseC.addCoin("Dime");
        purseC.addCoin("Nickel");

        System.out.println(purseC.toString());

        Purse purseD = new Purse();
        purseD.addCoin("Quater");
        purseD.addCoin("Dime");
        purseD.addCoin("Nickel");


        System.out.println(purseD.toString());


        System.out.println(purseC.sameContents(purseD));
    }
}
