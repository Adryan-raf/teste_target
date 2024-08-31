import java.util.Scanner;

public class LetterACounter {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = input.nextLine();

        int count = countLetterA(str);

        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') ocorre " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não foi encontrada na string.");
        }

        input.close();
    }
 
    public static int countLetterA(String input) {
        int count = 0;
        
        char[] characters = input.toCharArray();
        
        for (char c : characters) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
