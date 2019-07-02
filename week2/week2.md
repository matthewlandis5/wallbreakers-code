Wallbreakers Assignment Week #2 (due by EOD Friday, July 5th)

Goals For This Week:
  Hash maps and hash sets are arguably the most important data structures you will need for coding interviews, 
  as you might have noticed this during our first mock interview. 
  They come up all the time either directly, or indirectly (say as part of memorization, building a graph, etc.). 
  This week we want to make sure you are very comfortable using hash maps and hash sets in your language of choice. 
  You should be able to use them without needing to try to remember or look up the right API or syntax. 
  We will also look at multisets which are a special type of hash maps used for counting occurrences of objects.

Week 2 Checklist:
  Solve as many of the problems listed below as you can by EOD Friday, July 5th.
  Complete the weekly progress report form by EOD Friday, July 5th.

Week #2 Coding Exercises:
  Hash maps and hash sets
    https://leetcode.com/problems/jewels-and-stones/
    https://leetcode.com/problems/unique-morse-code-words/
    https://leetcode.com/problems/happy-number/
    https://leetcode.com/problems/uncommon-words-from-two-sentences/
    https://leetcode.com/problems/distribute-candies/
    https://leetcode.com/problems/groups-of-special-equivalent-strings/
    https://leetcode.com/problems/intersection-of-two-arrays/
    https://leetcode.com/problems/valid-sudoku/
    https://leetcode.com/problems/isomorphic-strings/
    https://leetcode.com/problems/word-pattern/
    https://leetcode.com/problems/design-hashmap/
    https://leetcode.com/problems/design-hashset/
  Multisets
    https://leetcode.com/problems/find-all-anagrams-in-a-string/
    Use a multiset for this one. You can also solve it without using one. How? Try to solve it both ways. 
    How do the two solutions compare?
    https://leetcode.com/problems/first-unique-character-in-a-string/
    https://leetcode.com/problems/subdomain-visit-count/
    https://leetcode.com/problems/find-the-difference/
    https://leetcode.com/problems/most-common-word/
    https://leetcode.com/problems/sort-characters-by-frequency/
    https://leetcode.com/problems/set-mismatch/
    This one has a few “clever” solutions but feel free to use a simple multiset solution.
    https://leetcode.com/problems/number-of-atoms/
    This one is more difficult than the average interview question but it is good exercise! 
    You will need to build a simple parser in addition to using a multiset.
  Tries
    https://leetcode.com/problems/longest-word-in-dictionary
    https://leetcode.com/problems/implement-trie-prefix-tree
    https://leetcode.com/problems/word-search-ii
    
Resources
  Python Resources
  Tutorial on dictionaries in Python (hash maps)
  Bonus: Learn how and when to use defaultdict in Python to speed up your coding
  Tutorial on sets in Python (hash sets)
  Multisets in Python: The collections.Counter class
  This is a very powerful class to know how to use. Some interview problems can be solved in only a few lines of code if you know how to use this class. Make sure you know how it works and that you could implement an equivalent class if needed. A good exercise would be to implement your own Counter class that imitates collections.Counter using a dictionary as the underlying structure.
  Java Resources
  HashMap in Java
  HashSet in Java
  Multisets: Unfortunately Java does not come with a multiset class. You will have to use a HashMap<T, Integer> and manually implement any of the multiset operations you need. (For real-world applications, you can use Google's Guava library which comes with a multiset class but I do not recommend using this for coding interviews as interviewers are likely to be unfamiliar with it, and you are generally expected to only use standard language features and libraries only.)
  Tries
  https://www.geeksforgeeks.org/trie-insert-and-search/
  https://medium.com/@info.gildacademy/a-simpler-way-to-implement-trie-data-structure-in-python-efa6a958a4f2
