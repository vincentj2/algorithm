package Algorthm.Programmers.고득점kit;

import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i].length() < phone_book[i+1].length()){
                if(phone_book[i+1].startsWith(phone_book[i]))return false;
            }else{
                if(phone_book[i].startsWith(phone_book[i+1])) return false;
            }
        }
        return answer;
    }
}