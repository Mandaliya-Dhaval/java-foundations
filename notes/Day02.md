1. .equals() vs ==?
-> == compare values in primitive types & for reference it checks reference(Same object), while .equals() check actual text value in reference/Non-primitive type

2. Why Scanner.nextLine() sometimes causes issues after nextInt() or nextDouble() (newline problem)
-> nextLine() is needed to consume the leftover newline character left in input buffer by previous numeric read (nextInt/nextDouble). Without consuming that newline, the nextcall to sc.nextLine() immediately return an empty string.