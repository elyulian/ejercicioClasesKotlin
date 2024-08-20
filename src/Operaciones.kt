class Operaciones {
   private var n1:Double = 0.0
   private var n2: Double =0.0

   constructor()
   constructor(n1: Double, n2: Double) {
      this.n1 = n1
      this.n2 = n2
   }
   // Getter para n1
   fun getN1(): Double {
      return n1
   }

   // Setter para n1
   fun setN1(value: Double) {
      n1 = value
   }

   // Getter para n2
   fun getN2(): Double {
      return n2
   }

   // Setter para n2
   fun setN2(value: Double) {
      n2 = value
   }

   //Metodo sin parametros y sin retornos
   fun suma(){
      println("la suma es ${this.n1+this.n2}")
   }
   //metodo con parametros sin retorno
   fun resta(n1: Double,n2: Double) {
      var resta:Double
      resta = n1-n2
      println("la resta es: ${resta}")
   }
   //metodo sin parametros con retorno
   fun multiplicacion():Double{
      return this.n1*this.n2
   }
   //metodo con parametros y con retorno
   fun division(n1: Double,n2: Double):Double{
      return n1/n2
   }
   fun cuadrado(n2:Double): Double{
      return Math.pow(n2,2.0)
   }

   override fun toString(): String {
      return "Operaciones(n1=$n1, n2=$n2)"
   }


}
