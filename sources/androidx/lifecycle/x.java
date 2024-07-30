package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import i1.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class x {
    public static final Class<? extends Object>[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2006a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2007b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2008c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2009d;

    /* renamed from: e, reason: collision with root package name */
    public final b.InterfaceC0395b f2010e;

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static x a(Bundle bundle, Bundle bundle2) {
            boolean z10;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new x();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    zc.d.c(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new x(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    if (obj != null) {
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return new x(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public x(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2006a = linkedHashMap;
        this.f2007b = new LinkedHashMap();
        this.f2008c = new LinkedHashMap();
        this.f2009d = new LinkedHashMap();
        this.f2010e = new b.InterfaceC0395b() { // from class: androidx.lifecycle.w
            @Override // i1.b.InterfaceC0395b
            public final Bundle a() {
                return x.a(x.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle a(androidx.lifecycle.x r10) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.a(androidx.lifecycle.x):android.os.Bundle");
    }

    public x() {
        this.f2006a = new LinkedHashMap();
        this.f2007b = new LinkedHashMap();
        this.f2008c = new LinkedHashMap();
        this.f2009d = new LinkedHashMap();
        this.f2010e = new b.InterfaceC0395b() { // from class: androidx.lifecycle.w
            @Override // i1.b.InterfaceC0395b
            public final Bundle a() {
                return x.a(x.this);
            }
        };
    }
}
