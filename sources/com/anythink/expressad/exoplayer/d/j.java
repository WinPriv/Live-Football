package com.anythink.expressad.exoplayer.d;

import com.anythink.expressad.exoplayer.d.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface j<T extends i> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7702a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7703b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7704c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7705d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7706e = 2;
    public static final int f = 3;

    /* loaded from: classes.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f7707a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7708b;

        public a(byte[] bArr, String str) {
            this.f7707a = bArr;
            this.f7708b = str;
        }

        @Override // com.anythink.expressad.exoplayer.d.j.d
        public final byte[] a() {
            return this.f7707a;
        }

        @Override // com.anythink.expressad.exoplayer.d.j.d
        public final String b() {
            return this.f7708b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f7709a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f7710b;

        public b(int i10, byte[] bArr) {
            this.f7709a = i10;
            this.f7710b = bArr;
        }

        @Override // com.anythink.expressad.exoplayer.d.j.e
        public final int a() {
            return this.f7709a;
        }

        @Override // com.anythink.expressad.exoplayer.d.j.e
        public final byte[] b() {
            return this.f7710b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f7711a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7712b;

        public c(byte[] bArr, String str) {
            this.f7711a = bArr;
            this.f7712b = str;
        }

        @Override // com.anythink.expressad.exoplayer.d.j.h
        public final byte[] a() {
            return this.f7711a;
        }

        @Override // com.anythink.expressad.exoplayer.d.j.h
        public final String b() {
            return this.f7712b;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        byte[] a();

        String b();
    }

    /* loaded from: classes.dex */
    public interface e {
        int a();

        byte[] b();
    }

    /* loaded from: classes.dex */
    public interface f<T extends i> {
        void a(byte[] bArr, int i10);
    }

    /* loaded from: classes.dex */
    public interface g<T extends i> {
        void a();
    }

    /* loaded from: classes.dex */
    public interface h {
        byte[] a();

        String b();
    }

    d a(byte[] bArr, byte[] bArr2, String str, int i10, HashMap<String, String> hashMap);

    String a(String str);

    void a(f<? super T> fVar);

    void a(g<? super T> gVar);

    void a(String str, String str2);

    void a(String str, byte[] bArr);

    void a(byte[] bArr);

    byte[] a();

    byte[] a(byte[] bArr, byte[] bArr2);

    h b();

    void b(byte[] bArr);

    void b(byte[] bArr, byte[] bArr2);

    byte[] b(String str);

    Map<String, String> c(byte[] bArr);

    void c();

    T d(byte[] bArr);
}
