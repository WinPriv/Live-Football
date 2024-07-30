package com.esotericsoftware.kryo.util;

import a3.k;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import sun.misc.Cleaner;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

/* loaded from: classes.dex */
public class UnsafeUtil {
    private static final Unsafe _unsafe;
    public static final long byteArrayBaseOffset;
    public static final long charArrayBaseOffset;
    static Constructor<? extends ByteBuffer> directByteBufferConstr;
    public static final long doubleArrayBaseOffset;
    public static final long floatArrayBaseOffset;
    public static final long intArrayBaseOffset;
    public static final long longArrayBaseOffset;
    public static final long shortArrayBaseOffset;

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    static {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.UnsafeUtil.<clinit>():void");
    }

    public static final ByteBuffer getDirectBufferAt(long j10, int i10) {
        Constructor<? extends ByteBuffer> constructor = directByteBufferConstr;
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(Long.valueOf(j10), Integer.valueOf(i10), null);
        } catch (Exception e10) {
            throw new RuntimeException(k.k("Cannot allocate ByteBuffer at a given address: ", j10), e10);
        }
    }

    public static void releaseBuffer(ByteBuffer byteBuffer) {
        Cleaner cleaner;
        if (byteBuffer != null && byteBuffer.isDirect() && (cleaner = ((DirectBuffer) byteBuffer).cleaner()) != null) {
            cleaner.clean();
        }
    }

    public static Field[] sortFieldsByOffset(List<Field> list) {
        Field[] fieldArr = (Field[]) list.toArray(new Field[0]);
        Arrays.sort(fieldArr, new Comparator<Field>() { // from class: com.esotericsoftware.kryo.util.UnsafeUtil.1
            @Override // java.util.Comparator
            public int compare(Field field, Field field2) {
                long objectFieldOffset = UnsafeUtil.unsafe().objectFieldOffset(field);
                long objectFieldOffset2 = UnsafeUtil.unsafe().objectFieldOffset(field2);
                if (objectFieldOffset < objectFieldOffset2) {
                    return -1;
                }
                return objectFieldOffset == objectFieldOffset2 ? 0 : 1;
            }
        });
        for (Field field : list) {
            if (Log.TRACE) {
                Log.trace("kryo", "Field '" + field.getName() + "' at offset " + unsafe().objectFieldOffset(field));
            }
        }
        return fieldArr;
    }

    public static final Unsafe unsafe() {
        return _unsafe;
    }
}
