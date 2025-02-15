package collectionsprograms.reverselistusinglinkedlistandarraylist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseListInLinkedList {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        for (int i=0;i< list.size()/2;i++){
            Collections.swap(list,i,list.size()-i-1);
        }
        System.out.println(list);
    }
}
