package com.example.uipatterns.context;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
@NoArgsConstructor
public class ScenarioContext {

    private Map<String, Object> context = new HashMap<>();

    public <T> void addToScenarioContext(String key, T value){
        context.put(key, value);
    }

    public <T> Optional<T> getFromScenarioContext(String key){
       return Optional.ofNullable((T) context.get(key));
    }
}
