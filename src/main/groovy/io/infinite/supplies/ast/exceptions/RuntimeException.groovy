package io.infinite.supplies.ast.exceptions

import groovy.transform.CompileStatic
import io.infinite.supplies.ast.metadata.MetaDataASTNode

@CompileStatic
class RuntimeException extends Exception {

    RuntimeException(String var1) {
        super(var1)
    }

    RuntimeException(String var1, Exception exception) {
        super(var1, exception)
        this.setStackTrace([] as StackTraceElement[])
    }

    RuntimeException(MetaDataASTNode metaDataASTNode, Exception exception) {
        super(metaDataASTNode.toString(), exception)
        this.setStackTrace([] as StackTraceElement[])
    }

}