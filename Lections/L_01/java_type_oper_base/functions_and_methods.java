package GB_Java_API_base.GB_Yava_base.Lections.L_01.java_type_oper_base;

// Функции и методы — это технически одно и то же.
//      Функции могут не принадлежать классам,
//      а методы принадлежат.

//В java все функции являются методами.

// Виды
// Описание //Вызов //Возвращаемое значение //Рекурсия

public class functions_and_methods { //обязательно для функции класс
    // ОБАРТИ ВНИМАНИЕ не в main
    static void sayHi(){ //вспоминаем void функция ничего не возвращающая
        System.out.println("hi!"); // не принимает не возвращает (только печатает)
    }

    static int sum(int a, int b){  // int в функции означает какой тип данных она будет возвращать
        return a + b;           // принимает int и возвращает int
    }

    // рекурсия
    static double factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }

    // и уже соответсвенно в main мы прописываем вызов функций
    public static void main(String[] args) {
        sayHi(); //hi!
        System.out.println(sum(1, 3)); //4
        System.out.println(factorial(5)); //120.0
    }
}
