/**
 * @author Jordan Jasik
 * @version 3/3/2020
 * This is the driver that will run the project
 */
public class Driver {
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String args[]) {
		int[] list = new int[] {7, 3, 18, 9, 3};
		startSort(list);
	}
	
	/**
	 * call each sorting method needed
	 * @param list - the list to do stuff to
	 */
	public static void startSort(int[] list) {
		Sorting sorting = new Sorting();
		
		System.out.println("Asc: " + listFormat(sorting.simpleSort(list, true)));
		
		System.out.println("Desc: " + listFormat(sorting.simpleSort(list, false)));
		
		sorting.printSortedFrequency(list);
		
		System.out.println("Number of unique list members: " + sorting.numberOfUniqueValues(list));
	}
	
	/**
	 * format list as a string
	 * @param list - the list to format
	 * @return a string of the list passed in
	 */
	public static String listFormat(int[] list) {
		String formatted = "";
		for(int i = 0; i < list.length; i++) {
			formatted = formatted + list[i] + ", ";
		}
		formatted = formatted.substring(0, formatted.length() - 2); // remove trailing space and comma
		return formatted;
	}

}
