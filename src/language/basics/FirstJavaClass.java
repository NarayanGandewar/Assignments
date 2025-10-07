package language.basics;

public class FirstJavaClass {

	// This is a main method, And always JVM begin the execution from main method
	//Comments in Java are mainly three different categories
	//1. Single line comment ==> //
	//2. Multi-line comment ++> /*....*/
	//3. Documentation comment==> /**..*/
	
	/*
	 * HelloWorld.java
	 * --------------
	 * This is a simple Java program that prints "Hello, World!" to the console.
	 * It also explains every part of the main() method in plain English
	 * 
	 */
	
	/**
	 * This is the main method . tje starting point for any java program
	 * 
	 * <p>
	 * Important Notes:
	 * </p>
	 * <url>
	 * <li><strong>puplic:</strong>Makes the method accessible to the JVM.</li>
	 * <li><strong>static:</strong>Allows calling without creating an object of the class.</li>
	 * <li><strong>void:</strong>Doesen't Return any value.</li>
	 * <li><strong>String[] args:</strong>Accept command line arguments.</li>
	 * </url>
	 * 
	 * @param args Command- line arguments passed to the program.
	 */
	
	
	/**
	 * This is the common base class of all Java language enumeration classesAndObjects.
	 *
	 * More information about enums, including descriptions of the
	 * implicitly declared methods synthesized by the compiler, can be
	 * found in section {@jls 8.9} of <cite>The Java Language
	 * Specification</cite>.
	 *
	 * Enumeration classesAndObjects are all serializable and receive special handling
	 * by the serialization mechanism. The serialized representation used
	 * for enum constants cannot be customized. Declarations of methods
	 * and fields that would otherwise interact with serialization are
	 * ignored, including {@code serialVersionUID}; see the
	 * <a href="{@docRoot}/../specs/serialization/index.html"><cite>Java
	 * Object Serialization Specification</cite></a> for details.
	 *
	 * <p> Note that when using an enumeration type as the type of a set
	 * or as the type of the keys in a map, specialized and efficient
	 * {@linkplain java.util.EnumSet set} and {@linkplain
	 * java.util.EnumMap map} implementations are available.
	 *
	 * @param <E> The type of the enum subclass
	 *
	 * @spec serialization/index.html Java Object Serialization Specification
	 * @serial exclude
	 * @author  Josh Bloch
	 * @author  Neal Gafter
	 * @see     Class#getEnumConstants()
	 * @see     java.util.EnumSet
	 * @see     java.util.EnumMap
	 * @jls 8.9 Enum Classes
	 * @jls 8.9.3 Enum Members
	 * @since   1.5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
