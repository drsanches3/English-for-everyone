package statistics;

import java.util.Scanner;

public class Statistics {
    
    public static void getStatistics(String[] args) {
        if (args.length == 0) {
            System.out.print("Session id: ");
            String sessionId = (new Scanner(System.in)).nextLine();
            serverGetStatistics(sessionId);
        }
        else if (args.length == 1) {
            String sessionId = args[0];
            serverGetStatistics(sessionId);
        }
        else {
            System.out.println("Incorrect count of arguments.");
        }
    }

    private static void serverGetStatistics(String sessionId) {
        //TODO: Write code
    }
}
