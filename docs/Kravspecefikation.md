# Projekt 1 – Tärningsspelet

## Obligatorisk del – krav för godkänt

### 1. Die

Skapa klassen `Die` som representerar en tärning.

**Instansvariabler:**
- `value` – tärningens nuvarande värde (`int`).
- `numberOfSides` – antal sidor på tärningen (`int`).
- En privat slumpgenerator av typen `Random`.

**Krav:**
- [ ] Antalet sidor ska anges i klassens konstruktor.
- [ ] Skapa en getter för antalet sidor.
- [ ] Skapa en getter för tärningens nuvarande värde.
- [ ] Skapa metoden `public void roll()`.
- [ ] Metoden `roll()` ska använda slumpgeneratorn för att slumpa fram ett heltal mellan 1 och antalet sidor.
- [ ] Importera `Random` från `java.util.Random`.

### 2. Player

Skapa klassen `Player` som representerar en spelare.

**Instansvariabler:**
- Namn (`String`).
- Poäng (`int`).
- En tärning av typen `Die`.

**Krav:**
- [ ] Namnet ska anges i konstruktorn.
- [ ] Skapa en getter för spelarens namn.
- [ ] Skapa en getter för spelarens poäng.
- [ ] Skapa en setter för spelarens poäng.
- [ ] Skapa metoden `rollDice()` som rullar spelarens tärning.
- [ ] Skapa metoden `getDieValue()` som returnerar tärningens aktuella värde.
- [ ] Skapa metoden `increaseScore()` som ökar spelarens poäng med ett.
- [ ] Skapa metoden `addDie(int numberOfSides)` som skapar en ny tärning med angivet antal sidor och tilldelar den till spelaren.

### 3. DiceGame

Skapa klassen `DiceGame` med en `main()`-metod så att programmet kan köras i terminalen.

**Inmatning:**
- [ ] Fråga hur många omgångar som ska spelas.
- [ ] Fråga hur många sidor tärningen ska ha.
- [ ] Fråga vad spelaren heter.
- [ ] Använd ett `Scanner`-objekt för inmatning via terminalen.

**Spelregler:**
- [ ] Spelaren ska gissa ett tal inom tärningens möjliga värden.
- [ ] Tärningen ska rullas efter att spelaren har gissat.
- [ ] Om gissningen stämmer med tärningens värde får spelaren en poäng.
- [ ] Visa tärningens resultat.
- [ ] Visa om spelaren gissade rätt eller fel.
- [ ] Visa spelarens sammanlagda poäng.
- [ ] Spelet ska avslutas efter det valda antalet omgångar.

### 4. Testning och felsökning

- [ ] Testa att spelet fungerar med korrekta inmatningar.
- [ ] Testa felaktiga inmatningar.
- [ ] Dokumentera vad som händer vid felaktig inmatning.
- [ ] Dokumentera eventuella fel som upptäcks.
- [ ] Fullständig hantering av felaktig inmatning krävs inte.

### 5. Git och GitHub

- [ ] Skapa ett gemensamt repository.
- [ ] Båda gruppmedlemmarna ska ha tillgång till repositoryt.
- [ ] Använd Git för versionshantering.
- [ ] Gör flera meningsfulla commits under projektets gång.
- [ ] Git-historiken ska visa projektets utveckling och individuella bidrag.

### 6. Dokumentation

- [ ] Skriv en kort dokumentation av projektet.
- [ ] Beskriv hur spelet fungerar.
- [ ] Beskriv hur programmet körs.
- [ ] Dokumentera testning och eventuella fel.

### 7. Individuell bidragsrapport

- [ ] Beskriv vilka delar du själv har arbetat med.
- [ ] Beskriv vilka klasser och metoder du har bidragit till.
- [ ] Beskriv ditt arbete med testning och felsökning.
- [ ] Beskriv eventuella andra bidrag till projektet.

---

## Extra utmaningar (frivilliga)

Extra utmaning 1 och övriga frivilliga utmaningar krävs inte för godkänt.

---

## Projektstatus

**Projektmedlemmar:**
- 
- 

**Startdatum:**

**Repository:**

**Status:** Pågående