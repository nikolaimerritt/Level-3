import java.util.Random;
import java.util.Scanner;
public class ChanceGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nHow much do ya wanna bet? "); int bet = sc.nextInt();
        p("\nYou ended up with " + chance(bet));
    }
    
    
    public static int chance(int betSum)
    {
        int payload = 0;
        int randNum = randInt(0, 30);
        p(String.valueOf(randNum));
        if (randNum % 2 == 0) { payload = 2 * betSum; p("It's even. Double bonus!"); }
        else if (randNum % 10 == 0) { payload = 3 * betSum; p("It's divisible by 10. Triple bonus!"); }
        else if (isPrime(randNum)) { payload = 5 * betSum; p("It's prime. 5x bonus! "); }
        else if (randNum < 5) { payload *= 5; p("It's smaller than 5. Double bonus!"); }
        return payload;
    }
    
    
    public static int randInt(int min, int max)
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    
    public static boolean isPrime(int num) 
    {
        boolean prime = true;
        for (int i = 2; i <= num; i++)
        {
            if (i != num)
            {
                if (num % i == 0)
                {
                    prime = false;
                }
            }
        }
        return prime;
    }
    
    public static void p(String toPrint)
    {
        System.out.println(toPrint);
    }
}