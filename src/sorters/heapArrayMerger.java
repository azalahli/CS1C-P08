package sorters;
import java.util.*;
import java.io.*;
/**
 * Created by Mober6 on 6/16/2017.
 */
public class heapArrayMerger {

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




    }

    /**
     * No necessary function, added to stop double printing
     * @return
     */
    public static ArrayList<HeapTuple[]> getHeapsUsed(){
        return null;
    }

}
