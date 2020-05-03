#! /bin/bash

read -p "Enter the name of the file :" file_name 
if [ -e $file_name ]
then
echo "$file_name is exist "
else
echo "file is not found"
fi
