package sorting;

public class QuickLomutoSort implements ISort {
    public String GetName() {
        return "Quick Lomuto";
    }

    public <T extends Comparable<T>> T[] Sort(T[] elements) {
        Sort(elements, 0, elements.length - 1);
        return elements;
    }

    private <T extends Comparable<T>> void Sort(T[] elements, int left, int right) {
        if (left < right) {
            var pivotIndex = Partition(elements, left, right);

            Sort(elements, left, pivotIndex - 1);
            Sort(elements, pivotIndex + 1, right);
        }
    }

    private <T extends Comparable<T>> int Partition(T[] elements, int left, int right) {
        var pivot = elements[right];
        var i = left - 1;

        for (int j = left; j < right; j++) {
            if (elements[j].compareTo(pivot) < 1) {
                i++;
                Exchange(elements, i, j);
            }
        }

        Exchange(elements, i + 1, right);
        return i + 1;
    }

    private <T> void Exchange(T[] elements, int i, int j) {
        T temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}


