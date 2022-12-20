import java.util.Arrays; 
public class QSort {
  public static void main(String args[]) {
    int intArray[] = {4,-1,6,8,0,5,-3};
    int n = intArray.length;
    System.out.println("\nOriginal Array: " + Arrays.toString(intArray)); 
    
    QuickSort obj = new QuickSort();
    obj.quick_sort(intArray, 0, n-1);

    System.out.println("\nSorted Array: " + Arrays.toString(intArray) + "\n");
  }
}
