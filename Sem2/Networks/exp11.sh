#!/bin/bash

select i in add sub mul quit
do
	case $i in 
		"add") echo $(($1+$2));;
		"sub") echo $(($1-$2));;
		"quit") break;;
		*) echo "invalid option"
	esac
done	

