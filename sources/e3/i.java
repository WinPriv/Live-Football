package e3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<h>> f27688b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map<String, String> f27689c;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final Map<String, List<h>> f27690b;

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<h>> f27691a = f27690b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f27690b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final String f27692a;

        public b(String str) {
            this.f27692a = str;
        }

        @Override // e3.h
        public final String a() {
            return this.f27692a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f27692a.equals(((b) obj).f27692a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f27692a.hashCode();
        }

        public final String toString() {
            return a3.l.p(new StringBuilder("StringHeaderFactory{value='"), this.f27692a, "'}");
        }
    }

    public i(Map<String, List<h>> map) {
        this.f27688b = Collections.unmodifiableMap(map);
    }

    @Override // e3.g
    public final Map<String, String> a() {
        if (this.f27689c == null) {
            synchronized (this) {
                if (this.f27689c == null) {
                    this.f27689c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f27689c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<h>> entry : this.f27688b.entrySet()) {
            List<h> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = value.get(i10).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i10 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f27688b.equals(((i) obj).f27688b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27688b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f27688b + '}';
    }
}
