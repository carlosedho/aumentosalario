/*
The MIT License (MIT)
Copyright (c) 2022 Carlos Eduardo <cduhno@gmail.com>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package aumentosalario;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, aumento, salarioFinal;
        System.out.println("Informe o seu salário: ");
        salario = input.nextDouble();
        if (salario <= 1900){
            aumento = salario *20/100;
        }
        else if (salario <= 3300){
            aumento = salario *15/100;
        }
        else if (salario <= 5800){
            aumento = salario *10/100;
        }
        else {
            aumento = salario *5/100;
        }
        salarioFinal = salario + aumento;
        System.out.println("O jogador terá aumento de R$ " + aumento + " e passará a receber R$ " + salarioFinal + " .");
    } 
}
