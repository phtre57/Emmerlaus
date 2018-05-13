package BackEnd;

import java.util.Random;

public class Dice
{
    private int numberOfFaces;

    public Dice(int numberOfFaces){
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDice(){
        Random randomNumber = new Random();
        return randomNumber.nextInt(this.numberOfFaces-1) + 1;
    }
}
