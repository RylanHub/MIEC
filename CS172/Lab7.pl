sumList([], 0).
sumList([_|], N) :- sumList(XS, M), N is M + X.

lastList([X], X):-!.
lastList([_|T], X):- lastList(T, X).

edge(a,b,1).
edge(a,c,1).
edge(a,d,1).
edge(b,h,1).
edge(b,c,1).
edge(c,e,1).
edge(c,g,1).
edge(h,g,1).
edge(g,f,1).
edge(e,f,1).

connected(X,Y,L) :- edge(X,Y,L) ; edge(Y,X,L).

way(A,B,Path,Len) :-
travel(A,B,[A],Q,Len),
reverse(Q,Path).
travel(A,B,P,[B|P],L) :-
connected(A,B,L).
travel(A,B,Visited,Path,L) :-
connected(A,C,D),
C \== B,
\+member(C,Visited),
travel(C,B,[C|Visited],Path,L1),
L is D+L1.

path(A, B, Path):-
	way(A, B, Path, _).
