/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Family
 */
public class ConvertNumber {
        private int decimal;

    public ConvertNumber(int decimal) {
        this.decimal = decimal;
    }
    
  void decimalToBinary() {
        StringBuilder binary = new StringBuilder();
        int num = decimal;

        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        
        System.out.println("So nhi phan: " + binary.toString());
    }
void binaryToDecimal(String binary) {
        int decimalValue = 0;
        int base = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimalValue += base;
            }
            base *= 2;
        }

        System.out.println("So thap phan: " + decimalValue);
    }



void decimalToHex() {
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("So hex: " + hex);
    }

void hexToDecimal(String hex) {
        int decimalValue = Integer.parseInt(hex, 16);
        System.out.println("So thap phan: " + decimalValue);
    }


}
