// Problema: https://leetcode.com/problems/longest-common-prefix
// Data: 26/05/2023

// Descrição: Escreva uma função para encontrar o maior prefixo comum entre um array de strings.
// Caso não exista prefixo comum, retorne uma string vazia "".

// Exemplo:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Exemplo 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explicação: Não existe prefixo comum entre as strings.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;

        while (index < s1.length() && index < s2.length()){
            if (s1.charAt(index) == s2.charAt(index))
                index++;
            else
                return s1.substring(0, index);
        }
      
        return s1.substring(0, index);
    }
}
