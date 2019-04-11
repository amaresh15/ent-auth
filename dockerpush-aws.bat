
call aws ecr get-login --no-include-email --region us-east-1 --registry-ids 015455881066>>x.txt
for /f "delims=" %%x in (x.txt) do set dockerlogin=%%x  
%dockerlogin%

docker build -t authservice/authservice .

docker tag authservice/authservice:latest 015455881066.dkr.ecr.us-east-1.amazonaws.com/amirepo/authservice:latest

docker push 015455881066.dkr.ecr.us-east-1.amazonaws.com/amirepo/authservice:latest

REM del x.txt

pause ..
