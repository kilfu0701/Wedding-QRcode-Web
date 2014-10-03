# -*- coding: utf-8 -*-
import os
import sys

def path_setting():
    dir_name = os.path.dirname(os.path.abspath(__file__))
    sys.path.append(dir_name + '/../')


def load_setting(env='local'):
    if env == 'local':
        from web import settings as my_setting
        os.environ.setdefault("DJANGO_SETTINGS_MODULE", "web.settings")
    elif env == 'dev':
        from web import settings_dev as my_setting
        os.environ.setdefault("DJANGO_SETTINGS_MODULE", "web.settings_dev")
    elif env == 'production':
        from web import settings_production as my_setting
        os.environ.setdefault("DJANGO_SETTINGS_MODULE", "web.settings_production")
    else:
        print 'env param invalid in load_setting()'
        print 'End of script.'
        exit()

    return my_setting


def gen_base_auth(user=None, password=None):
    import base64
    if user is None and password is None:
        base64string = base64.encodestring('%s:%s' % ('kilfu', 'ATNT4869')).replace('\n', '')
    else:
        base64string = base64.encodestring('%s:%s' % (user, password)).replace('\n', '')

    return base64string
