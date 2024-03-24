function fruitProcessor(a,b)
{
	let juice= "Juice preparing with "+a+" apples & "+b+" oranges";
	return juice;
}
let res=fruitProcessor(8,6);
document.write(res);

/*function cutFruitPieces(fruit)
{
	return 4;
}
function fruitProcessor(apples,oranges)
{
	let apple=apples*cutFruitPieces();
	let orange=oranges*cutFruitPieces();
	let juice=`Juice preparing with ${apple} applePieces and ${orange} orangePieces`;
	return juice;
}
let res;
res=fruitProcessor(8,6);
document.write(res);*/