## Luminosity is a Discord bot. Thats it.

[Add Luminosity to your server](https://discord.com/api/oauth2/authorize?client_id=739047445144666202&permissions=8&scope=bot)

#### About
Luminosity is discord bot developed in Java using the JDA library made by @DV8FromTheWorld.
JDA allows the Discord and the bot to communicate with Java and vice-versa.

#### Features
* Commands [Learn More](https://github.com/ScratchCat458/Luminosity/blob/master/docs/COMMANDS.md)
  * Help
  * Information
  * Bot Status
  * Sudo
* Event Notifications
  * GuildMemberJoin
  * GuildMemberLeave
  * GuildVoiceDeafen (SelfDeafenEvent)
  * GuildVoiceMute (SelfMuteEvent)
  * GuildVoiceJoin
  * GuildVoiceLeave
  * GuildVoiceStream



# Commands
Here is the documentation for all commands used by Luminosity. Refer to this page if you are confused about what you can put in arguments and to check out what you can do with the bot.

## Information
Basic information about Luminosity.
### Usage
`~info`

## Help
View simple versions of command usage help inside of Discord.
### Usage
`~help`

## Sudo
Causes the bot to say any text you want it to.
### Usage
`~sudo [some-fancy-text]`
Hyphens are replaced with spaces so remember to type like-this.

## Bot Status
Set the status of the bot in Discord. (Or presence if your fluent in JDA)
### Usage
`~status [arg1] [arg2]`
#### arg1 Options
* active - Sets the bot's online status.
* playing - Sets what game the bot is playing.
* watching - Sets what the bot is watching.
* listening - Sets what the bot is listening to.
#### arg2 Options
* online - Sets the bot as online. (arg1 must be active)
* idle - Sets the bot as idle. (arg1 must be active)
* nodisturb - Sets the bot as do not disturb. (arg1 must be active)
* invisible - Sets the bot as invisible. (arg1 must be active)
* any-text - Sets the activity as the given text. Hyphens are replaced with spaces so remember to type like-this. (arg1 must be either playing, watching or listening)

## More coming soon...
