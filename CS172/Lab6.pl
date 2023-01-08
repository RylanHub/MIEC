second(X,[_,X,_]).

tran(eins,one).
tran(zwei,two).
tran(drei,three).
tran(vier,four).
tran(fuenf,five).
tran(sechs,six).
tran(sieben,seven).
tran(acht,eight).
tran(neun,nine).
listtran([],[]).
listtran([G|GT],[E|ET]):-tran(G,E),listtran(GT,ET).

fib(0, [0]):- !.
fib(1, [1, 0]):- !.
fib(X, [H|[F1|T]]):-
	X1 is X - 1,
	X2 is X - 2,
	fib(X1, [F1|T]),
	fib(X2, [F2|_]),
	H is F1 + F2.

won(x,[x,x,x,_,_,_,_,_,_]).
won(x,[_,_,_,x,x,x,_,_,_]).
won(x,[_,_,_,_,_,_,x,x,x]).
won(x,[x,_,_,x,_,_,x,_,_]).
won(x,[_,x,_,_,x,_,_,x,_]).
won(x,[_,_,x,_,_,x,_,_,x]).
won(x,[x,_,_,_,x,_,_,_,x]).
won(x,[_,_,x,_,x,_,x,_,_]).
