# Tärningsspelet

Ett terminalbaserat tärningsspel skrivet i Java. Spelaren väljer antalet omgångar och tärningens antal sidor och försöker därefter gissa resultatet av varje kast.

Projektet är en övning i OOP, användarinmatning, validering, loopar och villkor.

## Spelregler

1. Välj antal omgångar: 1-100.
2. Välj antal sidor på tärningen: 2-20.
3. Ange ett spelnamn. Namnet får inte vara tomt eller enbart bestå av siffror.
4. Gissa ett heltal mellan 1 och tärningens antal sidor inför varje kast.
5. Tärningen kastas efter gissningen. En rätt gissning ger 1 poäng, en felaktig gissning ger inga poäng.
6. Tärningens resultat, om gissningen var rätt eller ej, samt spelarens totala poäng visas efter varje kast.

Spelet avslutas efter det valda antalet omgångar. Högsta möjliga poäng är lika med antalet omgångar. Vid ogiltig inmatning visas ett felmeddelande och spelaren får försöka igen.


## Kom igång

### Förutsättningar

- Java Development Kit (JDK)
- En terminal
- Projektets fyra Java-filer i samma mapp: `DiceGame.java`, `Die.java`, `Player.java` och `InputHandler.java`.

Kontrollera Java-installation med:

```bash
java -version
javac -version
```


### Kompilera och kör programmet

Ladda ner projektet och öppna en terminal i mappen där Java-filerna ligger.

Kompilera programmet:

```bash
javac DiceGame.java Die.java Player.java InputHandler.java
```

Starta spelet:

```bash
java DiceGame
```

Följ instruktionerna i terminalen.


## Projektstruktur

### DiceGame.java

Innehåller programmets startpunkt, `main()`, och styr spelets flöde:

- inställningar
- omgångar
- gissningar
- jämförelse av resultat
- uppdatering av poäng

### Die.java

Representerar en tärning med ett valt antal sidor. Metoden `roll()` slumpar fram ett värde mellan 1 och antalet sidor med hjälp av `Random`.

### Player.java

Lagrar spelarens namn, poäng och tärning. Har metoder för att tilldela och kasta tärningen, hämta resultatet och öka poängen.

### InputHandler.java

Hanterar användarinmatning med `Scanner`. 

- Metoden `readInt()` kontrollerar att inmatningen är ett heltal (`int`) inom tillåtet intervall.
- Metoden `readName()` kontrollerar spelarens namn (`String`).


## Utvecklare

- Jennie Falemar - [@JenFal93](https://github.com/JenFal93)
- Elin Forssell - [@obymael](https://github.com/obymael)
