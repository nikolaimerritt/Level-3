import java.util.Scanner;
public class ISBNNum
{
    public static void main(String[] args)
    {
        
    }
    
    public String GetISBN(String toPrint)
    {
        Scanner sc = new Scanner(System.in);
        String isbn = "";
        System.out.println(toPrint);
        do 
        {
            isbn = sc.nextLine();
            if (isbn.length() != 13) { System.out.println("ISBN length must be 13"); }
        } while (isbn.length() != 13);
        return isbn;
    }
    
    public int GetISBNRemainder(String isbn)
    {
        String isbnString = "";
        int isbnInt = 0;
        int isbnTotalInt = 0;
        int isbnRem = 0;
        for (int i = 0; i < (isbn.length() - 1); i++) //doing -1 so it wont work on the check number at the end
        {
            isbnString = String.valueOf(isbn.charAt(i));
            isbnInt = Integer.parseInt(isbnString);
            if (i % 2 == 1) { isbnInt *= 3; } //doing this to get weight of isbn number
            isbnTotalInt += isbnInt;
        }        
        return isbnRem;
    }
}