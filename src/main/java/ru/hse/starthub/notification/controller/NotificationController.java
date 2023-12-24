package ru.hse.starthub.notification.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.hse.starthub.notification.dto.NotificationRequest;
import ru.hse.starthub.notification.service.NotificationService;

import java.util.List;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void subscribe(@RequestBody NotificationRequest notificationRequest) {
        notificationService.subscribe(notificationRequest);
    }
}
