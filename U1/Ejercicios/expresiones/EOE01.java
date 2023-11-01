package expresiones;

// 1. Convierte en expresiones algorítmicas las siguientes expresiones algebráicas. Coloca paréntesis solamente donde sean necesarios.

public class EOE01 {
    public static void main(String[] args) {

        double a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, j = 9, m = 10, n = 11, r = 12, s = 13, p = 14,
                q = 15, x = 16, y = 17, z = 18;

        double varA = 3 / 2.0 + 4 / 3.0;
        System.out.println(varA);

        double varAb = 3 / 2.0 + 4 / 3.0;
        System.out.println("varAb: " + varAb);

        double varB = 1 / (x - 5) - 3 * x * y / 4;
        System.out.println("varB: " + varB);

        double varC = 1 / 2 + 7;
        System.out.println("varC: " + varC);

        double varD = 7 + 1 / 2;
        System.out.println("varD: " + varD);

        double varE = Math.pow(a, 2) / b - c + d - e / f - (g * h / j);
        System.out.println("varE: " + varE);

        double varF = m / n + p;
        System.out.println("varF: " + varF);

        double varG = m + n / (p - q);
        System.out.println("varG: " + varG);

        double varH = Math.pow(a, 2) / Math.pow(b, 2) + Math.pow(c, 2) / Math.pow(d, 2);
        System.out.println("varH: " + varH);

        double varI = (m + n / p) / (q - r / s);
        System.out.println("varhI: " + varI);

        double varJ = (3 * a + b) / (c - (d + 5 * e) / f + g / 2 * h);
        System.out.println("varJ: " + varJ);

        double varK = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2) / (1 / Math.pow(x, 2) + 2);
        System.out.println("varK: " + varK);

        /* Ap. 2 */

        double varL = b / 2 - 4 * a * c;
        System.out.println("varL: " + varL);

        double varM = 3 * x * y - 5 * x + 12 * x - 17;
        System.out.println("varM: " + varM);

        double varN = (b + d) / (c + 4);
        System.out.println("varN: " + varN);

        double varO = ((x * y) / y) + 2;
        System.out.println("varO: " + varO);

        double varP = 1 / y + 3 * x / z + 1;
        System.out.println("varP: " + varP);

        double varQ = 1 / y + (3 + x) / (y + 1);
        System.out.println("varQ: " + varQ);

    }
}
