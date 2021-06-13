
SOURCES_BASE = src/main/johanj/mal/readline.java src/main/java/mal/types.java \
               src/main/johanj/mal/reader.java src/main/java/mal/printer.java
SOURCES_LISP = src/main/johanj/mal/env.java src/main/java/mal/core.java \
               src/main/johanj/mal/stepA_mal.java
SOURCES = $(SOURCES_BASE) $(SOURCES_LISP)

all:
	mvn install

dist: mal.jar mal

mal.jar: target/classes/mal/stepA_mal.class
	mvn assembly:assembly
	cp target/mal-0.0.1.jar $@

SHELL := bash
mal: mal.jar
	cat <(echo -e '#!/bin/sh\nexec java -jar "$$0" "$$@"') mal.jar > $@
	chmod +x mal

src/main/mal/%.java:
	mvn install

target/classes/mal/step%.class: src/main/java/mal/step%.java ${SOURCES}
	mvn install

clean:
	mvn clean
	rm -f mal.jar mal
