FROM eclipse-temurin:21
WORKDIR /app

COPY . .

RUN find . -type f -name "*.java" -exec javac {} +

COPY run_all_chapters.sh .

CMD ["bash", "run_all_chapters.sh"]
