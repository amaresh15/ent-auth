@echo git checkout dev
REM git checkout dev
@echo git pull
REM git pull
@echo mvn clean package spring-boot:repackage
call mvn clean package spring-boot:repackage -Dmaven.test.skip=true
@pause