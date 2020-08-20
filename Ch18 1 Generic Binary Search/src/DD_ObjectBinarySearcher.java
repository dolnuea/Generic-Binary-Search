/**
 * @author Dolunay Dagci
 * Assignment:  Ch18 Generic Binary Search
 * CISS 111 - 360
 * Due Sunday, April 14, 2019
 * Fixed Code
 * This class includes generic binary search methods, and a array printer method.
 */

class DD_ObjectBinarySearcher {

    //comparison total for calculating the average
    private static int total;

    /**
     *
     * @return total counts of Binary Search
     */
    static int getTotal() {
        return total;
    }

    /**
     * @param array array to be sorted
     * @param low starting index
     * @param high ending index
     * @return partition for quick sort
     */
    //for flexibility, I added ? super T inside diamond brackets next to Comparable, because Consumer Super (from PECS) (I got this advice to use this from stackoverflow)
    private static <T extends Comparable<? super T>> int partition(T[] array, int low, int high)
    {
        T pivot = array[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            if (array[j].compareTo(pivot) <=0)
            {
                i++;
                // swap array[i] and array[j]
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swap array[i+1] and array[high] (or pivot)
        T temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    /**
     * @param array array to be sorted
     * @param low starting index
     * @param high ending index
     */
    static <T extends Comparable<? super T>> void QuickSort(T[] array, int low, int high)
    {
        if (low < high)
        { int pi = partition(array, low, high);
            QuickSort(array, low, pi-1);
            QuickSort(array, pi+1, high);
        }
    }

    /**
     * @param a array
     * @param b compared integer
     */
    static <T extends Comparable<T>> void binarySearch(T[] a, T b) {
        int count = 0;
        if (a.length == 0) return;
        int low = 0;
        int high = a.length-1;

        while(low <= high ) {
            int middle = (low+high) /2;
            if (b.compareTo(a[middle]) > 0){
                low = middle +1;
            } else if (b.compareTo(a[middle]) < 0){
                high = middle -1;
            } else { //The element has been found
                System.out.println("The number of comparisons made to search the item: " + count + "\n"); //display the # of comparisons
                total+=count; //totals are used to calculate average in the main
                return;
            }
            count++;
        } }

    /**
     *
     * @param array that will be printed
     */
    static <T extends Comparable<T>> void printArray(T[] array)
    {
        for (T value : array) {
            System.out.print(value + " "); //prints the array
        }
        System.out.println();
    }
}
