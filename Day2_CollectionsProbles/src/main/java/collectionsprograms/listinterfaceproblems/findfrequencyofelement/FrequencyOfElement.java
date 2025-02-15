package collectionsprograms.findfrequencyofelement;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfElement {

    public static HashMap<String,Integer> frequencyCount(List<String>list){
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        for(String element:list){
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }
            else{
                map.put(element,1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        System.out.println(list);
        HashMap<String ,Integer>map=frequencyCount(list);
        System.out.println(map);
    }
}
