class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        l = 0
        r = len(people)-1
        total = 0
        while r>=l:
            if people[r]+people[l]<=limit:
                total+=1
                r-=1
                l+=1
            elif people[r]+people[l]>limit:
                total+=1
                r-=1
        return total
