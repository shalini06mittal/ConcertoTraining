var data = [{id:1,name:'siya'},
            {id:2,name:'Rahul'},
            {id:3,name:'Konark'},
            {id:4,name:'Manasvi'}
]

var ele = document.getElementById('names');
var html =`<select onchange="console.log(this.value)">`
for(var d of data)
{
    html+=`
        <option value=${d.id}>${d.name}</option>
    `
}
html+='</select>'
ele.innerHTML = html;