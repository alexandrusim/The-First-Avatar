# Avatar: The Last Airbender - Game Project

## Project Overview
A 2D tile-based game inspired by Avatar: The Last Airbender, developed as a college project for PAOO (Object-Oriented Programming course). The game features multiple levels, combat mechanics, and interactive NPCs.

## What This Project Involved

### 1. Map Design & Level Creation
Created 4 distinct levels using Tiled Map Editor:
- **Level 0** - Starting/Tutorial area
- **Level 1 (Air)** - Air bending themed level with sky elements
- **Level 2 (Water)** - Water bending themed level with aquatic elements  
- **Level 3 (Earth)** - Earth bending themed level with ground/rock elements
- **Level 4 (Fire)** - Fire bending themed level with volcanic elements

Each map was designed with custom tilesets (.tsx files) and exported as .tmx files for use in the game engine.

### 2. Game Mechanics & Programming
Implemented core game systems in Java:
- Player character with movement and bending abilities
- NPC interactions (Raava character)
- Monster AI and pathfinding system
- Combat projectiles for different bending types (Fire, Water, Earth, Wind, Lightning)
- Item collection system (Hearts, Apples)
- Collision detection

### 3. Enemy Types
Created 4 unique monsters:
- **Blue Spirit** - Agile melee fighter
- **Golem** - Heavy ground-based enemy
- **Jellyfish** - Water-based threat for aquatic levels
- **Vaatu** - Boss-tier antagonist

### 4. Sprite & Asset Creation
Assembled and created visual assets:
- Water animation sprites (10+ variations)
- Bending effect sprites (Fire, Earth, Wind, Water effects)
- Character sprite direction sheets
- Enemy sprites and animations
- Tileset graphics for each themed level

## Technology Stack
- **Language:** Java
- **Map Editor:** Tiled Map Editor
- **Graphics:** Sprite-based 2D rendering
- **Database:** SQLite (for save/load functionality)
- **Asset Creation:** Aseprite

## Project Structure
```
Game/
├── TheFirstAvatar/          # Main Java game project
│   ├── src/                # Source code
│   │   ├── PAOOgame/      # Core game engine
│   │   ├── entity/        # Player, NPC classes
│   │   ├── monster/       # Enemy AI and types
│   │   ├── object/        # Projectiles and items
│   │   ├── tile/          # Tile system
│   │   ├── ai/            # Pathfinding algorithm
│   │   └── Database/      # Save system
│   └── res/                # Game resources
│
Maps/                        # Level map files (.tmx, .tsx)
├── Harta 0/               # Level 0 maps
├── harta1/                # Level 1 - Air
├── Harta 2/               # Level 2 - Water
├── Harta 3/               # Level 3 - Earth
└── Harta4/                # Level 4 - Fire
│
Sprites/                     # Visual assets
├── Apa/                   # Water sprites
├── Fire Effect/           # Fire effect sprites
├── Earth Effect/          # Earth effect sprites
├── Wind Effect/           # Wind effect sprites
└── Mecha-stone Golem/     # Enemy sprites
```

## Key Features Implemented
- Tile-based level system with customizable maps
- Player movement and bending ability system
- Multiple enemy types with AI pathfinding
- Projectile-based combat system
- Item collection and health system
- Save/Load game progress
- NPC dialogue system
- Thematic level design matching Avatar universe



Font downloaded from http://www.fontget.com
