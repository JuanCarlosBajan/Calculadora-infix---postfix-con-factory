/**Universidad del Valle de Guatemala
 Fecha: 02/02/2021
 Nombre:
 Juan Carlos Bajan: 20109
 Clase CalculadoraJuanBajan
 */

public class CalculadoraJuanBajan implements CalculadoraGeneral{

    private Stack<Integer> db;

    public CalculadoraJuanBajan(){
        db = new StackVector<Integer>();
    }

    /**
     * Funcion Calculo:
     *      Esta disenada con el fin de realizar el proceso de calculo a travez de POSTFIX, esta funcion recibe
     *      una variable de tipo String y devuelve otro String. Verifica que los caracteres del string recibido
     *      sean de tipo numerico o de las operaciones aritmeticas "+,-,*,/". Luego de realizar la verificacion
     *      procede con el calculo y asi hasta terminar con los datos. Puede regresar un valor numerico identificado
     *      como string o puede devolver la palabra "NO FUNCIONA CON ESTA OPERACION" refiriendose a que no cumple
     *      con los requisitos para que se obtenga un valor especifico.
     * */
    public String Calculo(String element) {

        boolean works = true;
        String resp = "";

        if (element != null) {
        for (int i = 0; i < element.length(); i++) {
            char c = element.charAt(i);

            if (Character.isDigit(c)) {
                db.push(c - '0');
            } else if (!Character.isDigit(c) && db.size() > 1 ) {
                int a = db.pop();
                int b = db.pop();



                switch (c) {
                    case '+':
                        db.push(a + b);
                        break;

                    case '-':
                        db.push(b - a);
                        break;

                    case '/':
                        db.push(b / a);
                        break;

                    case '*':
                        db.push(a * b);
                        break;
                }

            } else if (!Character.isDigit(c) && db.size() == 1) {
                works = false;
                resp = "NO FUNCIONA CON ESTA OPERACION";
                db = new StackVector<Integer>();
            }
        }
    }
        if(db.size() == 1 && works == true){
            resp = db.pop().toString();
        } else {
            resp = "NO FUNCIONA CON ESTA OPERACION";
            works = false;
            db = new StackVector<Integer>();
        }
        return resp;
    }
}
