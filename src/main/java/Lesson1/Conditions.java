package Lesson1;

class Conditions {

    public static void main(String[] args) {
//        int conteiner = 1;
//        int [][] table = new int[3][4];
//        for (int i = 0; i <3; i++) {
//            for (int j = 0; j <4; j++) {
//                table [i][j] = conteiner;
//                System.out.print(table[i][j]+ " ");
//                conteiner++;
//            }
//            System.out.println();
//        }

//        System.out.println("Введите операцию:");
//        System.out.println("1. Сложение");
//        System.out.println("2. Вычитание");
//        System.out.println("3. Умножение");
//        System.out.println("4. Деление");
//        Scanner scanner = new Scanner(System.in);
//        int operation = scanner.nextInt();
//        System.out.println("Введите первое число");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число");
//        int b = scanner.nextInt();
//        int result;
//        if (operation == 1) {
//            result = a + b;
//        } else if (operation == 2) {
//            result = a - b;
//        } else if (operation == 3) {
//            result = a * b;
//        } else {
//            result = a / b;
//        }
//        System.out.println("Результат = " + result);
//

//        *Тренировака примера из метоички. Урок 2 Циклы*
//        for (int i = 0, j = 10; i <= j; i++, j--) {
//            System.out.println("i+j: " + i + "-" + j);
//      продолжение тренировки
//        int a = 0, b = 10, c = 0;
//        if (a != 0) {
//            System.out.println("а не равно нулю");
//            c = b / a;
//            System.out.print("b/a =" + c);
//        } else {
//            System.out.println("a=0. Делить на 0 нельзя");
//        }

    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}
