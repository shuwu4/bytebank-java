package proyecto_bytebank;

public class test_referencia {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.Saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.Saldo=100;
		System.out.println(segundaCuenta.Saldo);
		System.out.println(primeraCuenta.Saldo);
		
		segundaCuenta.Saldo +=400;
		System.out.println(segundaCuenta);
		System.out.println(primeraCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}
		
	}
}
