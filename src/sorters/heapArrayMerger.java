package sorters;
import java.util.*;
import java.io.*;
import cs1c.*;
/**
 * Created by Mober6 on 6/16/2017.
 */
public class heapArrayMerger {

    public static void mergeSortedArrays(final int MEM_SIZE, ArrayList<Integer []> inputChunks, HeapTuple[] minHeap, String outfile, final boolean ENABLE_DEBUG){
        /*
        FileOutputStream out;
        try{
            out = new FileOutputStream(outfile);
        }
        catch (FileNotFoundException e){
            System.err.println(e);
            return;
        }
        PrintWriter sortedFiles = new PrintWriter(out, true);
*/

        //First MEM_SIZE minima, no order
        int tempLength = 0;
        FHbinHeap<Integer> heap = new FHbinHeap<>();
        for(int i = 0; i < inputChunks.size(); i++){
            //FHbinHeap<Integer> heap = null;
            Integer[] temp = inputChunks.get(i).clone();
            System.out.println(temp[0] + ",");
            for(int j = 0; j < temp.length; j++){
                //Integer[] temp = inputChunks.get(i).clone();
                System.out.print(temp[j] + ",");
                int hi = temp[j];
                heap.insert(hi);
            }
            tempLength += temp.length;
            System.out.println();

                //int heapRemove = heap.remove();

        }

        System.out.println();
        for(int i = 0; i < tempLength; i++){
            System.out.print(heap.remove() + ",");
        }




/*
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




    }

    /**
     * No necessary function, added to stop double printing
     * @return
     */
    public static ArrayList<HeapTuple[]> getHeapsUsed(){
        return null;
    }

}
