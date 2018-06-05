import java.util.Scanner;

public class MovieList {
    public static void main(String[] args){
        boolean quitMovie = false;
        String userInput, userMovie;

        Scanner input = new Scanner(System.in);

        String[] movies = new String[20];

        do{
            System.out.println("Enter the name of your favorite move: ");
            userMovie = input.nextLine();
            for(int i=0; i<movies.length; i++){
                if(userMovie.equalsIgnoreCase(movies[i])) {
                    System.out.println("Movie already added.");
                    break;
                }
                if(movies[i] == null){
                    movies[i] = userMovie;
                    break;
                }
                else{
                    continue;
                }
            }
            System.out.println("Would you like to quit? Press q/Q: ");
            userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("q")){
                quitMovie = true;
            }
        }while (quitMovie == false);

        // Print out the movies
        System.out.println("Your movie lists");
        for(int i=0; i<movies.length; i++){
            if(movies[i] != null){
                System.out.println(movies[i]);
            }
        }

        input.close();
    }
}
