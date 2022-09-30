package medium;

import java.util.LinkedList;
import java.util.Scanner;


// 简单使用了链表
public class TestLinkedList {
    public static void main(String[] args) {
        int result = 0;
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        System.out.println("============在链表头部添加============");
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            int m = s.nextInt();
            linkedList.addFirst(m);
            System.out.println(linkedList);
        }

        // 获取倒叙链表的值
        for (int j = linkedList.size() - 1;j >= 0;j--){
            result = (int) (result + (Math.pow(10,j))*(linkedList.get(j)));
        }
        System.out.println(result);

    }
}
