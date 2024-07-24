document.addEventListener("DOMContentLoaded", function() {
    const cardSlider = document.querySelector(".card-slider");
    const cardGroup = document.querySelector(".card-group");
    const cards = document.querySelectorAll(".card");
    const cardWidth = cards[0].offsetWidth + 20; // Ancho de la tarjeta más el margen derecho

    let currentPosition = 0;

    // Función para desplazar las tarjetas hacia la izquierda
    function slideLeft() {
        currentPosition -= cardWidth;
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        cardSlider.style.transform = `translateX(-${currentPosition}px)`;
    }

    // Función para desplazar las tarjetas hacia la derecha
    function slideRight() {
        currentPosition += cardWidth;
        const maxPosition = cardSlider.scrollWidth - cardGroup.offsetWidth;
        if (currentPosition > maxPosition) {
            currentPosition = maxPosition;
        }
        cardSlider.style.transform = `translateX(-${currentPosition}px)`;
    }

    // Event listener para la flecha izquierda
    cardGroup.querySelector(":first-child").addEventListener("click", slideLeft);

    // Event listener para la flecha derecha
    cardGroup.querySelector(":last-child").addEventListener("click", slideRight);
});