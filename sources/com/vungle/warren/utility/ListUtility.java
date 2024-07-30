package com.vungle.warren.utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ListUtility {
    public static <T> List<List<T>> partition(Collection<T> collection, int i10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
            if (arrayList2.size() == i10) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
