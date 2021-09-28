package br.edu.ifce.lp2.repository.mongodb.connections;

import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoTemplateSingleton {

    private MongoTemplateSingleton() {
    }

    public static final MongoOperations operations;

    static {
        var client = MongoClients.create("mongodb+srv://lp2:9sPpfptyRDumWWhY@lp2-cluster-01.zqexz.mongodb.net");
        operations = new MongoTemplate(client, "lp2");
    }

}
