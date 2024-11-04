class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> hold = new ArrayList<>();
        int numberOfkids = candies.length;
        int max  = Arrays.stream(candies).max().getAsInt();
        for(int i = 0; i < numberOfkids; i++) {
            if(candies[i] + extraCandies >= max)
                hold.add(true);
            else
                hold.add(false);
        }
        return hold;
    }
}