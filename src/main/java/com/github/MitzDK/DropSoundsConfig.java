package com.github.MitzDK;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(DropSoundsConfig.GROUP)
public interface DropSoundsConfig extends Config {

    String GROUP = "dropsoundscompleted";

    @Range(
            min = 0,
            max = 200
    )
    @ConfigItem(
            keyName = "announcementVolume",
            name = "Announcement volume 0-200",
            description = "Adjust how loud the audio announcements are played!",
            position = 1
    )
    default int announcementVolume() {
        return 100;
    }
    @ConfigItem(
            position = 2,
            keyName = "chatSelect",
            name = "Channel",
            description = "Pick between Group chat and Clan chat for notifications"
    )
    default ChatSelect chatSelect(){return ChatSelect.CLAN_MESSAGE;}
    @ConfigItem(
            position = 3,
            keyName = "itemsToNotify",
            name = "Items, case sensitive",
            description = "List of items to be notified"
    )
    default String itemsToNotify()
    {
        return "Clue scroll (beginner),Clue scroll (easy),Clue scroll (medium),Clue scroll (hard),Clue scroll (elite),Clue scroll (master),Dark totem top,Dark totem middle,Dark totem base,Mossy key,Giant key,Ancient shard,Brimstone key,Larran's key";
    }

}
