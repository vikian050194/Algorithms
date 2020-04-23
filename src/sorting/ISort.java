package sorting;

public interface ISort {
    String GetName();
    <T extends Comparable<T>> T[] Sort(T[] elements);
}
