#!/bin/bash

add()
{
	i=$1
	j=$2
	((k=i+j))
	echo "sum is $k"
}
sub()
{
        i=$1
        j=$2
        ((k=i-j))
        echo "sum is $k"
}
mul()
{
        i=$1
        j=$2
        ((k=i*j))
        echo "sum is $k"
}

echo "1:add,2:sub,3:mul"
read i
case $i in 
	1) add $1 $2;;
	2) sub $1 $2;;
	3) mul $1 $2;;
esac
