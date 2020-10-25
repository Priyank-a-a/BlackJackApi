1. blackJack api has been created using spring framework.
2. the following dependencies have been added to the application:
2.1 spring web
2.2 MySql driver
2.2 spring data jpa
2.4 spring devtools
3. MySQL database has been used create a database for the record of players.
4. The api is http://localhost:4200/players to get the list of players and is a GET request.
5. the api to create users/players is http://localhost:4200/create-players and has parameters name(name of the player) and coins(number of coins). After creating a user, 
the navigation can be done to players list present in the same header. the details entered go directly to the database. This is a POST request.
6. the api to search a player by an id is http://localhost:4200/players/{id} . it says "invalid id" if the id entered is not in database.
7. the database is named as player and table inside is tbl_players
