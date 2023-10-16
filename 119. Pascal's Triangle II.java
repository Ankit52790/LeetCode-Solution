
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rs= new ArrayList<>();
        rs.add(1);
        long prev =1;
        for(int k=1;k<= rowIndex;k++){
            long next_val = prev * (rowIndex - k+1) / k;
            rs.add((int) next_val);
            prev = next_val;
        }
         return rs;
        
    }
}
