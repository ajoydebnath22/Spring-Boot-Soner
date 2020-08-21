PID=`ps -eaf | grep "java -jar spring-boot-soner.jar" | grep -v grep | awk '{print $2}'`
if [[ "" !=  "$PID" ]]; then
  echo "found $PID and killing it!!"
  kill -9 $PID
fi