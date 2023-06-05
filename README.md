# Hero Squad Game Using Java Program

This project is about Hero Squad Java Program App.

Version Date: 23th May 2023

By Amani Mwasambu

## Description

#### This project is my independent project (IP) for java spark week 2

Hero Squad is a project that allows users who interact with it to create heroes and squads/alliances that contain a particular number of heroes. Heroes can be affiliated with only 1 squad at a single time, therefore if the hero was to switch to another group, their name should not be present in the previous squad that they were in

A Hero Squad game is an interactive game where players have the opportunity to recruit and assemble a team of superheroes to combat various challenges and enemies. The game revolves around the concept of creating a well-balanced team of superheroes, each with unique abilities and weaknesses, to overcome obstacles and accomplish missions.

In a Hero Squad game, players typically have the following objectives and gameplay elements:

Recruit Heroes: Players have the ability to select and recruit different heroes into their squad. Each hero possesses their own special powers, skills, and weaknesses. The players must strategically choose heroes with complementary abilities to form a strong and balanced team.

Squad Formation: Players need to strategically assign heroes to their squad, considering factors such as team synergy, tactical advantages, and mission requirements. The squad formation plays a crucial role in determining the overall effectiveness and success of the team.

Missions and Challenges: The game presents various missions, quests, or challenges that the Hero Squad must undertake. These missions can range from rescuing hostages, defeating supervillains, solving puzzles, or protecting the city from imminent threats. Players must navigate through different levels, face adversaries, and utilize their heroes' unique abilities to overcome obstacles and achieve the mission objectives.

Turn-Based Battles: Hero Squad games often incorporate turn-based combat mechanics. Players engage in battles with enemies or other opposing forces, taking turns to execute actions and abilities. The outcome of battles depends on factors such as hero abilities, strategy, and tactical decision-making.

Overall, Hero Squad games provide an immersive and engaging experience, allowing players to immerse themselves in a world of superheroes, teamwork, and strategic decision-making. The game combines elements of role-playing, strategy, and action to create an exciting and dynamic gameplay experience.

## Prerequisites

#### Java JDK
#### Gradle
#### Git
#### Some prior knowledge of Java
#### Some prior knowledge of Spark framework
#### Java IDE

## BDD (Behavior-Driven Development)

#### CREATING A HERO
To add a hero, on the homepage select add hero.
A form will be displayed with the hero details to be added.
Enter hero name and the rest of the details, age, weakness etc
Click on the submit button for the hero to be added.
Once added, the hero will be displayed on the home page, but will not come with an identified squad

#### CREATING A SQUAD
To create a squad, on the home page click on add squad.
A form will be displayed
On the form displayed, enter squad name, cause and the size.
Click on submit button for the hero to be created.

#### ASSIGNING A HERO TO A SQUAD
When a hero is created, he doesn't come with a squad pre-defined.
Likewise, when a squad is created it comes without any heroes.
So, to assign a hero to a squad, click on the already created squad.
A form will be displayed
On this form the squad name is already captured(the squad you clicked)
A dropdown will appear with a list of all available heroes
Select the hero to be assigned into the squad and submit

#### Feature: Recruit Heroes

Scenario: Successfully recruit a hero into the squad
Given the player is logged in and on the recruit page
When the player selects a hero from the available options
Then the hero is added to the squad roster
And the player receives a success message confirming the hero recruitment

Scenario: Cannot recruit the same hero twice
Given the player is logged in and on the recruit page
And the hero is already in the squad roster
When the player tries to recruit the same hero again
Then the player receives an error message indicating that the hero is already recruited

#### Feature: Squad Formation

Scenario: Assign heroes to the squad
Given the player is logged in and on the squad formation page
When the player selects heroes from the available roster
And assigns them to the squad slots
Then the heroes are successfully assigned to the squad
And the player can see the updated squad formation

#### Scenario: Squad size restriction
Given the player is logged in and on the squad formation page
And the squad has reached the maximum size limit
When the player tries to assign another hero to the squad
Then the player receives an error message indicating that the squad is already full

#### Feature: Missions and Challenges

Scenario: Complete a mission successfully
Given the player is on the mission page
And the squad is prepared for the mission
When the player initiates the mission
Then the player receives mission details and objectives
And the squad engages in battles and completes the objectives
And the player receives rewards upon successful completion

## Setup/Installation Requirements

To run the Hero Squad game on your local machine, you need to have the following prerequisites installed:

Java Development Kit (JDK): Make sure you have a valid JDK installed and configured properly in your development environment. The Hero Squad game is built using Java, so having a compatible JDK is essential.

IntelliJ IDEA (or any Java IDE of your choice): You will need an integrated development environment to open and work with the Hero Squad game code. IntelliJ IDEA is recommended, but you can use any Java IDE that supports Gradle projects.

Git: Git is a version control system that allows you to clone and manage the project's source code repository. Make sure Git is installed on your machine. If not, you can download and install it from the official website (https://git-scm.com/).

Once you have the necessary prerequisites installed, follow these steps to set up and run the Hero Squad game:

Clone the repository: Open your terminal or Git bash and navigate to the directory where you want to clone the project. Then, run the following command:

Go to git bash and Copy code:
git clone https://github.com/AMANIKAI/hero-squad.git
This will create a local copy of the project on your machine.

Open the project in IntelliJ IDEA: Launch IntelliJ IDEA and select "Open" from the File menu. Navigate to the directory where you cloned the project and select it. IntelliJ IDEA will load the project.

Build the project: Once the project is open in IntelliJ IDEA, it will automatically detect the Gradle configuration and build the project. Wait for the build process to complete.

Run the application: In the IntelliJ IDEA toolbar, locate the "Run" button and click on it. Select the main application class and click the "Run" button again. This will run the Hero Squad game on a local server.

Access the application: Open your web browser and enter the following URL: http://localhost:4567. The Hero Squad game should now be accessible, and you can interact with it through the browser.

That's it! You have successfully set up and installed the Hero Squad game on your local machine. You can now start recruiting heroes, forming squads, and playing the game.

## To access the code for learning:

1. Clone the repository: `git clone https://github.com/AMANIKAI/hero-squad.git
2. Open the cloned code on IntelliJ IDEA.
3. Run the code to view the output.

## Known Bugs

There are no known bugs in this project.

## Technologies Used

- Java programming language
- IntelliJ IDEA
- Bootstraps
- CSS & HTML (handlebars)
- Gradle
- JUnit
- Java spark
- Groovy

## Support and Contact Details

If you need any assistance, have questions, ideas, or concerns, kindly contact me through email: amanikai@gmail.com. You can also make a contribution to the code or seek assistance for the app/project.

## GitHub URL Link

To view the project, visit the GitHub repository:(https://github.com/AMANIKAI/hero-squad.git)

## License

The project is licensed under GPL (General Public License).

## Copyright &#169; 2023 Amani Kai

## Amani Kai Mwasambu &#174;

