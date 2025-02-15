package collectionsprograms.rotateelementinlist;

import java.util.ArrayList;
import java.util.List;

public class RotateElements {
    public static void rotate(List<Integer>list,int position){
        List<Integer>newList=new ArrayList<Integer>();
        for(int i=position;i<list.size();i++){
            newList.add(list.get(i));
        }
        for(int i=0;i<position;i++){
            newList.add(list.get(i));
        }
        System.out.println(newList);

    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        rotate(list,2);
    }
}
