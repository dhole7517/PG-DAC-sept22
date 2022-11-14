import java.util.*;
class absent 
{
    public static void main(String [] args){
  for (int i = 0; i < arr.length; i++) {
    int index = Math.abs(arr[i]);
    if (arr[index - 1] > 0) {
      arr[index - 1] *= -1;
    }
  }
  List < Integer > ans = new ArrayList < > ();
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
      ans.add(i + 1);
    }
  }
  return ans; 
}
}