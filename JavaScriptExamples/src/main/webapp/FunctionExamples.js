function greet()
{
	document.write("Good Morning");
}
greet();

function add(num1,num2)
{
	let res;
	res=num1+num2;
	document.write("Addition of 2 numbers "+res);
}
add(10,20);

function billCalc(name,price,quantity)
{
	let totalBill;
	totalBill=price*quantity;
	return totalBill;
}
let bill=billCalc("sugar",48,2);
document.write("Total Bill"+bill);

function dummy()
{
}
let res1=dummy()
document.write(res1);

function add1(num1=10,num2=20)
{
	return num1+num2;
}
console.log(add1());
console.log(add1(100));
console.log(add1(100,200));

let code=function(num1,num2)
		{
			return num1+num2;
		}
console.log(code(10,20));

let res=(num1,num2)=>{return num1+num2};
console.log(res(10,20));

let sum=(a,b)=>a+b;
console.log(sum(100,200));

let square=num=>num*num;
console.log(square(5));

function factorial(n)
{
	if(n===0||n===1)
	{
		return 1;
	}
	else{
		return n*factorial(n-1);
	}
}
console.log(factorial(5));












