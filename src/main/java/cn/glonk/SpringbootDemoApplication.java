package cn.glonk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author yang
 * @Date 2022/4/9 20:36
 * @Version 1.0
 */

@Slf4j
@EnableSwagger2
@SpringBootApplication
public class SpringbootDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootDemoApplication.class);
    }

    public static void main(String[] args) {
        log.info("********启动前**************" + System.currentTimeMillis() + "ms");
        SpringApplication.run(SpringbootDemoApplication.class, args);
        log.info("********启动后**************" + System.currentTimeMillis() + "ms");
    }
}
