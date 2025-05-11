# Repository

Her lagrer du alt logikk som skal til databasen din og alt som har med databehandling å gjøre. Det er hovedsakelig snakk
om å hente ting fra databasen din


---

## Hvordan håndere databaser:

- Ta i bruk jdbc template, for å unngå sql innjections
- Husk å ha riktig datatype for hver oppgave
- Du pusher **ALDRI** database detaljene dine til github
- Du lagrer credential og database tilkobling i ``application.properities``

## Dependencies for database som skal i ```pom.xml```

### jdbc:

```
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        
```

### postgres driver:

```
<dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
```