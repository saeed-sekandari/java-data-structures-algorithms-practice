public class BinarySearchArray {
    public static int binarySearch(int[] numbers, int key){
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == key){
                return key;
            }
            if(key < numbers[mid]){
                right = mid -1;
            }
            else {
                left = mid + 1;
            }

        }
        return -1;
    }
    public static void main(String [] args){
        int[] numbers = {1,3,6,9,12,55,88};
        int index = binarySearch(numbers,41);
        if(index != -1){
            System.out.println("The number was found at index " + index);
        }
        else {
            System.out.println("the number was not found.");
        }
    }
}
