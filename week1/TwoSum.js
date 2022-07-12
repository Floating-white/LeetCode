function twoSum(nums, target) {
    const map = new Map()
    // 对于符合要求的两个数称之为：互补数a和互补数b
    for (let i = 0; i < nums.length; i++) {
        // 对于每个互补数a，都查看哈希表中是否存在互补数b
        if (map.has(target - nums[i])) {
            // 如果存在, 则返回[互补数b的index, 互补数a的index]
            return [map.get(target - nums[i]), i]
        } else {
            // 如果不存在则把当前的数存入哈希表 {key=当前数值, value=当前数值的索引}
            map.set(nums[i], i)
        }
    }
}

