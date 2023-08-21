#!/bin/bash

if [-d "/home/user/" ]; 
then
	cat /home/user| grep "^May"
else
	echo "File not found"
fi

