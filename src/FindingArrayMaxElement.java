public class FindingArrayMaxElement {

    public static int findMax(int[] numbers) {
        // Write your code here
        int max = numbers[0];
        for (int i=0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 15, 7};
        System.out.println(findMax(numbers));
    }


}
