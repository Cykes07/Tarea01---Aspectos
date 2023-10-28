package Sistema;

import java.awt.Color;

public aspect AObserver {
	String ColorAnterior;
	
	pointcut observer() : execution(public void Sistema.Sistema.update(..));

	before() : observer(){
		Sistema sistema = (Sistema) thisJoinPoint.getThis(); 
		ColorAnterior = TransformarColorAString(sistema.getColor());
	}
	
	after() : observer(){
		Sistema sist = (Sistema) thisJoinPoint.getThis();
		Color actualColor = sist.getColor();

		if(!ColorAnterior.equals(TransformarColorAString(actualColor))) {						
			System.out.println("El color cambio a " + TransformarColorAString(actualColor));
		}else {						
			System.out.println("No se ha cambiado el color");
		}		
	}
	
	public String TransformarColorAString(Color color) {
		String StringColor = "";
		if(color.equals(new Color(238,238,238))){
			StringColor = "Gris";
		}
		if(color.equals(new Color(255,0,0))){
			StringColor = "Rojo";
		}
		if(color.equals(new Color(0,0,255))){
			StringColor = "Azul";
		}
		if(color.equals(new Color(0,255,0))){
			StringColor = "Verde";
		}
		return StringColor;
	}
}
