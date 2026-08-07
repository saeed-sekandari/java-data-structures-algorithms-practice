
//Create this table and print it
//10 20 30
//40 50 60
//70 80 90
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //declare and initialize the 2D array
        int[][] table = {{10,20,30},{40,50,60},{70,80,90}};
        //print the 2D array
        for(int i=0; i<table.length;i++){
            for(int j=0; j<table[i].length;j++){
                System.out.printf("%5d",table[i][j]);
            }
            //use this to print the next row in the next line
            System.out.println();
        }

    }

}


