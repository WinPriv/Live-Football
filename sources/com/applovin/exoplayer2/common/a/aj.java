package com.applovin.exoplayer2.common.a;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
final class aj {
    public static <K, V> Map<K, V> a(int i10) {
        return l.a(i10);
    }

    public static <K, V> Map<K, V> a() {
        return l.a();
    }

    public static <T> T[] a(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }
}
