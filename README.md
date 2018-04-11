# idm twitter query project

## Description

## Setup
In `/RestServer` do the following command :
```
pip install flask flask_api
```

## Valid DSL query
tags presidents [ #trump:green, #hillary:green ]
tags hockeyTeams [ #sharks:blue, #otter:red ]

countries northAmerica [ country USA, country test ]

map USElection displays presidents in northAmerica
map hockeyTrend displays hockeyTeams in northAmerica
