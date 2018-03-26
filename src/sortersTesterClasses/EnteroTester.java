package sortersTesterClasses;

import sorterClasses.SelectionSortSorter;

public class EnteroTester {
		public static void main(String[] arg){
		
		Entero[] enteroArr = new Entero[5];
		
		enteroArr[0] = new Entero(4);
		enteroArr[1] = new Entero(1);
		enteroArr[2] = new Entero(11);
		enteroArr[3] = new Entero(7);
		enteroArr[4] = new Entero(6);
		
		SelectionSortSorter<Entero> enteroSort = new SelectionSortSorter<Entero>();
		
		enteroSort.sort(enteroArr, null); //since enteros are not comparable, we will have an exception launched.
		}
}
