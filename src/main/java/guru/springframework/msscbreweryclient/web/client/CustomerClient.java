package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.config.ApiProperties;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
public class CustomerClient {

    public final String CUSTOMER_PATH_V1 = "/api/v1/customer/";
    private final RestTemplate restTemplate;
    private final String apiHost;

    public CustomerClient(ApiProperties apiProperties, RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
        this.apiHost = apiProperties.getApiHost();
    }

    public CustomerDto getCustomerById(UUID uuid) {
        return restTemplate.getForObject(apiHost + CUSTOMER_PATH_V1 + uuid.toString(), CustomerDto.class);
    }

    public URI saveNewCustomer(CustomerDto customerDto) {
        return restTemplate.postForLocation(apiHost + CUSTOMER_PATH_V1, customerDto);
    }

    public void updateCustomer(UUID uuid, CustomerDto customerDto) {
        restTemplate.put(apiHost + CUSTOMER_PATH_V1 + uuid.toString(), customerDto);
    }

    public void deleteCustomer(UUID uuid) {
        restTemplate.delete(apiHost + CUSTOMER_PATH_V1 + uuid.toString());
    }

}
