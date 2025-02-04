public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array with specified size
        int[][] arr = {
            {97, 5},
            {50,2,1},
            {5,4},
            {8,5,12}
        };

        // test lenght is 3
        if (arr.length == 3) {
            System.out.println("Length is 3");
        } else {
            System.out.println("Length is not 3 but is " + arr.length);
        }

        // Print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Print the array with index values
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}