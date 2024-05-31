# FileFormatter
# zad. Formatowanie Pliku

# Spis Treści
1. Opis projektu
2. Funkcjonalności
3. Zastosowane klasy
4. Wymagania
5. Instrukcja obsługi


# 1 - Opis projektu
Aplikacja CLI napisana w języku Java polegająca na odczytaniu pliku wejściowego i sformatowaniu tego pliku do pliku wyjściowego.


# 2 - Funkcjonalności
- Dodawanie spacji po przecinku,
- Formatowanie nawiasów okrągłych, tak aby spacja była przed i po nawiasie,
- Formatowanie nawiasów kwadratowych, tak aby spacje były dodawane wewnątrz nawiasów,
- Formatowanie operatorów, tak aby spacje były dodawane przed i po operatorach matematycznych, logicznych oraz bitowych.
- Formatowanie nawiasów klamrowych, tak aby były one jedynymi znakami w linii,
- Kończenie linii średnikami - chyba, że jest otoczony nawiasami okrągłymi,
- Zmiana tabulatorów na spacje, tak aby tabulator na początku linii zamieniany był na cztery spacje,
- Usuwanie podwójnych spacji, poza początkiem linii,
- Indencja, tak aby otwarcie nawiasu klamrowego zwiększało poziom wcięcia o jeden, a zamknięcie zmniejszało.

# 3 - Zastosowane klasy
1. import java.io.BufferedReader - klasa używana do odczytywania tekstu z pliku wejściowego.
2. import java.io.BufferedWriter - klasa używana do zapisywania tekstu do pliku wejściowego.
3. import java.io.FileReader - klasa używana do odczytywania strumieni znaków z pliku wejściowego. Jest odpowiedzialna za otwieranie pliku do odczytu i przekazywania zawartości do BufferedReader.
4. import java.io.FileWriter - klasa używana do zapisania strumieni znaków do pliku wyjściowego. Jest odpowiedzialna za otwieranie pliku do zapisu i przekazywania zawartości do BufferedWriter.
5. imprt java.io.IOException - klasa uzywana do przechwytywania i obsługi wyjątków, które mogą wystąpić podczas operacji wejścia/wyjścia.

# 4 - Wymagania
Java Development Kit (JDK)

# 5 - Instrukcja obsługi
1. Skomplować plik źródłowy 'javac FileFormatter.java'.
2. W pliku 'inputFile.txt' wpisać tekst, który chcemy sformatować (w dołączonym pliku jest już przykładowy tekst).
3. W terminalu wpisać 'java (przeciągnięta ścieżka skompliowanego pliku FileFormatter.java) (przeciągnięta ścieżka pliku o nazwie 'inputFile.txt') (przeciągnięta ścieżka pliku o nazwie 'outputFile.txt').
4. W pliku 'outputFile.txt' otrzymamy sformatowany tekst.
