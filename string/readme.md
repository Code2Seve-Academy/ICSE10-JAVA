# Code2Serve Academy

## String Handling

### Introduction

In Java, strings are used to store sequences of characters. Java provides several classes to work with strings, including

- `String`
- `StringBuffer`
- `StringBuilder`

  To manipulate, and use strings is essential for programming in Java.

## Working with Strings

### 1. `String`

**Definition:**

- Strings in Java are objects that represent `sequences of characters`.
- The String class is `immutable`, meaning once a string is created, it cannot be changed. Any modification to a string results in the creation of a new string object, while the original string remains unchanged. This immutability ensures that strings are stored in a consistent memory address.

### 2. `StringBuffer`

**Definition:**

- `StringBuffer` is a mutable sequence of characters. It is synchronized, making it thread-safe.

  _Not in syllabus(ICSE- 2025)_

### 3. `StringBuilder`

**Definition:**

- `StringBuilder` is similar to `StringBuffer` but is not synchronized, making it faster in single-threaded environments. It is also `mutable`.

  _Not in syllabus(2025)_

---

> All are inside `lang` package

---

## Creating and Using Strings

### Syntax

To create a string in Java, you can use string literals or the `String` class constructor.

### Different Ways to Declare

1. **Using String Literals:**

   ```java
   String str1 = "Hello";
   ```

2. **Using the String Class Constructor:**
   ```java
   String str2 = new String("Hello");
   ```

## Difference between Mutable and Immutable

### 1. Immutable Objects:

Objects whose state cannot be changed once they are created.

> Example: String

### 2. Mutable Objects:

Objects whose state can be changed after they are created.
Example: StringBuffer, StringBuilder

#### Summary

| Feature       | `String` (Immutable)          | `StringBuffer` (Mutable)     |
| ------------- | ----------------------------- | ---------------------------- |
| Storage       | String Pool (Heap)            | Heap (Regular Object)        |
| Modifications | Creates a new object          | Modifies existing object     |
| Performance   | Slower (More GC overhead)     | Faster (No new objects)      |
| Memory Usage  | Higher (New object each time) | Lower (Same object modified) |

---

## String Methods

Here is the list of commonly used Java String methods along with their descriptions, return types, and examples.

### 1. `char charAt(int index)`

**Description:** Returns the character at the specified index.\
**Return Type:** `char`\
**Example:**

```java
char c = str.charAt(0);
```

```java
String str1 = "Code2Serve";

String str2 = "Academy";

char result1 = str1.charAt(7); // Output:

char result2 = str2.charAt(7); // Output:
```

### 2. `int compareTo(String anotherString)`

**Description:**

- Compares two strings lexicographically.
- Case Sensitive comparison.

**Return Type:** `int`

> **-ve** : when 1st string is lexicographically < 2nd string

> **0** : when 1st string is lexicographically == 2nd string

> **+ve** : when 1st string is lexicographically > 2nd string
> **Example:**

```java
int result = str.compareTo("anotherString");
```

```java
String str1 = "apple";
String str2 = "banana";
String str3 = "Apple";
String str4 = "apple";

int result1 = str1.compareTo(str2); // Output: -1
int result2 = str1.compareTo(str3); // Output:
int result3 = str3.compareTo(str1); // Output:
int result3 = str1.compareTo(str4); // Output:
```

### 3. `int compareToIgnoreCase(String str)`

**Description:**

- Compares two strings lexicographically.
- Case Insensitive comparison.

**Return Type:** `int`\
**Example:**

```java
int result = str.compareToIgnoreCase("anotherString");
```

```java
String str1 = "apple";
String str2 = "banana";
String str3 = "Apple";
String str4 = "apple";

int result1 = str1.compareToIgnoreCase(str2); // Output:
int result2 = str1.compareToIgnoreCase(str3); // Output:
int result3 = str3.compareToIgnoreCase(str1); // Output:
```

### 4. `String concat(String str)`

**Description:** Concatenates the specified string to the end of this string.\
**Return Type:** `String`\
**Example:**

```java
String result = str.concat("anotherString");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";
String str3 = str1 + str2; // Output:

int result1 = str1.concat(str2); // Output:
```

<!-- ### 5. `contains(String s)`

**Description:** Returns `true` if and only if this string contains the specified sequence of char values.\
**Return Type:** `boolean`\
**Example:**

```java
boolean result = str.contains("sequence");
``` -->

### 5. `boolean endsWith(String suffix)`

**Description:** Tests if this string ends with the specified suffix.\
**Return Type:** `boolean`\
**Example:**

```java
boolean result = str.endsWith("suffix");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

boolean result1 = str1.endsWith("rve"); // Output:
boolean result2 = str1.endsWith("vve"); // Output:
boolean result3 = str1.endsWith("e"); // Output:
boolean result3 = str1.endsWith("Code2Serve"); // Output:
```

### 6. `boolean startsWith(String prefix)`

**Description:** Tests if this string starts with the specified prefix.\
**Return Type:** `boolean`\
**Example:**

```java
boolean result = str.startsWith("prefix");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

boolean result1 = str1.startsWith("cod"); // Output:
boolean result2 = str1.startsWith("Code"); // Output:
boolean result3 = str1.startsWith("ode"); // Output:
boolean result4 = str1.startsWith("Code2Serve"); // Output:
```

### 7. `boolean equals(String anotherString)`

**Description:**

- Compares two strings.
- (Case Sensitive)

**Return Type:** `boolean`

**Example:**

```java
boolean result = str.equals("anotherString");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

boolean result1 = str1.equals(str2); // Output:
boolean result2 = str1.equals("code2serve"); // Output:
boolean result3 = str1.equals("Code2Serve"); // Output:
```

### 8. `boolean equalsIgnoreCase(String anotherString)`

**Description:**

- Compares two strings,
- Case Insensitive.

**Return Type:** `boolean`

**Example:**

```java
boolean result = str.equalsIgnoreCase("anotherString");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

boolean result1 = str1.equalsIgnoreCase(str2); // Output:
boolean result2 = str1.equalsIgnoreCase("code2serve"); // Output:
boolean result3 = str3.equalsIgnoreCase("Code2Serve"); // Output:
```

### 9 a. `int indexOf(int ch)`

**Description:**

- Returns the index of the first occurrence of the specified character.
- **-1**: when not found

**Return Type:** `int`\
**Example:**

```java
int index = str.indexOf('a');
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

boolean result1 = str1.indexOf('e'); // Output:
boolean result2 = str1.indexOf('2'); // Output:
boolean result3 = str1.indexOf('3'); // Output:
```

### 9 b. `indexOf(String str)`

**Description:**

- Returns the index of the first occurrence of the specified character.
- -1: when not found

**Return Type:** `int`\
**Example:**

```java
int index = str.indexOf("substring");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

boolean result1 = str1.indexOf("e2"); // Output:
boolean result2 = str1.indexOf("2S"); // Output:
boolean result3 = str3.indexOf("3S"); // Output:
```

<!-- ### `isEmpty()`

**Description:** Returns `true` if, and only if, length() is `0`.\
**Return Type:** `boolean`\
**Example:**

```java
boolean result = str.isEmpty();
``` -->

### 10. `int length()`

**Description:** Returns the length of this string.\
**Return Type:** `int`\
**Example:**

```java
int length = str.length();
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

int result1 = str1.length(); // Output:
int result2 = str2.length(); // Output:
```

### 11 a. `String replace(char oldChar, char newChar)`

**Description:**

- Returns a new string resulting from replacing all occurrences of `oldChar` in this string with `newChar`.
- Case Sensitive

**Return Type:** `String`

**Example:**

```java
String result = str.replace('a', 'b');
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

String result1 = str1.replace('2','3'); // Output:
String result2 = str2.replace('A','a'); // Output:
```

### 11 b. `String replace(CharSequence target, CharSequence replacement)`

**Description:**

- Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
- Case Sensitive

**Return Type:** `String`

**Example:**

```java
String result = str.replace("target", "replacement");
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

String result1 = str1.replace("2S","3S"); // Output: Code3Serve
String result2 = str2.replace("AA","a"); // Output: Academy
```

<!-- ### `split(String regex)`

**Description:** Splits this string around matches of the given regular expression.\
**Return Type:** `String[]`\
**Example:**

```java
String[] parts = str.split("regex");
``` -->

<!-- ### `startsWith(String prefix)`

**Description:** Tests if this string starts with the specified prefix.\
**Return Type:** `boolean`\
**Example:**

```java
boolean result = str.startsWith("prefix");
``` -->

### 12 a. `String substring(int beginIndex)`

**Description:**

- Returns a new string that is a substring of this string starting from startIndex and ends at lastIndex(inclusive).

**Return Type:** `String`\
**Example:**

```java
String result = str.substring(5);
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

String result1 = str1.substring(5); // Output: Serve
String result2 = str2.substring(0); // Output: Academy
```

### 12 b. `String substring(int beginIndex, int endIndex)`

**Description:**

- Returns a new string that is a substring of this string starting from startIndex and ends at endIndex(exclusive).

**Return Type:** `String`\
**Example:**

```java
String result = str.substring(5, 10);
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

String result1 = str1.substring(5,8); // Output: Ser
String result2 = str2.replace(0,10); // Output: error
```

<!-- ### `toCharArray()`

**Description:** Converts this string to a new character array.\
**Return Type:** `char[]`\
**Example:**

```java
char[] chars = str.toCharArray();
``` -->

### 13. ` String toLowerCase()`

**Description:** Converts all of the characters in this String to lower case.\
**Return Type:** `String`\
**Example:**

```java
String result = str.toLowerCase();
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

String result1 = str1.toLowerCase(); // Output: code2serve
String result2 = str2.toLowerCase(); // Output: academy
```

### 14. `String toUpperCase()`

**Description:** Converts all of the characters in this String to upper case.\
**Return Type:** `String`\
**Example:**

```java
String result = str.toUpperCase();
```

```java
String str1 = "Code2Serve";
String str2 = "Academy";

String result1 = str1.toUpperCase(); // Output: CODE2SERVE
String result2 = str2.toUpperCase(); // Output: ACADEMY
```

### 15. `String trim()`

**Description:** Returns a copy of the string, with leading and trailing whitespace omitted.\
**Return Type:** `String`\
**Example:**

```java
String result = str.trim();
```

```java
String str1 = "   Code2Serve    ";

String str2 = "   Academy";

String str2 = "  Code2Serve     Academy  ";

String result1 = str1.trim(); // Output:
String result2 = str2.trim(); // Output:
String result3 = str3.trim(); // Output:
```

### 16. `String valueOf(all types)`

**Description:** Returns the string representation of the any data type argument.\
**Return Type:** `String`\
**Example:**

```java
String result = String.valueOf(123);
```

```java
double n1 = 32.5;

int n2 = 32;

String result1 = String.valueOf(n1); // Output:

String result2 = String.valueOf(n2); // Output:
```

### 17. `String toString()`

**Description:** Returns a string representation of the object.\
**Return Type:** `String`\
**Example:**

```java
Scanner sc= new Scanner(System.in);

String s1= sc.toString();
```

---

# ❓ <u>Important Output based Question</u>

1. ✏️ State the value of c and mantissa

   ```java
   String s="4.375";
   int n = s.indexOf('.');
   int c = Integer.parseInt(s.substring(0,n));
   int mantissa = Integer.valueOf(s.substring(n+1));

   ```

   ```
   Output -
    c: 4
    mantissa: 375
   ```

2. ✏️ Find the output

   ```java
   String s1= "yes";
   String s2= "yes";
   String s3= new String(s1);
   String s4 =s3;


   System.out.println(s1 == s2);

   System.out.println(s1.equals(s2));

   System.out.println(s1.equals(s3));

   <!-- System.out.println(s1.equals(s3)); -->

   System.out.println(s3== s4);

   System.out.println(s3.equals(s4));
   ```

   ```
   Output -



   ```

# 🧑‍💻 <u>Important Programs</u>

1. ✏️ Write a program to accept a string and display the reversed string.

   ```md
   Sample Input: Code2Serve Academy
   Sample Output: ymedacA evreS2edoC
   ```

   ```java
   import java.util.Scanner;

   public class Reverse {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String rev = "";
      char ch;

      for (int i = str.length() - 1; i >= 0; i--) {
          ch = str.charAt(i);
          rev = rev + ch;
      }

      System.err.println(rev);

    }
   }
   ```

2. ✏️ Write a Java method to check if a string is a palindrome.

   ```
   Sample Input:  Code2Serve Academy
   Sample Output: false

   Sample Input:  LOL
   Sample Output: true
   ```

   ```java
      import java.util.Scanner;

      public class Palindrome {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        char ch;

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rev = rev + ch;
        }

        if (str.equals(rev)) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }

      }

   }
   ```

3. ✏️ Write a program to accept a string and display the text with uppercase and lowercase reversed . **[ICSE- 2008]**

   ```
   Sample Input:  Code2Serve Academy
   Sample Output: cODE2sERVE aCADEMY
   ```

   ```java
    public class ReverseCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch >= 65 && ch <= 90) {
                ch += 32;
            } else if (ch >= 97 && ch <= 122) {
                ch -= 32;
            }

            res += ch;

        }

        System.out.println(res);

     }

   }
   ```

4. ✏️ Write a program to accept a string and change the first character of every word to upper case . **[ICSE- 2018]**

   ```
   Sample Input:  code2Serve academy is loved by all
   Sample Output: Code2Serve Academy Is Loved By All
   ```

   ```java
         import java.util.Scanner;

          public class FirstUpper {

              public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
                  String str = sc.nextLine().trim();
                  String res = "";
                  int len = str.length();
                  char ch, prev;

                  if (len > 0) {
                      ch = str.charAt(0);

                      res += String.valueOf(ch).toUpperCase();
                  }

                  for (int i = 1; i < len; i++) {
                      ch = str.charAt(i);
                      prev = str.charAt(i - 1);

                      if (prev == ' ') {
                          if (ch >= 97 && ch <= 122) {
                              ch -= 32;
                          }
                      }

                      res += ch;

                  }

                  System.out.println(res);

              }
          }
   ```

5. ✏️ Write a program to accept a string and print the length of the longest word in the given string . **[ICSE- 2009]**

   ```
   Sample Input:  code2Serve academy is loved by all
   Sample Output: 10
   ```

   ```java
        import java.util.Scanner;

        public class LongestWord {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                int start = 0, len = str.length(), longest = 0, count = 0;
                char ch;

                for (int i = 0; i < len; i++) {
                    ch = str.charAt(i);
                    if (ch == ' ' || i == len - 1) {
                        count = str.substring(start, i).length();

                        if (count > longest) {
                            longest = count;
                        }
                        start = i + 1;

                    }

                }

                System.out.print(longest);

            }
        }

   ```

6. ✏️ Write a program to accept a string and convert the string to uppercase display the number of double letter sequence in the given string . **[ICSE- 2012]**

   ```
   Sample Input:  code2Serve academy is loved by all
   Sample Output: 1
   ```

   ```java
       import java.util.Scanner;

        public class DoubleCount {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                char ch;
                int count = 0;

                for (int i = 0; i < str.length() - 1; i++) {
                    ch = str.charAt(i);
                    if (ch == str.charAt(i + 1)) {
                        count++;
                    }
                }

                System.out.println(count);

            }
        }

   ```

7. ✏️ Write a program to accept a string and display the frequency of each character after converting all to uppercase . **[ICSE- 2010]**

   ```
   Sample Input:  WELCOME TO ACADEMY
   Sample Output:

       CHARACTERS  A C D E L M O T W Y
       FREQUENCY   2 2 1 3 1 2 2 1 1 1
   ```

   ```java

        import java.util.Scanner;

        public class Frequency {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                //Array to store the count of each character
                //Count for A -> index 0
                //Count for B -> index 1
                // ...
                //Count for Z -> index 25
                int arr[] = new int[26];
                str = str.toUpperCase();
                char ch;
                int index;
                //To count the freq and store the same in the array
                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);
                    if (ch >= 65 && ch <= 90) {
                        index = ch - 65; //to get the index in the array to keep the count
                        arr[index]++;
                    }

                }

                //To print the characters
                System.out.print("CHARACTERS    ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        ch = (char) (i + 65);
                        System.out.print(ch + " ");
                    }
                }

                //To print the Frequency
                System.out.print("\nFREQUENCY    "); //"\n" to first go to next line then print FREQUENCY or we can also add Sopln() above this line
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        System.out.print(arr[i] + " ");
                    }
                }

            }
        }
   ```
