public class DiceGame
{
    private Die die1;
    private Die die2;
    private Player player;
    private int currentTotal;
    private boolean snakeEyes;

    public DiceGame(Player player, int sides)
    {
        this.player = player;
        die1 = new Die(sides);
        die2 = new Die(sides);
        currentTotal = 0;
        snakeEyes = false;
    }

    public int getCurrentTotal()
    {
        return currentTotal;
    }

    /* Rolls each of the two dice,
       then adds the sum to currentTotal

       If the roller rolls doubles
       (both dice are the same number),
       add only a single die (e.g. add 5 instead
       of 10 if they roll two 5's).

       If the roll is snake eyes (two 1's), set
       snakeEyes to true; otherwise set it to false.
       Do NOT update the score with snake eyee.

       Print out a message:
       - If die1 and die2 are different
        "You rolled __ and ___"
        "Your total is ___"
        "Your threshold is ___"

       - If they rolled snake eyes (two 1's):
        "You rolled snake eyes!"

       - If they rolled any other double:
        "You rolled two ___"
        "Your total is ___"
        "Your threshold is ___"
    */
    public void roll()
    {
        /* implement this method */
    }

    /* Returns -1 if the user "busted" and lost the game, which
       occurs if currentTotal exceeds player's threshhold OR if the
       latest roll was snake eyes (double 1's)

       Returns 0 if the user "won jackpot!", which occurs
       if currentTotal is within 2 of the player's threshold, without going over

       Returns 1 if the user "get your money back", which occurs if the player didn't
       bust (lose), but also didn't win the jackpot (i.e. the current total is more
       than 2 away from threshold).
     */
    public int winningStatus()
    {
    /* implement this method per specs above; 0 returned below as
       default value so file can compile */
        return 0;
    }
}
