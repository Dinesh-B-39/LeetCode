class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=k%len(nums)
        z=len(nums)-k
        nums[z:]=nums[z:][::-1]
        # nums.reverse()
        nums[:z]=nums[:z][::-1]
        nums[0:]=nums[0:][::-1]
        return nums