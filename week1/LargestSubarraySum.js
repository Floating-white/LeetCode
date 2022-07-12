/**
 * @param nums {number[]}
 * @return {number}
 */
const maxSubArray = function (nums) {
    let maxSum = nums[0], curSum = 0;
    for (let i = 0; i < nums.length; i++) {
        curSum = Math.max(curSum + nums[i], nums[i]);
        maxSum = Math.max(curSum, maxSum)
    }

    return maxSum;
};

console.log(maxSubArray([-2,1]));
