package proyecto_bytebank;

public class CrearCuenta {

	public static void main(String[] args) {
		// I n s t a n c i a s
		
		//Variable             //Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.Saldo= 500;
		
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.Saldo = 500;
		
		System.out.println(primeraCuenta.Saldo);
		System.out.println(segundaCuenta.Saldo);
		System.out.println(primeraCuenta.Agencia);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		//Comprobar xd
		//if(primeraCuenta == segundaCuenta) {
		//	System.out.println("Son el mismo objeto");
		//}
		//else {
		//	System.out.println("Son diferentes");
		//}
		
	}
}
