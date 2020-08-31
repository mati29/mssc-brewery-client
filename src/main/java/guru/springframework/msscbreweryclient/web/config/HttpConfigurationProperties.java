package guru.springframework.msscbreweryclient.web.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(value = "sfg.http", ignoreUnknownFields = false)
@ConstructorBinding
@AllArgsConstructor
@Getter
public class HttpConfigurationProperties {
    private final int maxTotal;
    private final int defaultMaxPerRoute;
    private final int connectionRequestTimeout;
    private final int socketTimeout;
}
