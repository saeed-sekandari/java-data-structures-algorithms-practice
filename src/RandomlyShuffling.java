public class RandomlyShuffling {
   public static int[] arrayShuffling(){
       int[] numbers = {4,66,95,42,73,30};
       //The shuffled array is [66, 95, 73, 42, 30, 4]
       //The shuffled array is [42, 73, 95, 4, 30, 66]

       for(int i=0; i < numbers.length -1; i++){
           int j = (int) (Math.random()*numbers.length);
           int temp = numbers[i];
           numbers[i] = numbers[j];
           numbers[j] = temp;
       }
       return numbers;
   }
   public static int[] arrayShifting(){
       int[] numbers = { 2, 5, 9, 12 ,11};
       int temp = numbers[0];

       //The shifted array is [5, 9, 12, 11, 2]
       for(int i = 1; i < numbers.length; i++){
           numbers [ i - 1] = numbers[i];
       }
       numbers[numbers.length - 1] = temp;

       return numbers;
   }
}

