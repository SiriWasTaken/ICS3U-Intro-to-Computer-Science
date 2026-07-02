import java.util.Scanner;

public class PasswordGenerator {
    /**
     * Generate a password of length n
     * @author Nucci
     * @param args
     */
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    // Read the length of pwd the user wants
    System.out.print("Please enter a password length: ");
    int passLength = scan.nextInt();
    System.out.println();

    int iterations = 0;
    String passwordString = "";
    while(passLength > iterations){
        char rand = (char)(Math.random() * ('z' - '0' + 1) + '0');
        if(rand >= '0' && rand <= '9' || rand >= 'A' && rand <= 'Z' || rand >= 'a' && rand <= 'z'){
            passwordString += rand;
            iterations++;
        }
        else{
            System.out.println("char: " + rand);
        }
    }
    System.out.println("Your password is: " + passwordString);
}
}