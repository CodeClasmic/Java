package logic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();

        Map<Character, Integer> countMap=new LinkedHashMap<>();
        
        for ( char ch : str.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                countMap.put(ch,countMap.getOrDefault(ch, 0)+1);
            }
        }

        char result='\0';

        for(Map.Entry<Character,Integer> entry : countMap.entrySet())
        {
            if(entry.getValue()==1)
            {
                result=entry.getKey();
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }
}
