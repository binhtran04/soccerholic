package soccerholic;

import java.util.Scanner;

public class MU {

    private int point = 0;

    private String question[] = {
        "1.Which Manchester Utd player was bailed until February 2008 after being arrested for an alleged rape at a Manchester Hotel in December 2007?",
        "2.Which player kung fu kicked a Crystal Palace fan in January 1995?",
        "3.When was Manchester United F.C. founded?",
        "4.What is the name of Manchester United's home ground?",
        "5.Who was the first Manchester United captain who was from outside the United Kingdom or the Republic of Ireland?",
        "6.George Best had 470 appearances for United. Where was he from?",
        "7.What are the standard colours for United's home games?",
        "8.When did Manchester United win their first Prmeiership title?",
        "9.Which of the following did NOT wear the \"legendary\" number 7 shirt?",
        "10.When did the Munich Air Disaster happen?",
        "1. In the 2009-10 Premier League season, Manchester United finished second on the league table. Who finished first?",
        "2.When Bobby Charlton was honoured by Queen Elizabeth II for his services to football, he was given what title?",
        "3.Manchester United's most succesful manager, Sir Alex Ferguson, used to be the manager of which Scottish club?",
        "4. At the time of the Munich Air Disaster in February 1958, who was the Manchester United manager?",
        "5.By what nickname were Manchester United known during the late 1950s?",
        "6.Who lost to Manchester United in the 1991 Final of the now defunct Cup-Winners Cup?",
        "7.Which Manchester United player was named English Footballer of the Year and PFA Player of the Year in 2000?",
        "8.Which Dutch player's transfer to Manchester United fell through after he failed a medical in 2000?",
        "9. Which Spanish team knocked Manchester United out of the European Champions League in April, 2000?",
        "10.What Manchester United footballer played for England no less than 106 times, and scored 49 goals?",
        "1.Where was Ryan Giggs born?",
        "2.Who were the Reds playing when Nicky Butt was dismissed for the first time in senior competition, in January 1996?",
        "3.On which ground did Paul Scholes make his senior level debut in November 1994?",
        "4.Where in the table, did United finish in Fergie's first full season south of the border?",
        "5.Where was George Best born?",
        "6.Against what club did Mark Hughes get his first senior hat trick for United?",
        "7.Who scored the only goal, as Liverpool inflicted United's first home Premiership defeat of the 2000-01 campaign?",
        "8.Which former United wing-half became a coach at Old Trafford, then lost his life at Munich?",
        "9.Of the survivors of the Munich air crash, two players never played again. One was an England winger. What was his name?",
        "10.Which Liverpool player once attempted to upset Eric Cantona, by turning down his collar?",};

    private String answer[] = {
        "Jonny Evans",
        "Eric Cantona",
        "1878",
        "Old Trafford",
        "Gary Neville",
        "Northern Ireland",
        "Red jersey, white shorts and black socks",
        "1993",
        "George Hunter",
        "February 1958",
        "Chelsea",
        "Duke Bobby Charlton",
        "Aberdeen",
        "George Poyser",
        "The Super Men",
        "Inter Milan",
        "Ryan Giggs",
        "Edgar Davids",
        "Real Madrid",
        "Brian Kidd",
        "Cardiff",
        "West Ham United",
        "The Dell",
        "sixth",
        "Belfast",
        "Arsenal",
        "Danny Murphy",
        "Bill Foulkes",
        "Geoff Bent",
        "Neil Grobbelar",};

    private String options[][] = {
        {"Rio Ferdinand", "Paul Scholes", "Ryan Giggs", "Jonny Evans"},
        {"Eric Cantona", "Paul Scholes", "Roy Keane", "Ryan Giggs"},
        {"1967", "1876", "1976", "1878"},
        {"Old Trafford", "Trafford Centre", "Old Manchester", "New Manchester"},
        {"Gary Neville", "Cristiano Ronaldo", "Jimmy Brown", "Eric Cantona"},
        {"England", "Scotland", "Wales", "Northern Ireland"},
        {"Red jersey, black shorts and white socks", "Red jersey, white shorts and black socks", "White shirt, black shorts and black socks", "White shirt, red shorts and black socks"},
        {"1995", "1990", "1997", "1993"},
        {"George Best", "George Hunter", "David Beckham", "Cristiano Ronaldo"},
        {"February 1958", "March 1950", "Decemeber 1948", "January 1955"},
        {"Liverpool", "Chelsea", "Aston Villa", "Tottenham Hotspur"},
        {"Lord Charlton of Manchester", "Duke Bobby Charlton", "Earl of Manchester", "Sir Bobby Charlton"},
        {"Celtic", "Hearts", "Aberdeen", "Rangers"},
        {"Alf Ramsey", "Joe Mercer", "Matt Busby", "George Poyser"},
        {"The Busby Kids", "The Super Men", "The Busby Babes", "The Bouncy Babes"},
        {"Inter Milan", "Ajax Amsterdam", "AS Monaco", "Barcelona"},
        {"Roy Keane", "David Beckham", "Ryan Giggs", "Paul Scholes"},
        {"Winston Bogarde", "Dennis Bergkamp", "Edgar Davids", "Ruud van Nistelrooy"},
        {"Barcelona", "Valencia", "Deportivo La Coruna", "Real Madrid"},
        {"Nobby Stiles", "Bobby Charlton", "Brian Kidd", "Gordon Hill"},
        {"Macclesfield", "Manchester", "Cardiff", "Swansea"},
        {"Blackburn Rovers", "West Ham United", "Crewe Alexandra", "Queens Park Rangers"},
        {"The Dell", "Goodison Park", "White Hart Lane", "Vale Park"},
        {"winners", "eleventh", "sixth", "runners up"},
        {"Dublin", "Derry", "Cork", "Belfast"},
        {"Arsenal", "Aston Villa", "Liverpool", "Newcastle United"},
        {"Danny Murphy", "Michael Owen", "Stephen Gerrard", "Dietmar Hamann"},
        {"Bill Foulkes", "Harry Gregg", "Johnny Berry", "Bert Whalley"},
        {"Bert Whalley", "Geoff Bent", "Jackie Blanchflower", "Johnny Berry"},
        {"Neil Ruddock", "Bruce Grobbelar", "Mark Wright", "Paul Ince"},};

    public MU() throws Exception {
        Scanner reader;
        reader = new Scanner(System.in);

        //open words
        System.out.println("Welcome to the glory time of Old Trafford!\n");
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
                    System.out.println("You're not a big fan!");
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
                    System.out.println("You're not a big fan as far as I can tell.");
                    System.out.println("You lose the game!!!");
                    break;
                }
            //difficult level    
            } else if (i == 29) {
                System.out.println("********************");
                System.out.println("Your final point: " + this.point);
                Thread.sleep(500);
                if (this.point >= 6) {
                    System.out.println("You're indeed a big fan of MAN UTD!Thanks a lot for participation.\n");
                    this.point = 0;
                    Thread.sleep(1500);
                } else if (this.point < 6) {
                    System.out.println("Sorry,but you also play well enough in this quiz");
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
