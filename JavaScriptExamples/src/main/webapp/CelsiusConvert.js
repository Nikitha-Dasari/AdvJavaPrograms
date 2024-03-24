function convertToCelsius()
{
	const farenheitTemp=document.getElementById("farenheitTemp").value;
	const celsiusTemp=(parseFloat(farenheitTemp)-32)*5/9;
	document.getElementById("Celsius").value=celsiusTemp.toFixed(2);
}