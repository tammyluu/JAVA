package com.example.chat_app.dao;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.r2dbc.core.DatabaseClientExtensionsKt;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MessageDAO {
    private  final ConnectionFactory connectionFactory;

    private DatabaseClient databaseClient;

    public MessageDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
        databaseClient = DatabaseClient.create(connectionFactory);
        Mono result = databaseClient
                .sql("CREATE TABLE  IF NOT EXISTS message (id long primary key auto_increment, content varchar(300), sender varchar(100), posttime DATETIME)")
                .then().doOnSuccess((Void) ->  {
                    System.out.println("Création de la table OK");
                }).doOnError((Void) ->  {
                    System.out.println("Création de la table Not OK");
                });
        result.subscribe();

    }
}
