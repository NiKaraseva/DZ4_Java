import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ex_01();     // Вывод задачи №1

        ex_02();

//        ex_03();     // Вывод задачи №3


    }
    static void ex_01(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(3);
        System.out.println("Изначальный список: " + list);

        LinkedList<Integer> reverse = new LinkedList<>();
        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            reverse.add(list.get(i));
        }
        System.out.println("Перевёрнутый список" + reverse);
        }


    static void ex_02() {

    MyQueue queue = new MyQueue();

        System.out.println(queue.empty());
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(0);
        System.out.println(queue.empty());
        System.out.println(queue);

        System.out.println();
        queue.dequeue();
        System.out.println(queue);

        System.out.println();
        queue.enqueue(15);
        System.out.println(queue.first());
        System.out.println(queue);

    }


    static void ex_03(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(3);
        System.out.println("Список: " + list);

        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            sum += item;
        }
        System.out.println("Сумма элементов списка: " + sum);

    }

}





