
function counter()
{
    var i = 0;
    function incr(){
        console.log(++i)
    }
    function decr(){
        return --i;
    }
    return {incr, decr};
}
var obj = counter()
// console.log(obj)
// console.log(obj.incr())
// console.log(obj.incr())
// console.log(obj.decr())

// console.log(obj.decr())