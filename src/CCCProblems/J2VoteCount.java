import java.util.Scanner;

public class J2VoteCount{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int aVotes = 0;
        int bVotes = 0;
        int numOfVotes = input.nextInt();
        char[] votes = input.next().toCharArray();


        for(int i = 0; i > votes.length; i++){
            if(votes[i] == 'A'){
                aVotes++;
                
            }
            else if(votes[i] == 'B'){
                bVotes++;
            }
        }

        if(aVotes > bVotes){
            System.out.println();
        }

        // Create the scanner
        // Ask the user for the number of scores
        // Store that number of votes for A and B (best bet is an array and iterating through an array n number of times)
        // Create logic (prolly an if statement) to check if A > B and the opposite for however long the array is 





    }

}