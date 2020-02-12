// Prompt for amount, interest rate and no. of years and calculate simple interest.

var amount = prompt('Enter the Amount')
var time = prompt('Enter the Time in Years')
var rate = prompt('Enter the Interest')

function simpleInterest(amount,rate,time){
    return (amount * rate * time)/100;
}
alert(`The Simple interest is ${simpleInterest(amount, time, rate)}`);