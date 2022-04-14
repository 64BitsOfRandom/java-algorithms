package algorithms.sort.exchange;

import algorithms.sort.Sorter;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


/**
 * Неээффективен на больших массивах
 * Сложность: O(n^2)
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BubbleSort implements Sorter {

    public static Sorter getInstance() {
        return new BubbleSort();
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // общее количество обходов массива
            for (int j = 0; j < array.length - i - 1; j++) { // j - текущее положение курсора
                if (array[j] > array[j + 1]) {
                    Sorter.swap(array, j, j + 1); //если следующий элемент больше - меняем их местами
                }
            }
        }
    }
}
