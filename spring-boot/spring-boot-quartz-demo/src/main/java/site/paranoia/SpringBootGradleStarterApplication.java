package site.paranoia;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author paranoia
 */
@EnableWebMvc
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("site.paranoia.mapper")
public class SpringBootGradleStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGradleStarterApplication.class, args);
    }

}
