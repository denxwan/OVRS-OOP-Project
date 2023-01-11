// Initialize Variables
var closePopup = document.getElementById("popupclose");
var overlay = document.getElementById("overlay-123");
var popup = document.getElementById("popup-123");


function buttonActiveSD() {
    document.getElementById("sd").className = "basic-btn active";
    document.getElementById("pd").className = "basic-btn";
    document.getElementById("ap").className = "basic-btn";
    document.getElementById("wd").className = "basic-btn";
    // overlay.style.display = block;
}

function buttonActivePD() {
    document.getElementById("sd").className = "basic-btn";
    document.getElementById("pd").className = "basic-btn active";
    document.getElementById("ap").className = "basic-btn";
    document.getElementById("wd").className = "basic-btn";
}

function buttonActiveAP() {
    document.getElementById("sd").className = "basic-btn";
    document.getElementById("pd").className = "basic-btn";
    document.getElementById("ap").className = "basic-btn active";
    document.getElementById("wd").className = "basic-btn";
}

function buttonActiveWD() {
    document.getElementById("sd").className = "basic-btn";
    document.getElementById("pd").className = "basic-btn";
    document.getElementById("ap").className = "basic-btn";
    document.getElementById("wd").className = "basic-btn active";
}





// Close Popup Event
// closePopup.onclick = function() {
//     overlay.style.display = 'none';
//     popup.style.display = 'none';
// }

function bookPopup() {
    overlay.style.display = 'block';
    popup.style.display = 'block';
}