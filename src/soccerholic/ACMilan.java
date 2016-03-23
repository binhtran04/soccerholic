package soccerholic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ACMilan {

    private int point = 0;

    private String question[] = {
        "What is the full name of AC Milan?",
        "When was Milan founded?",
        "How many occasions European Cup/Champion League did Milan win?",
        "How many league titles Milan has?",
        "Milan’s San Siro stadium has another name, what is it?",
        "What is Milan’s biggest rival?",
        "The matches between Milan and Inter are called?",
        "What is the nick name of AC Milan?",
        "What are the colors of their traditional kit?",
        "How many Champion League titles did Carlo Ancelotti bring to Milan?",
        "The star above the logo was awarded to Milan after winning 10 league titles in what year?",
        "In what position regarding to supporter Milan has achieved in Europe?",
        "What are the retired numbers in Milan squad?",
        "How many Intercontinental Cups did Milan win?",
        "Who made the most appearances for Milan?",
        "Who is all time top goalscorer for Milan?",
        "In what season Milan was invincible in Serie A?",
        "How many seasons did Paolo Maldini spend at Milan?",
        "Who is the longest served president of AC Milan?",
        "Who was the goalkeeper for AC Milan in Champion League Final in 2005?"               
    };
    
    private String answer[] = {
        "Associazione Calcio Milan",
        "1899",
        "7",
        "18",
        "Stadio Giuseppe Meazza",
        "Inter",
        "Derby della Madonnina",
        "Rossoneri",
        "Red and black",
        "2",
        "1979",
        "7th",
        "3",
        "3",
        "Paolo Maldini",
        "Gunnar Nordahl",
        "1991-92",
        "25",
        "Silvio Berlusconi",
        "Dida"
        };
    
    private String options [] []= {
        {"Air Conditioning Milan","Alternative Current Milan","Associazione Calcio Milan","All Cops Milan"},
        {"1899","1900","1901","1902"},
        {"6","7","8","9"},
        {"16","17","18","19"},
        {"Olimpico","Wembley","Gudison Park","Stadio Giuseppe Meazza"},
        {"Inter","Napoli","Juventus","AS Roma"},
        {"Milan Derby","Italian Derby","Derby della Madonnina","Derby of Milano"},
        {"Rossoneri","The Devil","Vecchia Signora","Nerazzurri"},
        {"White","Red and Black","Blue nad Black","White and Black"},
        {"1","2","3","4"},
        {"1979","1980","1981","1982"},
        {"5th","6th","7th","8th"},
        {"3","5","7","9"},
        {"0","1","2","3"},
        {"Filippo Inzaghi","Andriy Shevchenko","Ricardo Kaka","Paolo Maldini"},
        {"Gunnar Nordahl","Filippo Inzaghi","Ricardo Kaka","Andriy Shevchenko"},
        {"1990-91","1991-92","1992-93","1993-94"},
        {"23","24","25","26"},
        {"Piero Pirelli","Silvio Berlusconi","Felice Riva","Vittorio Duina"},
        {"Michael Agazzi","Sebastiano Rossi","Christian Abbiati","Dida"}
    };
    
    public ACMilan() throws Exception {
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

            while (true) {
                i = random.nextInt(this.question.length);
                if (!num.contains(i)) {
                    num.add(i);
                    break;
                }
            }

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
