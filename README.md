# CodeQuestJava
academic challenge to master java coder


@rselka
Alles klar, der Ansatz ist schon nicht schlecht, gute Struktur in [first task](firs-task.java)

Leider war die Aufgabenstellung 1.1 ein bisschen schrottig:

input: 4 

output: 33

die Erklärung wie die Berechnung funktioniert ist über Index-Berechnung merkwürdig, macht aber Sinn,
wenn wir uns das als array vorstellen

vielleicht wird der kram deutlicher mit einer array intialisierung, wie folgt
```java
int myFibArray[] = new int[10]
//fill array by hand
myFibArray[0] = 1 //even index ist 0 
myFibArray[1] = 2
myFibArray[2] = 3 //even 
myFibArray[3] = 5
myFibArray[4] = 8 // 
myFibArray[5] = 13
myFibArray[6] = 21 // 
myFibArray[7] = 34
//...

```

zentral ist: was wie berechne ich die Fibzahlen ? [fiba zahlen](https://de.wikipedia.org/wiki/Fibonacci-Folge) ; 
damit das für beliebige n als eingabe

