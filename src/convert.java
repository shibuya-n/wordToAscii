import java.util.Scanner;

public class convert {

    String input;




    public convert(String x){
        input = x;
    }

    public static String userInput(){
        System.out.println("What would you like to input?");
        return getUserInput();
    }

    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();

        return response;
    }

    public char asciiConvert(){
        int sum = 0;

        for (int i = 0; i < input.length(); i++){
            sum += ((int) input.charAt(i));
        }

        return (char) ((char) sum/input.length());






    }






}
