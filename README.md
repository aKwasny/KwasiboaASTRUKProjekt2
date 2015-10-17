# KwasiboaASTRUKProjekt2
Do zrobienia jest kalkulator w odwrotnej notacji PL
MUSI !!! wykorzystywać stos wykonany na uprzednich zajęciach.

MUSI przechwytywać wyjątek PUSTY STOS i w przypadku jego wyłapania wypisywać:
ZLA SKLADNIA ZA MAO LICZB ZA DUZO OPERACJI

Parametremwywołania kalkulatora będzie ciąg napisów:

2 4 x 3 + 1 -

Co daje ( (2 * 4) + 3) - 1
Co należy zrobić:

Algorytm jest bardzo prosty przy wykorzystaniu stosu.
- Czytamy napis
- Jeżeli napis jest jedną z operacji + - x : to:
a) ze stosu pobieramy dwie liczby a i b i wykonujemy na nich operację
a.1) wynik operacji wrzucamy na stos
b) w przeciwnym razie przeczytany napis konwertujemy na liczbę i wrzucamy na stos

Program:

1. Skorzystać z wykonanego STOSU
2. Wykonać klasę ONP, która będzie miała metodę oblicz:
try {
for(int i = 0; i< argc; ++i) // pętla po liscie arg
Jeśli jest nais IN (x + - :) pobierz dwie liczby ze stosu, wykonaj oper. WYNIK NA STOS
ELSE: konwertuj napis na liczbę i wrzuć na stos
} catch wyjątek PUSTY STOS

Sprawozdanie do soboty do godziny 23.59 (17.10.2015)
