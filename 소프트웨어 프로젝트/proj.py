from cgi import parse_qs
import json

def application(environ, start_response):

    try:
        request_body_size = int(environ.get('CONTENT_LENGTH', 0))
    except ValueError:
        request_body_size = 0

    request_body = environ['wsgi.input'].read(request_body_size)
    d = parse_qs(request_body)

    sentence = d.get('sentence', [''])[0]
    string = d.get('string', [''])[0]
    
    sentence  = sentence.upper()
    string = string.upper()

    length = len(sentence)
    count = sentence.count(string)

    if len(string) >1:
        count = 0

    status = '200 OK'
    response_body = json.dumps({'length': length, 'count': count})

    response_headers = [
        ('Content-Type', 'application/json'),
        ('Content-Length', str(len(response_body)))
    ]

    start_response(status, response_headers)
    return [response_body]

