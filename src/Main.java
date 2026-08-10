import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are ");
        FindingPrimeNumbers.printFirstNPrimes(50);
        NestedLoops.printNumbers(10);
        System.out.println(RecursiveFunction.SumNumbers(3));
        ArrayTraversal.arrNames();
        System.out.println();
        ArrayTraversal.searchForNames("Yasamin");
        ArrayTraversal.DeletAName("Madin");
        //PracticeArray.evenNumArrays();
        System.out.println("The max consecutive ones is: " +
                maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0,1,1,0,0,1,1,1,0}));
        System.out.println("The max element of the array is: " +
               FindingTheMaxElement.MaxElement(new int[] {22,3,20,90,120,3}) );
        int[] shuffledArray = RandomlyShuffling.arrayShuffling();
        System.out.println("The shuffled array is " + Arrays.toString(shuffledArray));
        int[] shiftedArray = RandomlyShuffling.arrayShifting();
        System.out.println("The shifted array is " + Arrays.toString(shiftedArray));



    }
}
