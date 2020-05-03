#! /bin/bash
# echo "Please enter a number to check is a prime number" 
# read num
# ret=$(factor $num | grep $num | cut -d ":" -f 2 | cut -d " " -f 2)
# if [ "$ret" -eq "$num" ] 
# then 
# echo "$num is a prime number" 
# else
# echo "$ num is not a prime number"
# fi
#! /usr/bin/bash

#! /usr/bin/bash

# echo enter the number
# read  -a array
# length=${#array[@]}
# for(( i=0;i<length;i++ ))
# do
# for(( j=i+1;j<length;j++ ))
# do
# for(( k=j+1; k<length;k++ ))
# do
#  if(( ${array[i]}+${array[j]}+${array[k]} == 0 ))
# then 
# echo ${array[i]} ${array[j]} ${array[k]}
# echo "sum of 3 nums zero"
# fi
# done
# done
# done

  
#! /usr/bin/bash

echo Enter the money 
read stake
echo Enter the amount need to win
read goal
echo Enter the trails 
read trails
for(( i=0;i<trails;i++ ))
do
cash=$stake
while(( cash>0 && cash<goal ))
do
random=$((  $RANDOM%10 ))
if(( random>=5 ))
then
(( cash++ ))
else
(( cash-- ))
fi
done
if(( cash == goal ))
then
(( wins++ ))
else
(( fails++ ))
fi
done
echo "Number of wins : "$wins
echo -e "won percentage :\c"
echo " 100*$wins/$trails" | bc
echo -e "losses percentage :\c"
echo  $fails