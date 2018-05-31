from flask import request, url_for
from flask_api import FlaskAPI, status, exceptions
from flask_cors import CORS

from tweetRequester import getHashtagFromLists
from config import hashtags, country_list

app = FlaskAPI(__name__)
CORS(app)

@app.route("/tweetsRatio", methods=['GET'])
def getTweetsRatio():

    #if tweet list is empty:
    #   return {}, status.HTTP_204_NO_CONTENT

    tagWithoutColor = list(map(lambda tag: tag.get('name'), hashtags))
    print(tagWithoutColor)
    #tweets_ratio = getHashtagFromLists(['#LoveTwitter', '#LoveWhereYouLive'], ["France", "United States"])
    tweets_ratio = getHashtagFromLists(tagWithoutColor, country_list)

    ratios = list(map(lambda country: [country, tweets_ratio[(tagWithoutColor[0], tagWithoutColor[1])][country]], country_list))

    return {'hashtags': hashtags,'ratios':ratios}, status.HTTP_200_OK

if __name__ == "__main__":
    app.run(debug=True)