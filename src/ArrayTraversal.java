public class ArrayTraversal {
    public static void arrNames() {
        String[] names = {"Saeed", "Yasamin", "Ghulam", "Ali Ahmad", "Madin"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ",");
        }
    }
    //Searching for an element
    public static void searchForNames(String NameToBeFound){
        String[] names = {"Saeed", "Yasamin", "Ghulam", "Ali Ahmad", "Madin"};
        for(int i = 0; i < names.length; i++ ){
            if( names[i].equals(NameToBeFound)){
                System.out.println(NameToBeFound + " is found, it is on index " + i);
                return;
            }
        }
        System.out.println(NameToBeFound + " is not found!");
    }
    public static void DeletAName(String NameToBeDeleted){
        String[] names = {"Saeed", "Yasamin", "Ghulam", "Ali Ahmad", "Madin"};
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(NameToBeDeleted)){
                names[i] = null;
                System.out.println("The value has been deleted successfully!");
                return;
            }
        }
        System.out.println("Name not found!");
    }

}
