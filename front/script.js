google.charts.load('current', {
  'packages':['geochart'],
  'mapsApiKey': '	AIzaSyC0l6grkS_DX5RAY17ljAaE_-Gj76I1qdk'
});
google.charts.setOnLoadCallback(drawRegionsMap);

function drawRegionsMap() {
  var data = google.visualization.arrayToDataTable([
    ['Country', 'Popularity'],
    ['Germany', 0],
    ['United States', 0.3],
    ['Brazil', 0.4],
    ['Canada', 0.5],
    ['France', 0.6],
    ['RU', 0.9]
  ]);

  var options = {
    colorAxis: {minValue: 0, maxValue: 1, colors: ['#00B231' , 'white' , '#FF0003']},
    backgroundColor: '#81d4fa',
    datalessRegionColor: '#D9D9D9'
  };

  var chart = new google.visualization.GeoChart(document.getElementById('regions_div'));

  chart.draw(data, options);
}