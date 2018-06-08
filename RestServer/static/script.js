const FETCH_DELAY = 11000; // Twitter limit is every 5 seconds, and we need two request
const FETCH_URL = 'http://localhost:5000/tweetsRatio';
const FETCH_OPTIONS = { header: {'Access-Control-Allow-Origin':'*'}};

const fetchData = () => {
  fetch(FETCH_URL, FETCH_OPTIONS)
    .then(function(response) {
      return response.json();
    })
    .then(function(myJson) {
      drawRegionsMap(myJson);
    });
};

const ApiIntervalFetcher = () => {
  fetchData();
  setInterval(fetchData, FETCH_DELAY);
};

const drawRegionsMap = (tagsData) => {

  const tagsListDisplay = document.getElementById('hashtags');
  tagsListDisplay.textContent = `Countries near 0 have the hashtag #${tagsData.hashtags[0].name} more famous while it is #${tagsData.hashtags[1].name} in the countries near 1`; // dont use innerHtml for security reason

  const data = google.visualization.arrayToDataTable([
    ['Country', 'Popularity'],
    ...tagsData.ratios
    ]
  );

  const tagsColors = tagsData.hashtags.map(tag => tag.color);
  const options = {
    colorAxis: {minValue: 0, maxValue: 1, colors: [tagsColors[0] , 'white' , tagsColors[1]]},
    backgroundColor: '#81d4fa',
    datalessRegionColor: '#b3b3b3'
  };

  const chart = new google.visualization.GeoChart(document.getElementById('regions_div'));
  chart.draw(data, options);
};

google.charts.load('current', {
  'packages':['geochart'],
  'mapsApiKey': '	AIzaSyC0l6grkS_DX5RAY17ljAaE_-Gj76I1qdk'
});
google.charts.setOnLoadCallback(ApiIntervalFetcher);
