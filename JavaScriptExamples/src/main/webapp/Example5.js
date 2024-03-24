
function convertToRupee()
{
	const dollarInput=document.getElementById("dollarInput").value;
	const rupee=parseFloat(dollarInput)*82.9;
	document.getElementById("rupeeInput").value=rupee.toFixed(2);
}
