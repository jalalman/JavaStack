import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;




public class PuzzleJava {
    Random rand=new Random();
    /* Get 10 random Int number array and print them  */
    int[] getTenRolls(){
        int[] tenRandom = new int[10];

        for(int i=0 ;i<tenRandom.length;i++){
            tenRandom[i]=Math.abs(rand.nextInt()/100000000);
        }
        for(int i=0 ;i<tenRandom.length;i++){
        System.out.println(tenRandom[i]);
        }
        return tenRandom;
    }
    /* Return the random letter. */
    char getRandomLetter(){
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int randletter=rand.nextInt(26);

        return letters[randletter];
    }
    /* generatePassword of 8 chars */
    String generatePassword(){
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String password="";
        for (int i=0 ;i<8;i++){
            int randletter=rand.nextInt(26);
            password+=letters[randletter];
        }
        return password;
    }
    /* List of generatePassword of 8 chars  */
    String[] getNewPasswordSet(int arraySize){
        String[] wordsList= new String[arraySize];
        for(int i=0 ;i<arraySize;i++){
            wordsList[i]=generatePassword();
        }

        return wordsList;
    }

    /* SENSEI BONUS:*/
    /* shuffleArray */
    void shuffleArray(String[] array){

        for(int i =0 ;i<array.length;i++){
            int randfirst=rand.nextInt(array.length);
            int randsecond=rand.nextInt(array.length);
            String temp=array[randfirst];
            array[randfirst]=array[randsecond];
            array[randsecond]=temp;
        }
        for (int i=0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
