export default class Student{
    constructor(public name:string,private email:string='test@gmail.com')
    {
        this.name = name;
        this.email = email;
    }
    display()
    {
        console.log(this.name, this.email)
    }
}
// let s1 = new Student('shalini','45678')
// let s2 = new Student('shalini')
// s1.display();
// s2.display()
export function f1()
{
    
}
