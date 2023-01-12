/**
 * 
 */
  var isPasswordSecure = (password) => {
    const re = new RegExp("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})");
    return re.test(password);
};
 var isEmailValid = (email) => {
    const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
};
 
 const registrationForm = document.getElementById("register-form");
 registrationForm.addEventListener("submit", (event) => {
	event.preventDefault();
	if(document.getElementById("name").value == "") {
		Swal.fire({
			title: '',
			text: 'The Name field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(document.getElementById("email").value == "") {
		Swal.fire({
			title: '',
			text: 'The Email field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(document.getElementById("NIC").value == "") {
		Swal.fire({
			title: '',
			text: 'The NIC field cannot be empty',
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
	else if(document.getElementById("re-password").value == "") {
		Swal.fire({
			title: '',
			text: 'The Confirm Password field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(document.getElementById("telephone").value == "") {
		Swal.fire({
			title: '',
			text: 'The Telephone field cannot be empty',
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
	else if(document.getElementById("password").value != document.getElementById("re-password").value) {
		Swal.fire({
			title: 'Oops',
			text: 'The Password and Confirm Password do not match',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(document.getElementById("telephone").value.length > 10 || isNaN(document.getElementById("telephone").value)) {
		Swal.fire({
			title: 'The telephone format invalid',
			text: 'The number should be 10 or less numbers without any letters and special characters',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if(document.getElementById("NIC").value.length > 12 ) {
		Swal.fire({
			title: 'The NIC format invalid',
			text: 'The NIC length should be 12 characters or less',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else {
		registrationForm.submit();
	}
});