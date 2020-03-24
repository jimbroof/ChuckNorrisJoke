package guru.springframework.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    @Bean
    // This bean is run when the program starts and initializes the ChuckNorrisQuotes

    // This is good for external jars from an open source project
    public ChuckNorrisQuotes gfdsgfdsgfdsgfds(){
        return new ChuckNorrisQuotes();
    }
}
