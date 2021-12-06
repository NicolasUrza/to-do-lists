var btnOpenPopUp = document.getElementById('add-list'),
	overlay = document.getElementById('overlay'),
	popup = document.getElementById('popup'),
	btnClosePopUp = document.getElementById('btn-close-popup'),
	btnSubmit= document.getElementById('btn-submit-list');

btnOpenPopUp.addEventListener('click', function(){
	overlay.classList.add('active');
	popup.classList.add('active');
});

btnClosePopUp.addEventListener('click', function(e){
	e.preventDefault();
	overlay.classList.remove('active');
	popup.classList.remove('active');
});

btnSubmit.addEventListener('click', function(e){
	e.preventDefault();
	overlay.classList.remove('active');
	popup.classList.remove('active');
});