package BackEnd;


public class test
{
    public static void main(String [ ] args)
    {
        Dice dice = new Dice(12);
        int number = dice.throwDice();
        System.out.println(number);
        
    }
}
