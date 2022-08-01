object Question2 extends App {

import scala.io.StdIn.readInt
println("Enter the integer");
var integerValue = readInt();

  def check_num(value:Int)=value match{
      case k if k==0 => println("Zero");
      case k if k<0 => println("Negative");
      case k if k>0 => isEven(k);
    }

  def isEven(check_value:Int)= check_value match{

      case x if x%2 ==0 => println("Even");
      case x if x%2 !=0 => println("Odd");
    }

    check_num(integerValue);

}
