var nos = 1
nos = [1,2,3,4,5,"adas", true];
console.log(nos.length)
//nos[100] = 30
console.log(nos[100])
if(nos[50] === undefined)
    console.log('not')

for(var n in nos)
    console.log(n, nos[n])
console.log(' for - of')
for(var n of nos)
    console.log(n)

    console.log(nos.length)
nos.push('hello')
console.log(nos)