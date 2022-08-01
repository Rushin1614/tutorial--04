package Tutorial04

object Question03 extends  App{

  def toUpper(string : String) : String = {
    string.toUpperCase();
  }

  def toLower(string : String) : String ={
    string.toLowerCase();
  }

  def formNames(name : String)(f : String => String) : String = {
    f(name);
  }

  var name1 = "Niroshan";
  var name2 = name1.substring(0,2);
  var name3 = "Kumara";
  var name4 = name3.substring(5);

  println(formNames("Benny")(toUpper(_)));
  println(formNames(name2)(toUpper(_))+"roshan");
  println(formNames("Saman")(toLower(_)));
  println("Kumara"+ formNames(name4)(toUpper(_)));
}
