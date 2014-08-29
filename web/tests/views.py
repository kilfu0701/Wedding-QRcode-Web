import logging

from django.shortcuts import render

logger = logging.getLogger('wedding')

"""
python manage.py shell
>> from tests.views import test_logger
>> test_logger()
"""
def test_logger():
    logger.debug("this is a debug message!")

