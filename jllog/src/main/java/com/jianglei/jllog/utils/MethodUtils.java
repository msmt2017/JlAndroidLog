package com.jianglei.jllog.utils;

import android.support.annotation.Nullable;

import com.jianglei.jllog.methodtrace.MethodStack.MethodNode;

import java.util.List;

/**
 * @author longyi created on 19-6-14
 */
public class MethodUtils {

    /**
     * 在节点列表中查找某个符合某个方法的节点
     *
     * @param allNodes         被查找的节点
     * @param classNameAndHash 类名@hashCode
     * @param methodName       方法名称
     * @return 如果查找到节点，返回该节点，否则返回null
     */
    @Nullable
    public static MethodNode findMethodNode(List<MethodNode> allNodes, String classNameAndHash,
                                              String methodName,String desc) {
        if (allNodes == null || allNodes.size() == 0) {
            return null;
        }
        for (MethodNode node : allNodes) {
            if (node.isEqual(classNameAndHash,methodName,desc)) {
                return node;
            }
        }
        return null;
    }
}
