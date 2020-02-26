// Name: Johar Samrao
// ID: 180
// Assignment 1
// Simple List 

package assign2;

public class SimpleList {

	int COUNT;
	int[] list;
	
	/*
	 * Constructor for this SimpleList Class 
	 * It creates a new integer list of size 10 
	 * It then init COUNT to 0 
	 */
	SimpleList(){
		list = new int[10];
		COUNT = 0;
	}
	
	/*
	 * Adds an element to the array 
	 * It inserts the element to the beginning
	 * of the array and pushes all other elements
	 * down by one
	 * If there is an overflow, the list expands
	 * by 50% to allow more elements to be added
	 * 
	 * @param	elementToAdd		The element to add
	 * 							To the array	
	 */
	public void add(int elementToAdd){
		
		if(list[list.length-1] != 0) {
			
			int[] newList = new int[(int) Math.ceil(list.length*1.5)];
			
			for(int iterator = 0; iterator < list.length; iterator++) {
				newList[iterator] = list[iterator];
			}
			this.list = newList;
			
		}
		
		for(int index = list.length-2; index >= 0; index--) {
			
			list[index + 1] = list[index];
		}
		
		list[0] = elementToAdd;
		System.out.println(list[0]);
		COUNT++;
	}
	
	/* 
	 * Removes an element from the array given
	 * the element to remove. This function searches
	 * the array for the element and removes it. It then
	 * shifts all the elements down by one since that 
	 * element was removed. This is similar to a stack.
	 * If the list has more than 25% empty spaces, the 
	 * list is reduced by one element.
	 *
	 * @param		elementToRemove	The element to remove
	 * 							To the array	
	 */
	public void remove(int elementToRemove){
		for(int index = 0; index < list.length; index++) {
			if(list[index] == elementToRemove) {
				COUNT--;
				for(int index_alt = index; index_alt < list.length - 1; index_alt++) {
					list[index_alt] = list[index_alt + 1];
				}
			}
		}
		int numOfZeros = 0;
		for(int index = 0; index < list.length; index++) {
			if(list[index] == 0) {
				numOfZeros++;
			}
		}
		if(numOfZeros >= .25*list.length && list.length > 1) {
			int[] newList = new int[list.length-1];
			
			for(int iterator = 0; iterator < newList.length; iterator++) {
				newList[iterator] = list[iterator];
			}
			this.list = newList;
		}
	}
	
	/*
	 * Returns the number of elements in the array.
	 * 
	 * @return	COUNT	The number of elements
	 * 					in the array 							
	 */
	public int count() {
		return COUNT;
	}
	
	/*
	 * returns a string that lists all the 
	 * elements in the array 
	 * 
	 * @return str 	The string that contains
	 * 				all the elements of the array
	 */
	public String toString() {
		String str = "";
		for(int index = 0; index < count()-1; index++) {
			str = str + list[index] + " ";
		}
		str = str + list[count()-1];
		return str;
	}
	
	/*
	 * Returns the integer where the 
	 * elementToFind is located.
	 * 
	 * @param	elementToFind	Element to search
	 * 
	 * @return	index	The index where the element is
	 */
	public int search(int elementToFind) {
		int indexOfElement = -1;
		for(int index = 0; index < list.length; index++) {
			if(list[index] == elementToFind) {
				indexOfElement = index+1;
			}
		}
		return indexOfElement;
	}
	
	/*
	 * Appends an element to the end of the list.
	 * If there is overflow, then the list 
	 * expands by 50% to allow more space
	 * 
	 * @param	elementToAppend	Element to append
	 * 
	 * 
	 */
	public void append(int elementToAppend) {
		if(list[list.length-1] != 0) {
			
			int[] newList = new int[(int) Math.floor(list.length*1.5)];
			
			for(int iterator = 0; iterator < list.length; iterator++) {
				newList[iterator] = list[iterator];
			}
			this.list = newList;
			
		}

		for(int index = 0; index < list.length; index++) {
			if(list[index] == 0) {
				list[index] = elementToAppend;
				System.out.println(list[index]);
				break;
			}
		}
		COUNT++;
	}
	
	/*
	 * Returns the first integer of the list
	 * If the list contains no number, then it
	 * returns -1
	 * 
	 * @return	first	The first element of the list
	 */
	public int first() {
		if(list[0] != 0) {
			int first = list[0];
			return first;
		}
		return -1;
	}
	
	
	/*
	 * Returns the last integer of the list
	 * If the list contains no number, then it
	 * returns -1
	 * 
	 * @return	last 	The last element of the list
	 */
	public int last() {
		if(list[0] == 0) {
			return -1;
		}
		for(int index = 0; index < list.length; index++) {
			if(list[index] == 0) {
				return list[index-1];
			}
		}
		return list[list.length-1];
	}
	
	/*
	 * Returns the size of the list.
	 * 
	 * 
	 * @return	list.length	The length of the list
	 */
	public int size() {
		return list.length;
	}
}
