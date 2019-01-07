package io.infinite.supplies.ast.cache


import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Caches the initialization of annotated field.<br>
 * Cache is on class level (cache is static).<br>
 * Field should be final.<br>
 * Field should not be static.<br>
 * This is an eager cache.<br>
 * Polymorphism is not supported - cache is global per class hierarchy.<br>
 * Example usage:<br>
 * <pre><code>
 *     &#64;Static
 *     final File file = new File("./file.txt")
 * </code></pre>
 * Is transformed to:<br>
 * <pre><code>
 *     static EagerMap eagerMap = new EagerMap()
 *     final File file = eagerMap.passThrough('file', {
 *         new File("./")
 *     })
 * </code></pre>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@GroovyASTTransformationClass("io.infinite.supplies.ast.cache.StaticTransformation")
@interface Static {

}