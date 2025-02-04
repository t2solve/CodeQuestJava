import java.util.Scanner;

public class FibonacciSum {
    public static int fibonacciSumEvenIndices(int n) {  //n= Anzahl der gewünschten Fibonacci-Paare //int= die berechnete Summe
        if (n <= 0) return 0; // Falls n nicht positiv ist, gib 0 zurück.

        int length = 2 * n - 1; // Länge des Fibonacci-Arrays //-1 weil mit Index 0 gestartet wird
        int[] myFibArray = new int[length]; //das Array speichert die Fibo-Zahlen

        // Fibonacci-Zahlen berechnen // ersten beiden Werte bloß initialisieren, daraus berechnet wird die Fibo-Folge
        myFibArray[0] = 1;
        myFibArray[1] = 2;

        for (int i = 2; i < length; i++) { // Schleife für die Indizes
            myFibArray[i] = myFibArray[i - 1] + myFibArray[i - 2]; // Berechnung zur Summe der Indizes
        }

        // Summe der Zahlen an geraden Indizes berechnen
        int sum = 0;
        for (int i = 0; i < length; i+=2) { // Nur gerade Indizes
            sum += myFibArray[i];   // die entsprechende Summe daraus
        }

        return sum; // gibt summe nach oben zurück
    }

    public static void main(String[] args) {        //Scanner zum Einlesen der angegebenen Fibo-Anzahl
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Fibonacci-Zahlen ein: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = fibonacciSumEvenIndices(n);    // Aufrufen der oberen Methode um Integer zu definieren und auszugeben
        System.out.println("Die Summe der Fibonacci-Zahlen an geraden Indizes ist: " + result); //Ausgabe des Ergebnisses
    }
}
