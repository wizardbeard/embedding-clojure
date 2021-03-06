package ssclojure;

import clojure.lang.RT;
import clojure.lang.Var;
import java.util.Collection;

/**
 * entry points into our jar.
 * I bet we could improve upon it by moving the RT initilization into
 * a static initializer.  Let's get it working in PostgreSQL first.
 */
public class PrettyCool {
    public static Collection<String> withTags(Collection<Object> collection) throws Exception {
	RT.loadResourceScript("ssclojure/core.clj");
	Var withTagsFunc = RT.var("ssclojure.core","withTags");
	return (Collection<String>) withTagsFunc.invoke(collection);
    }


    public static String hello(Object o) throws Exception {
	RT.loadResourceScript("ssclojure/core.clj");
	Var helloFunc = RT.var("ssclojure.core","hello");
	return (String) helloFunc.invoke(o);
    }

    public static void main(String[] args) throws Exception {
	System.out.println(hello("world"));
    }

    public static String hellos(String s) throws Exception {
	return hello(s);
    }
}
