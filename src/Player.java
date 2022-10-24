public class Player
{
    private String name;
    private int threshold;

    public Player(String name, int threshold)
    {
        this.name = name;
        this.threshold = threshold;
    }

    public String getName()
    {
        return name;
    }

    public int getThreshold()
    {
        return threshold;
    }
}
