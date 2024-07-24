const slideLeftButton = document.getElementById('slide-left-button');
const slideRightButton = document.getElementById('slide-right-button');
const optionContainers = document.querySelectorAll('.option-container');
const totalOptions = optionContainers.length;
const optionsToShow = 3;
let currentIndex = 0;

function showOptions() {
    optionContainers.forEach((container, index) => {
        if (index >= currentIndex && index < currentIndex + optionsToShow) {
            container.style.display = 'flex';
        } else {
            container.style.display = 'none';
        }
    });
}

showOptions();

slideLeftButton.addEventListener('click', () => {
    currentIndex -= optionsToShow;
    if (currentIndex < 0) {
        currentIndex = totalOptions - optionsToShow; 
    }
    showOptions();
});


slideRightButton.addEventListener('click', () => {
    currentIndex += optionsToShow;
    if (currentIndex >= totalOptions) {
        currentIndex = 0; 
    }
    showOptions();
});
