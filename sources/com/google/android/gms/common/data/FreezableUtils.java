package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.nodes.Element;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        Element.b bVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            bVar.add(arrayList.get(i10).freeze());
        }
        return bVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        Element.b bVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            bVar.add(it.next().freeze());
        }
        return bVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        Element.b bVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            bVar.add(e10.freeze());
        }
        return bVar;
    }
}
