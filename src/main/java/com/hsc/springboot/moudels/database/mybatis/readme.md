# application配置
    ##端口号
    server.port=8888
    ##检查 mybatis 配置是否存在，一般命名为 mybatis-config.xml
    mybatis.check-config-location =true
    ##配置文件位置
    mybatis.config-location=classpath:mybatis/mybatis-config.xml
    ## mapper xml 文件地址
    mybatis.mapper-locations=classpath*:mapper/*Mapper.xml
    ##日志级别
    logging.level.com.yang.dao=debug
    
    ##数据库url
    spring.datasource.url=jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false
    ##数据库用户名
    spring.datasource.username=root
    ##数据库密码
    spring.datasource.password=root
    ##数据库驱动
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver
    
 # pom配置
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>1.3.1</version>
    </dependency>