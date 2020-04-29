package sorting;

public class QuickHoareSort implements ISort {
    public String GetName() {
        return "Quick Hoare";
    }

    public <T extends Comparable<T>> T[] Sort(T[] elements) {
        Sort(elements, 0, elements.length - 1);
        return elements;
    }

    private <T extends Comparable<T>> void Sort(T[] elements, int left, int right) {
        if (left < right) {
            var pivotIndex = Partition(elements, left, right);

            Sort(elements, left, pivotIndex);
            Sort(elements, pivotIndex + 1, right);
        }
    }

    private <T extends Comparable<T>> int Partition(T[] elements, int left, int right) {
        var pivot = elements[(left + right) / 2];
        var i = left - 1;
        var j = right + 1;

        while (true) {
            do {
                i++;
            } while (elements[i].compareTo(pivot) < 0);

            do {
                j--;
            } while (elements[j].compareTo(pivot) > 0);

            if (i >= j) {
                return j;
            }

            Exchange(elements, i, j);
        }
    }

    private <T> void Exchange(T[] elements, int i, int j) {
        T temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}