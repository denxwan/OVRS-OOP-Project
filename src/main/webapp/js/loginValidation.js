/**
 * 
 */

const isPasswordSecure = (password) => {
    const re = new RegExp("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})");
    return re.test(password);
};
 const isEmailValid = (email) => {
    const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
};
 
 const loginForm = document.getElementById("login-form");
 loginForm.addEventListener("submit", (event) => {
	event.preventDefault();
	if(document.getElementById("email").value == "") {
		Swal.fire({
			title: '',
			text: 'The Email field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(document.getElementById("password").value == "") {
		Swal.fire({
			title: '',
			text: 'The Password field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(!isEmailValid(document.getElementById("email").value)) {
		Swal.fire({
			title: 'The Email format is invalid',
			text: 'Example : example@gmail.com',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(!isPasswordSecure(document.getElementById("password").value)) {
		Swal.fire({
			title: 'The password format invalid',
			text: 'The Password length should be at least 8 Characters, Alphanumeric containing at least one sepcial character',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else {
		loginForm.submit();
	}
});