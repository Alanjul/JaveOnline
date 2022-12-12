/* this class will go over lesson 10 content access modifiers*/
public class Lesson10Example {
    public static void main (string[] args){
        // this method demostrate the use of private access modifier
        Lesson10 myLesson10 = new Lesson10();
        Lesson10Extended myExtended = new Lesson10Extended();
        lesson10.myDefualtMethod();
        private void mymethod(){
            System.out.println("my method is a private access modifier")

        }// end of private access modifier

        // this method demostrate a use of the default acccess modifier
        void myDefaultMethod(){
            System.out.println("method form the default access modifier");
            System.out.println(" the next statement comes from the private method");

        }
    }
}
