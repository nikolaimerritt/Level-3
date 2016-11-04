
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Character;

public class StringHandling
{   
    public static void main(String[] args)
    {
        Task1();
        Task2();
    }
    
    public static String GetInput(String iT)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(iT);
        String out = input.nextLine();
        return out;
    }
    
    public static void Task1()
    {
        String origText = GetInput("original text: ");
        Integer shiftBy = Integer.parseInt(GetInput("How much do you want to shift by? "));
        int newInt;
        String newText = "";
        char oldLetter;
        String newLetter;
        for (int i = 0; i < origText.length(); i++)
        {
            oldLetter = origText.charAt(i);
            newInt = (int) oldLetter + shiftBy;
            newLetter = Character.toString((char) newInt);
            newText += newLetter;
            
        }
        System.out.println(newText);
    }
    
    public static void Task2()
    {
        String inputText = GetInput("Enter text to test: ");
        String revText = "";
        for (int i = 0; i < inputText.length(); i++)
        {
            revText += inputText.charAt(inputText.length() - (i + 1));
        }
        if (revText.equals(inputText)) { System.out.println("Palindrome! :D"); } else { System.out.println("Not a palindrome D:"); }
    }
}










