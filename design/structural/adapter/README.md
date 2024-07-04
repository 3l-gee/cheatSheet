### Adapter

The goal of an adapter is to allow two incompatible data structures to work together without having to rewrite one of the structures.

# Real World Analogy

- A kingdom has multiple lands
- Each lands speaks different languages
    - snake_land_only_write_in_sanke_cases
    - Main land write normally

The king doesn't understand the language and the practices of its lands and must use translator to use the complete service of its lands


# Problem

We woundn't want to reoganize all the lands to allow for seamless comunication. 
But we can adapt the land classes with translator so that they can comunicate freely. 

# Why Adapter

# Pros & Cons

++ Reuse code
++ Resolve compatibility issue

-- Adds complexity and abstractions

# Schema 

´´´Mermaid
classDiagram
    class Kingdom {
        <<abstract>>
        +harvest()
        +war()
    }

    class MainLand {
        +harvest() : str
        +war() : str
    }

    class SnakeLand {
        +harvest() : str
        +war() : str
        +priest() : str
    }

    class SnakeLandAdapter {
        -snake_land : SnakeLand
        +harvest() : str
        +war() : str
    }

    class KingCommunication {
        -kingdoms : list[Kingdom]
        +harvest()
        +war()
    }

    Kingdom <|-- MainLand
    Kingdom <|-- SnakeLandAdapter
    SnakeLandAdapter --> SnakeLand
    KingCommunication --> Kingdom
´´´