exp2.sh                                                                                             0000775 0001751 0001751 00000000157 14443024205 011016  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
i=12
if [[ $i -eq 12 ]] 
then 
	echo "number is equal to 12"

else
	echo "number is not equal"

fi
                                                                                                                                                                                                                                                                                                                                                                                                                 exp3.sh                                                                                             0000775 0001751 0001751 00000000250 14443025330 011011  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
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

                                                                                                                                                                                                                                                                                                                                                        exp4.sh                                                                                             0000664 0001751 0001751 00000000000 14443027655 011014  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   exp5.sh                                                                                             0000775 0001751 0001751 00000000047 14443030702 011016  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
a=12
b=1
echo $(( a + b ))
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         exp6.sh                                                                                             0000775 0001751 0001751 00000000063 14443032063 011017  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
i=$1
j=$2
((k=i+j))

echo "sum is :"$k
                                                                                                                                                                                                                                                                                                                                                                                                                                                                             exp7.sh                                                                                             0000775 0001751 0001751 00000000056 14443033266 011030  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
for java in *
do
	echo $java
done
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  hello.sh                                                                                            0000777 0001751 0001751 00000000115 14443026527 011250  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
echo "hello world"
i=0
while((i<10))
do
	echo $i
	((i+=1))
done

                                                                                                                                                                                                                                                                                                                                                                                                                                                   newfile.sh                                                                                          0000664 0001751 0001751 00000000055 14443026741 011572  0                                                                                                    ustar   user                            user                                                                                                                                                                                                                   #!/bin/bash
a=12
echo $a
echo "$a"
echo '$a'
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   