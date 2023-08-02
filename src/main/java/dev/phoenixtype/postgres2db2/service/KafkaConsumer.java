package dev.phoenixtype.psotgres2db2.service;

import dev.phoenixtype.psotgres2db2.model.StudentRecord;
import dev.phoenixtype.psotgres2db2.repository.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.apache.avro.generic.GenericRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {
    private static final String KAFKA_TOPIC = "postgres.public.student";

    private final StudentsRepository studentsRepository;

    // Kafka listener method to process the change events
    @KafkaListener(topics = KAFKA_TOPIC, groupId = "${spring.kafka.consumer.group-id}")
    public void processMessage(GenericRecord record) {
        try {
            // Extract the necessary data from the GenericRecord
            GenericRecord afterNode = (GenericRecord) record.get("after");
            if (afterNode != null) {
                String name = afterNode.get("name").toString();
                int id = Integer.parseInt(afterNode.get("id").toString());
                StudentRecord studentRecord = new StudentRecord();
                studentRecord.setId(id);
                studentRecord.setName(name);
                studentsRepository.save(studentRecord);
                System.out.println("Received and saved: " + studentRecord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
