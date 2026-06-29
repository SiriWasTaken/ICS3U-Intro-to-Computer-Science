/*
 * Author: Sri Ganty
 * Date: June 29, 2026
 * Problem: CCC '26 J1 - Concert Tickets
 * Description: Reads the number of tickets Besa wants, the total number
 * of tickets, and the number already purchased. Calculates whether Besa
 * can buy the requested tickets and prints the required output.
 */

import java.util.Scanner;
public class CCCJ1ConcertTickets {
   /**
 * Reads ticket information, determines whether Besa can purchase
 * the requested tickets, and prints the result.
 *
 * @param args Command-line arguments
 */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int besaRequests = input.nextInt();
        int totalTickets = input.nextInt();
        int ticketsSold = input.nextInt();
        int ticketsRemaining = totalTickets - ticketsSold - besaRequests;
        // Calculate how many tickets would remain if Besa purchased the requested number of tickets.
        if(ticketsRemaining >= 0){
            System.out.println("Y " + ticketsRemaining);
        }
        else{
            System.out.println("N");
        }

        input.close();
    }
}