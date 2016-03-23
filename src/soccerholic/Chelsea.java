package soccerholic;

import java.util.Scanner;

public class Chelsea {

    private int point = 0;

    private String question[] = {
        "1)When was Chelsea founded?",
        "2)Which player was Chelsea's highest appearance maker in First class games?",
        "3)Which player is Chelsea's most capped international player?",
        "4)Which player is Chelsea's all time top scorer?",
        "5)Chelsea hold the record for the highest ever points total for a league season. How many points was that?",
        "6)Chelsea's victory over Jeunesse Hautcharage in the European cup winners cup in 1971 remains the record in a European competition.List the match result",
        "7)Chelsea have not been the subject of which of these  films about Football?",
        "8)The 1994 FA Cup Final was won 4-0 by Manchester United. Which Chelsea player hit the crossbar in the first half while the scores were still level?",
        "9) Who did Chelsea beat in 1906, that set a record for their biggest League win?",
        "10)Chelsea won the 1971 European Cup-Winners Cup, but who did they beat in the final?",
        "11)Who did Chelsea beat to become FA Cup winners for the first time in 1970?",
        "12)Who was the first manager in Chelsea's history?",
        "13) Which club did Chelsea beat to get their best home result in the Premiership of 2003-04?",
        "14) Chelsea played out four extraordinary matches against Barcelona in Mourinho's first two seasons in charge, but how many own goals were scored in the matches?",
        "15)Who was the only person to score a hat-trick in all competitions for Chelsea in season 05/06?",
        "16)Whats the nickname given for Chelsea?",
        "17)How many UEFA Champions League has Chelsea won?",
        "18)From the below songs which is the officially recognised club song?",
        "19)Who is the  owner of Chelsea FC?",
        "20)For which player did Chelsea pay the highest amount?"
    };

    private String answer[] = {
        "10 March 1905",
        "Ron Harris",
        "Frank Lampard",
        "Frank Lampard",
        "95",
        "21-0",
        "Goal",
        "Gavin Peacock",
        "Glossop",
        "Real Madrid",
        "Leeds United",
        "John Tait Robertson",
        "Newcastle United",
        "3",
        "Eidur Gudjohnsen",
        "The Blues",
        "1",
        "Blue is the Colour",
        "Roman Arkadyevich Abramovich",
        "Fernando Torres"
    };

    private String options[][] = {
        {"10 March 1910", "10 March 1905", "10 March 1900", "10 March 1895"},
        {"Ron Harris", "Frank Lampard", "Peter Bonetti", "Bobby Tambling"},
        {"Ron Harris", "Frank Lampard", "Peter Bonetti", "Bobby Tambling"},
        {"Ron Harris", "Frank Lampard", "Peter Bonetti", "Bobby Tambling"},
        {"92", "93", "94", "95"},
        {"20-1", "21-1", "21-0", "20-2"},
        {"Jhoom Barabar Jhoom", "The Great Game", "Goal", "Football Factory"},
        {"Gavin Peacock", "Frank Sinclair", "Tony Cascarino", "Steve Clarke"},
        {"Real Madrid", "Barcelona", "Atletico madrid", "Glossop"},
        {"Real Madrid", "Barcelona", "Atletico madrid", "Liverpool"},
        {"Luton Town", "Plymouth Argyle", "Wimbledon", "Leeds United"},
        {"Damien Duff", "John Tait Robertson", "Calderhead", "Birrell"},
        {"Real Madrid", "Atletico Madrid", "Newcastle United", "Liverpool"},
        {"1", "2", "3", "4"},
        {"Michael Mancienne", "Jonas Elmer", "William Gallass", "Eidur Gudjohnsen"},
        {"Men in blues", "Blues", "The Champions", "The Blues"},
        {"0", "1", "2", "3"},
        {"On the day that Chelsea went and won the cup", "Blue is the Colour", "Blue Day", "We're Gonna Win"},
        {"Roman Arkadyevich Abramovich", "Juan de Cárcer", "Pedro Llorente", "Lippo Hertzka"},
        {"Loic Remy", "Fernando Torres", "Kurt Zouma", "Fabregas"}
    };

    public Chelsea() throws Exception {
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
            System.out.println("You are just a passby.Start watching football and gain some knowledge and come again");
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
