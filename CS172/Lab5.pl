factorial(1,1).
factorial(Result,N) :-N > 0,N1 is N-1,
                     factorial(Result1,N1),
                     Result is Result1*N.

fib(0, 0):- !.
fib(1, 1):- !.
fib(Term, Num):-Num1 is Num - 1,
	Num2 is Num - 2,
	fib(Term1, Num1),
	fib(Term2, Num2),
	Term is Term1 + Term2.

mul(0, 0, _).
mul(0, _, 0).
mul(X, X, 1).
mul(X, 1, X).
mul(Fact, X1, X2):-Fact is X1 * X2.
