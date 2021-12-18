Doubts related to Caching

- where is setSavedProps() / who is setting the values ?
- how a final variable is uninitialized and still compiles ?	// solved
```java
	static final int high
```
- why high is set through getSavedProperty(), but low is initialized during declaration itself ?
- can `savedProps` be modified ?
	+ I guess NO. 
	```java
		Collections.unmodifiableMap(savedProps);
	```
	+ `getSavedProps()` returns this on success


Where is length ? `arr.length`

A special piece of code is appended everytime an array is declared.
```java
class A<T> implements Clonable, Serializable {
	public static final int length = X;	// if Clonable and Serializable are empty where is this X coming from ?
	// clone method
	//...
	super.clone()						// what does this super refer to ? Object class or Class class
	//...
}
```


Why is Clonable and Serializable interfaces have no body although they are not native ?
