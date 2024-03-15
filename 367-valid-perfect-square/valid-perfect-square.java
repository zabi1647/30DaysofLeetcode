class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        long i = 2;
        long j = num;
        while(i<j){
            long mid = i+(j-i)/2;
            long sq = mid * mid;
            if(sq==num)
                return true;
            else if(sq>num){
                j = mid;
            }else
                i = mid+1;
        }
        return false;
    }
}