# Solution Homework 7
 
 ## 1.Iterator Pattern 
 
 Using the Iterator Pattern, we implement:
 
 • EpisodeIterator – common iterator interface exposing hasNext() / next().
 
 • SeasonIterator – normal order inside one season.
 
 • ReverseSeasonIterator – reverse order inside one season.
 
 • ShuffleSeasonIterator – random order (fixed seed for repeatability).
 
 • Season (Iterable) – returns a SeasonIterator so for (Episode e : season) works.
 
 • BingeIterator – chains seasons so the user plays S1E1 → series finale in a single pass.

## 2.Airport Tower Simulator

 Using the Mediator Pattern, we implement:

 • Interface Tower: Mediator contract.

 • Class ControlTower: Manages runway state and message routing.

 • Abstract Aircraft: Base for all aircraft types.

 • Concrete Plane, Helicopter: Aircraft implementations with custom reactions.

 • main: Demo sequence showing landing, takeoff, and emergency handling.
