function removeRole(){
	sessionStorage.removeItem("Role");
}

function setRole(){
	var user = document.getElementById("inputUser").value;
	sessionStorage.setItem("Role",user);
}