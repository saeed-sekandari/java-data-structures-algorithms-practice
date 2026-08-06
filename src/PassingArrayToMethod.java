public class PassingArrayToMethod {
    public static void main(String[] args){
        //passing array to method
        printArray(new int[]{1,2,3,4,5,6,7});
        System.out.println();

    }
    public static void printArray(int[] array){
        for(int arr:array){
            System.out.print(arr + " ");
        }
    }
}
