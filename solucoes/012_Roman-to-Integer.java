// Problema: https://leetcode.com/problems/roman-to-integer/
// Data: 25/05/2023

// Descrição: Considerando o sistema de numeração romana, receba uma string com um numeral romano, e converta-o para inteiro.

// Exemplo:
// Input: s = "III"
// Output: 3
// Explicação: III = 3

// Exemplo 2:
// Input: s = "MCMXCIV"
// Output: 1994
// Explicação: M = 1000, CM = 900, XC = 90, IV = 4.

class Solution {
    public int romanToInt(String s) {
        int result = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (4 * num < result)
                result -= num;
            else
                result += num;
        }
        return result;
    }
}
