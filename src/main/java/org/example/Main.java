/* Алгоритмы и структуры данных (семинары)
   Урок 3. Структуры данных. Связный список.
   Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

   Обучающийся: ШИТОВ Олег Владимирович, "Разработчик Python", поток 4544, будни, утро.  09.06.2023

   РАЗВОРОТ ОДНОСВЯЗНОГО СПИСКА
*/

package org.example;

public class Main {
    public static void main(String[] args) {
        // создаем список
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        // выводим исходный список
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        // разворачиваем список
        head = reverseList(head);

        // выводим результат
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
