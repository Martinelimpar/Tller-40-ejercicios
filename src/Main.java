import java.util.Locale;
import java.util.Scanner;

public class Main {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.US);

        // PARTE I
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        // PARTE II
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        ejercicio19();
        ejercicio20();
        ejercicio21();
        ejercicio22();
        ejercicio23();
        ejercicio24();
        // PARTE III
        ejercicio25();
        ejercicio26();
        ejercicio27();
        ejercicio28();
        ejercicio29();
        ejercicio30();
        // PARTE IV
        ejercicio31();
        ejercicio32();
        ejercicio33();
        ejercicio34();
        ejercicio35();
        ejercicio36();
        ejercicio37();
        ejercicio38();
        ejercicio39();
        // PROBLEMA FINAL
        problemaFinal();
    }


    // PARTE I

    // 1. Unir dos textos separados por un espacio
    static void ejercicio1() {
        System.out.println("\n--- Ejercicio 1 ---");
        System.out.print("Escribe el primer texto: ");
        String texto1 = scanner.nextLine();
        System.out.print("Escribe el segundo texto: ");
        String texto2 = scanner.nextLine();
        System.out.println(texto1 + " " + texto2);
    }

    // 2. Imprimir Hola y luego el nombre en la misma línea
    static void ejercicio2() {
        System.out.println("\n--- Ejercicio 2 ---");
        String nombre = "Martin"; // pon aquí tu nombre
        System.out.print("Hola "); // print NO salta de línea
        System.out.println(nombre); // println sí salta de línea
    }

    // 3. Cuadrado de un número
    static void ejercicio3() {
        System.out.println("\n--- Ejercicio 3 ---");
        System.out.print("Escribe un número: ");
        int n = scanner.nextInt();
        System.out.println("El cuadrado es: " + (n * n));
    }

    // 4. Suma de dos números
    static void ejercicio4() {
        System.out.println("\n--- Ejercicio 4 ---");
        System.out.print("Primer número: ");
        int a = scanner.nextInt();
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();
        System.out.println("La suma es: " + (a + b));
    }

    // 5. Suma, resta, multiplicación, división y residuo
    static void ejercicio5() {
        System.out.println("\n--- Ejercicio 5 ---");
        System.out.print("Primer número: ");
        int a = scanner.nextInt();
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b == 0) {
            System.out.println("División y residuo: no se puede dividir entre 0");
        } else {
            System.out.println("División: " + ((double) a / b)); // (double) para no perder decimales
            System.out.println("Residuo: " + (a % b));
        }
    }

    // 6. Parte entera y parte decimal de un número
    static void ejercicio6() {
        System.out.println("\n--- Ejercicio 6 ---");
        System.out.print("Escribe un número decimal (con punto): ");
        double numero = scanner.nextDouble();

        int parteEntera = (int) numero;             // (int) corta los decimales
        double parteDecimal = numero - parteEntera; // lo que sobra al quitar la parte entera
        parteDecimal = Math.round(parteDecimal * 1000000) / 1000000.0; // quita errores de precisión

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }

    // 7. Nota final con porcentajes (función calcularPromedio)
    static void ejercicio7() {
        System.out.println("\n--- Ejercicio 7 ---");
        System.out.print("Nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es: " + Math.round(notaFinal * 100) / 100.0);
    }

    static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return n1 * 0.15 + n2 * 0.20 + n3 * 0.15 + n4 * 0.30 + n5 * 0.20;
    }

    // 8. IVA de una venta (función calcularIVA)
    static void ejercicio8() {
        System.out.println("\n--- Ejercicio 8 ---");
        System.out.print("Precio bruto: ");
        double precioBruto = scanner.nextDouble();

        double iva = precioBruto * 0.19;
        double precioConIva = calcularIVA(precioBruto);

        System.out.println("Valor original: " + Math.round(precioBruto * 100) / 100.0);
        System.out.println("Valor del IVA (19%): " + Math.round(iva * 100) / 100.0);
        System.out.println("Valor con IVA incluido: " + Math.round(precioConIva * 100) / 100.0);
    }

    static double calcularIVA(double precioBruto) {
        double iva = precioBruto * 0.19;
        return precioBruto + iva; // devuelve el precio con IVA incluido
    }

    // 9. Área y perímetro de un círculo
    static void ejercicio9() {
        System.out.println("\n--- Ejercicio 9 ---");
        System.out.print("Radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área: " + Math.round(area * 100) / 100.0);
        System.out.println("Perímetro: " + Math.round(perimetro * 100) / 100.0);
    }

    // 10. Área de un hexágono regular
    static void ejercicio10() {
        System.out.println("\n--- Ejercicio 10 ---");
        System.out.print("Longitud del lado del hexágono: ");
        double lado = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) * lado * lado) / 2;
        System.out.println("Área del hexágono: " + Math.round(area * 100) / 100.0);
    }

    // 11. Promedio de n números
    static void ejercicio11() {
        System.out.println("\n--- Ejercicio 11 ---");
        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que 0");
        } else {
            double suma = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Número " + i + ": ");
                suma = suma + scanner.nextDouble();
            }
            double promedio = suma / n;
            System.out.println("El promedio es: " + Math.round(promedio * 100) / 100.0);
        }
    }

    // 12. Distancia entre dos puntos
    static void ejercicio12() {
        System.out.println("\n--- Ejercicio 12 ---");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia es: " + Math.round(distancia * 100) / 100.0);
    }

    // 13. Dígito n -> n, nn, nnn y su suma
    static void ejercicio13() {
        System.out.println("\n--- Ejercicio 13 ---");
        System.out.print("Escribe un dígito (0 a 9): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 9) {
            System.out.println("Eso no es un dígito");
        } else {
            int nn = n * 11;   // 5 * 11 = 55
            int nnn = n * 111; // 5 * 111 = 555
            System.out.println(n);
            System.out.println(nn);
            System.out.println(nnn);
            System.out.println("La suma es: " + (n + nn + nnn));
        }
    }

    // 14. Segundos -> horas:minutos:segundos
    static void ejercicio14() {
        System.out.println("\n--- Ejercicio 14 ---");
        System.out.print("Cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int seg = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + seg);
    }

    // =====================================================================
    // PARTE II
    // =====================================================================

    // 15. Par o impar
    static void ejercicio15() {
        System.out.println("\n--- Ejercicio 15 ---");
        System.out.print("Escribe un número: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    // 16. Positivo o negativo
    static void ejercicio16() {
        System.out.println("\n--- Ejercicio 16 ---");
        System.out.print("Escribe un número: ");
        double n = scanner.nextDouble();

        if (n > 0) {
            System.out.println("Es positivo");
        } else if (n < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero (ni positivo ni negativo)");
        }
    }

    // 17. IVA con descuento del 5% si la venta supera 150.000
    //     (el cálculo del IVA se hace aquí mismo para que el ejercicio sea independiente)
    static void ejercicio17() {
        System.out.println("\n--- Ejercicio 17 ---");
        System.out.print("Precio bruto de la venta: ");
        double precioBruto = scanner.nextDouble();

        double iva = precioBruto * 0.19;
        double precioConIva = precioBruto + iva;

        System.out.println("IVA (19%): " + Math.round(iva * 100) / 100.0);
        System.out.println("Precio con IVA: " + Math.round(precioConIva * 100) / 100.0);

        if (precioBruto > 150000) {
            double descuento = precioConIva * 0.05;
            double totalAPagar = precioConIva - descuento;
            System.out.println("Descuento (5%): " + Math.round(descuento * 100) / 100.0);
            System.out.println("Total a pagar: " + Math.round(totalAPagar * 100) / 100.0);
        } else {
            System.out.println("La venta no supera $150.000, no hay descuento");
            System.out.println("Total a pagar: " + Math.round(precioConIva * 100) / 100.0);
        }
    }

    // 18. Nota final con mensajes
    //     (la nota final se calcula aquí mismo para que el ejercicio sea independiente)
    static void ejercicio18() {
        System.out.println("\n--- Ejercicio 18 ---");
        System.out.print("Nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double notaFinal = n1 * 0.15 + n2 * 0.20 + n3 * 0.15 + n4 * 0.30 + n5 * 0.20;
        System.out.println("La nota final es: " + Math.round(notaFinal * 100) / 100.0);

        if (notaFinal < 2.0) {
            System.out.println("No puede habilitar");
        } else if (notaFinal < 3.0) {
            System.out.println("Reprobó");
        } else {
            System.out.println("Aprobó");
            if (notaFinal > 4.5) {
                System.out.println("¡Felicitaciones por tu excelente nota!");
            }
        }
    }

    // 19. Ecuación cuadrática ax2 + bx + c = 0 (función resolverCuadratica)
    static void ejercicio19() {
        System.out.println("\n--- Ejercicio 19 ---");
        System.out.print("Valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Valor de c: ");
        double c = scanner.nextDouble();

        resolverCuadratica(a, b, c);
    }

    static void resolverCuadratica(double a, double b, double c) {
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática (a no puede ser 0)");
        } else {
            double discriminante = b * b - 4 * a * c;

            if (discriminante < 0) {
                System.out.println("No tiene soluciones reales");
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("Una solución: x = " + Math.round(x * 100) / 100.0);
            } else {
                double raiz = Math.sqrt(discriminante);
                double x1 = (-b + raiz) / (2 * a);
                double x2 = (-b - raiz) / (2 * a);
                System.out.println("Dos soluciones: x1 = " + Math.round(x1 * 100) / 100.0
                        + " y x2 = " + Math.round(x2 * 100) / 100.0);
            }
        }
    }

    // 20. Usuario y contraseña
    static void ejercicio20() {
        System.out.println("\n--- Ejercicio 20 ---");
        String usuarioCorrecto = "carlos";
        String claveCorrecta = "1234";

        System.out.print("Usuario: ");
        String usuario = scanner.next();
        System.out.print("Contraseña: ");
        String clave = scanner.next();

        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

    // 21. Número (0 a 10) -> nombre
    static void ejercicio21() {
        System.out.println("\n--- Ejercicio 21 ---");
        System.out.print("Escribe un número entre 0 y 10: ");
        int n = scanner.nextInt();

        switch (n) {
            case 0: System.out.println("CERO"); break;
            case 1: System.out.println("UNO"); break;
            case 2: System.out.println("DOS"); break;
            case 3: System.out.println("TRES"); break;
            case 4: System.out.println("CUATRO"); break;
            case 5: System.out.println("CINCO"); break;
            case 6: System.out.println("SEIS"); break;
            case 7: System.out.println("SIETE"); break;
            case 8: System.out.println("OCHO"); break;
            case 9: System.out.println("NUEVE"); break;
            case 10: System.out.println("DIEZ"); break;
            default: System.out.println("El número no está entre 0 y 10");
        }
    }

    // 22. Cantidad de dígitos (número menor a 100.000)
    static void ejercicio22() {
        System.out.println("\n--- Ejercicio 22 ---");
        System.out.print("Escribe un número menor a 100000: ");
        int n = scanner.nextInt();
        n = Math.abs(n); // por si escriben un negativo

        if (n >= 100000) {
            System.out.println("El número debe ser menor a 100000");
        } else if (n < 10) {
            System.out.println("Tiene 1 dígito");
        } else if (n < 100) {
            System.out.println("Tiene 2 dígitos");
        } else if (n < 1000) {
            System.out.println("Tiene 3 dígitos");
        } else if (n < 10000) {
            System.out.println("Tiene 4 dígitos");
        } else {
            System.out.println("Tiene 5 dígitos");
        }
    }

    // 23. Tres números: incrementa, disminuye o ninguno
    static void ejercicio23() {
        System.out.println("\n--- Ejercicio 23 ---");
        System.out.print("Primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Tercer número: ");
        double c = scanner.nextDouble();

        if (a < b && b < c) {
            System.out.println("Está incrementando");
        } else if (a > b && b > c) {
            System.out.println("Está disminuyendo");
        } else {
            System.out.println("Ni se incrementa ni se disminuye");
        }
    }

    // 24. Número del día de la semana -> nombre
    static void ejercicio24() {
        System.out.println("\n--- Ejercicio 24 ---");
        System.out.print("Escribe el número del día (1 a 7): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día no válido (debe ser de 1 a 7)");
        }
    }

    // =====================================================================
    // PARTE III
    // =====================================================================

    // 25. Invertir un texto (función invertirTexto)
    static void ejercicio25() {
        System.out.println("\n--- Ejercicio 25 ---");
        scanner.nextLine(); // limpia el Enter que quedó del ejercicio 24 (bórrala si pruebas este ejercicio solo)
        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine();
        System.out.println("Texto invertido: " + invertirTexto(texto));
    }

    static String invertirTexto(String texto) {
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }
        return invertido;
    }

    // 26. Primera letra de cada palabra en mayúscula
    static void ejercicio26() {
        System.out.println("\n--- Ejercicio 26 ---");
        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine();

        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            // es la primera letra del texto, o la letra anterior es un espacio
            if (i == 0 || texto.charAt(i - 1) == ' ') {
                resultado = resultado + Character.toUpperCase(letra);
            } else {
                resultado = resultado + letra;
            }
        }
        System.out.println(resultado);
    }

    // 27. Penúltima palabra de un texto
    static void ejercicio27() {
        System.out.println("\n--- Ejercicio 27 ---");
        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.trim().split(" +"); // separa el texto en palabras
        if (palabras.length < 2) {
            System.out.println("El texto necesita al menos 2 palabras");
        } else {
            System.out.println("La penúltima palabra es: " + palabras[palabras.length - 2]);
        }
    }

    // 28. ¿El segundo texto contiene al primero?
    static void ejercicio28() {
        System.out.println("\n--- Ejercicio 28 ---");
        System.out.print("Escribe el primer texto (el que se busca): ");
        String primero = scanner.nextLine();
        System.out.print("Escribe el segundo texto: ");
        String segundo = scanner.nextLine();

        if (segundo.contains(primero)) {
            System.out.println("Sí, el segundo texto contiene al primero");
        } else {
            System.out.println("No, el segundo texto no contiene al primero");
        }
    }

    // 29. Palíndromo (función esPalindromo)
    static void ejercicio29() {
        System.out.println("\n--- Ejercicio 29 ---");
        System.out.print("Escribe una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    static boolean esPalindromo(String palabra) {
        // Se arma la palabra al revés aquí mismo, para que el ejercicio sea independiente
        String alReves = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            alReves = alReves + palabra.charAt(i);
        }
        return palabra.equalsIgnoreCase(alReves); // ignora mayúsculas y minúsculas
    }

    // 30. Área de un polígono regular de n lados (función areaPoligonoRegular)
    static void ejercicio30() {
        System.out.println("\n--- Ejercicio 30 ---");
        System.out.print("Número de lados del polígono (mínimo 3): ");
        int lados = scanner.nextInt();
        System.out.print("Longitud de cada lado: ");
        double longitud = scanner.nextDouble();

        if (lados < 3) {
            System.out.println("Un polígono necesita al menos 3 lados");
        } else {
            double area = areaPoligonoRegular(lados, longitud);
            System.out.println("Área: " + Math.round(area * 100) / 100.0);
        }
    }

    static double areaPoligonoRegular(int numeroLados, double longitudLado) {
        return (numeroLados * longitudLado * longitudLado) / (4 * Math.tan(Math.PI / numeroLados));
    }

    // =====================================================================
    // PARTE IV
    // =====================================================================

    // 31. Primeros 10 números naturales
    static void ejercicio31() {
        System.out.println("\n--- Ejercicio 31 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 32. Primeros 10 impares
    static void ejercicio32() {
        System.out.println("\n--- Ejercicio 32 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i - 1); // 1, 3, 5, ... 19
        }
    }

    // 33. Primeros 10 pares
    static void ejercicio33() {
        System.out.println("\n--- Ejercicio 33 ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i); // 2, 4, 6, ... 20
        }
    }

    // 34. Pedir un entero positivo hasta que sea válido
    static void ejercicio34() {
        System.out.println("\n--- Ejercicio 34 ---");
        int n;
        do {
            System.out.print("Escribe un número entero positivo: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Valor no permitido, intenta de nuevo");
            }
        } while (n <= 0);

        System.out.println("El número ingresado es: " + n);
    }

    // 35. Decimal a binario
    static void ejercicio35() {
        System.out.println("\n--- Ejercicio 35 ---");
        System.out.print("Escribe un número entero positivo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Debe ser un número positivo");
        } else if (n == 0) {
            System.out.println("Binario: 0");
        } else {
            String binario = "";
            while (n > 0) {
                binario = (n % 2) + binario; // el residuo se pega al inicio
                n = n / 2;
            }
            System.out.println("Binario: " + binario);
        }
    }

    // 36. Binario a decimal
    static void ejercicio36() {
        System.out.println("\n--- Ejercicio 36 ---");
        System.out.print("Escribe un número binario: ");
        String binario = scanner.next();

        boolean valido = true;
        int decimal = 0;
        int potencia = 1; // 1, 2, 4, 8, ...

        for (int i = binario.length() - 1; i >= 0; i--) { // de derecha a izquierda
            char c = binario.charAt(i);
            if (c == '1') {
                decimal = decimal + potencia;
            } else if (c != '0') {
                valido = false;
            }
            potencia = potencia * 2;
        }

        if (valido) {
            System.out.println("Decimal: " + decimal);
        } else {
            System.out.println("Eso no es un número binario (solo 0 y 1)");
        }
    }

    // 37. Patrón 1, 12, 123, ... hasta 12345678910
    static void ejercicio37() {
        System.out.println("\n--- Ejercicio 37 ---");
        for (int fila = 1; fila <= 10; fila++) {
            for (int numero = 1; numero <= fila; numero++) {
                System.out.print(numero);
            }
            System.out.println(); // salto de línea al terminar la fila
        }
    }

    // 38. Triángulo de @
    static void ejercicio38() {
        System.out.println("\n--- Ejercicio 38 ---");
        System.out.print("Número de filas: ");
        int filas = scanner.nextInt();

        for (int fila = 1; fila <= filas; fila++) {
            for (int j = 1; j <= fila; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    // 39. Triángulo invertido de *
    static void ejercicio39() {
        System.out.println("\n--- Ejercicio 39 ---");
        System.out.print("Número de filas: ");
        int filas = scanner.nextInt();

        for (int fila = 1; fila <= filas; fila++) {
            for (int j = 1; j <= filas - fila + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // =====================================================================
    // PROBLEMA FINAL
    // =====================================================================

    // Control de equipaje del Boeing 747
    static void problemaFinal() {
        System.out.println("\n--- Problema final ---");
        final int CAPACIDAD_AVION = 18000; // kg
        final int PESO_MAXIMO_BULTO = 500; // kg

        System.out.print("Valor de un dólar en pesos (ej: 4000): ");
        double valorDolar = scanner.nextDouble();

        int cantidadBultos = 0;
        int pesoTotal = 0;
        int masPesado = 0;
        int masLiviano = PESO_MAXIMO_BULTO; // ningún bulto aceptado puede pesar más que esto
        int ingresoPesos = 0;
        int peso;

        do {
            System.out.print("Peso del bulto en kg (0 para terminar): ");
            peso = scanner.nextInt();

            if (peso < 0) {
                System.out.println("Peso no válido");
            } else if (peso > PESO_MAXIMO_BULTO) {
                System.out.println("Rechazado: un bulto no puede pesar más de 500 kg");
            } else if (pesoTotal + peso > CAPACIDAD_AVION) {
                System.out.println("Rechazado: no cabe en el avión (capacidad restante: "
                        + (CAPACIDAD_AVION - pesoTotal) + " kg)");
            } else if (peso > 0) {
                // Se calcula la tarifa por kilo según el peso del bulto
                int tarifa;
                if (peso <= 25) {
                    tarifa = 0;
                } else if (peso <= 300) {
                    tarifa = 1500;
                } else {
                    tarifa = 2500;
                }
                int costo = peso * tarifa;

                // Se actualizan los acumuladores
                cantidadBultos++;
                pesoTotal = pesoTotal + peso;
                ingresoPesos = ingresoPesos + costo;
                if (peso > masPesado) {
                    masPesado = peso;
                }
                if (peso < masLiviano) {
                    masLiviano = peso;
                }

                System.out.println("Bulto " + cantidadBultos + ": " + peso + " kg | tarifa $" + tarifa
                        + "/kg | cobro $" + costo + " | peso acumulado " + pesoTotal + " kg");
            }
        } while (peso != 0);

        System.out.println();
        if (cantidadBultos == 0) {
            System.out.println("No se ingresó ningún bulto");
        } else {
            double promedio = (double) pesoTotal / cantidadBultos;
            double ingresoDolares = ingresoPesos / valorDolar;

            System.out.println("a. Total de bultos: " + cantidadBultos);
            System.out.println("b. Bulto más pesado: " + masPesado + " kg | más liviano: " + masLiviano + " kg");
            System.out.println("c. Peso promedio: " + Math.round(promedio * 100) / 100.0 + " kg");
            System.out.println("d. Ingreso: $" + ingresoPesos + " pesos = "
                    + Math.round(ingresoDolares * 100) / 100.0 + " dólares");
        }
    }
}