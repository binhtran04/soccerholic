package soccerholic;

import java.util.Scanner;

public class Real {

    private int point = 0;

    private String question[] = {
        "1)How many La Liga titles has Real Madrid won?",
        "2)How many  UEFA Champions Leagues has Real Madrid won?",
        "3)How many consecutive Spanish championships has Real Madrid won?",
        "4)Who was the first player of Real Madrid to win the Pichichi award four times in a row?",
        "5)Who is Madrid's all-time top scorer?",
        "6)Cristiano Ronaldo scored Real Madrid's fastest hat-trick.In how many minutes did he do that?",
        "7)When did Madrid received their 'Real' (royal) title?",
        "8)Which is the biggest ever win of Real Madrid in any competition ever(The goal difference)?",
        "9)How many times have Real Madrid appeared in the semi finals of the European Cup/Champions League,which is a record in the competition?",
        "10)What was the lowest ever placing of Real Madrid in La Liga ?",
        "11)How many goals did Cristiano Ronalndo score in a single La Liga season which was a record ?",
        "12)Who is the latest Real Madrid player to score quintuple(5) goals in a single game?",
        "13)Who is the only player of Real Madrid who haswon La Liga, the Copa del Rey, the Champions League, Intercontinental Cup, Uefa Super Cup, Spanish Supercopa, as well as a European Championship and a World Cup?",
        "14)How many games have Real Madrid won in 146 league matches played against Atletico Madrid?",
        "15)Which of the following club haven't played all the La Liga edition(Total 81 till now)?",
        "16)Who scored Real Madrid's first goal in European cup?",
        "17)Which of the following player scored Real Madrid's first 1000th club goal?",
        "18)How many La Liga series have Real Madrid won consecutively?",
        "19)Who was the first Real Madrid's manager?",
        "20) A Harvard University study on football showed that Real Madrid Football Club was the most popular team in the world, with a fan base of over . . . milion supporters ?(Choose the option below)"
    };

    private String answer[] = {
        "31",
        "10",
        "5",
        "Alfredo Di Stefano",
        "Raul",
        "10",
        "June 29,1920",
        "11-1",
        "22",
        "11",
        "40",
        "Fernando Morientes",
        "Iker Casillas",
        "80",
        "Atletico Madrid",
        "Miguel Munoz",
        "Pahino",
        "15",
        "Arthur Johnson",
        "228"
    };

    private String options[][] = {
        {"34", "32", "31", "35"},
        {"8", "9", "10", "11"},
        {"3", "5", "7", "9"},
        {"Atienza", "Ruiz Cervilla", "Herrera", "Alfredo Di Stefano"},
        {"Raul", "Cristiano Ronaldo", "Herrera", "Alfredo Di Stefano"},
        {"8", "10", "12", "14"},
        {"June 29,1917", "June 29,1918", "June 29,1920", "June 29,1919"},
        {"11-1", "11-2", "12-1", "12-2"},
        {"20", "21", "22", "23"},
        {"9", "10", "11", "12"},
        {"34", "36", "38", "40"},
        {"Raul", "Fernando Morientes", "Cristiano Ronaldo", "Alfredo Di Stefano"},
        {"Raul", "Iker Casillas", "Segio Ramos", "Bale"},
        {"73", "85", "80", "68"},
        {"Real madrid", "Barcelona", "Athletic Bilbao", "Atletico Madrid"},
        {"Miguel Munoz", "Zamorano", "Valdano", "Butragueño"},
        {"Gento", "Zamorano", "Juanito", "Pahino"},
        {"13", "15", "17", "19"},
        {"Arthur Johnson", "Juan de Cárcer", "Pedro Llorente", "Lippo Hertzka"},
        {"228", "238", "248", "259"}
    };

    public Real() throws Exception {
        Scanner reader;
        reader = new Scanner(System.in);

        System.out.println("Hello and Welcome!");
        Thread.sleep(500);
        System.out.println("You are about to begin the adventure about knowing yourself ,"
                + "\nabout how much you know about the club you think are "
                + "\na die-heart fan of.Lets see what the result proves you to be");
        System.out.println("\n");
        Thread.sleep(1000);
        System.out.println("You will pass through three different stages:");
        System.out.println("1st stage has 10 questions and each will yeild you 1 point");
        System.out.println("2nd stage has 5 questions and each will yeild you 2 point");
        System.out.println("3rd stage has 5 questions and each will yeild you 3 point");
        System.out.println("In each stages you will have four options and "
                + "\nyou should choose one you think is correct.");
        System.out.println("Now, lets start the game.");

        Thread.sleep(1500);

        int i = 0;
        while (i < this.question.length) {
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
                } else if (!input.equalsIgnoreCase(this.options[i][0])
                        && !input.equalsIgnoreCase(this.options[i][1])
                        && !input.equalsIgnoreCase(this.options[i][2])
                        && !input.equalsIgnoreCase(this.options[i][3])
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
            if (i < 10) {
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
            } else if (i < 15) {
                if (input.equalsIgnoreCase(this.answer[i])) {
                    this.point += 2;
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
            } else {
                if (input.equalsIgnoreCase(this.answer[i])) {
                    this.point += 3;
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

            }
            i++;
        }

        System.out.println("********************");
        System.out.println("Your final point: " + this.point);

        if (this.point <= 10) {
            System.out.println("You are just a passby. Start watching football and gain some knowledge and come again");
        } else if (this.point <= 20) {
            System.out.println("You are not a man with the craze of this football club but you know a bit about it");
        } else if (this.point <= 30) {
            System.out.println("You are  a man with the craze of  football club and "
                    + "\nyou know  about this club more but not enough to be called a fan");
        } else if (this.point <= 35) {
            System.out.println("You are a true die-heart fan of Real Madrid,and you are the ultimate winner of this game!\n");
        }

        Thread.sleep(1000);
    }
}
