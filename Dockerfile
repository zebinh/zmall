# 基础镜像
FROM openjdk:8

# 将Jenkins构建打包生成的jar包拷贝入镜像中
COPY ./mall-admin-0.0.1-SNAPSHOT.jar /usr/app/mall-admin-0.0.1-SNAPSHOT.jar
COPY ./mall-goods-provider-0.0.1-SNAPSHOT.jar /usr/app/mall-goods-provider-0.0.1-SNAPSHOT.jar

# 暴露接口
EXPOSE 9000 9100

# 更改工作目录
WORKDIR /usr/app/

# 启动springboot应用
CMD sh -c 'java -jar mall-goods-provider-0.0.1-SNAPSHOT.jar & java -jar mall-admin-0.0.1-SNAPSHOT.jar'
