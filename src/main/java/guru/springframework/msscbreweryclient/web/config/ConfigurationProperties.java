package guru.springframework.msscbreweryclient.web.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ApiProperties.class, HttpConfigurationProperties.class})
public class ConfigurationProperties {
}
