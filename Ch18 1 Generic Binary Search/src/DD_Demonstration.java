/**
 * @author Dolunay Dagci
 * Assignment: Ch18 Generic Binary Search
 * CISS 111 - 360
 * Due Sunday, April 14, 2019
 * Fixed Code
 * This class tests various types of arrays and searches them using the algorithm Binary Search.
 */
public class DD_Demonstration {

        public static void main(String[] args) {

            //Create the arrays and print them before being sorted.
            System.out.println("Various types of arrays are created:");
            Integer[] integers = {5,0,7,8,9,4,3,6,8,35};  DD_ObjectBinarySearcher.printArray(integers);
            String[] strings = {"Banana", "Pineapple", "Coconut", "Sand", "Vacation", "Sun", "Mosquitoes", "Cocktail", "Beach", "Waves"}; DD_ObjectBinarySearcher.printArray(strings);
            Float[] floats = {53F,44F,27F,48F,59F,64F,37F,64F,83F,95F}; DD_ObjectBinarySearcher.printArray(floats);
            Long[] longs = {15L,41L,71L,18L,19L,14L,31L,61L,81L,91L}; DD_ObjectBinarySearcher.printArray(longs);
            Double[] doubles = {0.44,0.22,0.23,0.88,1.22,-1.22,5.77,3.23,-33.02, 1.50}; DD_ObjectBinarySearcher.printArray(doubles);

            System.out.println("\nArrays are being sorted in order...\n"); //Inform the user that the arrays are being sorted.

            //Arrays are sorted before Binary Search Algorithm.
            DD_ObjectBinarySearcher.QuickSort(integers, 0, integers.length - 1);  DD_ObjectBinarySearcher.QuickSort(floats, 0, floats.length - 1);
            DD_ObjectBinarySearcher.QuickSort(strings, 0, strings.length - 1);  DD_ObjectBinarySearcher.QuickSort(longs, 0, longs.length - 1);
            DD_ObjectBinarySearcher.QuickSort(doubles, 0, doubles.length - 1);
            //After arrays are sorted, show the user the sorted arrays.
            System.out.println("Arrays are sorted:");
            DD_ObjectBinarySearcher.printArray(integers);
            DD_ObjectBinarySearcher.printArray(strings);
            DD_ObjectBinarySearcher.printArray(floats);
            DD_ObjectBinarySearcher.printArray(longs);
            DD_ObjectBinarySearcher.printArray(doubles);

            boolean done = false; //Testing is not done.
            System.out.println("\nArrays are tested 5 times. There are 10 elements in each array.\n");
            for (int i = 1; i <= 5; i++){ //Do testing 5 times, and track the # of comparisons in different types of arrays each time.
                int index = (int)(Math.random() * 10); //get random index (random element index) every time in the beginning of the loop.
                System.out.println("Integer Array"); System.out.println("Item to be searched: " +integers[index]); DD_ObjectBinarySearcher.binarySearch(integers, integers[index]);
                System.out.println("String Array"); System.out.println("Item to be searched: "+ strings[index]); DD_ObjectBinarySearcher.binarySearch(strings, strings[index]);
                System.out.println("Float Array"); System.out.println("Item to be searched: "+ floats[index]); DD_ObjectBinarySearcher.binarySearch(floats, floats[index]);
                System.out.println("Long Array"); System.out.println("Item to be searched: "+ longs[index]); DD_ObjectBinarySearcher.binarySearch(longs, longs[index]);
                System.out.println("Double Array"); System.out.println("Item to be searched: "+ doubles[index]); DD_ObjectBinarySearcher.binarySearch(doubles, doubles[index]);
                System.out.println("***********************************************");
                if (i == 5) done = true; //Testing is done.
                if (done)
                    System.out.println("The average number of comparisons: " + //Print the overall average of # of comparisons.
                        + DD_ObjectBinarySearcher.getTotal()/(5*5)); //Total number of comparisons is divided by five arrays being tested 5 times.
            }
        }
    }
