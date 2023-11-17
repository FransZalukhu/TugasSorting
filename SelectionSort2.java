package Sorting;

public class SelectionSort2 {
    public static void main(String[] args) {
        int nilai [] = {22,2,90,25,20,30,6,3};
       
        for (int i = 0 ; i<nilai.length-1;i++){
            int min = i;
            for (int x = 1+i ; x<nilai.length; x++){
                 /*System.out.println(min+" "+x);*/
                if (nilai[min] > nilai[x]){
                    min = x;
                }
            }
            int z= nilai[min];
            nilai[min] = nilai [i];
            nilai[i] = z;
        }
        for (int i = 0 ; i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
    }
   
}