pack([],[]).
pack([X|Xs],[Z|Zs]) :-transfer(X,Xs,Ys,Z),pack(Ys,Zs).
transfer(X,[],[],[X]).
transfer(X,[Y|Ys],[Y|Ys],[X]) :- X \= Y.
transfer(X,[X|Xs],Ys,[X|Zs]) :-transfer(X,Xs,Ys,Zs).
myencode(L1,L2) :- pack(L1,L), transform(L,L2).
transform([],[]).
transform([[X|Xs]|Ys],[[X,N]|Zs]) :- length([X|Xs],N),
transform(Ys,Zs).

mydecode([],[]).
mydecode([(_,0)|Y],R):-mydecode(Y,R).
mydecode([(X,N)|Y],[X|R]):-M is N-1,mydecode([(X,M)|Y],R).

prefixList(_,[],[]).
prefixList(C,[H|T],[CH|Result2]):-prefixList(C,T,Result2),concat(C,H,CH).
gray(1,['0','1']).
gray(N,X):-N>1,P is N-1,gray(P,Q),prefixList('0',Q,A),reverse(Q,R),prefixList('1',R,B),append(A,B,X).
