package InterviewProgram;


import java.util.Collections;
import java.util.PriorityQueue;

public class KThLargestElement {
    public static void main(String[] args) {
        int []num={3,2,1,5,6,4};
        int k=2;

        //PriorityQueue pq=new PriorityQueue<>();//for min heap
        PriorityQueue pq=new PriorityQueue<>(Collections.reverseOrder());// for max heap

        //for ADD THE ELEMENTS IN HEAP
        for(int nums: num){
            pq.add(nums);
        }
        //remove k-1 largest element
        for(int i =0; i<k; i++){
            pq.poll();
        }
        System.out.println("KTh largest element : "+pq.peek());
    }
}
