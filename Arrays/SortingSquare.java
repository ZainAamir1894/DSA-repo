
public class SortingSquare{
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        
        int[] result = new int[arr.length];

        int start = 0;
        int end = arr.length-1;

        while(start < end){
                for(int i = 0; i< arr.length; i++){
                    int num = arr[i] * arr[i];
                
                    if(Math.abs(arr[start]) < Math.abs(arr[end])){
                        start++;
                    } else {
                        end--;
                    }
                    result[i] = num;
                }
                
            for(int i : result){
                System.out.print(i + ", ");
            }
        }
    }
}