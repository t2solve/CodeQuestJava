import java.util.Scanner;

class Fibo {

    private static int myFibuNumberArray[]; // array to store the fibonacci numbers
    public static void main(String args[]) {
        int n = readNumberFromCommandLine();
        calcNFibNumbers(n);
        int result = getFiboSum(n);
        System.out.println(result);
    }

    private static int readNumberFromCommandLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount Fibonacci numbers: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    private static void calcNFibNumbers(int n )
    {
        myFibuNumberArray = new int[n];
        //fill first 2 by hand
        myFibuNumberArray[0] = 1 ;//even index is 0 
        myFibuNumberArray[1] = 2;
        for (int i = 2; i < n; i++) {
            //do calc
        }
    }

    private static int getFiboSum(int n) {
        int sum = 0;
        // iterate myFibuNumberArray
        
        return sum;
    }

}
