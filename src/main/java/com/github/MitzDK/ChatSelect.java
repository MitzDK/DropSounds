package com.github.MitzDK;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChatSelect {
    CLAN_MESSAGE("Clan"),
    CLAN_GIM_MESSAGE("Group");

    private final String name;
    @Override
    public String toString()
    {
        return getName();
    }
}
