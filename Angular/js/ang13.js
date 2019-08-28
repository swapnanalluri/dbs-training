/*var numbers = [12,34,,45,4,6,47,67];
numbers.filter(function(num){return num%2===0});
numbers.push(34);
numbers.pop();*/


/*var obj = {
    name:'swapna',
    getName:() => {
        return this.name;
    }
}

console.log(obj.getName());*/

class Employee {
    costructor(fname,lname) {
        this.fname=fname;
        this.lname=lname;
    }

    getFname(){
        return this.fname;
    }
    getLname() {
        return this.lname;
    }
    setFname(firstname) {
        this.fname=firstname;
    }
    setLname(lastname) {
        this.lname=lastname;
    }

    printEmpDesc() {
        console.log('FirstName: ${this.fname} LastName: ${this.lname}');
    }
}

let vinay = new Employee('vinay','krishna');

console.log(vinay.getFname());