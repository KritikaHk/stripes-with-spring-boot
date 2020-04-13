package com.hk.poc;

import com.hk.poc.services.MyService;
import net.sourceforge.stripes.springboot.autoconfigure.StripesAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Import( { StripesAutoConfiguration.class } )
@SpringBootApplication(scanBasePackages = "com.hk.poc")
@RestController
public class AppApplication {

  private final MyService myService;

  public AppApplication(MyService myService) {
    this.myService = myService;
  }

  @GetMapping("/home")
  public String home() {
    return myService.message();
  }

  public static void main(String[] args) {
    SpringApplication.run(AppApplication.class, args);
  }
}
