package com.example.demosoap;

import com.stamps.xml.namespace._2021._16.swsim.swsimv130.Credentials;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.SwsimV130Soap;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
  private final SwsimV130Soap swsimV130Soap;

  @Value("${Password}")
  private String password;

  @Value("${IntegrationID}")
  private String integrationID;

  @GetMapping("/authenticate")
  public String authenticateUser() {
    final Credentials credentials = new Credentials();
    credentials.setUsername("Flashs-001");
    credentials.setIntegrationID(integrationID);
    credentials.setPassword(password);
    swsimV130Soap.authenticateUser(credentials, null, null, null, null, null, null);

    return "OK";
  }
}
