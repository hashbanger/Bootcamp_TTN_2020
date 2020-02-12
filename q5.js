// create a list of objects of Employee with info as follow :
// Name, age, salary ,DOB
// Filter all employees with salary greater than 5000         
// group employee on the basis of their age
// fetch employees with salary less than 1000 and age greater than 20. Then give them an increment 5 times their salary.

var employee = [
    {'name':'prashant','age':22,'salary':28000,'dob':'23-09-1997'},
    {'name':'ankit','age':22,'salary':1000,'dob':'09-03-1997'},
    {'name':'vishal','age':19,'salary':767,'dob':'01-03-2001'},
    {'name':'shivam','age':24,'salary':400,'dob':'01-03-1995'},
    {'name':'karan','age':22,'salary':5155,'dob':'23-09-1997'},
    {'name':'megha','age':21,'salary':899,'dob':'23-07-1998'},
    {'name':'surbhi','age':24,'salary':100,'dob':'18-05-1995'}
]

// To show all objects and their key, pairs
for(var i=0;i<employee.length;i++){
    for(k in employee[i]){
        console.log(`${k} : ${employee[i][k]}`);
    }
    console.log("\n");
}

// Filter employees based on salary
greaterSalary = [];
for(var i=0;i<employee.length;i++){
    if(employee[i]['salary']>5000){
        greaterSalary.push(employee[i]['name']);
    }
}
console.log(`\nPeople having higher salary than 5000 are: ${greaterSalary}`)

// Grouping employee on basis on their salary
groupEmps = {}
for(var i=0;i<employee.length;i++){
    console.log(employee[i]['age']);
    if(groupEmps.hasOwnProperty(employee[i]['age'])){
        groupEmps[employee[i]['age']].push(employee[i]);
    }
    else{
        groupEmps[employee[i]['age']] = [];
        groupEmps[employee[i]['age']].push(employee[i]);
    }
}
console.log(groupEmps);

// Fetching employees with age greater than 20 and salary less than 1000.
lowerSalaryAge = [];
for(var i=0;i<employee.length;i++){
    if(employee[i]['salary'] < 1000 && employee[i]['age'] > 20){
        lowerSalaryAge.push(employee[i]['name']);
        employee[i]['salary'] += 5 * employee[i]['salary']; 
    }
}
console.log(`\nPeople having lower salary than 1000 are: ${lowerSalaryAge}`);

for(var i=0;i<employee.length;i++){
    for(k in employee[i]){
        console.log(`${k} : ${employee[i][k]}`);
    }
    console.log("\n");
}

