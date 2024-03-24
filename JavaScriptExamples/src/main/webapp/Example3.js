/**
 * 
 */
let num1=parseInt(prompt("Enter first number"));
let num2=parseInt(prompt("Enter last number"));
let i;
for(i=num1;i<=num2;i++)
{
	if(i%3==0)
	{
		document.write(" Fizz");
	}
	else if(i%5==0)
	{
		document.write(" Buzz");
	}
	else if(i%3==0 && i%5==0)
	{
		document.write(" FizzBuzz");
	}
	else
	{
		document.write(i);
	}
}
