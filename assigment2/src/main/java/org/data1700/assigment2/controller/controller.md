En kontroller er den som router hva som skal hva  på din nettside. Dette er en typisk "less is more" plass


## Annoteringer: 
Det er viktig å ha riktig annotering for jobben, disse bestemmer hva som gjør hva. Annoteringer starter med @, og plasseres enten forran klasse eller metode vanligvis.

vanlige annoteringer i spring boot: 

 annotering         | hva de gjør                                                                                   |
|--------------------|-----------------------------------------------------------------------------------------------|
| `@PostConstruct`   | gjør noe spesielt under laging av applikasjonen                                               |
| `@RestController`  | initaliserer en rest controller til applikasjonen din                                         |
| `@RequestMapping`  | Sier hvor en request skal peke til i en controller. Kan sees på som en "peker" på hvor ting e |
| `@Getmapping`      | GET http kall                                                                                 |
| `@Postmapping`     | POST http kall                                                                                |
| `@Putmapping`      | PUT http kall                                                                                 |
| `@Deletemapping`   | DELETE http kall                                                                              |


---
## Dependencies som kan være fint her: 

### Kryptering
```xml
 <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-core</artifactId>
        </dependency>
```
### validering
```xml
 <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```
---
## Valdiering

gjør standard if tester, og ta i bruk regexp og validation i L15

[regexp cheat sheet](https://cheatography.com/davechild/cheat-sheets/regular-expressions/)
