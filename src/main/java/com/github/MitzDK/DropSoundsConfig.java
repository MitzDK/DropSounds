package com.github.MitzDK;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(DropSoundsConfig.GROUP)
public interface DropSoundsConfig extends Config {

    String GROUP = "cengineercompleted";

    @Range(
            min = 0,
            max = 200
    )
    @ConfigItem(
            keyName = "announcementVolume",
            name = "Announcement volume",
            description = "Adjust how loud the audio announcements are played!",
            position = 1
    )
    default int announcementVolume() {
        return 100;
    }
    @ConfigItem(
            position = 2,
            keyName = "itemsToNotify",
            name = "Items to notify if dropped",
            description = "List of items to be notified, seperated by ,"
    )
    default String itemsToNotify()
    {
        return "";
    }

}
