interface One{
        void print();
}
interface Two extends One{
        void display();
}
class Three implements Two{
    public void display(){
            System.out.println("This is display");
    }
    public void print(){
        System.out.println("This is print");
    }
}
class test14{
    public static void main(String[] args){
            Three three=new Three();
            three.display();
    }
}