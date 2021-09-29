package br.edu.ifce.lp2.repository.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class ConfigMongoDev {

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(getClient(), "lp2021");
    }

    private MongoClient getClient() {
        return MongoClients.create("mongodb+srv://lp2:9sPpfptyRDumWWhY@lp2-cluster-01.zqexz.mongodb.net");
    }

}
