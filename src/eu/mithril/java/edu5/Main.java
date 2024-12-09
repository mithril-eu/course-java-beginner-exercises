package eu.mithril.java.edu5;

/*
 * Koraci:
 *
 * 1. Implementacija konstruktora
 *    - Validirati ime vlasnika (nije null ili prazno)
 *    - Validirati početno stanje (nije negativno)
 *    - Inicijalizirati račun kao aktivan
 *
 * 2. Getter metode
 *    - getBalance() - prikazuje trenutno stanje
 *    - getAccountHolder() - prikazuje vlasnika računa
 *    - isActive() - prikazuje status računa
 *
 * 3. Metoda za depozit
 *    - Validirati da je iznos pozitivan
 *    - Provjeriti ograničenje maksimalnog depozita
 *    - Provjeriti je li račun aktivan
 *    - Ažurirati stanje ako sve provjere prođu
 *
 * 4. Metoda za podizanje novca
 *    - Validirati da je iznos pozitivan
 *    - Provjeriti ograničenje maksimalnog podizanja
 *    - Provjeriti ima li dovoljno sredstava
 *    - Provjeriti je li račun aktivan
 *    - Ažurirati stanje ako sve provjere prođu
 *
 * 5. Upravljanje računom
 *    - Implementirati deaktivaciju koja sprječava daljnje transakcije
 *    - Osigurati da sve promjene stanja održavaju konzistentnost
 *
 * Testni slučajevi za implementaciju:
 * 1. Kreirati račun s valjanim i nevaljanim početnim vrijednostima
 * 2. Pokušati depozite s:
 *    - Negativnim iznosima
 *    - Nula iznosima
 *    - Iznosima koji prelaze maksimum
 *    - Valjanim iznosima
 * 3. Pokušati podizanja s:
 *    - Negativnim iznosima
 *    - Nula iznosima
 *    - Iznosima koji prelaze stanje
 *    - Iznosima koji prelaze dnevno ograničenje
 *    - Valjanim iznosima
 * 4. Testirati deaktivaciju računa:
 *    - Pokušati operacije na neaktivnom računu
 *    - Provjeriti da stanje ostaje nepromijenjeno
 */

public class Main {
}
