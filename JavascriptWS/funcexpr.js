// function expression
// hoisting in js

console.log(x)// 
var x = 10;
var sqrt = function(no){
    console.log('expr')
    return Math.sqrt(no);
}
function sqrt()
{
    console.log('sqrt')
}
console.log(typeof(sqrt))
console.log(sqrt(10))
// function calculate(nos, func)
// {
//     for(n of nos)
//         console.log(func(n))
// }
// function square(no){return no*no}
// function cube(no){return no*no*no}
// calculate([1,2,3,5],function(b, p=2){
//     return Math.pow(b,p);
// });
function outer()
{
    console.log('outer')
    function inner()
    {
        console.log('inner')

    }
    
}
outer();
// var f = outer();
// console.log(f)
// outer()();