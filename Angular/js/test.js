var sum=function(a,b) {
    return a+b;
}

var cal=function(a,b,fun) {
    return fun(a,b);
}

var maxVal=function(a,b) {
    var max=a>b?a:b;
    return max;
}

var mx=cal(45,67,maxVal);
console.log('max'+mx);