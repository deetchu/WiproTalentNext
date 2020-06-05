class Fruits
{    
	char name, taste, size;
        Scanner s= new Scanner(System.in);
  public void eat ( ) 
  {
       Scanner s= new Scanner(System.in);
       System.out.println("enter name of fruit");
       name=nextChar ( ) ;
       System.out.println ("provide the taste of the fruit") ;
       taste=nextChar ( ) ;
       system.out.println (name) ;

       system. out. println (taste) ;  

    }

}
class apple extends fruit
{
  void eat ( )
  {
       System.out.println("Name of the fruit is Apple");
       System.out.println("Taste of the fruit is sweet");
  }  
}
class orange extends fruit
{
   public void eat ( )
  {
       System.out.println("Name of the fruit is orange");
       System.out.println("Taste of the fruit is sour");
  }
}
class main
{
 public static void main(String[] args)
  {
    apple A=new apple();
    A.eat();
    orange O=new orange();
    O.eat();
  }
}