package collectionsprograms.removeduplicateswhilepreservingorder;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesElement {
    public static void removeElement(List<Integer>list){

        for(int i=0;i<list.size()-1;i++){
            for (int j = i + 1; j < list.size(); j++) {
                // If a duplicate is found, remove it
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; // Decrement j because elements shift left
                }
            }

        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        removeElement(list);
    }
}
