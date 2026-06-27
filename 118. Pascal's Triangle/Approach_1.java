class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    int value=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    row.add(value);
                }
            }
            ans.add(row);
        }
        return ans;
    }
}