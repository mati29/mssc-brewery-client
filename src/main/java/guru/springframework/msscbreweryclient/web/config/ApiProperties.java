package guru.springframework.msscbreweryclient.web.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(value = "sfg.brewery", ignoreUnknownFields = false)
@ConstructorBinding
@AllArgsConstructor
@Getter
public class ApiProperties {

    private final String apiHost;

}
