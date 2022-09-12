package assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindMax{

  public static Integer FindMaxInteger(List<Integer> list) {
    //check list is  empty or not
    if(list == null || list.size() == 0) {
      return Integer.MIN_VALUE;
    }

    //Create new list to avoid modification in 
    //new list

    List<Integer> sortedList = new ArrayList<>(list);

    //Sort list in natural order
    Collections.sort(sortedList);

    return sortedList.get(sortedList.size() -1);
  }

  public static void main( String[] args) {
    //Create an arrayList object list
       List<Integer> list = new ArrayList<>();
    //Add element in ArrayList object list
    list.add(44);
    list.add(11);
    list.add(22);
    list.add(33);

    //Pringt max
    System.out.println("Max" + FindMaxInteger(list));

  }
}