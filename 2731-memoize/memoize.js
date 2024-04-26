/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const array = {};
    return function(...args) {
        let result;
        let key = String(args);
        if(key in array)
            return array[key];
        result = fn(...args);
        array[key] = result;
        return result;
        
    }
}



/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */