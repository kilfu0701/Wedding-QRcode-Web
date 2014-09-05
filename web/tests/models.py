from django.db import models

class CI_Session(models.Model):
    session_id = models.AutoField(primary_key=True)
    ip_address = models.CharField(max_length=45, null=False, blank=False)
    user_agent = models.CharField(max_length=120, null=False, blank=False)
    last_activity = models.IntegerField(default=0)
    prev_activity = models.IntegerField(default=0)
    user_data = models.TextField()
   
    class Meta:
        db_table = 'ci_sessions'

