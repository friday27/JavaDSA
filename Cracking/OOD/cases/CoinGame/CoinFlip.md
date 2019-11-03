# Coin Flip

[From Object Oriented Design Tutorial](https://www.youtube.com/watch?v=fJW65Wo7IHI&list=PLGLfVvz_LVvS5P7khyR4xDp7T9lCk9PgE&index=1)

### Use Case Description
* Use Case: A player at random offers a prediction of a coin flip. The other player gets the other option. The coin is flipped. The correct guess wins.
* Triggers: A player at random offers a prediction of a coin flip.
* Actors (All the people involved)
    1. A player who makes the prediction
    2. A player that gets the other option
    3. Coin
    4. Goin Game

* Preconditions
    1. 2 players are available
    2. A coin is available

* Goal: One player wins and the other loses

* Not available: Failed conclusion, Extensions (Alternatives)

* Steps of Execution
    1. A player at random is picked to predict the coin flip
    2. The player picked offers a prediction of the coin flip
    3. The other player gets the other coin flip option
    4. The coin is flipped nd the result is provided
    5. A winner and loser is picked
    6. Offer them to try again

### Object Model
![Object Model](attachments/coin_flip_object_model.png)

### Class Diagram
![Class Diagram](attachments/coin_flip_class_diagram.png)
