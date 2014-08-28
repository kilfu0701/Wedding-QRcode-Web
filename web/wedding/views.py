import logging

from django.shortcuts import render

logger = logging.getLogger(__name__)




"""
python manage.py shell
>> from wedding.views import test_logger
>> test_logger()
"""
def test_logger():
    logger.debug("this is a debug message!")


