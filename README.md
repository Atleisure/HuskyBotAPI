# HuskyBotAPI
该插件使用[qqpd-bot-java](https://github.com/Kloping/qqpd-bot-java)封装
### 命令帮助
- /hbapi help 查看帮助
- /hbapi run 启动机器人
- /hbapi close 关闭机器人(关闭后不能再次启动)
- /hbapi reload 重载配置
### 注意事项
使用该插件配套的插件时应先启动其附属插件，再启动本插件  
基于本插件的开发可以看官方sdk，本插件内部只提供了极少的方法  
关于静态问答，建议使用Data中的Map去  
此外，建议一个插件只注册一次事件