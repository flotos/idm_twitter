import requests
import json


with open("countries-EN.json", encoding="utf-8") as fileCountriesName :

    countriesName = json.load(fileCountriesName)


dataCountries = {}
dataGeoTweet = {}

nbrCountries = len(countriesName)
compteur = 0
for country in sorted(countriesName) :
    compteur += 1
    print("Loading... " + str(compteur) + "/" + str(nbrCountries), end="\r")
    #req = requests.get('https://maps.googleapis.com/maps/api/geocode/json?address={}&key=AIzaSyArxP8u4h_2xYFboUKJ__rzeaGeLD0P7OY'.format(countriesName[country]))
    req = requests.get('https://maps.googleapis.com/maps/api/geocode/json?address={}&key=AIzaSyAsYwGZ5NMrHZmPe_bigtq79CAzQ1fL2_0'.format(countriesName[country]))
    dataCountries[country] = json.loads(req.text)
    dataGeoTweet[countriesName[country.replace("’","")]] = {}

    # Récupération de la latitude et la longitude du centre du pays : results => 0 =>geometry => location => lat et lng

    for nomCoordonnee, coordonnee in dataCountries[country]['results'][0]['geometry']['location'].items():
        dataGeoTweet[countriesName[country.replace("’","")]][nomCoordonnee] = coordonnee
        with open('dataGeoTweet.json', 'w', encoding="utf-8")as file:
            json.dump(dataGeoTweet, file, indent=4)

