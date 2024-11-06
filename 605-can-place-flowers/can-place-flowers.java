class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i = 0; i < len && n > 0; i++) {
            if(flowerbed[i] == 1)
                continue;
            if(i==0){
                if (i + 1 == len || flowerbed[i+1]== 0){
                    n--;
                    flowerbed[i] = 1;
                }
            }  
            else if(i == len -1){
                if(i-1 >= 0 && flowerbed[i-1] == 0){
                    n--;
                    flowerbed[i] = 1;
                }
            }else if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
            
        }
        return ((n == 0? true:false));
    }
}