import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int enteredNum = input.nextInt();

        int sum = 0;

        for( int i = 1 ; i < enteredNum ; i++){

            if( (enteredNum % i) == 0){
                sum += i;
            }
        }

        if ( sum == enteredNum){
            System.out.println(enteredNum + " is a perfect number.");

        }else{
            System.out.println(enteredNum + " is NOT a perfect number.");
        }

        input.close();
        
    }
}
