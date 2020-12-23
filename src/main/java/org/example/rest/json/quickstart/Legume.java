package org.example.rest.json.quickstart;

import io.quarkus.runtime.annotations.* ;

@RegisterForReflection
public class Legume {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Legume() {
    }

    public Legume(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
