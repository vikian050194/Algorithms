package sorting;

public interface ISort {
    <T extends Comparable<T>> T[] Sort(T[] elements);
}
