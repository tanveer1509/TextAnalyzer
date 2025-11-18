# TextAnalyzer
A robust command-line text analysis tool built in Java. This program takes a paragraph of text as input and performs various statistical analyses to provide insights into the data.

## Features
This tool performs the following operations on any given text input:
* **Character Count:** Calculates total characters (including spaces).
* **Word Count:** Counts total words based on whitespace.
* **Most Common Character:** Identifies the character with the highest frequency.
* **Character Frequency:** Checks how often a specific character appears (case-insensitive).
* **Word Frequency:** Checks how often a specific word appears (case-insensitive).
* **Unique Word Count:** Uses a `HashSet` to determine how many unique words are in the text (ignoring case).

## Technologies Used
* Java
* Eclipse IDE
* Java Collections (HashSet)

## How to Run
1.  Ensure you have Java installed on your machine.
2.  Download or clone this repository.
3.  Compile the Java file:
    ```bash
    javac TextAnalyzer.java
    ```
4.  Run the program:
    ```bash
    java TextAnalyzer
    ```

## Sample Output
```text
Please enter a paragraph or lengthy text:
The cat sat on the CAT

Character Count: 22
Word Count: 6
Most Common Character:
Please enter a character to count:
a
Frequency of 'a': 3
Please enter a word to count:
cat
Frequency of "cat": 2
Number of unique words: 4
