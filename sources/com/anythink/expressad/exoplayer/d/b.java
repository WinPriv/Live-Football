package com.anythink.expressad.exoplayer.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.exoplayer.d.c;
import com.anythink.expressad.exoplayer.d.e;
import com.anythink.expressad.exoplayer.d.f;
import com.anythink.expressad.exoplayer.d.i;
import com.anythink.expressad.exoplayer.d.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(18)
/* loaded from: classes.dex */
public final class b<T extends i> implements f<T> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f7635i = "DefaultDrmSession";

    /* renamed from: j, reason: collision with root package name */
    private static final int f7636j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7637k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f7638l = 60;
    private byte[] A;
    private Object B;
    private Object C;

    /* renamed from: a, reason: collision with root package name */
    final n f7639a;

    /* renamed from: b, reason: collision with root package name */
    final UUID f7640b;

    /* renamed from: c, reason: collision with root package name */
    final b<T>.HandlerC0098b f7641c;

    /* renamed from: m, reason: collision with root package name */
    private final j<T> f7642m;

    /* renamed from: n, reason: collision with root package name */
    private final c<T> f7643n;
    private final e.a o;

    /* renamed from: p, reason: collision with root package name */
    private final int f7644p;

    /* renamed from: q, reason: collision with root package name */
    private final HashMap<String, String> f7645q;

    /* renamed from: r, reason: collision with root package name */
    private final c.a f7646r;

    /* renamed from: s, reason: collision with root package name */
    private final int f7647s;

    /* renamed from: t, reason: collision with root package name */
    private int f7648t;

    /* renamed from: u, reason: collision with root package name */
    private int f7649u;

    /* renamed from: v, reason: collision with root package name */
    private HandlerThread f7650v;

    /* renamed from: w, reason: collision with root package name */
    private b<T>.a f7651w;

    /* renamed from: x, reason: collision with root package name */
    private T f7652x;
    private f.a y;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f7653z;

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, z10 ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z10;
            int i10;
            Object obj;
            Object obj2 = message.obj;
            boolean z11 = true;
            try {
                int i11 = message.what;
                if (i11 != 0) {
                    if (i11 == 1) {
                        Object obj3 = ((Pair) obj2).first;
                        obj = b.this.f7639a.b();
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    obj = b.this.f7639a.a();
                }
            } catch (Exception e10) {
                if (message.arg1 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (i10 = message.arg2 + 1) > b.this.f7647s) {
                    z11 = false;
                } else {
                    Message obtain = Message.obtain(message);
                    obtain.arg2 = i10;
                    sendMessageDelayed(obtain, Math.min((i10 - 1) * 1000, 5000));
                }
                if (z11) {
                    return;
                } else {
                    obj = e10;
                }
            }
            b.this.f7641c.obtainMessage(message.what, Pair.create(obj2, obj)).sendToTarget();
        }

        private boolean a(Message message) {
            int i10;
            if (!(message.arg1 == 1) || (i10 = message.arg2 + 1) > b.this.f7647s) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i10;
            sendMessageDelayed(obtain, Math.min((i10 - 1) * 1000, 5000));
            return true;
        }

        private static long a(int i10) {
            return Math.min((i10 - 1) * 1000, 5000);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.anythink.expressad.exoplayer.d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0098b extends Handler {
        public HandlerC0098b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.b(b.this, obj, obj2);
                    return;
                }
                return;
            }
            b.a(b.this, obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public interface c<T extends i> {
        void a();

        void a(b<T> bVar);

        void a(Exception exc);
    }

    public b(UUID uuid, j<T> jVar, c<T> cVar, e.a aVar, int i10, byte[] bArr, HashMap<String, String> hashMap, n nVar, Looper looper, c.a aVar2, int i11) {
        this.f7640b = uuid;
        this.f7643n = cVar;
        this.f7642m = jVar;
        this.f7644p = i10;
        this.A = bArr;
        this.o = bArr != null ? null : aVar;
        this.f7645q = hashMap;
        this.f7639a = nVar;
        this.f7647s = i11;
        this.f7646r = aVar2;
        this.f7648t = 2;
        this.f7641c = new HandlerC0098b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f7650v = handlerThread;
        handlerThread.start();
        this.f7651w = new a(this.f7650v.getLooper());
    }

    private boolean j() {
        if (n()) {
            return true;
        }
        try {
            byte[] a10 = this.f7642m.a();
            this.f7653z = a10;
            this.f7652x = this.f7642m.d(a10);
            this.f7648t = 3;
            return true;
        } catch (Exception e10) {
            c(e10);
            return false;
        }
    }

    private boolean k() {
        try {
            this.f7642m.b(this.f7653z, this.A);
            return true;
        } catch (Exception e10) {
            Log.e(f7635i, "Error trying to restore Widevine keys.", e10);
            c(e10);
            return false;
        }
    }

    private long l() {
        if (!com.anythink.expressad.exoplayer.b.bk.equals(this.f7640b)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> a10 = p.a(this);
        return Math.min(((Long) a10.first).longValue(), ((Long) a10.second).longValue());
    }

    private void m() {
        if (this.f7648t == 4) {
            this.f7648t = 3;
            c(new m());
        }
    }

    private boolean n() {
        int i10 = this.f7648t;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        int i10 = this.f7649u - 1;
        this.f7649u = i10;
        if (i10 != 0) {
            return false;
        }
        this.f7648t = 0;
        this.f7641c.removeCallbacksAndMessages(null);
        this.f7651w.removeCallbacksAndMessages(null);
        this.f7651w = null;
        this.f7650v.quit();
        this.f7650v = null;
        this.f7652x = null;
        this.y = null;
        this.B = null;
        this.C = null;
        byte[] bArr = this.f7653z;
        if (bArr != null) {
            this.f7642m.a(bArr);
            this.f7653z = null;
        }
        return true;
    }

    public final void c() {
        j.h b10 = this.f7642m.b();
        this.C = b10;
        this.f7651w.a(0, b10, true);
    }

    public final void d() {
        if (j()) {
            a(true);
        }
    }

    @Override // com.anythink.expressad.exoplayer.d.f
    public final int e() {
        return this.f7648t;
    }

    @Override // com.anythink.expressad.exoplayer.d.f
    public final f.a f() {
        if (this.f7648t == 1) {
            return this.y;
        }
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.d.f
    public final T g() {
        return this.f7652x;
    }

    @Override // com.anythink.expressad.exoplayer.d.f
    public final Map<String, String> h() {
        byte[] bArr = this.f7653z;
        if (bArr == null) {
            return null;
        }
        return this.f7642m.c(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.d.f
    public final byte[] i() {
        return this.A;
    }

    public final void a() {
        int i10 = this.f7649u + 1;
        this.f7649u = i10;
        if (i10 == 1 && this.f7648t != 1 && j()) {
            a(true);
        }
    }

    private void c(Exception exc) {
        this.y = new f.a(exc);
        this.f7646r.a(exc);
        if (this.f7648t != 4) {
            this.f7648t = 1;
        }
    }

    public final boolean a(byte[] bArr) {
        e.a aVar = this.o;
        return Arrays.equals(aVar != null ? aVar.f7694c : null, bArr);
    }

    public final void a(int i10) {
        if (n()) {
            if (i10 == 1) {
                this.f7648t = 3;
                this.f7643n.a(this);
            } else {
                if (i10 != 2) {
                    if (i10 == 3 && this.f7648t == 4) {
                        this.f7648t = 3;
                        c(new m());
                        return;
                    }
                    return;
                }
                a(false);
            }
        }
    }

    public final void a(Exception exc) {
        c(exc);
    }

    private void a(Object obj, Object obj2) {
        if (obj == this.C) {
            if (this.f7648t == 2 || n()) {
                this.C = null;
                if (obj2 instanceof Exception) {
                    this.f7643n.a((Exception) obj2);
                    return;
                }
                try {
                    this.f7642m.b((byte[]) obj2);
                    this.f7643n.a();
                } catch (Exception e10) {
                    this.f7643n.a(e10);
                }
            }
        }
    }

    public final boolean b(byte[] bArr) {
        return Arrays.equals(this.f7653z, bArr);
    }

    private void b(Object obj, Object obj2) {
        if (obj == this.B && n()) {
            this.B = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f7644p == 3) {
                    this.f7642m.a(this.A, bArr);
                    this.f7646r.c();
                    return;
                }
                byte[] a10 = this.f7642m.a(this.f7653z, bArr);
                int i10 = this.f7644p;
                if ((i10 == 2 || (i10 == 0 && this.A != null)) && a10 != null && a10.length != 0) {
                    this.A = a10;
                }
                this.f7648t = 4;
                this.f7646r.a();
            } catch (Exception e10) {
                b(e10);
            }
        }
    }

    private void a(boolean z10) {
        int i10 = this.f7644p;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 && k()) {
                    a(3, z10);
                    return;
                }
                return;
            }
            if (this.A == null) {
                a(2, z10);
                return;
            } else {
                if (k()) {
                    a(2, z10);
                    return;
                }
                return;
            }
        }
        if (this.A == null) {
            a(1, z10);
            return;
        }
        if (this.f7648t == 4 || k()) {
            long l10 = l();
            if (this.f7644p == 0 && l10 <= 60) {
                Log.d(f7635i, "Offline license has expired or will expire soon. Remaining seconds: ".concat(String.valueOf(l10)));
                a(2, z10);
            } else if (l10 <= 0) {
                c(new m());
            } else {
                this.f7648t = 4;
                this.f7646r.b();
            }
        }
    }

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f7643n.a(this);
        } else {
            c(exc);
        }
    }

    public static /* synthetic */ void b(b bVar, Object obj, Object obj2) {
        if (obj == bVar.B && bVar.n()) {
            bVar.B = null;
            if (obj2 instanceof Exception) {
                bVar.b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (bVar.f7644p == 3) {
                    bVar.f7642m.a(bVar.A, bArr);
                    bVar.f7646r.c();
                    return;
                }
                byte[] a10 = bVar.f7642m.a(bVar.f7653z, bArr);
                int i10 = bVar.f7644p;
                if ((i10 == 2 || (i10 == 0 && bVar.A != null)) && a10 != null && a10.length != 0) {
                    bVar.A = a10;
                }
                bVar.f7648t = 4;
                bVar.f7646r.a();
            } catch (Exception e10) {
                bVar.b(e10);
            }
        }
    }

    private void a(int i10, boolean z10) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2 = i10 == 3 ? this.A : this.f7653z;
        e.a aVar = this.o;
        if (aVar != null) {
            byte[] bArr3 = aVar.f7694c;
            String str3 = aVar.f7693b;
            str = aVar.f7692a;
            str2 = str3;
            bArr = bArr3;
        } else {
            str = null;
            bArr = null;
            str2 = null;
        }
        try {
            Pair create = Pair.create(this.f7642m.a(bArr2, bArr, str2, i10, this.f7645q), str);
            this.B = create;
            this.f7651w.a(1, create, z10);
        } catch (Exception e10) {
            b(e10);
        }
    }

    public static /* synthetic */ void a(b bVar, Object obj, Object obj2) {
        if (obj == bVar.C) {
            if (bVar.f7648t == 2 || bVar.n()) {
                bVar.C = null;
                if (obj2 instanceof Exception) {
                    bVar.f7643n.a((Exception) obj2);
                    return;
                }
                try {
                    bVar.f7642m.b((byte[]) obj2);
                    bVar.f7643n.a();
                } catch (Exception e10) {
                    bVar.f7643n.a(e10);
                }
            }
        }
    }
}
