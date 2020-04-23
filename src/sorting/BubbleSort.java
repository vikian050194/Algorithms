package sorting;

public class BubbleSort implements ISort {
    public <T extends Comparable<T>> T[] Sort(T[] elements) {
        T temp;

        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i].compareTo(elements[i + 1]) <= 0) {
                continue;
            }

            temp = elements[i];
            elements[i] = elements[i + 1];
            elements[i + 1] = temp;
        }

        return elements;
    }
}