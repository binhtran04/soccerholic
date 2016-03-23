package soccerholic;

import java.util.Scanner;

public class Barcelona {

    private int point = 0;

    private String question[] = {
        "1.What colours are Barcelona's home colours?",
        "2.Who wears the no.14 shirt for Barcelona?",
        "3.What is the name of Barcelona's home stadium?",
        "4.Which team did Barcelona buy Ronaldinho from?",
        "5.Who makes Barcelona's kit?",
        "6.What charity sponsors Barcelona?",
        "7.What country does Barcelona's Lionel Messi come from?",
        "8.What league position did Barcelona come in the 07/08 season?",
        "9.What number did Ronaldinho wear during his time at Barcelona?",
        "10.What is the capacity of Barcelona's Canp Nou?",
        "1.When were Barcelona founded?",
        "2.Who founded Barcelona?",
        "3.Who is the manager of Barcelona?",
        "4.Who knocked Barcelona out of the semi-finals last season?",
        "5.Who is Barcelona’s kit manufacturer?",
        "6.When did Barcelona last win the la liga?",
        "7.How many times have Barcelona won the club World Cup?",
        "8.Which Barcelona player has won the most Ballon d'ors?",
        "9.What is Barcelona’s stadium called?",
        "10.Trick question. What was the score in Barcelona’s first league game this season?",
        "1.Who is Barcelona president now?",
        "2.Who´s Barcelona actual Captain?",
        "3.What two players where nominated from Barcelona for the Goal ball?",
        "4.How many Champions league has Barcelona win?",
        "5.What´s the name of Barcelona Mexican player?",
        "6.Which one of this coaches trained the team called as the \" dream team \"?",
        "7.Who´s Barcelona new start in the 2005/2006 league?",
        "8.Of what colour is Barcelona second t-shirt for the 2005/2006?",
        "9.How many goals did Etoo scored in the Spanish League during the 2004/2005?",
        "10.What's Ronaldinho's real name?"
    };

    private String answer[] = {
        "Blue and Maroon",
        "Thierry Henry",
        "The Mestella",
        "AC Milan",
        "Adidas",
        "Unicef",
        "Argentina",
        "1st",
        "10",
        "10000",
        "1899",
        "Joan Gamper",
        "Gerardo Martino",
        "Chelsea",
        "Adidas",
        "2009",
        "2",
        "Messi",
        "Camp Nou",
        "5-1",
        "Joan Laporta",
        "Messi",
        "Ronaldinho, Deco",
        "2",
        "Iniesta",
        "Eriksson",
        "Mark van Bommel",
        "Red",
        "22",
        "Ronaldinho"
    };

    private String options[][] = {
        {"Blue and Maroon", "Black and Gold", "Blue"},
        {"Thierry Henry", "Lionel Messi", "Samuel Eto'o"},
        {"The Mestella", "Santiago Bernabeu", "Santiago Bernabeu"},
        {"Brazil", "AC Milan", "PSG"},
        {"Adidas", "Reebok", "Nike"},
        {"Unicef", "Trocaire", "Goal"},
        {"Argentina", "Spain", "Brazil"},
        {"5th", "1st", "3rd"},
        {"7", "10", "11"},
        {"80000", "120000", "10000"},
        {"1899", "1892", "1882"},
        {"Joan Gamper", "Jon Kamper", "Juan Gamper"},
        {"Tito Vilanova", "Gerardo Martino", "Pep Guardiola"},
        {"Real Madrid", "Chelsea", "Bayern Munich"},
        {"Puma", "Nike", "Adidas"},
        {"2011", "2013", "2009"},
        {"1", "2", "3"},
        {"Xavi", "Messi", "Valdes"},
        {"Camp Nou", "New Camp", "Santiago Bernabeu"},
        {"1-5", "5-1", "7-0"},
        {"Joan Laporta", "Nunez", "Joan Gaspart"},
        {"Messi", "Edmilson", "Carles Puyol"},
        {"Ronaldinho, Etoo", "Etoo, Deco", "Ronaldinho, Deco"},
        {"1", "2", "3"},
        {"Marquez", "Maxi Lopez", "Iniesta"},
        {"Johan Cruyff", "Boby Robson", "Eriksson"},
        {"Henrik Larsson", "Andres Iniesta", "Mark van Bommel"},
        {"Yellow", "Red", "Pink"},
        {"22", "24", "26"},
        {"Ronaldo de Assis", "Arleina Ronaldo petit", "Ronaldinho"}
    };

    public Barcelona() throws Exception {
        Scanner reader;
        reader = new Scanner(System.in);

        //open words
        System.out.println("Welcome to the glory time of Barcelona FC!\n");
        Thread.sleep(1000);
        System.out.println("There are three different level: easy, medium, and difficult");
        System.out.println("Give 6 correct answers out of 10 to win each level.");
        System.out.println("You have to pass all three levels to win the game\n");
        System.out.println("Let's start!!!\n");
        Thread.sleep(1500);

        int i = 0;
        while (i < 30) {
            //print level
            if (i == 0) {
                System.out.println("Level: EASY\n");
                System.out.println("Let's start with some basics!");
            } else if (i == 10) {
                System.out.println("Level: MEDIUM\n");
                System.out.println("Now you've enter the medium level,feel excited?");
                System.out.println("Alrighty,let's get down to it.");
                System.out.println("");
            } else if (i == 20) {
                System.out.println("Level: DIFFICULT\n");
                System.out.println("Alright,now that you've chosen the most difficult part");
                System.out.println("Get ready for it!");
                System.out.println("");
            }
            Thread.sleep(500);

            //print question
            System.out.println(this.question[i]);
            Thread.sleep(500);
            System.out.println(">> " + this.options[i][0]);
            Thread.sleep(300);
            System.out.println(">> " + this.options[i][1]);
            Thread.sleep(300);
            System.out.println(">> " + this.options[i][2]);
            Thread.sleep(300);
            //System.out.println(">> " + this.options[i][3]);
            //Thread.sleep(300);
            System.out.println("");

            //Get input
            String input = null;
            while (true) {
                System.out.print("Type your answer: ");
                input = reader.nextLine();

                if (input.equalsIgnoreCase("menu")) {
                    Soccerholic.printMenu();
                } else if (!input.equalsIgnoreCase(this.options[i][0])
                        && !input.equalsIgnoreCase(this.options[i][1])
                        && !input.equalsIgnoreCase(this.options[i][2])
                       
                        && !input.equalsIgnoreCase("change")
                        && !input.equalsIgnoreCase("quit")) {
                    System.out.println("Invalid aswer!!!");
                } else {
                    break;
                }
            }

            if (input.equalsIgnoreCase("change")) {
                break;
            } else if (input.equalsIgnoreCase("quit")) {
                break;
            }

            Thread.sleep(500);

            //evaluate answer
            if (input.equalsIgnoreCase(this.answer[i])) {
                this.point++;
                System.out.println("CORRECT!");
                Thread.sleep(300);
                System.out.println("Your point: " + this.point);
                System.out.println("----------------------------------------\n");

            } else {
                System.out.println("INCORRECT!");
                Thread.sleep(300);
                System.out.println("The correct anwser is " + this.answer[i]);
                Thread.sleep(300);
                System.out.println("Your point: " + this.point);
                System.out.println("----------------------------------------\n");
            }

            //easy level
            if (i == 9) {
                System.out.println("********************");
                System.out.println("Your final point: " + this.point);
                Thread.sleep(500);
                if (this.point >= 6) {
                    System.out.println("Congratulations!You're qualified to enter the next level!\n");
                    this.point = 0;
                    Thread.sleep(1500);
                } else if (this.point < 6) {
                    System.out.println("You're not a fan,man.I'm serious.");
                    System.out.println("You lose the game!!!");
                    break;
                }
                //medium level    
            } else if (i == 19) {
                System.out.println("********************");
                System.out.println("Your final point: " + this.point);
                Thread.sleep(500);
                if (this.point >= 6) {
                    System.out.println("Congrats! My friend,go ahead and challenge the difficult one!\n");
                    this.point = 0;
                    Thread.sleep(1500);
                } else if (this.point < 6) {
                    System.out.println("Seems you're not a big fan of Barcelona");
                    System.out.println("You lose the game!!!");
                    break;
                }
                //difficult level    
            } else if (i == 29) {
                System.out.println("********************");
                System.out.println("Your final point: " + this.point);
                Thread.sleep(500);
                if (this.point >= 6) {
                    System.out.println("You're indeed a big fan,no doubt!\n");
                    System.out.println("You WIN the game!!!");
                    this.point = 0;
                    Thread.sleep(1500);
                } else if (this.point < 6) {
                    System.out.println("You're good ,just not enough to earn the title.");
                    System.out.println("You lose the game!!!");
                    break;
                }
            }

            i++;

        }
        System.out.println("\n\n");
        Thread.sleep(2000);
    }
}
