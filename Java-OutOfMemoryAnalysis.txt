Question - Imagine that you have to process a large unsorted CSV file in Java/Scala/Clojure or Kotlin
with two columns: productId (Int) and availableIn (ISO2 String, e.g. "US", "NL"). The goal
is to group the file sorted by productId together with a list where the product is available.
Example:
1, "DE"
2, "NL"
1, "US"
3, "US"
Becomes:
1 -> ["DE", "US"]
2 -> ["NL"]
3 -> ["US"]
You have to process the file in-memory and unfortunately, the program crashes with a
java.lang.OutOfMemoryError after processing approx. 80%. What would you do to
succeed?

Answer - 

Context of the problem
It depends on the type of java.lang.OutOfMemoryError . Basically this error occurs when there is no / insufficient space to allocate in memory heap / no space available to create a new object / too much time taken on garbage collection resulting in small amount of Memory freed up.

Approaches to solve the problem -
 1) Checking the way File is being read. Best possible way is to Stream the file which is independent of JAVA/SCALA/KOTLIN (Eg - Utilization of InputStreamReader)
 2) Clearing each row after read. 
 3) May be due to misconfiguration against GCOverheadLimit --> Temporary / Non Recommended Solution
 