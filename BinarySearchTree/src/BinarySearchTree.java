import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean insert(int data){
        Node newNode = new Node(data);

//        if(newNode==null){
//            return false;
//        }
        //check whether tree is empty
        if(root==null){
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true){
            //if data is equal to root then return false
            if(data==temp.getData()){
                return false;
            }
            //if data < parent data
            if(data<temp.getData()){
                //check whether left node is present or not
                if(temp.getLeft()==null) {
                    //if leftNode is null then set newNode to left node
                    temp.setLeft(newNode);
                    return true;
                }
                //if left node is present then traverse to left node
                temp=temp.getLeft();
            }else{
                //check whether right node is present or not
                if(temp.getRight()==null){
                    //if right node is null then assign right node to newNode
                    temp.setRight(newNode);
                    return true;
                }
                //if right  node is present then traverse to right node
                temp=temp.getRight();
            }
        }
    }

    public void preOrder(){
        Node temp=root;
        Stack<Node> s1=new Stack<>();
        System.out.print("Preorder: ");
        while(temp!=null|| !(s1.empty())){

            while(temp!=null){
                System.out.print(temp.getData()+" ");
                s1.push(temp);
                temp=temp.getLeft();
            }
            temp=s1.pop().getRight();
        }
        System.out.println();
    }

    public void inOrder(){
        Node temp=root;
        Stack<Node> stack=new Stack<>();
        System.out.print("Inorder: ");
        while(temp!=null||!stack.empty()){
            while(temp!=null){
                    stack.push(temp);
                    temp=temp.getLeft();
            }
            temp=stack.pop();
            System.out.print(temp.getData()+" ");
            temp=temp.getRight();
        }
        System.out.println();
    }

}
