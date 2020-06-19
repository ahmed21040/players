# players
Given a Player class - an instance of which can communicate with other Players.

The requirements are as follows:

1. create 2 Player instances
1. one of the players should send a message to second player (let's call this player "initiator")
1. when a player receives a message, it should reply with a message that contains the received message concatenated with the value of a counter holding the number of messages this player already sent.
1. finalize the program (gracefully) after the initiator sent 10 messages and received back 10 messages (stop condition)
1. both players should run in the same java process (strong requirement)
1. document for every class the responsibilities it has.
1. additional challenge (nice to have) opposite to 5: have every player in a separate JAVA process.

Please use core Java as much as possible without additional frameworks like Spring etc; focus on design and not on the technology.
Please include a maven project with the source code to build the jar and a shell script to start the program.
Everything not specified is to be decided by you; everything specified is a hard requirement.

You should send your source code as an archive attached to the e-mail; inline links for downloading will be ignored.

1. Compilation .

    `mvn install`
    
1. Run the Application.

   `java -jar ./target/players-0.0.1-SNAPSHOT.jar` 
 
    
1. Result
```
#1 initiator send MSG :Hello			playerB received MSG :Hello
#1 playerB send MSG :Hello 1			initiator received MSG :Hello 1
#2 initiator send MSG :Hello 1 2			playerB received MSG :Hello 1 2
#2 playerB send MSG :Hello 1 2 2			initiator received MSG :Hello 1 2 2
#3 initiator send MSG :Hello 1 2 2 3			playerB received MSG :Hello 1 2 2 3
#3 playerB send MSG :Hello 1 2 2 3 3			initiator received MSG :Hello 1 2 2 3 3
#4 initiator send MSG :Hello 1 2 2 3 3 4			playerB received MSG :Hello 1 2 2 3 3 4
#4 playerB send MSG :Hello 1 2 2 3 3 4 4			initiator received MSG :Hello 1 2 2 3 3 4 4
#5 initiator send MSG :Hello 1 2 2 3 3 4 4 5			playerB received MSG :Hello 1 2 2 3 3 4 4 5
#5 playerB send MSG :Hello 1 2 2 3 3 4 4 5 5			initiator received MSG :Hello 1 2 2 3 3 4 4 5 5
#6 initiator send MSG :Hello 1 2 2 3 3 4 4 5 5 6			playerB received MSG :Hello 1 2 2 3 3 4 4 5 5 6
#6 playerB send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6			initiator received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6
#7 initiator send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7			playerB received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7
#7 playerB send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7			initiator received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7
#8 initiator send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8			playerB received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8
#8 playerB send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8			initiator received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8
#9 initiator send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9			playerB received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9
#9 playerB send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9			initiator received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
#10 initiator send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10			playerB received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10
#10 playerB send MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10 10			initiator received MSG :Hello 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10 10
```
