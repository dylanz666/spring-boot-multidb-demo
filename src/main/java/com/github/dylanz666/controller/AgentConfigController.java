package com.github.dylanz666.controller;

import com.github.dylanz666.domain.AgentConfig;
import com.github.dylanz666.service.AgentConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author : dylanz
 * @since : 09/19/2020
 */
@RestController
public class AgentConfigController {
    @Autowired
    private AgentConfigService agentConfigService;

    @GetMapping("/agent/config/{id}")
    @ResponseBody
    public Optional<AgentConfig> getAgentConfigById(@PathVariable(name = "id") String id) {
        return agentConfigService.findById(id);
    }

    @PostMapping("/agent/config")
    @ResponseBody
    public Optional<AgentConfig> save(@RequestBody AgentConfig agentConfig) {
        return agentConfigService.saveAgentConfig(agentConfig);
    }
}
