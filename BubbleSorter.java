public class BubbleSorter{

	//Implementasjon av Bubble Sort-algoritmen skrevet av Eirik Timo Bøe Vilpponen//

	public int[] sorter(int[] arrayToSort){

		boolean swap = true;

		while(swap)
		{
			swap = false;

			for(int i = 0; i <= arrayToSort.length; i++)
			{
				if(i <arrayToSort.length - 1 && arrayToSort[i]>arrayToSort[i+1])
				{
					int temp = arrayToSort[i];
					arrayToSort[i] = arrayToSort[i+1];
					arrayToSort[i+1] = temp;
					swap = true;
				}
			}
		}

		return arrayToSort;
	}
}