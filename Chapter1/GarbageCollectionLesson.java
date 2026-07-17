package chapter1;

public class GarbageCollectionLesson {

   public static void main(String[] args) {
       AnObject obj1 = new AnObject();
       AnObject obj2 = new AnObject();
       AnObject obj3 = obj1;
       obj1 = null;
       obj1 = new AnObject();
       obj2 = obj3;
       obj3 = obj1;
   }
}

class AnObject{
  String name;
  int code;

}