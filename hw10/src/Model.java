/**
 * Model.java:
 * This class build a pizza model
 *
 * @author Sishi Cheng
 */
public class Model {

    //Create a string variable named size
    private String size;

    //Create a boolean variable named peppers
    private boolean peppers;

    //Create a boolean variable named onions
    private boolean onions;

    //Create a boolean variable named mushrooms
    private boolean mushrooms;

    //Create a boolean variable named olives
    private boolean olives;

    //Create a boolean variable named bananaPeppers
    private boolean bananaPeppers;


    //Create a boolean variable named ham
    private boolean ham;

    //Create a boolean variable named pepperoni
    private boolean pepperoni;

    //Create a boolean variable named sausages
    private boolean sausage;

    //Create a boolean variable named salami
    private boolean salami;

    //Create a boolean variable named chicken
    private boolean chicken;

    //Create a boolean variable named steak
    private boolean steak;

    //Create a double variable named price
    private double price = 0.00;

    //Create a int variable count the number of the types of meats
    private int meatsNum = 0;

    /**
     * Constructor that initialize the instance variables
     */
    public Model( ) {

        //Initialize the size to small
        size = "Small";

        //Initialize the price to 0.00
        price = 0.00;

        //Initialize the veggies' toppings boolean to false
        peppers = onions = mushrooms = olives = bananaPeppers = false;

        //Initialize the meats' toppings boolean to false
        ham = pepperoni = sausage = salami = chicken = steak = false;
    }

    /**
     * Set the size of the pizza
     *
     * @param s the size of the pizza
     */
    public void setSize( String s )
    {
        size = s;
    }

    /**
     * get the size of the pizza
     *
     * @return the size of the pizza
     */
    public String getSize()
    {
        return size;
    }

    /**
     * Set the peppers boolean to true
     */
    public void setPeppers()
    {
        price += 0.50;
        peppers = true;
    }

    /**
     * get the value of peppers boolean
     *
     * @return the peppers boolean
     */
    public boolean getPeppers()
    {
        return peppers;
    }

    /**
     * Set the onions boolean to true
     */
    public void setOnions()
    {
        price += 0.50;
        onions = true;
    }

    /**
     * get the value of onions boolean
     *
     * @return the onions boolean
     */
    public boolean getOnions()
    {
        return onions;
    }

    /**
     * Set the mushrooms boolean to true
     */
    public void setMushrooms()
    {
        price += 0.50;
        mushrooms = true;
    }

    /**
     * get the value of mushrooms boolean
     *
     * @return the mushrooms boolean
     */
    public boolean getMushrooms()
    {
        return mushrooms;
    }

    /**
     * Set the olives boolean to true
     */
    public void setOlives()
    {
        price += 0.50;
        olives = true;
    }

    /**
     * get the value of olives boolean
     *
     * @return the olives boolean
     */
    public boolean getOlives()
    {
        return olives;
    }

    /**
     * Set the bananaPeppers boolean to true
     */
    public void setBananaPeppers()
    {
        price += 0.50;
        bananaPeppers = true;
    }

    /**
     * get the value of bananaPeppers boolean
     *
     * @return the bananaPeppers boolean
     */
    public boolean getBananaPeppers()
    {
        return bananaPeppers;
    }

    /**
     * Set the ham boolean to true
     */
    public void setHam()
    {
        meatsNum += 1;
        ham = true;
        meatsPrice( meatsNum );
    }

    /**
     * get the value of ham boolean
     *
     * @return the ham boolean
     */
    public boolean getHam()
    {
        return ham;
    }

    /**
     * Set the pepperoni boolean to true
     */
    public void setPepperoni()
    {
        meatsNum += 1;
        pepperoni = true;
        meatsPrice( meatsNum );
    }

    /**
     * get the value of pepperoni boolean
     *
     * @return the pepperoni boolean
     */
    public boolean getPepperoni()
    {
        return pepperoni;
    }

    /**
     * Set the sausage boolean to true
     */
    public void setSausage()
    {
        meatsNum += 1;
        sausage = true;
        meatsPrice( meatsNum );
    }

    /**
     * get the value of sausage boolean
     *
     * @return the sausage boolean
     */
    public boolean getSausage()
    {
        return sausage;
    }

    /**
     * Set the salami boolean to true
     */
    public void setSalami()
    {
        meatsNum += 1;
        salami = true;
        meatsPrice( meatsNum );
    }

    /**
     * get the value of salami boolean
     *
     * @return the salami boolean
     */
    public boolean getSalami()
    {
        return salami;
    }

    /**
     * Set the chicken boolean to true
     */
    public void setChicken()
    {
        meatsNum += 1;
        chicken = true;
        meatsPrice( meatsNum );
    }

    /**
     * get the value of chicken boolean
     *
     * @return the chicken boolean
     */
    public boolean getChicken()
    {
        return chicken;
    }

    /**
     * Set the steak boolean to true
     */
    public void setSteak()
    {
        meatsNum += 1;
        steak = true;
        meatsPrice( meatsNum );
    }

    /**
     * get the value of steak boolean
     *
     * @return the steak boolean
     */
    public boolean getSteak()
    {
        return steak;
    }

    /**
     * add the meats topping price to the price variable
     *
     * @param m the number of the meat toppings
     */
    public void meatsPrice( int m )
    {
        if ( meatsNum <= 2 ) {
            price += 2.00;
        }
        else {
            price += 1.50;
        }
    }

    /**
     * get the total price of the pizza
     *
     * @return the price of the pizza
     */
    public double getPrice()
    {
        if( size.equals( "Small" )) {
            price += 10.00;
        }
        else if( size.equals( "Medium" )) {
            price += 11.00;
        }
        else{
            price += 12.00;
        }

        if( meatsNum > 2 )
        {
            price -= 1.00;
        }

        return price;
    }
}
