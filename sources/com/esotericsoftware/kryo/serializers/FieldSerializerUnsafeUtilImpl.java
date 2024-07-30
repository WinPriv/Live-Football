package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class FieldSerializerUnsafeUtilImpl implements FieldSerializerUnsafeUtil {
    private FieldSerializer serializer;

    public FieldSerializerUnsafeUtilImpl(FieldSerializer fieldSerializer) {
        this.serializer = fieldSerializer;
    }

    private int fieldSizeOf(Class<?> cls) {
        if (cls != Integer.TYPE && cls != Float.TYPE) {
            if (cls != Long.TYPE && cls != Double.TYPE) {
                if (cls != Byte.TYPE && cls != Boolean.TYPE) {
                    if (cls != Short.TYPE && cls != Character.TYPE) {
                        return UnsafeUtil.unsafe().addressSize();
                    }
                    return 2;
                }
                return 1;
            }
            return 8;
        }
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createUnsafeCacheFieldsAndRegions(java.util.List<java.lang.reflect.Field> r25, java.util.List<com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField> r26, int r27, com.esotericsoftware.kryo.util.IntArray r28) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtilImpl.createUnsafeCacheFieldsAndRegions(java.util.List, java.util.List, int, com.esotericsoftware.kryo.util.IntArray):void");
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil
    public long getObjectFieldOffset(Field field) {
        return UnsafeUtil.unsafe().objectFieldOffset(field);
    }
}
