package Java8classes;

public class EvenNumber {
    public static void main(String[] args) {
     int[] arr1={34,22,55,11,3};
     int[] arr2={49,43,55,33};
     int[] arr3=new int[arr1.length + arr2.length];
     for(int i=0 ; i<=arr1.length-1 ; i++){
         arr3[i] = arr1[i];
     }
        for(int j=0 ; j<arr2.length ; j++){
            arr3[arr1.length+j] = arr2[j];
        }

        for(int i=0 ; i<=arr3.length-1 ; i++){
            System.out.println(arr3[i]);

        }



    }
}

//word digit seprate
//fabinocci series
//reverse the number
//duplicate number