/**
 * 
 */
let massRatan=parseFloat(prompt("Enter mass of ratan"));
let heightRatan=parseFloat(prompt("Enter height of ratan"));
let massAnu=parseFloat(prompt("Enter mass of Anu"));
let heightAnu=parseFloat(prompt("Enter height of Anu"));
var BMIRatan;
var BMIAnu;
BMIRatan=massRatan/(heightRatan*heightRatan);
BMIAnu=massAnu/(heightAnu*heightAnu);
console.log(" BMI of ratan "+BMIRatan);
console.log(" BMI of Anu "+BMIAnu);
document.writeln(" BMI of ratan "+BMIRatan);
document.writeln(" BMI of Anu "+BMIAnu);
let RatanHigherBMI;
RatanHigherBMI=BMIRatan>BMIAnu;
if(RatanHigherBMI)
{
	console.log(" Ratan has Higher BMI ");
	document.writeln(" Ratan has higher BMI");
}
else{
	console.log(" Anu has higher BMI");
	document.writeln(" Anu has higher BMI");
}