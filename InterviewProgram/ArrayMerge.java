package InterviewProgram;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a={72,4,6,64,33};
        int[] b={87,42,41,88,66};

        //for merging two arrays and create new one
        int[] merge=new int[a.length+b.length];

        for(int i=0;i <= a.length-1; i++){
            //add array of a elements to merged list
            merge[i]=a[i];
        }
        for(int j=0; j<=b.length-1;j++){
            //add array of b
            merge[a.length+j]=b[j];
        }
        //iterate it
        for (int i=0;i<merge.length-1;i++) {
            System.out.println( merge[i]);
        }
    }
}
