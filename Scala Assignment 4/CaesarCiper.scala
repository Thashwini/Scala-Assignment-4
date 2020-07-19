import io.StdIn._
object CaesarCiper extends App{

  var alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

  val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

  var s=readLine("Enter Text: ")
  print("Key: ")
  var key=readInt()

  val ciper=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val ct=ciper(E,s,key,alphabet);

  val pt=ciper(D,ct,key,alphabet);

  println("Entered Text: "+s);
  println("Encrypted Text: "+ct);
  println("Decrypted Text: "+pt);

}












