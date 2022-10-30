package com.example.demosoap;

import com.stamps.xml.namespace._2021._16.swsim.swsimv130.Address;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.Credentials;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.GetRates;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.GetRatesResponse;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.RateV45;
import com.stamps.xml.namespace._2021._16.swsim.swsimv130.SwsimV130Soap;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping("/rates")
  public GetRatesResponse getRatesResponse() {
    final Credentials credentials = new Credentials();
    credentials.setUsername("Flashs-001");
    credentials.setIntegrationID(integrationID);
    credentials.setPassword(password);
    final GetRates parameters = new GetRates();
    parameters.setCredentials(credentials);
    final RateV45 rateV45 = new RateV45();
    final Address from = new Address();
    from.setZIPCode("92128");
    rateV45.setFrom(from);
    final Address to = new Address();
    to.setZIPCode("90245");
    rateV45.setTo(to);
    rateV45.setWeightLb(1D);
    rateV45.setWeightOz(0D);
    rateV45.setPackageType("Package");
    rateV45.setShipDate(buildDate());
    parameters.setRate(rateV45);

    return swsimV130Soap.getRates(parameters);
  }

  @SneakyThrows
  public XMLGregorianCalendar buildDate() {
    GregorianCalendar c = new GregorianCalendar();
    return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
  }
}
