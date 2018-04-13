import requests
import twitter
import json

# Return a set with nbr of favorite and nbr of retweets
def getNbLikes(request):
	favorite_count = 0
	retweet_count = 0
	# Iterating through tweets
	for tweet in request:
		#for key in tweet:
		#	print(key)
		if 'favorite_count' in tweet:
			favorite_count += tweet['favorite_count']
		if 'retweet_count' in tweet:
			retweet_count += tweet['retweet_count']
	return (favorite_count, retweet_count)

def getLatLngFromCountryName(country):
	latLng = set()
	with open('../Localisation/dataGeoTweet.json', encoding='utf-8') as file:
		dataGeoTweet = json.load(file)
	if country not in dataGeoTweet:
		raise ValueError("Le pays '{}' n'existe pas dans la base de données.".format(country))
	lat = dataGeoTweet[country]['lat']
	lng = dataGeoTweet[country]['lng']
	latLng = (lat, lng)
	return latLng


# Create a query with a set of values.
# if there is more than one value, the first value is a set with lat & lng or a country name
# If there is 3 values, the second is the radius of space to look for tweets ('500km')
# In every case, the last value is an hashtag
def getRequest(arg):
	request = ""
	if isinstance(arg, tuple):
		hashtag = arg[-1][1:] if arg[-1][0] == '#' else arg[-1]
		if len(arg) == 1: # Only the Hashtag
			request = "q=" + "%23" + hashtag
		elif len(arg) == 2: # A location and the Hashtag
			if isinstance(arg[0], tuple):
				request = "q=geocode%3A"+str(arg[0][0])+"%2C"+str(arg[0][1])+"%2C"+"%23"+hashtag
			else:
				latLng = getLatLngFromCountryName(arg[0])
				request = "q=geocode%3A"+str(latLng[0])+"%2C"+str(latLng[1])+"%2C"+arg[1]+"%2C"+"%23"+hashtag
		elif len(arg) == 3: # A location, radius and the Hashtag
			if isinstance(arg[0], tuple):
				request = "q=geocode%3A"+str(arg[0][0])+"%2C"+str(arg[0][1])+"%2C"+arg[1]+"%2C"+"%23"+hashtag
			else:
				latLng = getLatLngFromCountryName(arg[0])
				request = "q=geocode%3A"+str(latLng[0])+"%2C"+str(latLng[1])+"%2C"+arg[1]+"%2C"+"%23"+hashtag
		else:
			raise ValueError("Bad Argument: ", arg, "Use ('France', '50km', '#LoveTwitter') instead")
	else:
		raise ValueError("Bad Argument: ", arg, "Use ('France', '50km', '#LoveTwitter') instead")
	return request

#  Print the numbers of like and retweet on 15 tweets each for two hashtag in a certain location
def getTweets(arg1, arg2):
	api = twitter.Api(consumer_key="8L86JGKczb0FWo2LoaO6WYe19",
		          consumer_secret="cyZw4UZ552mN4OCcx6cwJpjmyNfmHuAL9qRzkwN3sV4koow8fX",
		          access_token_key="2923216455-wcFTIP7xSj8MGN5kVXsgQnmCj4gEeCDps9qok8T",
		          access_token_secret="T9RF8LeJOIHX2cjo4Y2y2i2le4KOff3t8y5UQ9gl9Gtp9")

	request1 = getRequest(arg1)
	request2 = getRequest(arg2)

	results1 = api.GetSearch(raw_query=request1)
	results2 = api.GetSearch(raw_query=request2)

	results1 = [x.AsDict() for x in results1]
	results2 = [x.AsDict() for x in results2]

	(favorite_count1, retweet_count1) = getNbLikes(results1)
	(favorite_count2, retweet_count2) = getNbLikes(results2)

	ponderation1 = 1 * favorite_count1 + 1 * retweet_count1
	ponderation2 = 1 * favorite_count2 + 1 * retweet_count2

	hashtag1 = arg1[-1] if arg1[-1][0] == '#' else '#' + arg1[-1]
	hashtag2 = arg2[-1] if arg2[-1][0] == '#' else '#' + arg2[-1]

	if ponderation1 > ponderation2:
		return hashtag1
	else:
		return hashtag2


