DATABASES = {
        'default': {
            'ENGINE': 'django.db.backends.sqlite3', # Add 'postgresql_psycopg2', 'mysql', 'sqlite3' or 'oracle'.
            'NAME': '_data/wedding_qrcode.db', # Or path to database file if using sqlite3.
            # The following settings are not used with sqlite3:
            'USER': 'yourname',
            'PASSWORD': 'yourPassword',
            'HOST': 'localhost', # Empty for localhost through domain sockets or '127.0.0.1' for localhost through TCP.
            'PORT': '', # Set to empty string for default.
            'TEST_CHARSET':'UTF8'
            }
        }

## generator in command line
#python -c 'import random; import string; print "".join([random.SystemRandom().choice(string.digits + string.letters + string.punctuation) for i in range(50)])'

SECRET_KEY = ""
