public class Tut16ManyMethodsAndInstances2nd {
    private String girlName;
    public void setName(String name){
        girlName=name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf name was %s", getName());
        //System.out.println("Your first gf's name was "+ getName());
    }
}
