package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public final class NumberWordsApplication {
        private final NumberWords numberWords ;
        private final BufferedReader reader ;
        public NumberWordsApplication() {
                numberWords = new NumberWords() ;
                reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
        }
 //Function for user input
        public void execute() {
                while( true ) {
                        try {
                                System.out.print( "Enter number (0 to exit): " ) ;
                                String value = reader.readLine() ;
                                int number = Integer.parseInt( value ) ;
 //Program should exit if the user types in 0
                                if(number == 0)
                                        break;
                                else if (number > 9999999 || number < 0) {
                                        System.out.println("Please enter a number less than 9999999 and greater than 0");
                                        continue;
                                }
                                System.out.println(numberWords.toWords(number));
                        } catch ( NumberFormatException | IOException e ) {
                                System.out.println( "Invalid number!! Please enter a number less than 9999999 and greater than 0" ) ;
                        }
                }
        }
 //Program execution starting
        public static void main(String[] args) {
                new NumberWordsApplication().execute() ;
        }
}
