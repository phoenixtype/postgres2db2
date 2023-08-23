docker run --tty \
--network postgres2db2_default \
confluentinc/cp-kafkacat \
kafkacat -b kafka:29092 -C \
-s key=s -s value=avro \
-r http://schema-registry:8081 \
-t postgres.public.student