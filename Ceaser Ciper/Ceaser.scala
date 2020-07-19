object Ceaser{
def main(args : Array[String]):Unit= {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encrypt = (c: Char, key: Int, alp: String) =>{
  val index = alp.indexOf(c.toUpper)
  if (index == -1)
    c
  else
    alp((index + key) % alp.size)
}
  val decrypt = (c: Char, key: Int, alp: String) =>{
    val index = alp.indexOf(c.toUpper)
    if (index == -1)
      c
    else
      {val newKey = ((-1*key)%alp.size) +alp.size
      alp((index + newKey) % alp.size)
  }}

  val cipher =(func:(Char,Int,String)=> Char, pString : String, key:Int , alp:String) =>{
    pString.map(func(_,key,alp))
  }

  val plaintext = "I Love Scala"
  val shiftkey =5

  val encryptedText = cipher(encrypt,plaintext,shiftkey,alphabet)
  println(encryptedText)

  val decryptedText = cipher(decrypt,encryptedText,shiftkey,alphabet)
  println(decryptedText)
}
}