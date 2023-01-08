fruit(apple).
fruit(orange).
fruit(banana).
fruit(grape).
snack(hamburger).
snack(cheese).

pal(X,_,X).
pal(X,Y,Y,X).
pal(X,Y,_,Y,X).

parentOf(a,h).
parentOf(a,b).
parentOf(h,g).
parentOf(h,i).
parentOf(i,f).
parentOf(i,e).
parentOf(b,c).
parentOf(c,d).
ancestorOf(X,Y):-parentOf(X,Y).
ancestorOf(X,Z):-parentOf(X,Y),ancestorOf(Y,Z).


