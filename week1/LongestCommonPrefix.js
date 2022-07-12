/**
 * @param {string[]} strs
 * @return {string}
 */
const longestCommonPrefix = function (strs) {
    // 获取最短字符串的长度
    let minLen = strs[0].length;
    for (let str of strs) {
        if (str.length < minLen) minLen = str.length;
    }

    for (let i = 0; i < minLen; i++) {
        // 从第一个字符串中依次选取字符 纵向比对
        let char = strs[0].charAt(i);

        for (let j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) !== char) {
                return strs[0].substring(0, i);
            }
        }
    }

    return strs[0].substring(0, minLen);
};


