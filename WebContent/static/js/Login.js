function validate()	{
	var username = document.getElementById("username");
	var password = document.getElementById("password");
	console.log("Working")
	var flag=0;
	if(username.value == "")	{
		username.focus();
		document.getElementById("sUsername").innerHTML = "Required";
		flag=1;
	}
	if(password.value == "")	{
		password.focus();
		document.getElementById("sPassword").innerHTML = "Required";
		flag=1;
	}
	if(flag==1)
		return false;
}