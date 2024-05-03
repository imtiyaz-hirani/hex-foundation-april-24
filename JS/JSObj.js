const empArry=[];
function loadObjects(){
    let e1={
        id: 1,
        name: 'harry potter',
        salary: 90000,
        city: 'mumbai',
        department: 'DEV'
    }

    let e2={
        id: 2,
        name: 'ronald weasley',
        salary: 75000,
        city: 'chennai',
        department: 'TESTING'
    }

    let e3={
        id: 3,
        name: 'hermione granger',
        salary: 98000,
        city: 'mumbai',
        department: 'DEV'
    }

    let e4={
        id: 4,
        name: 'draco malfoy',
        salary: 87000,
        city: 'delhi',
        department: 'ADMIN'
    }

    empArry.push(e1);
    empArry.push(e2);
    empArry.push(e3);
    empArry.push(e4);
    
}

function displayAllEmployees(){
    loadObjects();
    empArry.forEach(emp => console.log(emp.id + '--' + emp.name 
        + '--' + emp.department + '--' + emp.city + '--' + emp.salary))
    let data='';
    empArry.forEach(emp=> {
        data = data +emp.id + '--' + emp.name 
                + '--' + emp.department + '--' + emp.city + '--' + emp.salary + '<br />'
    })
    document.getElementById('employeeData').innerHTML=data
}

function filterEmployee(){
    let tempArry =[...empArry];
    let searchStr = document.getElementById('searchStr').value;
    //console.log('harry potter'.search(searchStr));
    tempArry = tempArry.filter(emp=>(emp.name.search(searchStr) >= 0 || emp.city.search(searchStr) >= 0));
    let data='';
    tempArry.forEach(emp=> {
    data = data +emp.id + '--' + emp.name 
                + '--' + emp.department + '--' + emp.city + '--' + emp.salary + '<br />'
    })
    document.getElementById('employeeData').innerHTML=data
}