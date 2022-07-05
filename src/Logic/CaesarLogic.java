/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Tung
 */
public class CaesarLogic {
    private String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[]{}\\|;:'\"<>,.?/";
    private int length;
    
    public CaesarLogic(){
        length = alphabets.length();
    }
    
    int findInAlphabets(char c) {
        for(int i = 0; i < length; i++){
            if(alphabets.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
    
    public String encode(String text, int offset) {
        String cipherText = "";
        for(int index = 0; index < text.length(); index++) {
            char c = text.charAt(index);
            int i = findInAlphabets(c);
            if(i > -1){
                cipherText += alphabets.charAt((i + offset) % length);
            }
            else {
                cipherText += " ";
            }
        }
        return cipherText;
    }
    
    public String decode(String text, int offset) {
        String plainText = "";
        for(int index = 0; index < text.length(); index++) {
            char c = text.charAt(index);
            int i = findInAlphabets(c);
            if(i > -1){
                plainText += alphabets.charAt((i - offset) % length);
            }
            else {
                plainText += " ";
            }
        }
        return plainText;
    }
}
