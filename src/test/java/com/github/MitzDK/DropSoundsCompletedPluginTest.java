package com.github.MitzDK;

import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


public class DropSoundsCompletedPluginTest
{
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	@Mock
	SoundEngine mockSoundEngine = Mockito.mock(SoundEngine.class);
	@Mock
	DropSoundsConfig mockConfig = Mockito.mock(DropSoundsConfig.class);
	@InjectMocks
	DropSoundsCompletedPlugin underTest = new DropSoundsCompletedPlugin();
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DropSoundsCompletedPlugin.class);
		RuneLite.main(args);
	}

	@Test
	public void testMessage() {
		Mockito.when(mockConfig.chatSelect()).thenReturn(ChatSelect.CLAN_MESSAGE);
		ChatMessage message = new ChatMessage();
		message.setMessage("Untradeable drop: 7 x Crystal Shard");
		message.setType(ChatMessageType.GAMEMESSAGE);
		underTest.onChatMessage(message);
		Mockito.verify(mockSoundEngine, Mockito.times(1)).playClip(Sound.UNTRADEABLE_DROP);

	}
}
