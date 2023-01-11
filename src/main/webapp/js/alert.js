/**
 * 
 */

 
window.onload = function Alert() {
	var status = document.getElementById("status").value;
	if (status == "emptyName") {
		Swal.fire({
			title: '',
			text: 'The Name field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "emptyEmail") {
		Swal.fire({
			title: '',
			text: 'The Email field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "emptyNIC") {
		Swal.fire({
			title: '',
			text: 'The NIC field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "emptyPassword") {
		Swal.fire({
			title: '',
			text: 'The Password field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "PassLen") {
		Swal.fire({
			title: '',
			text: 'The Password should be more than 8 charcters',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "emptyTelephone") {
		Swal.fire({
			title: '',
			text: 'The telephone field cannot be empty',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "successUpdate") {
		Swal.fire({
			title: '',
			text: 'Update Successfull',
			icon: 'success',
			showConfirmButton: false,
			timer: 1200
		})
	}
	else if (status == "failedUpdate") {
		Swal.fire({
			title: '',
			text: 'There was a problem updating the account',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "invalidUnPw") {
		Swal.fire({
			title: '',
			text: 'The password and username does not match',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "noNumber") {
		Swal.fire({
			title: '',
			text: 'The password must contain at least 1 number',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "noLetter") {
		Swal.fire({
			title: '',
			text: 'The password must contain at least 1 letter',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "noSpecial") {
		Swal.fire({
			title: '',
			text: 'The password must contain at least 1 Special Character',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "invalidTelephone") {
		Swal.fire({
			title: '',
			text: 'The number should be 10 or less numbers without any letters and special characters',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "invalidNIC") {
		Swal.fire({
			title: '',
			text: 'The NIC should be 12 or less Characters',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "PassUnequal") {
		Swal.fire({
			title: '',
			text: 'The password and the confirm password is different',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "userExist") {
		Swal.fire({
			title: '',
			text: 'This user is already registered... Please login',
			icon: 'warning',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "successLogin") {
		Swal.fire({
			title: '',
			text: 'Login Successfull',
			icon: 'success',
			showConfirmButton: false,
			timer: 1200
		})
	}
	else if (status == "successRegister") {
		Swal.fire({
			title: '',
			text: 'Registration successfull. Please login',
			icon: 'success',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "failedRegister") {
		Swal.fire({
			title: 'Something went wrong',
			text: 'Registration Failed. Please try again',
			icon: 'error',
			confirmButtonText: 'Ok'
		})
	}
	else if (status == "failedDelete") {
		Swal.fire({
			title: 'Something went wrong',
			text: 'Delete Failed. Please try again',
			icon: 'success',
			confirmButtonText: 'Ok'
		})
	}
}










