/**
 * this class along with class lesson 10 will demostrate
 * access modifier from lesson 10 slide deck*/
public class Lesson10Extended {
   /* this method will demostrate how to call a default
    from another class in the same package
     */
    public void methodFromAnotherClass(){
        System.out.println("this method is public and from the lesson 10 extended")
        Lesson10 = new Lesson10();
        lesson10.myDefualtMethod();
    }

}
