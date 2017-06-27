
#使用说明

##pom.xml
```
   	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<java.version>1.7</java.version>
		<jetty.version>9.2.17.v20160517</jetty.version>
		<swagger.version>2.2.2</swagger.version>
	</properties>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.4.1.RELEASE</version>
	</parent>
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
	<dependencies>
		<dependency>
			<groupId>cn.gcks</groupId>
			<artifactId>cn.gcks.web</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>${swagger.version}</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>${swagger.version}</version>
		</dependency>
	</dependencies>
```
##目录说明

xx.xx.xx.domain 数据相关：定义实体对象和访问接口
xx.xx.xx.service 服务层
xx.xx.xx.web web相关接口

##查询说明

http://localhost:8080/api/account?IN_nickname=string
[过滤方式]_[属性]=[过滤值]

###过滤方式

EQ 等于  http://localhost:8080/api/account?EQ_nickname=string 
NEQ 不等于
LIKE 模糊匹配
NLIKE 模糊匹配失败
GT 大于的
LT 小于
GTE 大于等于
LTE 小于等于
IN 在列表里   http://localhost:8080/api/account?IN_id=1&IN_id=2 
NIN 不在列表里


#swagger相关

##swagger访问地址
http://localhost:8080/swagger-ui.html

##swagger注释
```
    @Api：用在类上，说明该类的作用
    @ApiOperation：用在方法上，说明方法的作用
    @ApiImplicitParams：用在方法上包含一组参数说明
    @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面
        paramType：参数放在哪个地方
            header-->请求参数的获取：@RequestHeader
            query-->请求参数的获取：@RequestParam
            path（用于restful接口）-->请求参数的获取：@PathVariable
            body（不常用）
            form（不常用）
        name：参数名
        dataType：参数类型
        required：参数是否必须传
        value：参数的意思
        defaultValue：参数的默认值
    @ApiResponses：用于表示一组响应
    @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
        code：数字，例如400
        message：信息，例如"请求参数没填好"
        response：抛出异常的类
    @ApiModel：描述一个Model的信息（这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）
        @ApiModelProperty：描述一个model的属性
```
https://github.com/swagger-api/swagger-core/wiki/Annotations#apimodel
