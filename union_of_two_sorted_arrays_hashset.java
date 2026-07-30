import java.util.*;
class union_of_two_sorted_arrays_hashset{
    public static void main(String args[]){
        int[] arr1={1,2,2,3,5,6};
        int[] arr2={1,3,4,4,5,6,7};
        int n1=arr1.length;
        int n2=arr2.length;
        HashSet <Integer> set=new HashSet<>(); 
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        for(int num:set){
            System.out.print(num+" ");
        }
    }
}
