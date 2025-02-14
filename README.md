# NullPointerException in Scala Class

This example demonstrates a common error in Scala: a NullPointerException caused by passing a null value to a class constructor and then attempting to use that value without handling the null case.  The `MyClass` constructor accepts a `String` but the `main` method initializes it with `null`. When `printName` attempts to use this null value, it throws a `NullPointerException`.

The solution shows how to handle null values correctly, avoiding the exception.

## How to Reproduce

1. Save the code in `bug.scala`.
2. Compile and run using the Scala compiler: `scalac bug.scala && scala MainObject`
3. Observe the NullPointerException.

## Solution

The solution is to either prevent null values from being passed to the constructor or handle them gracefully within the class.