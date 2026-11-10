# **Tärningsspelet |** Projektdokumentation

## **1 |** Projektbeskrivning och syfte

Tärningsspelet är ett terminalbaserat Java-program där spelaren väljer antalet omgångar, tärningens antal sidor och försöker därefter gissa resultatet av varje kast. Rätt gissning ger en poäng. Resultatet och totalpoängen visas efter varje omgång. För att kompilera och köra krävs JDK, instruktioner kring hur detta används finns i projektets README. Projektet är en övning i OOP, användarinmatning, validering, loopar och villkor.

**Spelflöde**: inställningar → gissning → tärningskast → jämförelse → poäng → nästa omgång  
☞ *Stegen från gissning upprepas tills det valda antalet omgångar har spelats därefter avslutas spelet. Högsta möjliga poäng är lika med antalet omgångar. Vid ogiltig inmatning visas ett felmeddelande och spelaren får försöka igen.*

## **2 |** Programstruktur

#### **2.1 |** Klasser och ansvarsområden

Vi delade upp spelet i separata klasser med olika ansvarsområden:

- `Die` ansvarar för tärningen
- `Player` hanterar spelaren och poängen
- `DiceGame` styr spelets flöde
- `InputHandler` sköter inmatning och validering

#### **2.2 |** Viktiga metoder

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

## **3 |** Designbeslut och kodval

Till en början användes `Scanner` direkt i `DiceGame`, vilket innebar att inmatning och spellogiken hanterades i samma klass. Under utvecklingen identifierade vi ett behov att förbättra detta och skapade därför den separata klassen `InputHandler`, för att samla inmatning och validering på ett ställe. Detta följer två viktiga programmeringsprinciper:

- **DRY (Don't Repeat Yourself)**: Samma metod för att läsa och validera heltal (integers) kan återanvändas för antal omgångar, antal tärningssidor och spelarens gissningar.
- **Separation of Concerns**: `InputHandler` ansvarar för inmatning och validering, medan `DiceGame` fokuserar på spellogiken.

Vi använder oss även av konstanter för gränsvärden istället för magic numbers (hårdkodade siffror), detta gör det tydligare vad siffrorna står för samt att man vid ändring bara behöver ändra på ett ställe.

## **4 |** Arbetsprocess och versionshantering
TODO: Användning av Git & GitHub

#### Issues

#### Branches

#### Commits

#### Pull Requests

## **5 |** Testning och felsökning
TODO: Skriv om kontrollering av validering genom att testa olika typer av inmatning (fel typ etc.)

#### **5.1 |** Genomförda tester

#### **5.2 |** Problem och lösningar
TODO: Skriv om input mismatch exceptions, programcrash osv som ledde till att vi implementerade validering i InputHandler

## **6 |** Användning av AI

TODO: Skriv om användning som stöd för att skapa issues, diskutera struktur och lokik. Importance of understanding, granskning och testning istället för assume att det funkar. Dokumentation STRUKTUR.

## **7 |** Kända begränsningar och förbättringsmöjligheter

