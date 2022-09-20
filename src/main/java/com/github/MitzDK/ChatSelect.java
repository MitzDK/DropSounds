package com.github.MitzDK;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChatSelect {
    CLAN_MESSAGE("Clan chat notification"),
    CLAN_GIM_MESSAGE("Group chat notification");

    private final String name;
    @Override
    public String toString()
    {
        return getName();
    }
}
