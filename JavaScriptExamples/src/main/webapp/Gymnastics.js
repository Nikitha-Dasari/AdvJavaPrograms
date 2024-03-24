function score(d1,d2,d3,k1,k2,k3)
{
	let scoreDolphins=(d1+d2+d3)/3;
	let scoreKoolas=(k1+k2+k3)/3;
	var status;
	if(scoreDolphins>scoreKoolas && scoreDolphins>=100)
	{
		status="Dolphins win the trophy";
	}
	else if(scoreDolphins<scoreKoolas && scoreKoolas>=100)
	{
		status="Koolas win the trophy";
	}
	else if(scoreDolphins===scoreKoolas &&scoreDolphins>=100&&scoreKoolas>=100)
	{
		status="Both win the trophy";
	}
	else{
		status="Neither of them win the trophy as their avg is less than 100";
	}
	document.write(status);
}
score(96,108,89,88,93,110);