package logic;

import java.util.HashMap;

public class majority {
    void majorityCheck(int[] arr)
    {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=arr.length;
        int flag=1;
        for(int num:arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
            if (map.get(num) > l/2)
            {
                System.out.println("the majority= "+ num);   
                flag=0;
            }
            else
            {
                flag=1;
            }
            
        }
        if(flag==1)
        {
            System.out.println("none");
        }
    }
    void frequency(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int element = -1;
        int frequency=0;
        for(int num: arr)
        {
            map.put(num, map.getOrDefault(num, 0)+1);

            if(map.get(num)>frequency)
            {
                frequency=map.get(num);
                element=num;
            }
        }
        System.out.println("element= "+ element);
    }
    public static void main(String[] args) {
        int arr[]={4,8,8,8,5,6,8,4,4,4,4};
        majority obj=new majority();
        obj.majorityCheck(arr);
        obj.frequency(arr);
    }
}
