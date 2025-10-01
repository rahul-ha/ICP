class Solution {
    public boolean lemonadeChange(int[] arr) {
        int count = 0;
        int a = 0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
            a++;
            count++;}
            if(arr[i]==10){
                b++;
                if(a>=1){
                    count++;
                    a--;
                }
            }
            if(arr[i]==20){
                if(b>=1 && a>=1){
                    count++;
                    b--;
                    a--;
                }
                else if(a>=3){
                    count++;
                    a = a-3;
                }
            }

        }
        int k = arr.length-count;
        if(k==0)
        return true;
        return false;
    }
}
