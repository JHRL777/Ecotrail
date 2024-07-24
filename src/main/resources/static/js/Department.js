document.addEventListener('DOMContentLoaded', function () {
    const buttons = document.querySelectorAll('.button_department');
  
    buttons.forEach(button => {
      button.addEventListener('click', function () {
        buttons.forEach(btn => btn.classList.remove('selected'));
        this.classList.add('selected');
      });
    });
  });