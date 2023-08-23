package dev.phoenixtype.postgres2db2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableJpaRepositories
@SpringBootApplication
public class Postgres2db2Application {
    public static void main(String[] args) {
        SpringApplication.run(Postgres2db2Application.class, args);
    }
}
