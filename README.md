# snakes_ladders_Java
SnakesAndLadders (Java Implementation)

<b> Todo</b> <br>
<b>• Dice</b>
1. produces integer random numbers between 1 and 6
<b>• Player</b>
1. knows his/her name
2. knows how to move him/herself, that is, leave its current square and enter into
another one, a certain number of squares ahead
3. knows the square he/she is at
<b>• Square</b>
1. knows its number or position
2. knows which player is in it, if any (zero or one)
3. therefore, can accept and remove a player from itself (that is, one can ask it to
do that)
4. knows what to do if the square already contains one player and another falls on
it: send him to the first square
5. given a number rolled by the dice, knows how to compute where the player is
going to land on : the square with number equal to present square number +
dice value, provided he does not surpass the last square
6. in this later case, the computation results in staying at the present square
• First square : same as Square plus
1. knows it can have zero, one or more players
2. keeps (add, remove) this set of players
• Last square : same as Square plus
1. knows it’s an special square (but not why), the last one, and therefore can answer
about this
<b>• Ladder/ Snake<b>
1. knows that a player landing on it has to be moved to some square ahead/back
of itself a certain amount of positions (can compute the forwarding position)


<b> Done </b> <br>
Basic Implementation (1 Player, roll a dice, if player= 100, win game)<br>
Game (Implementation and Logic) [Very high] <br>

<br> <b> Instructions</b><br>

Run with javac Main.java and java Main to start a game or use a preferred IDE to compile.

