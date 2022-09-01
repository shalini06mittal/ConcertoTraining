// immediately invoked function expression
(function(global)
{
    let cities=['Mumbai','chennai']
     var ele = document.getElementById('head');
    function dispaly()
    {
        ele.innerHTML=''
        for(let city of cities) ele.innerHTML+=`<p>${city}</p>`
    }
    dispaly();
    function addCity(city)
    {
        cities.push(city)
        dispaly()
    }
    function removeCity(city)
    {
        cities.splice(0,1)
        
        dispaly()
    }
    global.addCity = addCity;
    global.removeCity = removeCity;
})(window);
// var i = 1
// let intv = setInterval(function(){
//     console.log(i++);
// }, 1000);

setTimeout(function(){
    // alert('times up')
    // clearInterval(intv)
    addCity('Pune')
}, 2000);

setTimeout(function(){
    // alert('times up')
    // clearInterval(intv)
    removeCity('Mumbai')
}, 4000);