class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{

            int firstNumber = 0;
            int secondNumber = 1;
            int thirdNumber = 1;
            int fourthNumber;

            for(int i=0;i<n;i++){
                fourthNumber = firstNumber + secondNumber + thirdNumber;

                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = fourthNumber;
            }

            return firstNumber;
        }
    }
}