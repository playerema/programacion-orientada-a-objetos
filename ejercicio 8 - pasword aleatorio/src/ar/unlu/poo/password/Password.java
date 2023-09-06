package ar.unlu.poo.password;

import java.util.Random;

public class Password {
    public static long contador = 0;
    private int longitud;
    private String contraseña;
    private String caracteresAleatorios(int n){
        String characteres ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        long semilla = System.currentTimeMillis() + contador++;
        Random random = new Random(semilla);
        StringBuilder resultado = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(characteres.length());
            char randomChar = characteres.charAt(randomIndex);
            resultado.append(randomChar);
        }

        return resultado.toString();
    }

    public Password(int n){
        longitud = n;
        contraseña=this.caracteresAleatorios(longitud);
    };
    public Password() {
        longitud = 8;
        contraseña=this.caracteresAleatorios(longitud);
    };

    public boolean generar() {
        boolean continuar = true;
        boolean fortificado = false;

        do {
            contraseña = this.caracteresAleatorios(longitud);
            if(longitud<6){continuar=false;}

            if(this.fuerte()==true){
                continuar=false;
            }

        } while (continuar == true);

        return fortificado;
    }

    public boolean fuerte(){
        int mayus=0;
        int minus=0;
        int num=0;

        for(int i=0;i<contraseña.length();i++){
            char ch=contraseña.charAt(i);

            if(Character.isDigit(ch)){
                num++;
            } else if (Character.isLowerCase(ch)) {
                minus++;
            } else if (Character.isUpperCase(ch)) {
                mayus++;
            }
        }

        if((mayus > 2) && (minus > 1) && (num>=2)){
            return true;
        }else{
            return false;
        }
    }

    public void setlongitud(int n){
        longitud=n;
        contraseña=this.caracteresAleatorios(longitud);
    }

    public int getlongitud(){return longitud;};

    public String getContraseña(){return contraseña;};


}


