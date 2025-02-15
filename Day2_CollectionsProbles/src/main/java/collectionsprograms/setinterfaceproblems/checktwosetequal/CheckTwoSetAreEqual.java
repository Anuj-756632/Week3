package collectionsprograms.setinterfaceproblems;

import collectionsprograms.listinterfaceproblems.findnthelementfromend.FindNthElement;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CheckTwoSetAreEqual {
    public static void compareSets(Set<Integer>set,Set<Integer>set1){
        if(set.equals(set1)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer>set1=new HashSet<Integer>();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        compareSets(set,set1);
    }
}
