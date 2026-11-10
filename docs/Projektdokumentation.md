# **Tärningsspelet |** Projektdokumentation

## **1 |** Projektbeskrivning och syfte

Ett terminalbaserat tärningsspel skrivet i Java. Spelaren väljer antalet omgångar och tärningens antal sidor och försöker därefter gissa resultatet av varje kast.

Projektet är en övning i OOP, användarinmatning, validering, loopar och villkor.

---  

## **2 |** Spelregler och spelflöde

**Spelflöde**: inställningar → gissning → tärningskast → jämförelse → poäng → nästa omgång  
☞ *Stegen från gissning upprepas tills det valda antalet omgångar har spelats därefter avslutas spelet.*

1. Välj antal omgångar: 1-100.
2. Välj antal sidor på tärningen: 2-20.
3. Ange ett spelnamn. Namnet får inte vara tomt eller enbart bestå av siffror.
4. Gissa ett heltal mellan 1 och tärningens antal sidor inför varje kast.
5. Tärningen kastas efter gissningen. En rätt gissning ger 1 poäng, en felaktig gissning ger inga poäng.
6. Tärningens resultat, om gissningen var rätt eller ej, samt spelarens totala poäng visas efter varje kast.

Högsta möjliga poäng är lika med antalet omgångar. Vid ogiltig inmatning visas ett felmeddelande och spelaren får försöka igen.

---  

## **3 |** Installation och körning

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

Följ instruktionerna i terminalen. Spelets meddelanden och instruktioner är på engelska.

---  

## **4 |** Programstruktur

#### **4.1 |** Klasser och ansvarsområden

Vi delade upp spelet i separata klasser med olika ansvarsområden:

- `Die` ansvarar för tärningen
- `Player` hanterar spelaren och poängen
- `DiceGame` styr spelets flöde
- `InputHandler` sköter inmatning och validering


#### **4.2 |** Viktiga metoder

- **`main(String[] args)`** i klassen `DiceGame`
    - Ansvarar för att starta spelet och styra inställningar, omgångar och jämförelsen mellan gissning och resultat.
- **`readInt(String prompt, int min, int max)`** i klassen `InputHandler`
    - Läser heltal och kontrollerar att det ligger inom tillåtet intervall. Frågar igen vid ogiltig inmatning.
- **`readName(String prompt)`** i klassen `InputHandler`
    - Läser spelarens namn och kontrollerar att det inte är tomt eller enbart siffror. Frågar igen vid ogiltig inmatning.
- **`addDie(int numberOfSides)`** i klassen `Player`
    - TODO: lägg till vad den gör (ändra om vi ska använda någon annan metod som exempel)
- **`rollDice()`** i klassen `Player`
    - TODO: lägg till vad den gör (ändra om vi ska använda någon annan metod som exempel)
- **`roll()`** i klassen `Die`
    - TODO: lägg till vad den gör (ändra om vi ska använda någon annan metod som exempel)
- **`increaseScore()`** i klassen `Player`
    - TODO: lägg till vad den gör (ändra om vi ska använda någon annan metod som exempel)

Klasserna innehåller även getters och en setter för att läsa och uppdatera privata fält, exempelvis spelarens namn och poäng samt tärningens värde. Dessa beskrivs inte individuellt ovan men är viktiga för att andra klasser ska kunna komma åt informationen utan att fälten behöver vara publika.

---  

## **5 |** Designbeslut och kodval


Till en början användes `Scanner` direkt i `DiceGame`, vilket innebar att inmatning och spellogiken hanterades i samma klass. Under utvecklingen identifierade vi ett behov att förbättra detta och skapade därför den separata klassen `InputHandler`, för att samla inmatning och validering på ett ställe.

Detta följer två viktiga programmeringsprinciper:

- **DRY (Don't Repeat Yourself)**: Samma metod för att läsa och validera heltal (integers) kan återanvändas för antal omgångar, antal tärningssidor och spelarens gissningar.
- **Separation of Concerns**: `InputHandler` ansvarar för inmatning och validering, medan `DiceGame` fokuserar på spellogiken.

TODO: Skriv om användning av konstanter för gränsvärden ist för magic numbers - tydlig beskrivning om gränserna + lättare att ändra

---  

## **6 |** Arbetsprocess och versionshantering
TODO: Användning av Git & GitHub

#### Issues

#### Branches

#### Commits

#### Pull Requests

---  

## **7 |** Testning och felsökning
TODO: Skriv om kontrollering av validering genom att testa olika typer av inmatning (fel typ etc.)

#### **7.1 |** Genomförda tester

#### **7.2 |** Problem och lösningar
TODO: Skriv om input mismatch exceptions, programcrash osv som ledde till att vi implementerade validering i InputHandler

---  

## **8 |** Användning av AI

TODO: Skriv om användning som stöd för att skapa issues, diskutera struktur och lokik. Importance of understanding, granskning och testning istället för assume att det funkar. Dokumentation STRUKTUR.

---  

## **9 |** Kända begränsningar och förbättringsmöjligheter

