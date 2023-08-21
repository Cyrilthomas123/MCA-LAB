#!/bin/bash
i=10
j=20

if [[ $i -gt $j ]]
then
	echo "$i is greater than $j"

elif [[ $i -lt $j ]]
then
	echo "$i is less than $j"

else
	echo "$i is equal to $j"

fi

