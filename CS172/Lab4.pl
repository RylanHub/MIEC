directlyIn(katarina,olga).
directlyIn(olga,natasha).
directlyIn(natasha,irina).
in(A.B):-directlyIn(A,B).
in(A,B):-directlyIn(A,C),in(C,B).

directTrain(saarbruecken,dudweiler).
directTrain(forbach,saarbruecken).
directTrain(freyming,forbach).
directTrain(stAvold,freyming).
directTrain(fahlquemont,stAvold).
directTrain(metz,fahlquemont).
directTrain(nancy,metz).
travelFromTo(A,B):-directTrain(A,B).
travelFromTo(A,C):-directTrain(A,B),travelFromTo(B,C).

edge(a,b).
edge(a,c).
edge(a,d).
edge(b,c).
edge(b,h).
edge(d,e).
edge(c,e).
edge(h,g).
edge(g,f).
edge(e,f).
connect(X,Y):-edge(X,Y).
connect(X,Y):-edge(Y,X).
path([X,Y]):-!,connect(X,Y).
path([H1|[H2|T]]):-connect(H1,H2),path([H2|T]).

mother(mary,jim).
mother(mary,alice).
mother(mary,dana).
mother(jane,karen).
mother(dana,jack).
mother(dana,rita).
mother(rita,kate).
maternalAncestor(A,B):-mother(A,B).
maternalAncestor(A,C):-mother(A,B),maternalAncestor(B,C).
