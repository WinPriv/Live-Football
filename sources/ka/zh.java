package ka;

import android.content.Context;
import android.util.SparseArray;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zh {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f32271a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray<SoftReference<gi>> f32272b;

    static {
        ArrayList arrayList = new ArrayList();
        f32271a = arrayList;
        f32272b = new SparseArray<>();
        arrayList.add(1);
        arrayList.add(16);
        arrayList.add(-1);
        arrayList.add(60);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(12);
        arrayList.add(8);
        arrayList.add(13);
        arrayList.add(18);
    }

    public static gi a(int i10, Context context) {
        gi giVar;
        SparseArray<SoftReference<gi>> sparseArray = f32272b;
        SoftReference<gi> softReference = sparseArray.get(i10);
        if (softReference != null) {
            giVar = softReference.get();
        } else {
            giVar = null;
        }
        if (giVar == null) {
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 != 7) {
                        if (i10 != 12) {
                            if (i10 != 16 && i10 != 18) {
                                if (i10 != 60) {
                                    giVar = new bi(context, i10);
                                } else {
                                    giVar = new ci(context);
                                }
                            }
                        } else {
                            giVar = new ai(context);
                        }
                    } else {
                        giVar = new sh(context, 1);
                    }
                }
                giVar = new fi(context, i10);
            } else {
                giVar = new sh(context, 0);
            }
            sparseArray.put(i10, new SoftReference<>(giVar));
        }
        return giVar;
    }
}
