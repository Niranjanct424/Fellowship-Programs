#! /usr/bin/bash

echo enter the number
read  -a array
length=${#array[@]}
for(( i=0;i<length;i++ ))
do
for(( j=i+1;j<length;j++ ))
do
for(( k=j+1; k<length;k++ ))
do
 if(( ${array[i]}+${array[j]}+${array[k]} == 0 ))
then 
echo sum of 3 nums is zero
else 
echo sum of 3 nums is equal to zero
fi


done
done
done