package com.example.helloworld.echo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EchoForm implements Serializable {
    private static final long serialVersionUID = 2557725707095364445L;

    @NotNull // (1)
    @Size(min = 1, max = 5) // (2)
    private String name;

    private String name2;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName2() {
        return name2;
    }
}