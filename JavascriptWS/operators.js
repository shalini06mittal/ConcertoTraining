/*
unary: ++ -- !
binary :
arithmetic : + - * / %
relational : / comparison - < > <= >= == != <== >== === !==
logical : && ||

ternary : ?:
*/
let a = 10
let p = a++ + a * 10 + ++a /2
document.write(`<p>a = ${a} : p = ${p}</p>`)
document.write(`<p> 5/2 = ${5/2}</p>`)

document.write(`<p>1 == '1' ${1 == '1'}</p>`)
document.write(`<p>1 === '1' ${1 === '1'}</p>`)

document.write(`<p>&& ${a == 10 && ++a > 2}</p>`)
document.write(`<p>&& ${a}</p>`)

document.write(`<p>|| ${a == 12 || ++a > 2}</p>`)
document.write(`<p>|| ${a}</p>`)