# Open Light Source

Open Light Source (Chest Net) is a Baritone fork with a command `ChestNet`. `ChestNet` moves through a list of all chest spawner loctions throught 50k spawn radius looking for shulkers from shops or small stashes. 

The name `ChestNet` comes from the idea that multiple accounts will be used to search the chest creating a network of chest searching accounts.

### Shulkers Found Using ChestNet
**Found**: 0

### Where did This Data Come From?
This data comes from Dekto's and Lamp's 100k over world spawn world download, I ran it through my data miner looking specifically for all spawners and the spawners delay. 

The spawners delay indicates if a chest was opened or not, any delay greater than 1 means the spawner was activated meaning a player was within the range to load the spawner having mobs spawn. 

with this data I was able to create an interactive graph that shows all spawners and locations and delays allowing me to sort for activated spawners Vs. non-activated spawners. 

![img_1.png](img_1.png)

### What We Did With This Info 
We started using this info to look for activated spawners manually and found about a dub of loot. 

unfortunately, this task was too demanding for three other players to do so we had to automate the process. 

## Core Features 
This is for the first iteration of the mod.

- Ability to move above a spawner location 
- Ability to search for a chest around the spawner 
- Ability to open and search the contents of the chest (if there is chests)
- Ability to send a discord msg to a discord channel using the built in discord bot 

## How To Use 
the mod will not work if you dont have the correct variables set up with in your system.

To get the discord api key, you can share one with groups, or for personal use, to get it you will need to go to discord.com and follow the directions on how to get the api key and set up the bot. 

To get the channel id, you can right-click the channel that you want the bot to be in and copy the id by clicking the button, if you dont see that button then you need to change to dev mode/account in settings. 

**Note** you need to store this into your system permanently with these exact variable names or the mod wont work. I wont provide the command to do so since its diffrent for every OS, you can google how to do it or ask chat gpt. 

- For discord api key: `DISCORD_BOT_API_KEY`  < api key >

- For discord channel id: `DISCORD-CHANNEL-ID` < channel ID >

## Future Features
Future iterations will hopefully have:

- Ability to fly to target after a certain distance
- Adding more targeted searches for shops 
  - searching buried treasure 
  - searching ship wrecks
  - searching mine-carts
- Better multi-accounting usability 

# Graphs

### Graph of All Activated Spawners

![img_2.png](img_2.png)

### Graph of All 1.19+ Spawners 

![img_3.png](img_3.png)