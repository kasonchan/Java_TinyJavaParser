/*
    README.txt
    Programmer: Ka Son Chan KaSonChan@my.unt.edu
    Class: CSCE 3650, Spring 2013
    Due: Mar 20, 2013
    cse01.cse.unt.edu
*/

Instruction to execute the code in cse01 machine:

(1)	Type in command: cup -parser TinyJavaParser -symbols Symbol -expect 12 -nowarn TinyJava.cup
	...
	------- CUP v0.11a beta 20060608 Parser Generation Summary -------
	0 errors and 12 warnings
	52 terminals, 43 non-terminals, and 96 productions declared, 
	producing 203 unique parse states.
	0 terminals declared but not used.
	0 non-terminals declared but not used.
	0 productions never reduced.
	12 conflicts detected (12 expected).
	Code written to "TinyJavaParser.java", and "Symbol.java".
	---------------------------------------------------- (v0.11a beta 20060608)

(2)	Type in command: jflex TinyJava.jflex
	Reading "TinyJava.jflex"
	Constructing NFA : 323 states in NFA
	Converting NFA to DFA : 
	........................................................................................................................................................
	154 states before minimization, 149 states in minimized DFA
	Writing code to "TinyJavaLexer.java"

(3) Type in command: javac -cp .:java-cup-11a-runtime.jar TinyJavaLexer.java

(4) Type in command: javac -cp .:java-cup-11a-runtime.jar TinyJavaPars.java

	The following instructions are for testing:

(5) Type in command: java-cup-11a-runtime.jar TinyJavaPars < Tests/Test1.java

(6) Type in command: java-cup-11a-runtime.jar TinyJavaPars < Tests/Test2.java

(7) Type in command: java-cup-11a-runtime.jar TinyJavaPars < Tests/Test3.java

(8) Type in command: java-cup-11a-runtime.jar TinyJavaPars < Tests/Test4.java

I also include a typescript file to show my coding code.