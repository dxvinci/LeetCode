// Problema: https://leetcode.com/problems/two-sum/
// Data: 11/02/2023

// Descrição: Passado como parâmetro um array de inteiros e um número inteiro como objetivo,
// encontre os dois números dentro do array, que somados resultam nesse número objetivo,
// retornando então um array de 2 números inteiros, sendo estes o índice de cada número somado.

// Exemplo:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explicação: Como nums[0] + nums[1] == 9, retorna-se [0, 1].

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return array;
    }
}
