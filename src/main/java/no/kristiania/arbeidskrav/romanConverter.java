package no.kristiania.arbeidskrav;

// AS: Oppretter klasse
public class romanConverter {
    //AS: Lager metode for å konvertere fra indo-arabiske tall til romerske tall
    static String toRoman(int number) {
        /* AI: Oppretter variabel "result", av klassen Stringbuilder som er som et array av strings eller karakterer.
        Dette lar oss behandle en string som et array, og vi kan for eksempel hente ut en
        bokstav fra en gitt indexplass */
        StringBuilder result = new StringBuilder();

        // AS: Oppretter variabel "number" som henter inn parametre fra metoden "toRomanDigit".
        // Angir korrekte verdier for de tilfellene der man ikke følger hovedreglen med å øke med I(1).
        number = toRomanDigit(number, result, 1000,"M");
        number = toRomanDigit(number, result, 900,"CM");
        number = toRomanDigit(number, result, 500,"D");
        number = toRomanDigit(number, result, 400,"CD");
        number = toRomanDigit(number, result, 100,"C");
        number = toRomanDigit(number, result, 90,"XC");
        number = toRomanDigit(number, result, 50,"L");
        number = toRomanDigit(number, result, 40,"XL");
        number = toRomanDigit(number, result, 37,"XXXVII");
        number = toRomanDigit(number, result, 18,"XVIII");
        number = toRomanDigit(number, result, 10,"X");
        number = toRomanDigit(number, result, 9,"IX");
        number = toRomanDigit(number, result, 5,"V");
        number = toRomanDigit(number, result, 4,"IV");
        number = toRomanDigit(number, result, 1,"I");

        //AS: returnerer StringBuilder som en String
        return result.toString();
    }
    //AI: Lager metode "toRomanDigit" og deklarerer parametrene number, result, digitValue og digitSymbol.
    private static int toRomanDigit(int number, StringBuilder result, int digitValue, String digitSymbol) {
        /*AI: Lager en while-løkke som sjekker om variabelen number inneholder tall som er større eller
        det samme som parameteretverdien i digitValue. Dersom disse betingelsene stemmer legges digitsymbol inn i
        Stringbuilderen "result"*/
        while (number >= digitValue){
            result.append(digitSymbol);
         //AI: number = number - digitvalue
            number -= digitValue;
        }
        return number;
    }
}
