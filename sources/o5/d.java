package o5;

import java.util.ArrayList;

/* compiled from: DefaultHlsExtractorFactory.java */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f33634b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i10, ArrayList arrayList) {
        int[] iArr = f33634b;
        int i11 = 0;
        while (true) {
            if (i11 < 7) {
                if (iArr[i11] == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }
}
