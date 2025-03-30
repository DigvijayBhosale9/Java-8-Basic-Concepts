package arraybasics;
class SumOfArray{
    public int arraySum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        int[] arr = {1,2,3,4,5};
        System.out.println("Sum of Array: "+obj.arraySum(arr));
    }
}