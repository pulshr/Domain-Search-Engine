package org.pulkitshrivastava;

import java.util.ArrayList;

public class Main {
    public static class DomainNameAndRankPair {
        String domainName;
        int domainRank;
        DomainNameAndRankPair(String name, int rank) {
            this.domainName = name;
            this.domainRank = rank;
        }
    }
    public static class TrieNode {
        TrieNode[] children;
        ArrayList<Integer> domainIndexes;
        TrieNode() {
            this.children = new TrieNode[26];
            this.domainIndexes = new ArrayList<>();
        }
    }
    public static void addDomains(TrieNode root, DomainNameAndRankPair[] domainsList) {
        for(int i=0;i<domainsList.length;i++) {
            TrieNode curr = root;
            String domainName = domainsList[i].domainName;
            for(int j=0;j<domainName.length();j++) {
                int charInt = domainName.charAt(j)-'a';
                if(curr.children[charInt]==null) {
                    curr.children[charInt] = new TrieNode();
                }
                curr = curr.children[charInt];
                if(curr.domainIndexes.size()<5) {
                    curr.domainIndexes.add(i);
                }
            }
        }
    }
    public static String[] getResults(TrieNode root, String query, DomainNameAndRankPair[] domainsList) {
        TrieNode curr = root;
        for(int i=0;i<query.length();i++) {
            int charInt = query.charAt(i)-'a';
            if(curr.children[charInt]==null) {
                return new String[]{};
            } else {
                curr = curr.children[charInt];
            }
        }
        String[] res = new String[5];
        for(int i=0;i<curr.domainIndexes.size();i++) {
            res[i] = domainsList[curr.domainIndexes.get(i)].domainName;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
