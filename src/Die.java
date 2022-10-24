public class Die
{
    private int sides;
    private int roll;

    // Precondition: sides >= 4
    public Die(int sides)
    {
        this.sides = sides;
        roll = 0;
    }

    public int getRoll()
    {
        return roll;
    }

    /* Sets the die to a random number from
       1 to number of sides
    */
    public void rollDie()
    {
        /* implement this method */
    }
}

