object bala{
    def main(args:Array[String]){
    var ch:Char=0;
    var num1:Int=0;
    var num2:Int=0;
    var result:Int=0

    println(" chal operation bata: ")
    ch=scala.io.StdIn.readChar()

    print("ab tu num1 bata: ")
    num1=scala.io.StdIn.readInt()

    print("aur ab num2 bata: ")
    num2=scala.io.StdIn.readInt()

    ch match{
        case '+'=> result=num1+num2
        case '-'=> result=num1-num2
        case '*'=> result=num1*num2
        case '/'=> result=num1/num2
        case '_'=>println("acche se dal be")
    }

    println("kare lavdya ghe result ani ghal gandit: "+result)
}
    }
    
