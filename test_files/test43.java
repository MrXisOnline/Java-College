class Student{
    public void audit(){
        System.out.println("Audit classes");
    }
}
class TeamLeader extends Student{
    public void monitor(){
        System.out.println("Monitors team");
    }
    public void mentor(){
        System.out.println("Mentors team");
    }
}
class SchoolLeader extends TeamLeader{
    public void monitor(){
        System.out.println("Monitors school");
    }
}
class test43 {
    public static void main(String[] args){
        TeamLeader obj = new SchoolLeader();
        obj.audit();
        obj.mentor();
        obj.monitor();
    }
}
