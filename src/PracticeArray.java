import java.util.Scanner;
public class PracticeArray {
    public static void evenNumArrays(){
        int [] evenNum = new int[5];
        System.out.println("Please enter the arrays elements: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < evenNum.length; i++){
            evenNum[i] = input.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < evenNum.length; i++){
            System.out.println(evenNum[i]);
        }
    }
}
