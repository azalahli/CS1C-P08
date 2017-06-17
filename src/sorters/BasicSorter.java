package sorters;
import cs1c.FHsort;
/**
 *
 * Created by Mober6 on 6/16/2017.
 */
public class BasicSorter {
    /**
     * The method only uses quicksort, because its pretty much always the best to use
     * @param chunk mem chunk to sort
     */
    public static void sortChunk(Integer[] chunk){
        FHsort.quickSort(chunk);
    }
}
