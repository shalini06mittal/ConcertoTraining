//if(localStorage)
localStorage.setItem('token','45678')
localStorage.setItem('data',JSON.stringify({"name":"shalini"}))
console.log(localStorage.getItem('token'))
localStorage.removeItem('token')
var data = localStorage.getItem('data');
var obj = JSON.parse(data)
console.log(obj.name)