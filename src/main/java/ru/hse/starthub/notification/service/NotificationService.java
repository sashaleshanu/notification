package ru.hse.starthub.notification.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hse.starthub.notification.dto.NotificationRequest;
import ru.hse.starthub.notification.dto.NotificationResponse;
import ru.hse.starthub.notification.model.Notification;
import ru.hse.starthub.notification.repository.NotificationRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void subscribe(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .user_id(notificationRequest.getUser_id())
                .startup_id(notificationRequest.getStartup_id())
                .build();

        notificationRepository.save(notification);
        log.info("New notification info was set for user {}, subscribed {}", notification.getUser_id(), notification.getStartup_id());
    }
}
