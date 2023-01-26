class Consonantes {
    public static void main(String[] args) {
        String cadena = "hola soy david nebot Lopez alumno de semipresencial";
        int consonantes = 0;
        for (int x = 0; x < cadena.length(); x++) {
            char letra = cadena.charAt(x);
            if (esConsonante(letra)) {
                consonantes++;
            }
        }
        System.out.printf("La cadena '%s' tiene %d consonantes", cadena, consonantes);
    }

    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
    }
}