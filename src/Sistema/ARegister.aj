package Sistema;

public aspect ARegister{
	
	before() : execution(* Sistema.Sistema.*(..)){
		String metodo = thisJoinPointStaticPart.getSignature().getName();
		System.out.println("El método ejecutado en Sistema es: " + metodo);
	}
}