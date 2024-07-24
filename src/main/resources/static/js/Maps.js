const cundinamarcaMap = document.querySelector('.cundinamarca-defMap');
const boyacaMap = document.querySelector('.boyaca-defMap');

const cundinamarcaButton = document.getElementById('cundinamarca');
const boyacaButton = document.getElementById('boyaca');


function showCundinamarcaMap() {
    cundinamarcaMap.style.display = 'block';
    boyacaMap.style.display = 'none'; 
}

function showBoyacaMap() {
    cundinamarcaMap.style.display = 'none'; 
    boyacaMap.style.display = 'block';
}

cundinamarcaButton.addEventListener('click', showCundinamarcaMap);
boyacaButton.addEventListener('click', showBoyacaMap);
