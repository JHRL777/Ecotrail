document.addEventListener('DOMContentLoaded', function () {
    const navToggle = document.getElementById('nav-toggle');
    const main = document.querySelector('main');
    const slideContainer = document.querySelector('.slide-container');

    navToggle.addEventListener('change', function () {
        if (this.checked) {
            main.style.marginLeft = 'calc(var(--navbar-width-min) + 2vw)';
            slideContainer.style.marginLeft = 'calc(var(--navbar-width-min) + 2vw)';
        } else {
            main.style.marginLeft = 'calc(var(--navbar-width) + 2vw)';
            slideContainer.style.marginLeft = 'calc(var(--navbar-width) + 2vw)';
        }
    });
});

var departmentOptionCundinamarca = document.querySelector('#department-dropdown .nav-button-department:nth-of-type(1)');
var departmentOptionBoyaca = document.querySelector('#department-dropdown .nav-button-department:nth-of-type(2)');

var departmentOptionsContainer = document.getElementById('department-dropdown');
var navContentHighlight = document.getElementById('nav-content-highlight');

function hideHighlight() {
  navContentHighlight.style.display = 'none';
}

departmentOptionCundinamarca.addEventListener('mouseover', function() {
  navContentHighlight.style.top = 'calc((5 - 1) * 54px + 16px)';
});

departmentOptionBoyaca.addEventListener('mouseover', function() {
  navContentHighlight.style.top = 'calc((6 - 1) * 54px + 16px)';
});






