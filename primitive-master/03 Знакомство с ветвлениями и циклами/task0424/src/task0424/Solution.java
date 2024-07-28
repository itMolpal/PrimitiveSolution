package task0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        numberOfAnother(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        int index1 = numbers[0] = 1;
        int index2 = numbers[1] = 2;
        int index3 = numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        if (numbers[0] != numbers[1] && numbers[1] == numbers[2])
            System.out.println(index1);

        else if (numbers[0] == numbers[2] && numbers[0] != numbers[1])
            System.out.println(index2);

        else if (numbers[0] == numbers[1] && numbers[1] != numbers[2])
            System.out.println(index3);

    }

//    static void numberOfAnother(int index1, int index2, int index3) throws IOException {
//        int[] numbers = new int[3];
//        numbers[0] = index1;
//        numbers[1] = index2;
//        numbers[2] = index3;
//
//        int index;
//
//        if (numbers[0] != numbers[1] && numbers[1] == numbers[2]) {
//            index = 1;
//            System.out.println(index);
//        } else if (numbers[0] == numbers[2] && numbers[0] != numbers[1]) {
//            index = 2;
//            System.out.println(index);
//        } else if (numbers[0] == numbers[1] && numbers[1] != numbers[2]) {
//            index = 3;
//            System.out.println(index);
//        }
//    }

}
