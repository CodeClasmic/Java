package logic;
import java.util.*;
public class cleanList {
    void clean(List<Integer> list)
    {
        int l=list.size();
        System.out.println(l);
        if(l==0)
            System.out.println("Empty list");
        else if(l==1)
            System.out.print(list);
        else 
        {
           for(int x=0;x<list.size()-1;x++)
           {
                if(list.get(x) == list.get(x+1))
                {
                    list.remove(x+1);
                }
           }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        cleanList obj=new cleanList();
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(9);
        obj.clean(list);
    }
}
