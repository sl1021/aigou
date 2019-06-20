package cn.itsource.aigou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplicaiton7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplicaiton7001.class);
    }
}
