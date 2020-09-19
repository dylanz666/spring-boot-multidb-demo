package com.github.dylanz666.service;

import com.github.dylanz666.domain.AgentConfig;
import com.github.dylanz666.repository.AgentConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author : dylanz
 * @since : 09/19/2020
 */
@Service
public class AgentConfigService implements AgentConfigRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public Optional<AgentConfig> findById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        return Optional.ofNullable(mongoTemplate.findOne(query, AgentConfig.class));
    }

    public Optional<AgentConfig> saveAgentConfig(AgentConfig agentConfig) {
        String id = agentConfig.get_id();

        Query query = new Query(Criteria.where("_id").is(id));
        Update update = new Update();
        update.set("application", agentConfig.getApplication());
        mongoTemplate.updateFirst(query, update, AgentConfig.class);

        return findById(id);
    }
}
