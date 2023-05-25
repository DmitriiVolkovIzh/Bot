package com.example.bot.service;

import com.example.bot.entity.NotificationTask;
import com.example.bot.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }
    //
    public void save(NotificationTask notificationTask) {
        notificationTaskRepository.save(notificationTask);
    }
}
