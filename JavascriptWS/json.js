var employee={name:'nam1',city:'Mumbai'}
console.log(employee.city)
console.log(employee['name'])
var key ='name';
console.log(employee[key])
employee.name = 'shalini'
console.log(employee)
//employee.phone = '123245'
console.log(employee)
var emps =[
    {id:1,name:'Shalini', city:'Mumbai'},// emps[0]
    {id:2, name:'Kavya', city:'Pune'},
];

var empfound = emps.find(function(emp){return emp.id==2})
console.log(empfound)

var keys = Object.keys(employee)
console.log(keys)// name city
for(let i=0;i<emps.length;i++)
{
    console.log('Empliyee '+(i+1))
    //var emp = emps[i]
    for(let key of keys)
        console.log(key, emps[i][key])
}

/**
  (function()
  {
    1. initalize an empty employee array
    2. create function initialize(): add 4 employee objects
    in the employees array
    employee: id, name, city, email, phone, 
    dateofjoining : YYYY-MM-DD,
    profilepic : 'https://www.dummy.com/shalini.jpg'
    searchEmployee(id) => display the employee details on the page
    Id: 
    name:
    Date of j : 3 April 2022
    Pic : shalini.jpeg
    find()
  }
  )
 */