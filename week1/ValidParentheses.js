/**
 * @param {string} s
 * @return {boolean}
 */
const isValid = function (s) {
    const stack = ["$"];

    const map = new Map([["(", ")"], ["[", "]"], ["{", "}"]]);

    for (let i = 0; i < s.length; i++) {
        if (map.has(s.charAt(i))) {
            stack.push(s.charAt(i));
        } else {
            if (map.get(stack.pop()) !== s.charAt(i)) return false;
        }
    }

    return stack.length === 1;
};
