class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = {}

        for n in nums:
            counter[n] = 1 + counter.get(n, 0)
        
        freq_array = [[] for _ in range(len(nums) + 1)]

        for key, value in counter.items():
            freq_array[value].append(key)

        res = []
        for i in range(len(freq_array) -1, -1, -1):
            if len(res) == k:
                return res
            res.extend(freq_array[i])
