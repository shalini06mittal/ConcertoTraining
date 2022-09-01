interface Employee{
    id:number,
    ename:string,
    phone?:string
}
function display(data:Employee)
{
    console.log(data.id)
}
display({id:1, ename:'', phone:''})
display({id:1, ename:''})
// display(1)
// display('ajshdk')
// display([1,2,3])