package sia5;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
public class FileWriterIntegrationConfig {

    @Profile("xmlconfig")
    @Configuration
    @ImportResource("classpath:filewriter-config.xml")
    public static class XmlConfiguration {}
}
