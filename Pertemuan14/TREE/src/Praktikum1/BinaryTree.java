/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author HP
 */
public class BinaryTree {
    Node root;
    int size = 0;
    
    public void jumlahLeaf(Node node1){
        if (node1 == null){
            return;
        }
        if (node1.left == null && node1.right == null){
            size++;
            return;
        }
        if (node1.left != null){
            jumlahLeaf(node1.left);
        }
        if (node1.right != null){
            jumlahLeaf(node1.right);
        }
    }
    
    public BinaryTree(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        }else{
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data > current.data){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                } else{
                    break;
                }
            }
        }
    }
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current!=null){
            if(current.data == data){
                hasil = true;
                break;
            }else if (data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node node){
        if (node!= null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
            while(successor.left!=null){
            successorParent = successor;
            successor = successor.left;
            }
            if (successor!=del.right) {
                successorParent.left = successor.right;
                successor.right=del.right;
            }
    return successor;
}
    void delete (int data){
        if(isEmpty()){
            System.out.println("masih kosong");return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
            else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
            if(current == null){
                System.out.println("data tidak ditemukan"); return;
            }else{
                if(current.left == null && current.right == null){
                    if(current == root){
                        root = null; //proses penghapusan
                    } else{
                        if(isLeftChild){
                            parent.left = null;
                        }else{
                            parent.right = null;
                        }
                    }
                }else if(current.left == null){
                    if(current== root){
                        root = current.right;
                    }else{
                        if(isLeftChild){
                             parent.left = current.right;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else if(current.right == null){//if there is 1 child (left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else{//if there is 2 childs
                Node successor = getSuccessor(current);
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = successor;   
                    }else{
                        parent.right =successor;
                    }
                    successor.left = current.left;
                        }
                    }
                }
            }
        }
    void insert(int data){
        root = addRecursive(root, data);
    }
    Node addRecursive(Node root, int data){
       if (root == null){
           root = new Node(data);
           return root;
       }
       if (data < root.data){
           root.left = addRecursive(root.left, data);
       }else if (data > root.data){
           root.right = addRecursive(root.right, data);
       }
       return root; 
    }
    public int findMin(Node node1){
        if (node1 == null){
            return Integer.MAX_VALUE;
        }
        int minimal = node1.data;
        int left = findMin(node1.left);
        int right = findMin(node1.right);
        if (left < minimal){
            minimal = left;
        }
        if (right < minimal){
            minimal = right;
        }
        return minimal;
    }
    public int findMax(Node node1){
       if (node1 == null){
            return Integer.MIN_VALUE;
        }
        int maximum = node1.data;
        int left = findMax(node1.left);
        int right = findMax(node1.right);
        if (left > maximum){
            maximum = left;
        }
        if (right > maximum){
            maximum = right;
        }
        return maximum;
    }
    public void dataLeaf(Node node1){
        if (node1 == null){
            return;
        }
        if (node1.left == null && node1.right == null){
            System.out.print(node1.data + " ");
            return;
        }
        if (node1.left != null){
            dataLeaf(node1.left);
        }
        if (node1.right != null) {
            dataLeaf(node1.right);
        }
        
    }
    }
    

