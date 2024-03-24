function stringReversal()
{
	const stringInput=document.getElementById("stringInput").value;
	let reverseString="";
	let i;
	for(i=stringInput.length-1;i>=0;i--)
	{
		reverseString=reverseString+stringInput[i];
	}
	document.getElementById("reverseInput").value=reverseString;
}