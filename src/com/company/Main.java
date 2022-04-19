package com.company;

import com.company.Exceptions.WrongAnswerException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongAnswerException {
        String correctAnswer = "42";
        boolean isAnswered = false;
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ответ на самый главный вопрос(у вас три попытки):");
        for (int i = 0; i < 3; i++) {
            answer = scanner.nextLine();
            if (answer.equals(correctAnswer)) {
                isAnswered = true;
                break;
            } else System.out.println("Серьёзно? Вы думали, что ответ на САМЫЙ ГЛАВНЫЙ ВОПРОС, это " + answer + "? Попробуйте ещё раз. Это будет попытка №" + (i+2));
        }
        if (isAnswered) {
            System.out.println("Красава!");
        } else throw new WrongAnswerException("World terminate");
    }
}
