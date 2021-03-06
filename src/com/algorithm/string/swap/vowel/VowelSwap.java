package com.algorithm.string.swap.vowel;

import java.util.ArrayList;
import java.util.List;

/*
 * 모음 위치 바꾸기
 */
public class VowelSwap {

  static String vowelSwap(String str) {
    StringBuilder sb = new StringBuilder();
    List<String> list = new ArrayList<>();
    String s = str.toLowerCase();

    int strSize = str.length();
    for (int i = 0; i < strSize; ++i) {
      char c = s.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        list.add(Character.toString(str.charAt(i)));
      }
    }

    int size = list.size();
    for (int i = 0; i < strSize; ++i) {
      char c = s.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        sb.append(list.get(--size));
      }
      else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Naver Webtoon";
    String s3 = "LikeLion at SKHU";
    String s4 = "MinGOOD";

    System.out.println(vowelSwap(s1));
    System.out.println(vowelSwap(s2));
    System.out.println(vowelSwap(s3));
    System.out.println(vowelSwap(s4));
  }
}
