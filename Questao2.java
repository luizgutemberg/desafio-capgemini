import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Questao2 {

        public int contaSenha(String senhaUsuario) {

            int count = 0;
    
            Pattern dig = Pattern.compile("(\\d)");
            Pattern letraMaiuscula = Pattern.compile("([A-Z])");
            Pattern letraMinuscula = Pattern.compile("([a-z])");
            Pattern especialChar = Pattern.compile("(\\W)");
    
            Matcher Dig = dig.matcher(senhaUsuario);
            Matcher LetraMaiuscula = letraMaiuscula.matcher(senhaUsuario);
            Matcher LetraMinuscula = letraMinuscula.matcher(senhaUsuario);
            Matcher Especial = especialChar.matcher(senhaUsuario);
    
            if (!Dig.find()) {
                count++;
            }
            if (!LetraMaiuscula.find()) {
                count++;
            }
            if (!LetraMinuscula.find()) {
                count++;
            }
            if (!Especial.find()) {
                count++;
            }
    
            if ((count + senhaUsuario.length()) < 6) {
                count = count + 6 - (count + senhaUsuario.length());
            }
    
            return count;
        }
    
    }
    

