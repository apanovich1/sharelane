import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

    }
    public static void VerifyNumber(int userInput){
        int[] numberArray = new int[10];
        for(int i=numberArray[0];i<numberArray.length;i++){
            if(i = userInput){
                System.out.println("number is in array");
            }
            else{
                System.out.println("number is not in array");
            }
        }
    }
}