package com.shunwang.alpha.server.service.impl;

import com.shunwang.alpha.common.config.ServerConfig;
import com.shunwang.alpha.server.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class ServerServiceImpl implements ServerService {
    @Autowired
    public ServerConfig serverConfig;

    public String getServer() {
        return this.serverConfig.getAvamarServer().getUsername();

    }


}
