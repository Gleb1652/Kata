import java.util.Scanner; // импортируем сканер

public class Calculator {
    public static void main(String[] args) { //  в мейн берется сама строка

        Scanner scn = new Scanner(System.in);//создаем объект класса сканер
        String str = scn.nextLine();//берем строку в которой будет записан пример
        System.out.println(calc(str)); // выводим решение на печать

    }

    public static String calc (String str) { // функция в которой проходят вычисления

        RomToArab RomToArab = new RomToArab(); // класс для конвертации чисел
        String[] actions = {"+", "-", "/", "*"}; // массив с действиями



        //Проверяем арифметическое действие:
        int actionIndex = -1;
        for (int i = 0; i < actions.length; i++) {
            if (str.contains(actions[i])) {
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        if (actionIndex == -1) { // проверяем правильно ли введен оператор
            System.out.println("Некорректное выражение");
            System.exit(0);

        }



        String[] data = str.split(" ");
        //Определяем, находятся ли числа в одном формате (оба римские или оба арабские)
        if (RomToArab.isRoman(data[0]) == RomToArab.isRoman(data[2])) {
            int a, b;
            //Определяем, римские ли это числа
            boolean isRoman = RomToArab.isRoman(data[0]);
            if (isRoman) {
                //если римские, то конвертируем их в арабские

                a = RomToArab.romanToInt(data[0]);
                b = RomToArab.romanToInt(data[2]);

            } else {
                //если арабские, конвертируем их из строки в число
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[2]);
            }
            //выполняем с числами арифметическое действие
            int result; // выбираем оператор
            switch (actions[actionIndex]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                default:
                    result = a / b;
                    break;
            }

            if (isRoman) {
                //если числа были римские, возвращаем результат в римском числе
                return (RomToArab.intToRoman(result));
            } else {
                String resultA = Integer.toString(result);// если числа арабские переводим результат в строку и возвращаем его
                return resultA;

            }
        } else {
            String result = ("Разный формат чисел");
            return result;
        }
    }
}
