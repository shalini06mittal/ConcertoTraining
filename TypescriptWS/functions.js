function add(a, b) {
    return a + b;
}
function reverse(items) {
    var toreturn = [];
    for (var i = items.length - 1; i >= 0; i--) {
        toreturn.push(items[i]);
    }
    return toreturn;
}
console.log(reverse([1, 2, 3, 4, 5]));
console.log(reverse(['Mumbai', 'Chennai', 'Delhi', 1]));
