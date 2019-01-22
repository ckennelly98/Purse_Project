import java.util.ArrayList;
/**
 * A purse holds a collection of coins
 * @author Colin Kennelly
 */
public class Purse {
    ArrayList<String> purseCoins;
    /**
     * Constructs an empty purse.
     */
    public Purse(){
        purseCoins = new ArrayList<String>();
    }
    /**
     * Add a coin to the purse
     * @param coinName the coin to add
     */
    public void addCoin(String coinName){
        purseCoins.add(coinName);
    }
    /**
     * Return a string describing the object
     * @return a string in the format "Purse[coinName1, coinName2, ...]"
     */
    public String toString(){
        if (purseCoins.size() == 0)
            return "Purse[]";
        String output = "Purse[";
        for (String coin : purseCoins)
        output = output + coin + ", ";
        // remove the last ", "
        output = output.substring(0, output.length() - 2);
        return output + "]";
    }

    public String reverse(){
        String front = "Purse[";
        String output = "";
        for(String next: purseCoins)
        output = next + ", " + output;

        output = output.substring(0, output.length() - 2);

        return front + output + "]";

    }

    public void transfer(Purse otherPurse){
        //transfer coins from otherPurse to Purse
        purseCoins.addAll(otherPurse.purseCoins);


        //remove coins from otherPurse
        otherPurse.purseCoins.clear();
    }

    public boolean sameContents(Purse otherPurse){
        //create boolean
        Boolean sameCoin = true;

        //check if the length of each list is the same
        if(this.purseCoins.size() != otherPurse.purseCoins.size())
            return false;

        //checks each index if they have the same string
        for(int k = 0; k < this.purseCoins.size(); k++){
            if(this.purseCoins.get(k) != otherPurse.purseCoins.get(k))
                return true;
        }
        return true;
    }
}
