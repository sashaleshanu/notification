package ru.hse.starthub.notification.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Notification")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Notification {
    Long user_id;
    Long startup_id;
}
