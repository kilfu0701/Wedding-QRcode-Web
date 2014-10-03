#!/bin/sh
DIRS="/Users/fu/Desktop/github/Wedding-QRcode-Web/web/cron"
LOG_FILE="/Users/fu/Desktop/github/Wedding-QRcode-Web/web/cron/log"
cd $DIRS

python crawler.py local > $LOG_FILE

