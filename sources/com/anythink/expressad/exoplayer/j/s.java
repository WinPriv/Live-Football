package com.anythink.expressad.exoplayer.j;

import android.text.TextUtils;
import com.anythink.expressad.exoplayer.j.h;
import com.anythink.expressad.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface s extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final com.anythink.expressad.exoplayer.k.u<String> f8898c = new com.anythink.expressad.exoplayer.k.u<String>() { // from class: com.anythink.expressad.exoplayer.j.s.1
        @Override // com.anythink.expressad.exoplayer.k.u
        public final /* synthetic */ boolean a(String str) {
            String d10 = af.d(str);
            if (TextUtils.isEmpty(d10)) {
                return false;
            }
            return ((d10.contains(com.anythink.expressad.exoplayer.k.o.f9070c) && !d10.contains(com.anythink.expressad.exoplayer.k.o.O)) || d10.contains("html") || d10.contains("xml")) ? false : true;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static boolean a2(String str) {
            String d10 = af.d(str);
            if (TextUtils.isEmpty(d10)) {
                return false;
            }
            return ((d10.contains(com.anythink.expressad.exoplayer.k.o.f9070c) && !d10.contains(com.anythink.expressad.exoplayer.k.o.O)) || d10.contains("html") || d10.contains("xml")) ? false : true;
        }
    };

    /* loaded from: classes.dex */
    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final f f8899a = new f();

        public abstract s a(f fVar);

        @Override // com.anythink.expressad.exoplayer.j.s.b, com.anythink.expressad.exoplayer.j.h.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            return a(this.f8899a);
        }

        @Override // com.anythink.expressad.exoplayer.j.s.b
        public final f c() {
            return this.f8899a;
        }

        @Override // com.anythink.expressad.exoplayer.j.s.b
        @Deprecated
        public final void d() {
            this.f8899a.a();
        }

        @Override // com.anythink.expressad.exoplayer.j.s.b
        @Deprecated
        public final void a(String str, String str2) {
            this.f8899a.a(str, str2);
        }

        @Override // com.anythink.expressad.exoplayer.j.s.b
        @Deprecated
        public final void a(String str) {
            this.f8899a.a(str);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends h.a {
        @Deprecated
        void a(String str);

        @Deprecated
        void a(String str, String str2);

        @Override // com.anythink.expressad.exoplayer.j.h.a
        /* renamed from: b */
        s a();

        f c();

        @Deprecated
        void d();
    }

    /* loaded from: classes.dex */
    public static final class d extends c {
        public final String f;

        public d(String str, k kVar) {
            super("Invalid content type: ".concat(String.valueOf(str)), kVar);
            this.f = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final Map<String, List<String>> f8905g;

        public e(int i10, Map<String, List<String>> map, k kVar) {
            super("Response code: ".concat(String.valueOf(i10)), kVar);
            this.f = i10;
            this.f8905g = map;
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.h
    int a(byte[] bArr, int i10, int i11);

    @Override // com.anythink.expressad.exoplayer.j.h
    long a(k kVar);

    void a(String str);

    void a(String str, String str2);

    @Override // com.anythink.expressad.exoplayer.j.h
    void b();

    Map<String, List<String>> c();

    void d();

    /* loaded from: classes.dex */
    public static class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8900a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8901b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8902c = 3;

        /* renamed from: d, reason: collision with root package name */
        public final int f8903d;

        /* renamed from: e, reason: collision with root package name */
        public final k f8904e;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        private c(k kVar, int i10) {
            this.f8904e = kVar;
            this.f8903d = i10;
        }

        public c(String str, k kVar) {
            super(str);
            this.f8904e = kVar;
            this.f8903d = 1;
        }

        public c(IOException iOException, k kVar, int i10) {
            super(iOException);
            this.f8904e = kVar;
            this.f8903d = i10;
        }

        public c(String str, IOException iOException, k kVar) {
            super(str, iOException);
            this.f8904e = kVar;
            this.f8903d = 1;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f8906a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f8907b;

        private synchronized void b(Map<String, String> map) {
            this.f8907b = null;
            this.f8906a.clear();
            this.f8906a.putAll(map);
        }

        public final synchronized void a(String str, String str2) {
            this.f8907b = null;
            this.f8906a.put(str, str2);
        }

        private synchronized void a(Map<String, String> map) {
            this.f8907b = null;
            this.f8906a.putAll(map);
        }

        public final synchronized Map<String, String> b() {
            if (this.f8907b == null) {
                this.f8907b = Collections.unmodifiableMap(new HashMap(this.f8906a));
            }
            return this.f8907b;
        }

        public final synchronized void a(String str) {
            this.f8907b = null;
            this.f8906a.remove(str);
        }

        public final synchronized void a() {
            this.f8907b = null;
            this.f8906a.clear();
        }
    }
}
