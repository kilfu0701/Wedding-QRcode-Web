import gzip
from StringIO import StringIO

def ungzip(resp):
    if resp.info().get('Content-Encoding') == 'gzip':
        buf = StringIO(resp.read())
        f = gzip.GzipFile(fileobj=buf)
        data = f.read()

        return data

    else:
        return resp.read()

