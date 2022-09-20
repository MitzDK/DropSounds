# Drop Sounds 

##### A plugin for [RuneLite](https://runelite.net/)

HUGE thanks to m0bile btw, for helping me with this project, and for allowing me to use his work as a baseline.
Custom sounds play when certain drop criteria are met.
___

## Customising your sounds

### 1. Locate your `.runelite` folder

On windows this is likely to be here: `C:\Users\<your username>\.runelite`

If you aren't sure, it's the same place that stores your `settings.properties`

Within this `.runelite` folder, there should be a `drop-sounds` folder, which is where the sound files are downloaded to

### 2. Prepare your sound files

Make sure your files are all `.wav` format (just changing the extension won't work, actually convert them)

Make sure the file name __exactly__ matches the name of the existing file (in `drop-sounds` folder) you want to replace

### 3. Understand how the files are handled

If you replace an existing file in `drop-sounds` using exactly the same file name, your sound will be loaded instead

If you place a new file with an unexpected file name in `drop-sounds`, it will be deleted

If you place a new folder inside `drop-sounds` that is unexpected, this should be left as is, so can be used to store multiple sounds that you may want to swap in at a future date

If you want to revert to a default sound file, simply delete the relevant file in `drop-sounds` and the default file will be re-downloaded when the plugin next starts

### 4. If it fails to play your sound

Remove your sound and make sure it plays the default sound for that event - if not, there is something misconfigured in your plugin _or in-game_ settings. For example, untradeable sound will only play, if you have the untradeable drop setting enabled within Runescape.

Check that your file is actually a valid `.wav` and not just a renamed `.mp3` or similar

Check that the file is still there in the `drop-sounds` folder, if you accidentally used an incorrect file name, it won't have been loaded, and will have been deleted
___

## Other information

### Announcement options include

- Clan chat / Group iron loot notification sounds
- Untradeable items notification sound

Sounds are downloaded to the local file system instead of being 'baked in' to the plugin build, allowing for further
expansion in the future while also 'supporting' user-swapped sounds for pre-existing events

### Planned / Work In Progress expansions

- none right now, but more than open to suggestions / input, can reach me on discord: Victor#6895

