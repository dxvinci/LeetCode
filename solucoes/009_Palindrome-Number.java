// Problema: https://leetcode.com/problems/palindrome-number/
// Data: 24/05/2023

// Descrição: Dado um número inteiro x, retorne verdadeiro (true) se x for um palíndromo e falso (false) caso contrário.

// Exemplo:
// Input: x = 121
// Output: true
// Explicação: 121 é o mesmo quando lido de trás para frente.

class Solution {
    public boolean isPalindrome(int x) {
        
        int n = x;
        int rev_num = 0;
        while (n > 0) {
            rev_num = rev_num * 10 + n % 10;
            n /= 10;
        }

        return x == rev_num;

    }
}
