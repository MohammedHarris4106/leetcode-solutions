# 118. Pascal's Triangle

### Difficulty: Easy

## Description
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

 
Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:
Input: numRows = 1
Output: [[1]]

 
Constraints:


	1 <= numRows <= 30

## Submission Details
- **Status**: Accepted
- **Runtime**: 1
- **Memory**: 43660000
- **Language**: java

## Code
```java
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
```
