let myData={
	"rollno":1234,
	"firstname":"Dasari",
	"lastname":"Nikitha",
	"middlename":null,
	"hobbies":["cricket","reading"],
	"marks":[99,98,98,99],
	"maritalstatus":false,
	"salary":55000.50,
	"location":{
		"city":"San-Fransico",
		"state":"CA"
	}
}
//Accessing Individual Properties
console.log("RollNo:",myData.rollno);
console.log("FirstName:",myData.firstname);
console.log("All Hobbies:",myData.hobbies);
console.log("Marital Status:",myData.maritalstatus);
console.log("Middle Name:",myData.middlename);
console.log("First hobby",myData.hobbies[0]);
console.log("Second Marks",myData.marks[1]);
console.log("Location:",myData.location);
console.log("Location:",myData.location.city);