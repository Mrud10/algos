class Solution:
    def numTrees(self, n: int) -> int:
        dp = [0] * (n+1)
        dp[0] = 1
        dp[1] = 1
        for i in range(2,n+1):
            total = 0
            for j in range(1,i+1):
                 left = j-1
                 right = i-j
                 total+=dp[left] * dp[right]
                 dp[i]=total
        return dp[n]





#1 = 1 
#2 = 2
#3 = 5
#4 = 14
#5 = 
    
