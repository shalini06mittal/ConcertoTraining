let products = ['Pencil','Eraser','Notebook']
let price = [20, 10, 200]

var html=""
for(var i=0;i<price.length;i++)
{
    html+=`
        <tr><td>
        ${products[i]}
        </td>
        <td>
        ${price[i]}
        </td>
        <td>
        <input type='text' id=p${i+1} value='0' onChange="console.log(this.value, this.getAttribute('id'))"/>
        </td>
        </tr>
    `
}
html+=`<button onclick="calculate()">Calculate Total</button>`
var tableele = document.getElementById('prod');
tableele.innerHTML += html;


function calculate()
{
    alert('kh')
    var qty = []
    qty.push(document.getElementById('p1').value);
    qty.push(document.getElementById('p2').value);
    qty.push(document.getElementById('p3').value);
    var total = 0;
    for(var i=0;i<qty.length;i++)
        total += parseInt(qty[i]) * price[i];
    tableele.innerHTML+=`
        <tr>
            <td colspan='3'>Total ${total}</td>
        </tr>
    `
}

