echo 'Installing ForecastTrigger' 
cd '/home/ec2-user/ForecastTrigger/StormCheck'
mvn -e clean install >> /var/log/ForecastTrigger.log
#cp target/*.war /usr/share/tomcat7/webapps/ >> /var/log/tomcat.log
#cd  /usr/share/tomcat7/bin
docker build -t abhishekmehra/forecastTrigger .
docker run -p 8080:8080 --name StormCheck abhishekmehra/forecastTrigger >> /var/log/forecastTriggerDocker.log 2>&1 &
#sh ./start.sh >> /var/log/tomcat.log 2>&1 &
