/**
 * 1. output => return 
 * 2. input => parameters
 * 3. BL
 * 
 * () => {
 * BL
 * return <value>
 * }
 * 
 * if(expr){}
 */
function greet(){console.log()}

var greet = () => console.log('greeted')
greet();
var greet = (name) => console.log('greeted '+name)
greet('shalini');
// var square = (n) => {
//     return n*n;
// }
var square = n => n*n;

console.log(square(10))
function calculate(nos, func)
{
    for (const n of nos) {
        func(n)
    }
}

calculate([1,2,3,4,5],n => n*n*n)