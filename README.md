# Final Project

This is the final project for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

## Introduction

Between my two classes, I believe my understanding of Github, the terminal, and how to use markdown language to speed up the formatting process has been cemented. I've even added the `status`, `add`, `commit`, and `push` commands onto my background to really nail it home. Even though I am new to all three, I already can see how they will be invaluable as I continue through my classes and personal projects.

## Chapter 1

As we build up our program, in seperated parts unlike my *.NET* class, I'm excited to learn more in depth about how the different parts interact and how I can interact with them.  Though, something I definitely need to work on is remembering the different prompts to print in the different languages. While Java's `System.out.println()` seems to be the easiest of the bunch for me to remember, I still found myself typing in *Javascript*'s `Console.log()`, *C#*'s `Console.WriteLine()`, and even *Python*'s `print()` often enough that it was an issue.

## Chapter 2
Something else that's pretty nice about learning multiple programming languages at the same time is that the data values rarely differ between them, which makes learning them all together seem less daunting seperately. However, the negative of that is, where it *does* differ, it's harder to remember the language it's used in. Something interesting that I enjoyed, though, is I've known about the `if (x && y)` boolean deal for a while but never knew about the reversing of it ( i.e. `x && y == !(x || y)` ), which is something that's been present since I started taking classes in programming last year. I guess there's always things to learn.

## Chapter 3
<i>TBA</i>

## Chapter 4
<i>TBA</i>

## Chapter 5
<i>TBA</i>

## Final Project

The idea I have for my final project is a survival/puzzle text-based adventure. The player finds themselves within a seemingly abandoned base, trying to gain access to parts blocked off and piece together what left the place in such a state of dissarray. To do so, they will have to solve various logic puzzles and examine their surroundings to understand what happened. They will be able to carry items along with them and try using / combining them with other items. ASCII art will be printed to help the player visualize their enviorment.

I worry this project may be too ambitious, but it's a project I had previously started working on in Python and love puzzle games so I have the general layout and what I want and where - It's just the matter of putting it together.

### <u>User Cases</u>

* Pick up and carry various items within inventory, which will be compartmentalized by catagory. (MVP)
* Use inventory against other items within the enviorment (MVP)
* Solve problems / create own tools by combining objects from inventory. (MVP)
* Examine surroundings for clues (MVP)
* Have an objective that updates as the player progresses [Player can view complete, current or both] (MVP)
* Remove items from the room and add them to player inventory. (MVP)
* Print ASCII art to assist player in visualiziation (Stretch Goal)
* Update ASCII art with changes made to enviorment. (Stretch Goal)
* Add notes to report of things seen. (Stretch Goal)
* Add visual component to inventory (Stretch Goal)

| + Player  |
|---|
|- Name: String | 
|- Inventory: int[] array| 
|---|
|<<create>> +Player()|
|<<create>> +Person(name: String, inventory: int[]|
||
