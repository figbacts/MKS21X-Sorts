public class Sort{
  public static void selectionsort(int [] ary){
    int smallindex = 0;
    int small = ary[0];
    for(int i = 0; i < ary.length; i ++){
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
}
