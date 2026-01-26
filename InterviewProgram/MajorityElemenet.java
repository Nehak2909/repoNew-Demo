package InterviewProgram;

import java.util.HashMap;

public class MajorityElemenet {
    //majority element which appears more than n/2 times
    public static void main(String[] args) {
        int [] arr={3,2,2};
        HashMap <Integer,Integer> map=new HashMap<>();

        //count frequency
        for (int i:arr) {
            map.put( i, map.getOrDefault(i,0)+1);

        }
        
        for (int i:map.keySet()) {
            if(map.get(i)>arr.length/2){
                System.out.println(i);
            }
        }
    }
}
