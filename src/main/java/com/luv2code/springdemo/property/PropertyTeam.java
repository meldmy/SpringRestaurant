package com.luv2code.springdemo.property;

import org.springframework.stereotype.Component;

/**
 * @author Dmytro Melnychuk
 */
@Component
public class PropertyTeam {

    private String name;
    private int quantityMembers;

    public PropertyTeam(String name, int quantityMembers) {
        this.name = name;
        this.quantityMembers = quantityMembers;
    }

    public String getName() {
        return name;
    }

    public int getQuantityMembers() {
        return quantityMembers;
    }
}
