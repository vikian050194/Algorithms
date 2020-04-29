package sorting;

public class MergeSort implements ISort {
    public String GetName() {
        return "Merge";
    }

    public <T extends Comparable<T>> T[] Sort(T[] elements) {
        Sort(elements, 0, elements.length - 1);

        return elements;
    }

    private <T extends Comparable<T>> void Sort(T[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int middle = (left + right) / 2;
        Sort(array, left, middle);
        Sort(array, middle + 1, right);
        Merge(array, left, middle, right);
    }

    private <T extends Comparable<T>> void Merge(T[] elements, int left, int middle, int right) {
        var leftArray = new Object[middle - left + 1];
        var rightArray = new Object[right - middle];

        for (int i = 0; i < leftArray.length; i++){
            leftArray[i] = elements[left + i];
        }

        for (int i = 0; i < rightArray.length; i++){
            rightArray[i] = elements[middle + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (((T) leftArray[leftIndex]).compareTo((T) rightArray[rightIndex]) < 0) {
                    elements[i] = (T) leftArray[leftIndex];
                    leftIndex++;
                } else {
                    elements[i] = (T) rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                elements [i] = (T) leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                elements[i] = (T) rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}