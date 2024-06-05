FROM gradle:8.7-jdk21
LABEL authors="egolgovskikh"

WORKDIR /app

RUN gradle installDist

CMD ./build/install/app/bin/app