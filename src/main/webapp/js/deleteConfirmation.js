/**
 * 
 */
var form = document.getElementById("deleteForm");
form.addEventListener("submit", (event) => {
	event.preventDefault();
	Swal.fire({
		title: 'Are you sure?',
		text: "You won't be able to revert this!",
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#FF4200',
		cancelButtonColor: '#d33',
		confirmButtonText: 'Yes, delete it!'
	}).then((result) => {
		if (result.isConfirmed) {
			Swal.fire(
				'Deleted!',
				'Your Account has been deleted.',
				'success'
			)
			form.submit();
		}
	})
}); 
