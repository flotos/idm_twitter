import pip

try:
    import requests
except:
    pip.main(['install', 'requests'])

try:
    import flask
except:
    pip.main(['install', 'flask'])

try:
    import flask_api
except:
    pip.main(['install', 'flask_api'])