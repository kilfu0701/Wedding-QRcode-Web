# -*- coding: utf-8 -*-
from django.db import models
from my_util import secure

class People(models.Model):
    id = models.AutoField(primary_key=True)
    fullname = models.CharField(max_length=32)              # 姓名
    #groups_id
    attend_number = models.IntegerField(default=1)          # 預計參加人數
    froms = models.IntegerField(default=0)                  # 男方, 女方...

    qrcode_sha256 = models.CharField(max_length=64, blank=False, null=False)
    create_at = models.DateField(null=False, blank=False)
    update_at = models.DateTimeField(auto_now_add=True)

    groups = models.ForeignKey('Groups')

    class Meta:
        db_table = 'people'

    ## override
    def save(self, *args, **kwargs):
        if not self.pk:
            if not self.qrcode_sha256:
                self.qrcode_sha256 = secure.generate_sha256()

        super(People, self).save(*args, **kwargs)

    @staticmethod
    def get_froms_list():
        return {
            '0': u'-',
            '1': u'男方',
            '2': u'女方',
            '3': u'同學',
            '4': u'其他',
        }



class Groups(models.Model):
    id = models.AutoField(primary_key=True)
    name = models.CharField(max_length=32)
    create_at = models.DateField(null=False, blank=False)
    update_at = models.DateTimeField(auto_now_add=True)


    class Meta:
        db_table = 'groups'


class AttendHistory(models.Model):
    id = models.AutoField(primary_key=True)
    #people_id
    create_at = models.DateField(null=False, blank=False)   # 報到時間
    update_at = models.DateTimeField(auto_now_add=True)

    people = models.ForeignKey('People')

    class Meta:
        db_table = 'attend_history'







