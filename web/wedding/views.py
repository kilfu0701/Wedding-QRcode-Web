import logging

from django.shortcuts import render
from django.template.loader import get_template
from django.template import Context
from django.http import HttpResponse
from django.core import serializers
from django.utils.timezone import utc
from django.views.decorators.csrf import csrf_exempt
from django.http import Http404
from django.http import HttpResponseNotFound
from django.http import HttpResponseForbidden
from django.conf import settings
from django.db.models import Count

from .models import *

logger = logging.getLogger(__name__)


def index(request):
    output = 'wedding/index'
    t = get_template('wedding/index.html')
    html = t.render(Context({'content': output}))

    return HttpResponse(html)

