// Problema: https://leetcode.com/problems/valid-parentheses/
// Data: 26/05/2023

// Descrição: Dada uma string s contendo os caracteres '(', ')', '{', '}', '[' e ']', determine se a string é válida, retornando um valor boolean.
// A string de entrada é válida quando:
// Os parênteses, chaves ou colchetes são fechados na ordem inversa àquela em que foram abertos.

// Exemplo:
// Input: s = "()"
// Output: true

// Exemplo 2:
// Input: s = "([]){()}"
// Output: true

// Exemplo 3:
// Input: s = "([)]"
// Output: false

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
            }
            else if (!stack.isEmpty()) {
                char cPop = stack.pop();
                if (c == ')' && cPop != '(' ||
                        c == ']' && cPop != '[' ||
                        c == '}' && cPop != '{') {
                    return false;
                }
            }
            else
                return false;
        }
        
        return stack.isEmpty();
    }
}
