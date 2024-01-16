package com.zenika.zacademy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Méthode permettant de gérer l'algorithme de Fizzbuzz
     * <ul>
     * <li>« Fizz » à la place du nombre si celui-ci est divisible par 3.</li>
     * <li>« Buzz » à la place du nombre si celui-ci est divisible par 5 et non par 3.</li>
     * <li>« FizzBuzz » à la place du nombre si celui-ci est divisible à la fois par 3 et par 5.</li>
     * <li>sinon afficher le nombre.</li>
     * </ul>
     * @param value
     * @return
     */
    public static String getFizzBuzzValue ( int value) {
        checkIfValueIsBetween1And100(value);

        if ( value % 15 == 0 ) {
            return "FizzBuzz";
        } else if ( value % 5 == 0 ){
            return "Buzz";
        } else if ( value % 3 == 0 ) {
            return "Fizz";
        }

        return String.valueOf(value);
    }

    private static void checkIfValueIsBetween1And100(int value) throws RuntimeException {
        if (value < 1 || value > 100) {
            String exceptionMessage = value < 1 ?
                    "La valeur doit être supérieur à 0 !" :
                    "La valeur doit être inférieur à 101 !";
            throw new RuntimeException(exceptionMessage);
        }
    }

    public static void main(String[] args) {
    getFizzBuzzValue(8);
    getFizzBuzzValue(15);
    }
}