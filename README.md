# idm twitter query project

## Description

## Setup the python server
In `/RestServer` do the following command :
```
pip install flask flask_api flask_cors
```

To access the Twitter API, you need to install Python-twitter and Requests

    pip install python-twitter
    
    pip install requests

Add your twitter credentials on the python file tweetRequester, line 62
```
# Fake credentials
api = twitter.Api(consumer_key="3hBKSSsJLFSD5ARJfqc9oD0hM",
		          consumer_secret="NfSSZg5kDZL6y1V5MzA5SDMG71rtlWYqWOaE9h20uyNXnEnx4u",
		          access_token_key="393464607-Ckr8UKHNGxXIurAQS8P4DiXAV8J7OBj3ocjWbDL9",
		          access_token_secret="WKB4LVRMZSnpsdQ12kinscXD2zYeOX22XGK6UGt1ulNK4")

```
And then run the flask server : `python3 RestServer/server.py`


## Setup and use the DSL

Import the projects from `/dsl` on your eclipse workspace

Right click on `dsl/org.xtext.geotweet.gtdsl/src/org/xtext/geotweet/gtdsl/GTDsl.xtext` and select run > Generate Mwe2 workflow.
Then right click on the `org.xtext.geotweet.gtdsl` top folder and run as > Eclipse Application.

Create a new Java project, and change the folder location to `{Git project root}/RestServer`.
Create a new file with the extension `.gtdsl` on the src folder and select `yes` when prompted to convert to xtext.

try the hello world below :

```tags presidents [ #trump:green, #hillary:red ]

countries northAmerica [ USA, France ]

map USElection displays presidents in northAmerica
```

## Using the API

Open `/front/index.html` on your browser to display the map. It will update automatically every 11 seconds