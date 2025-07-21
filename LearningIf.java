public class LearningIf {
    public static void main(String[] args) {
        //boolean isMale = false;
        //String name = "Bob";

        /*if(isMale){
            System.out.println("Mr." + name);
        }
        else{
            System.out.println("Mrs. " + name);
        }*/

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;

       /* if(isSeniorCitizen){
            System.out.println("Hello Senior citizen");
        }
        else{
            if(isAnAdult){
                System.out.println("Hello adult");

            }
            else{
                System.out.println("Hello child");
            }
        }*/

        if(isSeniorCitizen){
            System.out.println("Hello Senior citizen");
        }
        else if (isAnAdult) {
            System.out.println("Hello Adult");
        }
        else{
            System.out.println("Hello child");
        }

    }
}
