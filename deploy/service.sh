#!/bin/bash
# 微服务启动脚本
SCRIPT_NAME=$0                                  # 脚本绝对路径
START_STOP=$1                                   # 命令行第一个参数

# 主体目录
ROOT_DIR="$(cd "$(dirname "$0")" && pwd -P)"
echo "当前路径为: ${ROOT_DIR}"

# 所需运行的jar包
DemoJAR="$(ls -R |grep 'demo-0.0.1-SNAPSHOT.jar')"
echo "命令绑定的jar包为:  ${DemoJAR}"

usage(){
    echo
    echo "使用方法: ${SCRIPT_NAME} start|stop|restart|status"
    echo
    exit 1
}

# 判断命令行参数是否为空,如果为空，调用帮助提示函数
if [[ ${START_STOP} == "" ]]; then
    usage
fi

# 启动
start(){
nohup java -jar ${DemoJAR} >logs/log 2>&1 & 
echo "${DemoJAR} 已启动..."

}

# 重启
restart(){

stop
start

}

# 停止
stop(){

PID=$(ps -ef | grep ${DemoJAR} | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
    echo Application is already stopped
else
    echo kill $PID
    kill $PID
	echo "${DemoJAR} 已停止..."
fi

}

# 状态
status(){

PID=$(ps -ef | grep ${DemoJAR} | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
    echo ${DemoJAR} is already stopped
else
    echo ${DemoJAR} is running
fi

}

# 判断命令行第二个参数
case ${START_STOP} in
    start   )
        start
        ;;
    stop    )
        stop
        ;;
    restart )
        restart
        ;;
    status  )
        status
        ;;
    *       )
        usage
        ;;
esac
