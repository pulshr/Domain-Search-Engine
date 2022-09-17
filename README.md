# Domain-Search-Engine
Get domain names based on their rankings

Application Summary:
  Domain Search Engine can be used to search through the top domain names based on their prefixes. 
  For every search query, top 5 domains based on thier respective ranks would be provided to the user.

Example: 

  Registered Domains (with their ranks):
  
    - scalerclasses(8)
    - scalerverse(3)
    - scaler(10)
    - scalertopics(5)
    - scalercontests(7)
    - yahoosports(12)
    - yahoo(15)
    - yahoonews(10)
    - googleimages(15)
    - google(18)
    
  Query (3 Strings): 
  
    - scaler
    - yahoo
    - google
    
  Output (Result of all the three strings based on their rankings):
  
    - scaler
    - scalerclasses
    - scalercontests
    - scalertopics
    - scalerverse
    
    - yahoo
    - yahoosports
    - yahoonews
    
    - google
    - googleimages

Impelementation:
  - Trie Data Structure was used to store domain names, because they can implement insert and search operations faster than a binary search tree
  - Tries are also faster than hash tables as there are no hash functions and collisions in a Trie
  - They can also be used to implement prefix-based searching which can't be implemented using a Hash Table
  
Time and Space Complexity:
  - Trie is an efficient information retrieval data structure. Using Trie, search complexities can be brought to optimal limit (key length)
  - If we store keys in binary search tree, a well-balanced BST will need time proportional to M * log N, 
       - where M is maximum string length and N is number of keys in tree
  - Using Trie, we can search the key in O(M) time. However, the penalty is on Trie storage requirements
  - Searching up data in a trie is faster in the worst case, O(m) time (where m is the length of a search string), compared to an imperfect hash table
  - An imperfect hash table can have key collisions. A key collision is the hash function mapping of different keys to the same position in a hash table
  - The worst-case lookup speed in an imperfect hash table is O(N) time, but far more typically is O(1), with O(m) time spent evaluating the hash.
    - Overall TC: O(N*L+M*L')
    - Overall SC: O(N*L*26)
      - N = Number of domains
      - L = Length of domain
      - M = Number of queries
      - L' = Length of query
  
  

























