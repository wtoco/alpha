package com.shunwang.alpha.server.controller;

import com.shunwang.alpha.server.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servers")
public class ServerController {
    @Autowired
    public ServerService serverService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String show() {
        String username = this.serverService.getServer();
        return username;
    }

}
