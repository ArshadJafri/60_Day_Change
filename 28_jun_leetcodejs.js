/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */


//2 

/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    count = 0
    return function() {
      return n++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */

//3
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let present_val = init
    return {
        increment :()=>++present_val,
        decrement :()=>--present_val,
        reset :() =>present_val = init

    }
    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */

//4

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    function toBe(new_val){
        if (val === new_val){
            return true;
        }
        else{
            throw new Error("Not Equal");
        }
    }
    function notToBe(new_val){
        if (val !== new_val){
            return true;
        }
        else{
            throw new Error("Equal");
        }
    }
    return {
        toBe: toBe,
        notToBe: notToBe
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */

//4
javascript
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
   
    for(let i=0;i<arr.length;i++){
        arr[i]= fn(arr[i],i);
     
    }
    return   arr;
}
