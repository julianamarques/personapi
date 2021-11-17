package com.digitalinnovationone.personapi.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

    private final String description;

    @JsonCreator
    public static PhoneType getByValue(String t) {
        return Arrays.stream(PhoneType.values())
                .filter(i -> i.name().equals(t)).findFirst().orElse(PhoneType.HOME);
    }
}
