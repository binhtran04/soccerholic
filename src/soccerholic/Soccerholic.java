package soccerholic;

import java.util.Scanner;

public class Soccerholic {

    public static void printWelcomeBoard() throws Exception {
        System.out.println("--------SOCCERHOLIC--------");
        System.out.println(" Welcome to Soccerholic!!!");
        System.out.println("***************************");
        System.out.println("");
        Thread.sleep(500);
        System.out.print("Loading ");
        Thread.sleep(500);
        System.out.print(". ");
        Thread.sleep(500);
        System.out.print(". ");
        Thread.sleep(500);
        System.out.print(". ");
        Thread.sleep(500);
        System.out.print(". ");
        Thread.sleep(500);
        System.out.print(". ");
        Thread.sleep(500);
        System.out.print(". ");
        Thread.sleep(500);
        System.out.println("");
        System.out.println("");
    }

    public static void printMenu() {
        System.out.println("***** MENU *****");
        System.out.println("menu - to print this menu");
        System.out.println("change - to change club");
        System.out.println("quit - to quit");
        System.out.println("");
        System.out.println("");
    }

    public static void printStory() throws Exception {
        System.out.println("It is the winter transfer time. While the clubs are finding good players for there teams,"
                + "\nthere are also many players searching for"
                + "their suitable (and also so favorite) clubs.\n");
        Thread.sleep(1000);

        System.out.println("In the market, there are 6 HOT names that every players desire to join: "
                + "Liverpool, Manchester United, Chelsea, Barcalona, AC Milan, Real Madrid.\n");
        Thread.sleep(1000);

        System.out.println("You are a very good player that every team wants you. "
                + "You can choose any team you want to play for. \n");
        Thread.sleep(1000);

        System.out.println("The only thing is that you have to past a test on how well do you know the club.\n");
        Thread.sleep(1000);

        System.out.println("****** Now let your journey begin ******\n");
        Thread.sleep(1000);

        System.out.println("CLUBS: Liverpool, Manchester United, Chelsea, Barcelona, AC Milan, Real Madrid.");

    }

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        printWelcomeBoard();

        printMenu();
        Thread.sleep(2000);

        printStory();

        while (true) {
            System.out.println("Please select your club: ");
            String input = reader.nextLine();
            System.out.println("");

            if (input.equalsIgnoreCase("quit")) {
                break;
            } else if (input.equalsIgnoreCase("change")) {
                continue;
            } else if (input.equalsIgnoreCase("menu")) {
                printMenu();
            }

            if (input.equalsIgnoreCase("Liverpool")) {
                new Liverpool();
                System.out.println("You have finished your journey with Liverpool");
                System.out.println("Type quit to quit or type any key to change club: ");
                String changeOrQuit = reader.nextLine();
                if (changeOrQuit.equalsIgnoreCase("quit")) {
                    break;
                }

            } else if (input.equalsIgnoreCase("AC Milan")) {
                new ACMilan();
                System.out.println("You have finished your journey with AC Milan");
                System.out.println("Type quit to quit or type any key to change club: ");
                String changeOrQuit = reader.nextLine();
                if (changeOrQuit.equalsIgnoreCase("quit")) {
                    break;
                }
            } else if (input.equalsIgnoreCase("Real") || input.equalsIgnoreCase("Real Madrid")) {
                new Real();
                System.out.println("You have finished your journey with Real Madrid");
                System.out.println("Type quit to quit or type any key to change club: ");
                String changeOrQuit = reader.nextLine();
                if (changeOrQuit.equalsIgnoreCase("quit")) {
                    break;
                }
            } else if (input.equalsIgnoreCase("Chelsea")) {
                new Chelsea();
                System.out.println("You have finished your journey with Chelsea");
                System.out.println("Type quit to quit or type any key to change club: ");
                String changeOrQuit = reader.nextLine();
                if (changeOrQuit.equalsIgnoreCase("quit")) {
                    break;
                }
            }else if (input.equalsIgnoreCase("MU") || input.equalsIgnoreCase("manchester united")) {
                new MU();
                System.out.println("You have finished your journey with Manchester United");
                System.out.println("Type quit to quit or type any key to change club: ");
                String changeOrQuit = reader.nextLine();
                if (changeOrQuit.equalsIgnoreCase("quit")) {
                    break;
                }
            }else if (input.equalsIgnoreCase("Barcelona") || input.equalsIgnoreCase("Barca")) {
                new Barcelona();
                System.out.println("You have finished your journey with Barcelona");
                System.out.println("Type quit to quit or type any key to change club: ");
                String changeOrQuit = reader.nextLine();
                if (changeOrQuit.equalsIgnoreCase("quit")) {
                    break;
                }
            }
        }
        System.out.println("Thank you very much for playing Soccerholic.");

    }

}
