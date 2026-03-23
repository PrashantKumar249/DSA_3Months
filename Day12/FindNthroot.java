class FindNthroot {
    public int NthRoot(int N, int M) {
        
        int low = 1;
        int high = M;
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            
            long power = 1;
            
            // mid^N calculate
            for(int i = 1; i <= N; i++){
                power = power * mid;
                
                if(power > M) break;
            }
            
            if(power == M){
                return mid;
            }
            
            else if(power < M){
                low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        
        return -1;
    }
}