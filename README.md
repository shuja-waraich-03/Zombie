## Zombie Weakness Search
In the year 2020, the world has been under siege by the zombie apocalypse for two years. As a computer scientist on a team of scientists, your mission is to identify different types of zombies and their weaknesses. The goal is to be able to search for a type of zombie and quickly return that zombie’s weakness, as the number of zombie types is constantly growing.

## Solution Overview
This project provides a Java program that allows for efficient searching of zombie types and their weaknesses using enums and in-memory storage. The solution ensures fast lookup times and maintains a unique set of zombies.

# Questions for the Client
Should the search be case-sensitive?
Should the system handle custom zombie types that are not predefined in the enum, or is it restricted to only predefined types?

# Design Decisions and Assumptions
Enums for Zombie Types: Use enums to define predefined zombie types with associated weaknesses.
In-Memory Storage: Data is stored in memory using a HashMap for quick lookups and a HashSet to ensure uniqueness.
Case Insensitivity: Searches are case-insensitive for ease of use.
