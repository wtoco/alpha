package com.shunwang.alpha.message.service;

import com.shunwang.alpha.message.model.Message;

public interface MessageQueueService {

    public Message next() throws InterruptedException;

    public void enqueueMessage(Message msg);
}
