#!/bin/bash

# connect to mysql as root user of mysql and execute sql script
mysql -u root -p < database/data_initial.sql
