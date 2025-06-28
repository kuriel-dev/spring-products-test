package com.example.products.serializers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ProductSerializer {
//    @JsonIgnore
//    public abstract Long getId();

    @JsonProperty("desc")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public abstract String getDescription();
}
