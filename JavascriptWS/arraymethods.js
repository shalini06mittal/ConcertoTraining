// var colors=['Red','Blue','Green','Black','Purple','Raspberry']

// colors.forEach(color=>console.log(color.toUpperCase()))
// console.log(colors)
// var nos =[1,2,3,4,5]

// var uppercolors =colors.map((color, index)=> index+ " : "+color.toUpperCase())
// console.log(uppercolors)
// console.log(colors)

// var colorslength = colors.map(color => color.length)
// console.log(colorslength)

// var bluecolors = colors.filter(color => color.startsWith('B'))

 var nos = [10,20,30,40,50]
// var sum = nos[0]
// for(var i=1;i<nos.length;i++)
//  sum+=nos[i]
// sum = pv
var total= nos.reduce((sum, n) =>sum + (n - n*0.1),0)
console.log(total)
/**
 * var invoices =[
 *  {invid:1, totalamount:3124, cname:'', invdate:'',isMember:true}
 * ]
 * 
 * 10% discount => use map => check every invoice if ismember is true
 * apply 10%disc and return the new array
 * get the total of all  the invoices for ismember = true
 * using reduce
 */
 var invoices =[
     {invid:1, totalamount:1000, cname:'Sara', invdate:'2022-03-03',isMember:true},
     {invid:2, totalamount:2000, cname:'Rahul', invdate:'2022-10-03',isMember:false},
     {invid:3, totalamount:1500, cname:'Shyam', invdate:'2022-09-05',isMember:false},
     {invid:4, totalamount:3000, cname:'Shridhar', invdate:'2022-05-13',isMember:true},
     {invid:5, totalamount:4500, cname:'Maya', invdate:'2022-03-03',isMember:true},
]

console.log(invoices.filter(invoice=>invoice.isMember)
       .map(invoice => {
         invoice.totalamount  = invoice.totalamount 
         - invoice.totalamount * 0.1
         return invoice
        }
    ).reduce((total, invoice)=> total + invoice.totalamount,0)
    )

console.log(
       invoices.map(invoice => {
        if(invoice.isMember)
         invoice.totalamount  = invoice.totalamount - invoice.totalamount * 0.1
        //  else
        //  invoice.totalamount  = invoice.totalamount - invoice.totalamount * 0.05
         return invoice
        }
    ))