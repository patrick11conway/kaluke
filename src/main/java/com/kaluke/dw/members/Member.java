package com.kaluke.dw.members;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import javax.validation.constraints.NotNull;


class Member {

    @NotNull
    String id;
    
    @NotNull
    String name;
    
    public Member(){
    this.id=UUID.randomUUID().toString();
    this.name="Unknown";
    }
    
    public Member(String name){
        
        this.name=name;
        this.id=UUID.randomUUID().toString();
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
    
    
}
