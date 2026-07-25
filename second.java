public class second{
    public static void main(String args[]){
        int arr[]={1,2,4,7,7,5};
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int largest=arr[n-1];
        int slargest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                slargest=arr[i];
                break;
            }
        }
    System.out.println(slargest);    
    }
}