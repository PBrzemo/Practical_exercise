public class Main {
}



/*
napisanie programu bez GUI, który będzie miał funkcjonalności opisane poniżej.
Jest to przegląd kilku podstawowych modułów Javy - postaraj się nie korzystać z żadnych bibliotek.
Kod wyślij mailem lub wrzuć na jakieś publiczne repozytorium i podrzuć link.
Datę ustalmy sobie na czwartek za tydzień, czyli 04.01.2018r.

1.
- poprosi użytkownika o podanie adresu URL do obrazka
- przy pomocy klasy napisanej przy użyciu wzorca Singleton odpowiedzialnej za łączenie z internetem pobierze obrazek
(obsługa https; np. https://go.wroclaw.pl/api/download/img-8c02a62f2df7bd08570783a82a443ce8/1507736586094-jpeg.jpg)
- wypisze w konsoli status odpowiedzi serwera
- zapisze go na dysku
- zamknie wszystkie streamy

2.
- przy pomocy wzorca fabryki stwórz obiekty typu Circle, Square i Triangle które rozszerzają superklasę Shape
- zapisz je w kolekcji
- wykorzystaj stream API do odfiltrowania jedynie obiektów typu Circle.
- wykorzystaj interfejs Function do stworzenia funkcji, która przyjmie w argumencie obiekt typu Circle, a zwróci wynik funkcji toString tego obiektu

3.
- stwórz prostą klasę szyfrującą i odszyfrowującą Stringi jakimś algorytmem symetrycznym
- napisz bezpieczną funkcję generowania hashy z haseł użytkowników

4.
- napisz generyczną klasę abstrakcyjną z metodą getParametrizedType() zwracającą parametryzowany typ klasy konkretnej jako obiekt typu Class (podpowiedź:
abstract class XXX<Y>{
   protected abstract Class<Y> getParametrizedType();
}) - wykorzystaj refleksje

5.
- policz sinusa, cosinusa i zaokrąglij w górę liczbę podaną przez usera - wykorzystaj gotowe funkcje

6.
- wygeneruj 10 losowych liczb z zakresu 0-100

7.
- napisz funkcję iteracyjną wyliczającą n-ty wyraz ciągu fibonacciego
- wywołaj ją w osobnym wątku

8.
- zdefiniuj klasę User z 3 polami (id, firstName, lastName)
- zmodyfikuj ją w taki sposób, aby nie dało się do jegnego HashSetu włożyć dwóch userów o tych samych imionach i nazwiskach
- utwórz do niej Buildera

9.
- wykorzystaj Javadoc do opisania jednej Twojej klasy i jej metod

10.
- zdefinium enuma Season (Summer, Autumn, Spring, Winter)
- zaimplementuj statyczną metodę przyjmującą w argumencie obiekt daty, a zwracający odpowiednią wartość w zależności od faktycznej pory roku tego dnia
- znajdź funkcję zwracającą Set wszystkich możliwych wartości enuma Season
 */