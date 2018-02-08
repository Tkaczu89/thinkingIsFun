# Algorithms are Fun!

W tym repozytorium będą zadania, które będą wymagały od Was poszukania dodatkowych informacji na różne tematy, niekoniecznie związane z programowaniem.  
Do każdej metody są podane testy jednostkowe sprawdzające poprawność wyniku.

1. PeselUtility
    Klasa udostępniająca metody pomocniczne do pracy z numerami PESEL
    * boolean isValid(String pesel) - zwraca true, jeżeli numer PESEL jest poprawny
    * boolean isMale(String pesel) - zwraca true, jeżeli osoba z danym numerem pesel jest mężczyzną, a false jeżeli kobietą
2. LongSum
    Klasa umożliwiająca dodawanie zmiennych typu Long
    * String sum(Long[] longs) - dodaje liczby w przekazanej tablicy obiektów typu Long, a wynik dodawania zwraca jako String
3. EmailValidator
    Klasa umożliwiająca sprawdzenie poprawności adresu e-mail
    * boolean isValid(String email) - zwraca true, jeżeli adres ma poprawny format, a w przypadku niepoprawnego adresu zwróci false  
    Poprawny adres e-mail będzie pozwalał na umieszczenie w nazwie mały oraz dużych liter, cyfr oraz znaków `-`, `+`, `_` oraz `.`. Domena może zawierać domeny niższego rzędu, a domena globalna musi zawierać minimum 2 znaki.
