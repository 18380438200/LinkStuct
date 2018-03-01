package com.example.linkstuct;

import android.util.Log;

/**
 * Created by libo on 2018/2/28.
 */

public class MyLink<E> {
    //头节点
    private Node head;
    //尾部节点
    private Node tail;
    //临时操作节点
    private Node temp;
    private int length;

    public MyLink(){
        //构造方法创建头节点，并将尾节点也指向头
        head = new Node();
        tail = head;
        //初始化长度为0
        length = 0;
    }

    public int getLength(){
        return length;
    }

    /**
     * 遍历链表
     */
    public void traverse(){
        temp = head;
        if(head != null){
            Log.i("minfo",head.data + "");
        }
        while (temp.next != null){
            Log.i("minfo",temp.next.data + "");
            //当前节点temp往后移动
            tail = tail.next;
        }
    }

    /**
     * 清除链表数据
     */
    public void clear(){
        while (head.next != null){
            head.next = head.next.next;
        }
        //尾节点指向头节点
        tail = head;
        temp = null;
        length = 0;
    }

    /**
     * 从尾部添加节点
     */
    public void addNode(E data){
        temp = new Node(data);
        tail.next = temp;
        tail = temp;
        length++;
    }

    /**
     * 从指定位置插入元素
     * @param position
     * @param data
     */
    public void insertAsPos(int position,E data){
        if(position >= 0 && position <= length){
            temp = moveToPos(position);
            Node insertNode = new Node(data);
            insertNode.next = temp.next;
            temp.next = insertNode;
            length ++;
        }else{
            System.out.println("插入失败，位置不合法");
        }
    }

    public void delAsPos(int position){
        if(position >= 0 && position <= length){
            temp = moveToPos(position);
            //删除temp下一个
            Node delNode = temp.next;
            //让temp的一下元素指向往后移一个
            temp.next = delNode.next;
            length--;
        }else{
            System.out.println("删除失败，位置不合法");
        }
    }

    /**
     * 移动指针从头到指定位置
     */
    private Node moveToPos(int position){
        if(position >= 0 && position <= length){
            temp = head;
            for(int i=0;i<position;i++){
                if(temp != null){
                    temp = temp.next;
                }
            }
        }
        return temp;
    }

}