package io.infinite.supplies

import io.infinite.supplies.ast.metadata.MetaDataMethodNode
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.stmt.EmptyStatement
import org.junit.Test

class CompileExceptionTest {

    @Test
    void runTest() {
        MethodNode methodNode = new MethodNode("runTest", 0, ClassHelper.make(CompileExceptionTest.class), null, null, new EmptyStatement())
        methodNode.setDeclaringClass(ClassHelper.make(CompileExceptionTest.class))
        MetaDataMethodNode metaDataMethodNode = new MetaDataMethodNode(methodNode)
    }

}
