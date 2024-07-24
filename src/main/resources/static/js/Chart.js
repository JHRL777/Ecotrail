const labels = ["2019", "2020", "2021", "2022", "2023"];
const data = {
  labels: labels,
  datasets: [
    {
      label: "Hectareas taladas",
      data: [12, 5, 7, 10, 3],
      backgroundColor: "rgba(44, 62, 80, 0.8)",
      borderColor: "rgb(172, 234, 197)",
      borderWidth: 1,
      borderRadius: 2,
    },
  ],
};

const config = {
  type: "bar",
  data: data,
  options: {
    scales: {
      y: {
        beginAtZero: true,
      },
    },
    plugins: {
      title: {
        display: true,
        text: "Hectáreas deforestadas por Año",
      },
      legend: {
        display: true,
        position: 'bottom',
      }
    },
    responsive: true,
    maintainAspectRatio: false,
  },
};

const myChart = new Chart(document.getElementById("myChart"), config);
