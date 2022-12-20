// ------------ QUICK SORT  ------------
import java.util.Arrays; 
class QuickSort {
  int partition(int intArray[], int low, int high) {
    int pi = intArray[high];
    int i = (low-1);

    for (int j=low; j<high; j++) {
      if (intArray[j] <= pi) {
        i++;
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
      }
    }
    
    int temp = intArray[i+1];
    intArray[i+1] = intArray[high];
    intArray[high] = temp;
    return i+1;
  }

  void quick_sort(int intArray[], int low, int high) { 
    if (low < high) {
      int pi = partition(intArray, low, high);
      quick_sort(intArray, low, pi-1); 
      quick_sort(intArray, pi+1, high);
    }
  }
} 