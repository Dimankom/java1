package Lesson1;

public class Homework1 {
    //    Добавил еще коммент и делаю Commit
    /*1.Создать пустой проект в IntelliJIDEA и прописать метод Lesson1.main().*/
    public static void main(String[] args) {
        /*2. Создать переменные всех пройденных типов данных и инициализировать их значения.*/
        byte byteX = 127; // это максимальное число! и в минус до -128 возможно
        short shortX = 20; // 32767 - предел в положит. сторону
        int intX = (int) 3e9; // предел - два мильярда
        long longX = 3000000L; // предел - 1е18
// Вещественные
        float floatX = 2.18f; // Дробные числа. Применяется литерал
        double doubleX = 5.555; // Литерала для дабл не применяется
        System.out.println(1 / 3d);
        System.out.println(1 / 3f); // точность меняется после 9 знака
        boolean booleanX = true; // два вариант : правда, ложь
        char charX = 'x';  // в одинарных литералах. Один символ!!!

        boolean result = isRangeSum(17, 8); // можно подставить любые цифры
        System.out.println(result);

    }

    /*3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
          где a, b, c, d – аргументы этого метода, имеющие тип float.*/
    public static float sum(float a, float b, float c, float d) {
        float z = a * (b + (c / d));
        System.out.println(z);
        return z;
    }

    /*4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
        пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean isRangeSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10) {
            return sum <= 20;
        } else {
            return false;
        }
    }

    /*5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем
положительным числом.*/
    public static void isDigit(int digit) {
        if (digit >= 0) {
            System.out.println("Число" + digit + "является положительным");
        } else {
            System.out.println("Число" + digit + "является отрицательным");
        }

    }

    /*6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     если число отрицательное, и вернуть false если положительное.*/
    public static boolean isDigitTrueFalse(int isDigit2) {
        return isDigit2 >= 0;

    }

    /* 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    public static void helloName(String name) {
        System.out.println("Привет" + name + "!");
    }


}
