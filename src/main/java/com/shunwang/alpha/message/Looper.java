package com.shunwang.alpha.message;

import com.shunwang.alpha.message.service.impl.MessageQueue;
public class Looper {

    protected static final ThreadLocal<Looper> sThreadLocal = new ThreadLocal<Looper>();
    MessageQueue mq;

//    private Looper() {
//        mq = new MessageQueue();
//    }
}
