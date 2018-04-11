from flask import request, url_for
from flask_api import FlaskAPI, status, exceptions

from tweetRequester import getTweetRatio
from locationUtils import getLocation
from inputGenerated import queryParameters

app = FlaskAPI(__name__)

@app.route("/tweetsRatio", methods=['GET'])
def getTweetsRatio():
    #userId = request.args.get('userId')

    #if tweets is empty:
    #   return {}, status.HTTP_204_NO_CONTENT
    location_coordinates = getLocation(queryParameters.location)
    tweets_ratio = getTweetRatio(queryParameters.hashtags, location_coordinates)

    return tweets_ratio, status.HTTP_200_CREATED

if __name__ == "__main__":
    app.run(debug=True)