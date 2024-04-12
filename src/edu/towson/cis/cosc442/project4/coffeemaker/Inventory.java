package edu.towson.cis.cosc442.project4.coffeemaker;

/**
 * Inventory for the coffee maker
 * 
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Inventory {

    private int coffee;
    private int milk;
    private int sugar;
    private int chocolate;

    public Inventory() {
        coffee = 15;
        milk = 15;
        sugar = 15;
        chocolate = 15;
    }

    /**
     * Method getChocolate.
     * 
     * @return int
     */
    public int getChocolate() {
        return chocolate;
    }

    /**
     * Method setChocolate.
     * 
     * @param chocolate int
     */
    public void setChocolate(int chocolate) {
        if (chocolate >= 0) {
            this.chocolate = chocolate;
        } else {
            this.chocolate = 0;
        }
    }

    /**
     * Method getCoffee.
     * 
     * @return int
     */
    public int getCoffee() {
        return coffee;
    }

    /**
     * Method setCoffee.
     * 
     * @param coffee int
     */
    public void setCoffee(int coffee) {
        if (coffee >= 0) {
            this.coffee = coffee;
        } else {
            this.coffee = 0;
        }
    }

    /**
     * Method getMilk.
     * 
     * @return int
     */
    public int getMilk() {
        return milk;
    }

    /**
     * Method setMilk.
     * 
     * @param milk int
     */
    public void setMilk(int milk) {
        if (milk >= 0) {
            this.milk = milk;
        } else {
            this.milk = 0;
        }
    }

    /**
     * Method getSugar.
     * 
     * @return int
     */
    public int getSugar() {
        return sugar;
    }

    /**
     * Method setSugar.
     * 
     * @param sugar int
     */
    public void setSugar(int sugar) {
        if (sugar >= 0) {
            this.sugar = sugar;
        } else {
            this.sugar = 0;
        }
    }

    /**
     * Returns true if there are enough ingredients to make
     * the beverage.
     * 
     * @param r
     * 
     * @return boolean
     */
    public boolean enoughIngredients(Recipe r) {
        return coffee >= r.getAmtCoffee() && milk >= r.getAmtMilk() && sugar >= r.getAmtSugar()
                && chocolate >= r.getAmtChocolate();
    }

    /**
     * Method toString.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Coffee: " + coffee + "\n" +
                "Milk: " + milk + "\n" +
                "Sugar: " + sugar + "\n" +
                "Chocolate: " + chocolate + "\n";
    }
}
