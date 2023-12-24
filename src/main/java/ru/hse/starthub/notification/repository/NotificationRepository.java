package ru.hse.starthub.notification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.hse.starthub.notification.model.Notification;

@Repository
public interface NotificationRepository extends MongoRepository <Notification, Long> {

}
