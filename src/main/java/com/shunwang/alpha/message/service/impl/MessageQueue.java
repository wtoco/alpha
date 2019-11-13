package com.shunwang.alpha.message.service.impl;

import com.shunwang.alpha.message.model.Message;
import com.shunwang.alpha.message.service.MessageQueueService;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MessageQueue implements MessageQueueService {

    private BlockingQueue<Message> queue;

    public MessageQueue(int cap) {

        this.queue = new LinkedBlockingQueue<>(cap);
    }

    @Override
    public Message next() throws InterruptedException {
        // TODO Auto-generated method stub
        return queue.take();
    }

    @Override
    public void enqueueMessage(Message msg) {
        // TODO Auto-generated method stub
        try {
            queue.put(msg);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
