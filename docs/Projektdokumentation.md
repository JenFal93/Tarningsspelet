# **Tärningsspelet |** Projektdokumentation

## **1 |** Projektbeskrivning och syfte

---

## **2 |** Spelregler och spelflöde

---

## **3 |** Installation och körning

---

## **4 |** Programstruktur

#### **4.1 |** Klasser och ansvarsområden

Vi delade upp spelet i separata klasser med olika ansvarsområden:

- `Die` ansvarar för tärningen
- `Player` hanterar spelaren och poängen
- `DiceGame` styr spelets flöde
- `InputHandler` sköter inmatning och validering


#### **4.2 |** Viktiga metoder

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

---
