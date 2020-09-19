package com.github.dylanz666.repository;

import com.github.dylanz666.domain.AgentConfig;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author : dylanz
 * @since : 09/19/2020
 */
@Repository
public interface AgentConfigRepository {
    Optional<AgentConfig> findById(String id);

    Optional<AgentConfig> saveAgentConfig(AgentConfig agentConfig);
}
