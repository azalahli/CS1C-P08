package sorters;
import java.awt.*;
import java.util.*;
import java.io.*;
import cs1c.*;
/**
 * Class uses FHbinheap to sort chunks of information
 * @author Myron Pow, 6/18/2017
 */
public class heapArrayMerger {

    /**
     * Attempted to merge sorted arrays. Merely encapsulates within a FHbinheap
     * @param MEM_SIZE size of virtual chunk
     * @param inputChunks array of chunks
     * @param minHeap   HeapTuple object. Could not get it to work, as I believe it needs to be an array stored, not the data itself
     * @param outfile   path of the outfile
     * @param ENABLE_DEBUG  unused
     */
    public static void mergeSortedArrays(final int MEM_SIZE, ArrayList<Integer []> inputChunks, HeapTuple[] minHeap, String outfile, final boolean ENABLE_DEBUG){

        FileOutputStream out;
        try{
            out = new FileOutputStream(outfile);
        }
        catch (FileNotFoundException e){
            System.err.println(e);
            return;
        }
        PrintWriter sortedFiles = new PrintWriter(out, true);

        int tempLength = 0;
        FHbinHeap<Integer> heap = new FHbinHeap<>();
        for (int i = 0; i < inputChunks.size(); i++) {
            Integer[] temp = inputChunks.get(i).clone();
            for(int j = 0; j < temp.length; j++){
                //Integer[] temp = inputChunks.get(i).clone();
                //System.out.print(temp[j] + ",");
                int hi = temp[j];
                heap.insert(hi);
            }
            tempLength += temp.length;
        }
        System.out.println();
        for(int i = 0; i < tempLength; i++){
            int removal = heap.remove();
            System.out.print(removal + ",");
            sortedFiles.print(removal + ",");
        }
        sortedFiles.close();





/* FAILED CODE

        Due to our sorting of the arrays, the minimum of the entire set must be the minimum of the set of the first element for all chunks
        By adding an offset to the array whose


        FHbinHeap<HeapTuple> metaHeap = null;
        HeapTuple[] heapElement = null;
        // Probably should just be a FHbinheap
        for (int i = 0; i < inputChunks.size(); i++) {
            for (int j = 0; j < MEM_SIZE; i++) {
                heapElement[i] = new HeapTuple(inputChunks.get(i)[j], i, j);
                metaHeap.insert(heapElement[i]);
                System.out.println(metaHeap.remove());
                //sortedFiles.println(metaHeap.remove());
            }
        }

*/


        //First MEM_SIZE minima, no order
        /*/*
        int removed = 0;
        int [] arrayShift = new int[MEM_SIZE];
        //int innerIndex = 0;

        int tempLength = 0;

        int tempMin = 0;
        int tempMinIndex = 0;
        FHbinHeap<Integer> heap = new FHbinHeap<>();
        for (int j = 0; j < 5; j++) {
            //System.out.println(arrayShift[0] + "ARRAYSHIFT");
            for (int i = 0; i < inputChunks.size(); i++) {
                //FHbinHeap<Integer> heap = new FHbinHeap<>();
                Integer[] temp = inputChunks.get(i).clone();
                //System.out.println(temp[arrayShift[i]] + ",");
                if (temp[arrayShift[i]] < tempMin) {
                    tempMin = temp[arrayShift[i]];
                    tempMinIndex = i;
                }


            for(int j = arrayShift[i]; j < temp.length; j++){
                //Integer[] temp = inputChunks.get(i).clone();
                System.out.print(temp[j] + ",");
                //int hi = temp[j];
                //heap.insert(hi);
            }

                tempLength += temp.length;
                heap.insert(temp[arrayShift[i]]);
                //System.out.print(temp[arrayShift[i]]+ ",");


                //int heapRemove = heap.remove();
                if (i == inputChunks.size() - 1) {
                    removed = heap.remove();
                    System.out.println();
                    System.out.println(removed + ",MINIMUM");
                    arrayShift[tempMinIndex] = (arrayShift[tempMinIndex] + 1);
                }

            }
        }
        */




    }

    /**
     * No necessary function, as my attempt at the sort involved encapsulating everything within a FHbinheap
     * @return null pointer
     */
    public static ArrayList<HeapTuple[]> getHeapsUsed(){
        return null;
    }

}
