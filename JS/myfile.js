/* My JS code goes here.. */
const num = 5;  //global variable 
const arry=[4,2,7,1,3,8,6,0,9]; //1000X : [4,2,7,1,3,8,6,0,9
                                //arry: 1000X
                                //tempArray: 2000X   2000X : [4,2,7,1,3,8,6,0,9]
function helloMsg(){
    //num =6; -- cannot change global const 
    console.log('This is my JS file');
}

function add(x,y){
    let sum = x+y; //local variable
    console.log('Sum is ' + sum);
}

function displayArray(){
    let arryStr='';
    arry.forEach(e => arryStr = arryStr + ' '+ e); //e=4, e=2, e=7, e=1 ........
    console.log(arryStr)
    document.getElementById('arry').innerHTML=arryStr
}

function sortArray(direction){
    let tempArry = [...arry];   //... : spread operator which creates a clone 
    let arryStr='';

    if(direction == 'ASC') 
        tempArry.sort((a, b) => a - b) 

    if(direction == 'DESC') 
        tempArry.sort((a, b) => b - a) 

    tempArry.forEach(e => arryStr = arryStr + ' '+ e); //e=4, e=2, e=7, e=1 ........
    console.log(arryStr)
    document.getElementById('sortedArray').innerHTML=arryStr
}

function searchElement(){
    let element = document.getElementById('searchElement').value;
    let result = arry.find(e=>e == element);
    if(result == undefined)
        document.getElementById('searchMsg').innerHTML='Element Not Present'; 
    else
        document.getElementById('searchMsg').innerHTML='Element is Present'; 
}