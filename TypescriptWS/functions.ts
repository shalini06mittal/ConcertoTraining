function add(a:number, b:number):number
{
    return a+b;
}
function reverse<T>(items: T[]): T[] {
    var toreturn:T[] = [];
    for (let i = items.length - 1; i >= 0; i--) {
        toreturn.push(items[i]);
    }
    return toreturn;
}
console.log(reverse([1,2,3,4,5]))
//console.log(reverse<string>(['Mumbai','Chennai','Delhi',1]))
