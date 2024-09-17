class Solution {
    public List<List<Integer>> findMatrix(int[] arr) {

        Map<Integer,Integer> um=new HashMap<>();
		
		for(int i:arr)
		{
			um.put(i, um.getOrDefault(i, 0)+1); 
		}
		
		List<List<Integer>> ans=new ArrayList<>();
		
		while(!um.isEmpty())
		{
			List<Integer> temp=new ArrayList<Integer>();
			List<Integer> toEraze=new ArrayList<Integer>();
			
			for(Map.Entry<Integer, Integer> entry: um.entrySet())
			{
				int f=entry.getKey();
				int s=entry.getValue();
				
				temp.add(f);
				s--;
				
				if(s==0)
				{
					toEraze.add(f);
				}
				um.put(f,s);
			}
			ans.add(temp);
			
			for(int i:toEraze)
			{
				um.remove(i);
			}
			
		}
		return ans;
		
		
	}
}