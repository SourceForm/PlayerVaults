# Player Vaults Plugin

#### PlayerVaults is a Minecraft Spigot plugin that allows players to access and store items in virtual chests refferred to as vaults.
#### Each player can open their vaults through a command, and the contents are saved between sessions.

## Features
- Virtual Chests: Each player has access to 9 virtual chests (vaults) for item storage.
- Persistent Storage: Items in vaults are saved to each player's individual Persistent Data Storage Container, ensuring persistence between server restarts.

## Installation
1. Download the latest release of the PlayerVaults plugin.
2. Place the downloaded JAR file into your server's *'plugins'* directory.
3. Start or restart your Minecraft Spigot Server.

## Usage
### Commands
#### '/playervault'
- Description: Opens the main menu for vault selection.
- Usage: '/playervault' OR '/pv'
- Permission: 'playervaults.openvault'
## Example
```plaintext
/playervault
```

## Events
The plugin listens to inventory-related events to handle the saving of vault contents.

## Contributions
### Thank you to Billy for helping me figure out the code work for storing independent data for each player!


