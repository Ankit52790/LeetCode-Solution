class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > nums.length/3)
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
