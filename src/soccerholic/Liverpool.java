package soccerholic;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Liverpool {

    private int point = 0;

    private String question[] = {
        "What is the stadium of Liverpool FC?",
        "When was Liverpool FC born?",
        "When did Liverpool FC win their first League Championship?",
        "In which stadium did Liverpool FC win their first European Cup?",
        "Who is the club’s most successful manager of all time?",
        "In 1977, against which club did Liverpool FC win their first European Cup?",
        "What is the name of Liverpool’s supporters?",
        "How many times did Liverpool FC win the League Championship?",
        "How many European Cups was Liverpool FC crowned?",
        "What year was Bill Shankly appointed as the manager of Liverpool FC?",
        "Steven Gerrard captained the club to win UEFA Champions League in what year?",
        "What title Bob Paisley didn’t win as Liverpool’s boss?",
        "Number 96 related to what in the club?",
        "In what year and with which manager did Liverpool win the astonishing three trophies: FA Cup, League Cup, and UEFA Cup? ",
        "How many goals did Kenny Dalglish score for Liverpool FC?",
        "Who is the all times scorers for the club?",
        "Who scored the fastest hat-trick in the club history?",
        "Who made the most appearances for the club?",
        "Who is the most expensive player the club have bought?",
        "When was the first League Cup for the club?"
    };

    private String answer[] = {
        "Anfield",
        "1892",
        "1901",
        "Stadio Olimpico",
        "Bob Paisley",
        "Borussia Monchengladbach",
        "Liverpudlian",
        "18",
        "5",
        "1959",
        "2005",
        "FA Cup",
        "Hillsborough",
        "2001 Gerard Houllier",
        "172",
        "Ian Rush",
        "Robbie Fowler",
        "Ian Callaghan",
        "Andy Carroll",
        "1981"
    };
    private String options[][] = {
        {"Liverpool Stadium", "Anfield", "San Siro", "Emirates"},
        {"1890", "1891", "1892", "1893"},
        {"1895", "1900", "1901", "1912"},
        {"Stadio Olimpico", "Istanbul", "Anfield", "Wembly"},
        {"Bob Paisley", "Bill Shankly", "King Kenny", "Rafa Benitez"},
        {"AC Milan", "Borussia Dortmund", "Borussia Monchengladbach", "AS Roma"},
        {"LFC Fan", "Liverpudlian", "Kopite", "Scouse"},
        {"16", "17", "18", "19"},
        {"4", "5", "6", "7"},
        {"2001", "1992", "1979", "1959"},
        {"2005", "2007", "1997", "2001"},
        {"League Cup", "UEFA Cup", "Leauge Championship", "FA Cup"},
        {"Helsey", "Hillsborough", "Number of tropies", "A year"},
        {"2005 Rafa Benitez", "2001 Gerard Houllier", "1995 King Kenny", "1967 Bob Paisley"},
        {"152", "172", "212", "222"},
        {"Ian Rush", "Robbie Fowler", "King Kenny", "Steven Gerrard"},
        {"Steven Gerrard", "Robbie Fowler", "King Kenny", "Fernendo Torres"},
        {"Jamie Carragher", "King Kenny", "Robbie Fowler", "Ian Callaghan"},
        {"Fernendo Torres", "Luis Suarez", "Andy Carroll", "Stuard Downing"},
        {"1961", "1971", "1981", "1991"}
    };

    public Liverpool() throws Exception {
        Scanner reader;
        reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();
        int r = 0;
        int i = 0;
        
        //open words
        System.out.println("In this part, you have to choose one among 4 options"
                + "\ncorrect answer give you one point, incorrect answer give you zero"
                + "\nyou have to reach at least 70% correct of answers to be approved to the club."
                + "\nGood Luck!!! ");
        Thread.sleep(1500);

        while (r < this.question.length) {
            //random question
            while (true) {
                i = random.nextInt(this.question.length);
                if (!num.contains(i)) {
                    num.add(i);
                    break;
                }
            }
            //print question
            System.out.println(this.question[i]);
            Thread.sleep(500);
            System.out.println(">> " + this.options[i][0]);
            Thread.sleep(300);
            System.out.println(">> " + this.options[i][1]);
            Thread.sleep(300);
            System.out.println(">> " + this.options[i][2]);
            Thread.sleep(300);
            System.out.println(">> " + this.options[i][3]);
            Thread.sleep(300);
            System.out.println("");
            
            //Get input
            String input = null;
            while (true) {
                System.out.print("Type your answer: ");
                input = reader.nextLine();
                
                if (input.equalsIgnoreCase("menu")) {
                    Soccerholic.printMenu();
                }else if (!input.equalsIgnoreCase(this.options[i][0])
                        && !input.equalsIgnoreCase(this.options[i][1])
                        && !input.equalsIgnoreCase(this.options[i][2])
                        && !input.equalsIgnoreCase(this.options[i][3])
                        && !input.equalsIgnoreCase("change")
                        && !input.equalsIgnoreCase("quit")){
                    System.out.println("Invalid aswer!!!");                    
                }else {
                    break;
                }
            }
            
            if (input.equalsIgnoreCase("change")) {
                break;
            } else if (input.equalsIgnoreCase("quit")) {
                break;
            }

            Thread.sleep(500);

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
            r++;

        }
        
        
        System.out.println("********************");
        System.out.println("Your final point: " + this.point + "/20\n");

        if (this.point >= 14) {

            System.out.println("CONGRATULATION !!!");
            Thread.sleep(1000);
            System.out.println("You have passed 70% of the test!");
            Thread.sleep(500);
            System.out.println("You have a good knowledge about the club.");
            System.out.println("You are now a  member of the club.\n");

        } else {
            System.out.println("Unfortunately! You cannot reach 70% correct of answeers");
            Thread.sleep(500);
            System.out.println("Your knowledge about the club is not enough");
            System.out.println("You are not qualified to join our club.\n");
        }
        Thread.sleep(1000);
    }

}
