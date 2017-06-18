package sorters;
import java.io.*;
import java.util.*;

/**
 * Splits a file into simulated chunks, by means of dividing elements into arrays
 * @author Myron Pow, 6/18/2017
 * */

public class SimulateChunks {
    /**
     * Parses a file into simulated chunks
     * @param MEM_SIZE size of our simulated memory block/array
     * @param fileName name of the file
     * @param chunkArray pass by ref of the array of the simulated chunks
     */
    public static void splitFileIntoArrayChunks(final int MEM_SIZE, String fileName, ArrayList<Integer[]> chunkArray){
        File inputFile = new File(fileName);
        int size;
        String elements;
        try{
            Scanner input = new Scanner(inputFile);
            elements = input.nextLine();
            String[] items = elements.split(",");
            if(items.length % MEM_SIZE == 0) {
                size = (items.length / MEM_SIZE);
            }
            else {
                size = (items.length / MEM_SIZE) + 1;
            }

            for(int i = 0; i < size - 1; i++){
                Integer[] chunk =  new Integer[MEM_SIZE];
                for(int j = 0; j < MEM_SIZE; j++){
                    chunk[j] = Integer.parseInt(items[(i * MEM_SIZE) + j]);
                }
                chunkArray.add(chunk);
            }
            int lastChunk = items.length % MEM_SIZE;
            Integer[] chunk = new Integer[lastChunk];
            for(int i = 0; i < lastChunk; i++){
                chunk[i] = Integer.parseInt(items[i]);
            }
            chunkArray.add(chunk);
            input.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
