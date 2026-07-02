import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class S1EnglishOrFrench {
    public static void main(String[] args) throws IOException {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int textNumLines = Integer.parseInt(input.readLine());
        int countT = 0;
        int countS = 0;


        for(int i = 0; i < textNumLines; i++){
            String textLine = input.readLine();
            String[] characterArray = textLine.split("");
            for(int k = 0; k < characterArray.length; k++){
                if(characterArray[k].equals("T") || characterArray[k].equals("t")){
                    ++countT;
                }
                else if(characterArray[k].equals("S") || characterArray[k].equals("s")){
                    ++countS;
                }
            }
        }
        if(countT > countS){
            System.out.println("English");
        }
        else if(countS > countT || countS == countT){
            System.out.println("French");
        }

    }
}
