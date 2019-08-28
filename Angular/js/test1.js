/*var greet = function(fname,lname) {
    var  message = function(message) {
        console.log(message +':'+fname+','+lname);
    }
    return message;
}
var greetFun=greet('sw','na');
greetFun('hi');*/

/*var user=function() {
    var fname='';
    var lname='';
    var obj = {
        setFname:function(fName) {
            fname=fName;
        },
        getFname:function() {
            return fname;
        },
        setLname:function(lName) {
            lname=lName;
        },
        getLname:function() {
            return lname;
        }
    }
    return obj;
}
var swapna = user();
swapna.setFname('swapna');
console.log(swapna.getFname());*/

/*var user = function() {
    var totalAmount=0;
    var tip=0;

    var obj = {
        setTotalAmount:function(tAmount) {
            if(tAmount>0) {
                totalAmount=tAmount;
            }
            else {
                console.log("Invalid amount");
            }
        },
        getTotalAmount:function() {
            return totalAmount;
        },

        setTip:function(tipAmunt) {
            if(tipAmunt>0) {
                tip=tipAmunt;
            }
            else {
                console.log("Invalid tip");
            }
        },
        getTip:function() {
            return tip;
        },
        getTotal:function() {
            var total = totalAmount+tip;
            return total;
        }
    }
return obj;
}
var swapna = user();
swapna.setTotalAmount(-1000);
swapna.setTip(-100);
console.log(swapna.getTotalAmount());
console.log(swapna.getTip());
console.log(swapna.getTotal());
*/

/*var list = [
    { 
        id:1,
        dep:'Hr',
        sal:1000,
        name:'x'
     },
     { 
        id:1,
        dep:'Hr',
        sal:2000,
        name:'x1'
     },
     { 
        id:1,
        dep:'Hr',
        sal:3000,
        name:'x2'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:2000,
        name:'x3'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x4'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x'
     },

];
var salary=0;
for(i=0;i<list.length;i++) {
    if(list[i].dep=='Hr') {
        salary=salary+list[i].sal;
    }
}
console.log(salary);*/

/*var list = [
    { 
        id:1,
        dep:'Hr',
        sal:1000,
        name:'swapna'
     },
     { 
        id:1,
        dep:'Hr',
        sal:2000,
        name:'nalluri'
     },
     { 
        id:1,
        dep:'Hr',
        sal:3000,
        name:'abc'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:2000,
        name:'def'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'hij'
     },
     { 
        id:1,
        dep:'Hr1',
        sal:1000,
        name:'x'
     },
];

var task_names = list.map(function (list) {
 
    return '<li>'+console.log(list.name)+'</li>'; 
 
});*/

