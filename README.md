docker exec kafka1 kafka-topics --bootstrap-server localhost:9092 --create --topic test_topic1 --partitions 3 --replication-factor 3