/**
 * named functions
 * function expressions
 * IIFE
 * closures
 * arrow
 */
function greet()
{
    alert('welcome')
}
//console.log(greet())

function add(a,b)
{
    alert(a+b)
    return a+b
}
//console.log(add(2,3))

function addClicked()
{
    var n1ele = document.getElementById('n1');
    console.log(n1ele.value)
    var h1ele = document.getElementById('head');
    h1ele.innerHTML = '<i>Result</i> '+ n1ele.value;
    h1ele.style.color = 'green';
    //document.write(`<h1>Res : ${n1ele.value + n1ele.value}</h1>`)
}
function mul(a,b)
{
    console.log(arguments)
    //console.log(a*b);
}
// mul()
// mul(1)
mul(1,2,3,4,5)