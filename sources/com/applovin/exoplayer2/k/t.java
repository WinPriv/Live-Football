package com.applovin.exoplayer2.k;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.k.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface t extends i {

    /* renamed from: a, reason: collision with root package name */
    public static final Predicate<String> f16188a = new Predicate() { // from class: com.applovin.exoplayer2.k.c0
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public final boolean apply(Object obj) {
            boolean a10;
            a10 = t.a((String) obj);
            return a10;
        }
    };

    /* loaded from: classes.dex */
    public static final class a extends c {
        public a(IOException iOException, l lVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, lVar, 2007, 1);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends i.a {
        @Override // com.applovin.exoplayer2.k.i.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        t a();
    }

    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: b, reason: collision with root package name */
        public final l f16189b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16190c;

        public c(l lVar, int i10, int i11) {
            super(a(i10, i11));
            this.f16189b = lVar;
            this.f16190c = i11;
        }

        private static int a(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static c a(IOException iOException, l lVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i11 == 2007) {
                return new a(iOException, lVar);
            }
            return new c(iOException, lVar, i11, i10);
        }

        public c(String str, l lVar, int i10, int i11) {
            super(str, a(i10, i11));
            this.f16189b = lVar;
            this.f16190c = i11;
        }

        public c(IOException iOException, l lVar, int i10, int i11) {
            super(iOException, a(i10, i11));
            this.f16189b = lVar;
            this.f16190c = i11;
        }

        public c(String str, IOException iOException, l lVar, int i10, int i11) {
            super(str, iOException, a(i10, i11));
            this.f16189b = lVar;
            this.f16190c = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: d, reason: collision with root package name */
        public final String f16191d;

        public d(String str, l lVar) {
            super(s.f.b("Invalid content type: ", str), lVar, 2003, 1);
            this.f16191d = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: d, reason: collision with root package name */
        public final int f16192d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16193e;
        public final Map<String, List<String>> f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f16194g;

        public e(int i10, String str, IOException iOException, Map<String, List<String>> map, l lVar, byte[] bArr) {
            super(a3.l.i("Response code: ", i10), iOException, lVar, 2004, 1);
            this.f16192d = i10;
            this.f16193e = str;
            this.f = map;
            this.f16194g = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f16195a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f16196b;

        public synchronized Map<String, String> a() {
            if (this.f16196b == null) {
                this.f16196b = Collections.unmodifiableMap(new HashMap(this.f16195a));
            }
            return this.f16196b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = Ascii.toLowerCase(str);
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        if ((lowerCase.contains(com.anythink.expressad.exoplayer.k.o.f9070c) && !lowerCase.contains(com.anythink.expressad.exoplayer.k.o.O)) || lowerCase.contains("html") || lowerCase.contains("xml")) {
            return false;
        }
        return true;
    }
}
