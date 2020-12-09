// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// TODO: High-level file comment.

/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example;

import com.alibaba.fastjson.support.retrofit.Retrofit2ConverterFactory;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RetrofitScan("com.example.retrofit")
public class HelloworldApplication {


  @Bean
  @ConditionalOnMissingBean
  public Retrofit2ConverterFactory retrofit2ConverterFactory() {
    return Retrofit2ConverterFactory.create();
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }
}

//@RestController
//class HelloworldController {
//  private static final Logger log = LoggerFactory.getLogger(HelloworldController.class);
//
//  @Value("${version:1.0}")
//  public String version;
//
//  @GetMapping("/hello/{name}")
//  public Map<String, String> hello(@Value("${greeting}") String greetingTemplate, @PathVariable String name) throws UnknownHostException {
//  	log.info("Recevied hello request for: " + name);
//    Map<String, String> response = new HashMap<>();
//
//    String hostname = InetAddress.getLocalHost().getHostName();
//    String greeting = greetingTemplate
//        .replaceAll("\\$name", name)
//        .replaceAll("\\$hostname", hostname)
//        .replaceAll("\\$version", version);
//
//    response.put("greeting", greeting);
//    response.put("version", version);
//    response.put("hostname", hostname);
//
//    return response;
//  }
//}
