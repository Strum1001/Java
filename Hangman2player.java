import java.util.ArrayList;
import java.util.Scanner;

public class Hangman2{

public static void main(String [ ] args){
Scanner input = new Scanner (System.in);

ArrayList<String> guesses = new ArrayList<>();

 System.out.print("Enter a word: ");
String word = input.nextLine();
String[] letters = word.split("(?!^)");
System.out.printf("%n %n %n %n %n %n %n %n %n %n %n %n %n %n %n %n ");


int Strike = 0;
String underscore = "_ ";
    String [] guessword;
    guessword = new String[letters.length];
    for(int t= 0; t<letters.length; t++){
        guessword[t] =underscore;
        System.out.print(guessword[t]);
    }

while(Strike !=3){
    System.out.print("Enter a guess: ");
    System.out.printf("%n");
String guess = input.nextLine();
guesses.add(guess);
for(int y = 0; y < guessword.length; ++y){

    if(guessword[y].contains(guess)){
        System.out.println("Already Guessed");
        break;
    }
    }

for(int i =0; i<letters.length; i++){
    for(int array = 0; array<guesses.size(); array= array+1){

    if(guesses.get(array).equals(letters[i])){
    guessword[i] =    guesses.set(array, guesses.get(array));

        }else{
}  
    }

    System.out.print(guessword[i]);  

 }
System.out.println(); 
if(word.contains(guess)){
    System.out.println("Good guess");
    
} else{ 
    Strike ++;
    System.out.println("Strike "+ Strike);
        if(Strike == 3){
            System.out.println("You lose");
        }
}
for(int y = 0; y < guessword.length; ++y){
    if(!guessword[y].contains("_") && y >letters.length - 2){
        Strike = 3;
        System.out.println("You win!");
    }
}
System.out.println("guesses: "+ guesses);
if(Strike ==3){
    System.out.println("Game over");
}
}
}

   
}
