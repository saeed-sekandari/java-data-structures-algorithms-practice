public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = { 29, 2, 1,4,5};
        int minValue = numbers[0];
        for(int i=1; i < numbers.length; i++){
            if( numbers[i] < minValue){
                minValue = i;
            }
        }
        System.out.println(minValue);


    }
}
