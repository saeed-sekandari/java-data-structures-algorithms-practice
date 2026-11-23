public class FindingVowelsLetters{

    public static int countVowels(String text) {
        int counter = 0;
        text = text.toLowerCase();
        // Write your solution here
        for(int i = 0; i<text.length(); i++){
            char letters = text.charAt(i);
            if(letters == 'a' || letters == 'e' || letters == 'o' || letters == 'i' || letters == 'u'){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World"));
        System.out.println(countVowels("JAVA"));
        System.out.println(countVowels(""));
    }
}