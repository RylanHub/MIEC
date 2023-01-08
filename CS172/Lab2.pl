female(elizabeth) .
female(diana).
female(camilla) .
female(sarah) .
female(kate) .
female(meghan) .
female(eugenie) .
female(beatrice).
female(charlotte) .

male(philip).
male(charlies).
male(andrew).
male(william).
male(harry) .
male(george) .
male(louise) .

married(father,mother).
married(philip,elizabeth).
married(charles,diana).
married(charles,camilla).
married(andrew,sarah).
married(william,kate).
married(harry,meghan).

mother(elizabeth,charlies).
mother(elizabeth,andrew).
mother(diana,william).
mother(diana,harry).
mother(kate,george).
mother(kate,charlotte).
mother(kate,louis).
mother(sarah,eugenie).
mother(sarah,beatrice).

grandmother(X,Y):-mother(Z,Y).



