file:///H:/Downloads/java-interview-master/java-interview-master/src/main/java/collection/CollectionTest.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 71
uri: file:///H:/Downloads/java-interview-master/java-interview-master/src/main/java/collection/CollectionTest.java
text:
```scala
package collection;

import java.util.List;
import java.util.stream.Col@@lectors;

class CollectionTest {

  public static List<Double> compute1(List<Integer> input) {
    return input.stream()
        .map(x -> Math.pow((x * 2) + 3, 5))
        .collect(Collectors.toList());
  }

  public static List<String> compute2(List<String> input) {
    return input.stream()
        .map(s -> {
          if (s.isEmpty()) return s;
          String capitalized = Character.toUpperCase(s.charAt(0)) + s.substring(1);
          return capitalized + capitalized;
        })
        .collect(Collectors.toList());
  }

}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:36)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:389)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator