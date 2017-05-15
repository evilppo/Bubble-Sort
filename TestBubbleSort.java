import java.util.Scanner;
import java.io.*;

public class TestBubbleSort{

	public static void main(String[] args){
		

		//Deklarering og oppretting av nødendige objekter etc//

		int [] testArray = new int [10000];
		int j = 0;
		Scanner scanner = null;
		FileWriter skriver = null;
		File utfil = new File("Sortert Liste.txt");
		BubbleSorter sorteringsObjekt = new BubbleSorter();


		//Lese inn fil med tilfeldige tall//

		try {
			scanner = new Scanner(new File("Random numbers large.txt"));
		}
		
		catch(FileNotFoundException e){

			System.out.println("Fil ikke funnet");
		}
		
		while(scanner.hasNextInt()){
		   testArray[j++] = scanner.nextInt();
		}


		//Skrive ut usortert liste til terminalen//

		System.out.println("***************");


		for(int i = 0; i<testArray.length; i++){

			System.out.println("Usortert array index nr " + i + ": " + testArray[i]);
		}	


		System.out.println("***************");


		//Sortering av usortert liste og tidtakning//

		long startTime = System.currentTimeMillis();
		
		testArray = sorteringsObjekt.sorter(testArray);

		long endTime = System.currentTimeMillis();


		//Skrive ut sortert liste og sorteringstid til terminal//

		for(int i = 0; i<testArray.length; i++){

			System.out.println("Sortert array, index nr " + i + ": " + testArray[i]);
		}

		System.out.println("***************");

		System.out.println("Sorteringen tok: " + (endTime - startTime) + " millisekunder");

				
		//Skrive ut resultatet til fil//

		try{
			
			skriver = new FileWriter(utfil);
		}

		catch(IOException e){}

		try{

			for(int tall : testArray){

				skriver.write(tall + "\n");
			}
		}

		catch(IOException e){}
	}
}