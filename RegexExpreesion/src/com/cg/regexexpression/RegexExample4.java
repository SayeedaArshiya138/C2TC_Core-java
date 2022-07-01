package com.cg.regexexpression;

import java.util.regex.Pattern;

public class RegexExample4 {
public static void main(String [] args) {
	System.out.println(Pattern.matches("[amn]?", "a"));
	System.out.println(Pattern.matches("[amn]?", "aaa"));
	System.out.println(Pattern.matches("[amn]?", "aammmnn"));
	System.out.println(Pattern.matches("[amn]?", "aazzta"));
	System.out.println(Pattern.matches("[amn]?-", "am"));

}}
