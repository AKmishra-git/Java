import java.util.Scanner;



public class numberguessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = (int)(Math.random()*100);
        int mynumber;

        do{
            System.out.println("Enter your guess(1-100): ");
            mynumber = sc.nextInt();

            if(mynumber==number){
                System.out.println("Congrats, Right guess");
                break;
            }

            else if(mynumber>number){
                System.out.println("Number is too large");
            }

            else {
                System.out.println("Your number is too small");
            }

        }while(mynumber>=0);

        System.out.println("Your number was: ");
        System.out.println(number);

    }
    
}
