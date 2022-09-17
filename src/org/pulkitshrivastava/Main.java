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
    public static void main(String[] args) {

    }
}
