Desciption of the directories:
==============================

* src:      all the source files
* classes:  all the class files
* bin:      the executable Bb
* libs:     directory with external libraries
* examples: some examples of Bb programs
* javadoc:  the doc files produced by javadoc
* doc:      a simple user guide (Bb.pdf)

Installation:
=============

The Makefile contains several commands:

make all     -> creates the program and doc files (recommended)

make compile -> creates the all Bb classes

make exec    -> creates the executable script (bin/Bb)

make clean   -> cleans the directories and keeps the essential files

Execution:
==========

* Set your path too look into the bin directory
* Run "Bb" (you can run "Bb -help" too see the available options)

Licesing:
=========

This distribution contains the libraries antlr3.jar and commons-cli.jar
in the libs directory. These libraries can only be used and distributed
under the conditions specified in their licenses (also included in
the same directory).
