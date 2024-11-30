import java.util.Random;
public class NumbersGame {
    public static void main(String[] args){
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
        int tries=3;
        while(true){
            try{
            int answer = new Random().nextInt(0,10);
            String guess = System.console().readLine();
            
                if (tries==0){
                    System.out.println("You have no Tries Left");
                    System.out.println("Play again Type: yes or y");
                    String play = System.console().readLine();
                    if (play.equals("yes") ||play.equals("y")){
                        
            
                        tries =3;
                    }
                    else{
                        break;
                    }
                }
                if(guess.equals("q")){
                    System.out.println("I knew you didn't have it in you.");
                    System.out.println("Shutting down...");
                    break;
                }
                if(Integer.parseInt(guess)>10 || Integer.parseInt(guess)<0){
                    System.out.println("The guessing goes between 0 and 10");
                }
                else{
                    
                    if(Integer.parseInt(guess)==answer){
                        System.out.println("Lucky guess! But can you do it again?");
                        break;
                    }else{
                        System.out.println("Swing and a miss! Keep trying...");
                        tries-=1;
                        System.out.println("you have "+tries+" left");
                        
                    }

                }
                
            }
            catch (Exception e){
                System.out.println("Unknown Character you only can use 'q' to Quit");
            }
            
        }
        System.out.println("Game over. Shutting down...");
    }
}