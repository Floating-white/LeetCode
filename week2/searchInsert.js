/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
const searchInsert = function (nums, target) {

    let l = 0
    let r = nums.length - 1
    while ( l <= r) {
        let mid = Math.round((l + r) / 2)

        if (nums[mid] === target) return mid
        else if (nums[mid] > target) {
            r = mid - 1
        } else if (nums[mid] < target) {
            l = mid + 1
        }
    }
    return  l
}

