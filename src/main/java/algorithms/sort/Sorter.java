package algorithms.sort;

public interface Sorter {
    void sort(int[] array);

    static void swap(int[] array, int from, int to){
        int temp = array[to];
        array[to] = array[from];
        array[from] = temp;
    }

}
