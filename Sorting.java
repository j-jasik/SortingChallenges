import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Class that will hold all of the sorting methods
 * @author Jordan Jasik
 * @version 3/3/2020
 */
public class Sorting {

	/**
	 * Default constructor for the Sorting class
	 */
	public Sorting() {
	}
	
	/**
	 * Sort list passed in
	 * @param list - the list to sort
	 * @param ascending - if true, descending if false
	 * @return the sorted list
	 */
	public int[] simpleSort(int[] list, boolean ascending) {
		// ascending is straightforward
		if(ascending) {
			Arrays.sort(list);
			return list;
		}
		
		// descending we need to convert ints to Integers for easy sorting
		Integer[] newList = new Integer[list.length];
		for(int i = 0; i < list.length; i++) {
			newList[i] = new Integer(list[i]);
		}
		Arrays.sort(newList, Collections.reverseOrder());
		// convert back for return 
		int[] finalList = new int[newList.length];
		for(int i = 0; i < newList.length; i++) {
			finalList[i] = newList[i];
		}
		return finalList;
	}
	
	/**
	 * print sorted list with frequency
	 * @param list to sort and print
	 */
    public void printSortedFrequency(int[] list) {
    	int[] sortedList = simpleSort(list, true);
    	int counter = 0;
    	int currentNum = -1;
    	for(int i = 0; i < sortedList.length; i++) {
    		if(currentNum == sortedList[i]) {
    			counter++;
    		}else {
    			if(currentNum != -1) {
					System.out.println(currentNum + " appears " + counter + " times.");
    			}
				counter = 1;
				currentNum = sortedList[i];
    		}
    	}
    	System.out.println(currentNum + " appears " + counter + " times.");
    }
    
    /**
     * get number of unique values in list
     * @param list - the list to find unique values in
     * @return
     */
    public int numberOfUniqueValues(int[] list) {
    	ArrayList<Integer> unique = new ArrayList<Integer>();
    	for(int i = 0; i < list.length; i++) {
    		if(!contains(unique, list[i])) {
    			unique.add(list[i]);
    		}
    	}
    	return unique.size();
    }
    
    /**
     * Check if a list contains an item
     * @param list - the list to check
     * @param num - the number to look for
     * @return true if found, false otherwise
     */
    private boolean contains(ArrayList<Integer> list, int num) {
    	for(int i = 0; i < list.size(); i++) {
    		if(num == list.get(i)) {
    			return true;
    		}
    	}
    	return false;
    }
	
}
