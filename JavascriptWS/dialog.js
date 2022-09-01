/*
alert - dsiplay some info
prompt - take input
confirm - confirmation adn it returns true or false
*/
// alert('heyy')
// let x;
// console.log(x);
let no = parseFloat(prompt('enter a number')); // returns a value of type string
console.log(typeof(no))
// null Nan undefined reference error empty
document.write(`<h2> No : ${no}</h2>`);
document.write(`<h2> Result : ${no * 5}</h2>`);
document.write(`<h2> Result : ${no + 5}</h2>`);
document.write(`<h2> Result : ${no < 5}</h2>`);
document.write(`<h2> Result : ${no /0}</h2>`);
//alert('welcome '+uname)