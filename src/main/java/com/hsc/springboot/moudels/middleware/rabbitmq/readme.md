# linux安装rabbitmq

# springboot整合rabbitmq

## 配置pom
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-amqp</artifactId>
    </dependency>
## 演示流程
- 新建一个消息发送者Sender，使用AmqpTemplate将消息发送到消息队列message中去。
    ````
    Sender.java
    @Autowired
    private AmqpTemplate amqpTemplate;
    public String send(){
           String context = "简单消息发送";
           logger.info("简单消息发送时间："+new Date());
           amqpTemplate.convertAndSend("message", context);
           return "发送成功";
    }
    
    Receiver.java
    @RabbitHandler
        public void process(String Str) {
            logger.info("接收消息："+Str);
            logger.info("接收消息时间："+new Date());
    }
   