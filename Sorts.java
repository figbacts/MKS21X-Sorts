 import java.util.Random;
public class Sorts{
  public static void selectionSort(int [] ary){
    for(int i = 0; i < ary.length; i ++){
      int smallindex = i;
        int small = ary[i];
      for (int j = i; j <ary.length; j++){
        if (ary[j] < small){
          smallindex = j;
          small = ary[j];
        }
      }
      ary[smallindex] = ary[i];
      ary[i] = small;
    }
  }
  public static void bubbleSort(int [] ary){
    int index = ary.length -1;
    int placeholder = 0;
    for (int i = 0; index != 0; i ++){
      for (int j = 0; j < index; j ++){
        if (ary[j] > ary[j+1]){
          placeholder = ary[j];
          ary[j] = ary[j+1];
          ary[j+1] = placeholder;
        }
      }
      index = index - 1;
    }
  }
  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}
public static boolean checkArray(int [] ary){
  for (int i = 0; i < ary.length -1 ; i ++){
    if (ary[i] > ary[i+1]){
      return false;
    }
  }
  return true;
}

  public static void main(String[] args) {
   int length = Integer.parseInt(args[0]);
 int ary[];
 ary = new int[length];
 Random rand = new Random();
 for (int i = 0; i < ary.length; i ++){
   ary[i] = rand.nextInt();
 }
bubbleSort(ary);
System.out.println(checkArray(ary));
  }
}
