package programmers.level01.day08;

import programmers.level01.day05._006_두개뽑아서더하기;

public class _006_신규아이디추천 {

    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        System.out.println("new_id = " + new_id);
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        System.out.println("new_id = " + new_id);
        new_id = new_id.replaceAll("\\.{2,}", ".");
        System.out.println("new_id = " + new_id);
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        System.out.println("new_id = " + new_id);
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        System.out.println("new_id = " + new_id);
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");
        }
        System.out.println("new_id = " + new_id);
        while (new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        System.out.println("new_id = " + new_id);
        return new_id;
    }

    public static void main(String[] args) {
        String solution = new _006_신규아이디추천().solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println("solution = " + solution);
    }
}
