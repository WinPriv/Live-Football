package com.anythink.core.common.g.a;

import com.anythink.core.common.b.n;
import com.anythink.core.common.g.a.c;
import com.anythink.core.common.k.h;
import com.anythink.expressad.exoplayer.k.p;
import com.huawei.openalliance.ad.constant.w;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    private static d f5845g;

    /* renamed from: h, reason: collision with root package name */
    private String f5851h;

    /* renamed from: i, reason: collision with root package name */
    private int f5852i;

    /* renamed from: j, reason: collision with root package name */
    private Socket f5853j;

    /* renamed from: c, reason: collision with root package name */
    private final int f5848c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f5849d = 7;

    /* renamed from: e, reason: collision with root package name */
    private final int f5850e = 1;
    private final String f = "d";

    /* renamed from: a, reason: collision with root package name */
    byte[] f5846a = null;

    /* renamed from: b, reason: collision with root package name */
    byte[] f5847b = new byte[1];

    /* renamed from: com.anythink.core.common.g.a.d$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends com.anythink.core.common.k.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f5854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f5855b;

        public AnonymousClass1(c cVar, c.a aVar) {
            this.f5854a = cVar;
            this.f5855b = aVar;
        }

        @Override // com.anythink.core.common.k.b.b
        public final void a() {
            try {
                try {
                    d.this.a(this.f5854a);
                    int e10 = d.this.e();
                    if (e10 == 1) {
                        c.a aVar = this.f5855b;
                        if (aVar != null) {
                            aVar.a(this.f5854a);
                            return;
                        }
                        return;
                    }
                    throw new Exception("Response Error Code:".concat(String.valueOf(e10)));
                } catch (SocketException unused) {
                    d.b(d.this);
                    d.this.a(this.f5854a);
                    int e11 = d.this.e();
                    if (e11 == 1) {
                        c.a aVar2 = this.f5855b;
                        if (aVar2 != null) {
                            aVar2.a(this.f5854a);
                            return;
                        }
                        return;
                    }
                    throw new Exception("Response Error Code:".concat(String.valueOf(e11)));
                }
            } catch (Throwable th) {
                this.f5854a.a("", th.getMessage() + "," + h.a(th.getStackTrace()), d.this.f5851h, d.this.f5852i);
                c.a aVar3 = this.f5855b;
                if (aVar3 != null) {
                    aVar3.a(th);
                }
            }
        }
    }

    private d() {
    }

    private void b() {
        synchronized (this) {
            if (this.f5853j == null) {
                Socket socket = new Socket();
                this.f5853j = socket;
                socket.setSoTimeout(w.f22171t);
            }
            com.anythink.core.c.a b10 = com.anythink.core.c.b.a(n.a().g()).b(n.a().p());
            if (b10 != null) {
                this.f5851h = b10.v();
                this.f5852i = b10.w();
                this.f5853j.connect(new InetSocketAddress(this.f5851h, this.f5852i), 30000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int e() {
        byte b10;
        if (this.f5853j.getInputStream().read(this.f5847b, 0, 1) != -1) {
            byte[] bArr = this.f5847b;
            b10 = bArr[0];
            bArr[0] = 0;
        } else {
            throw new SocketException("Socket.InputStream read length = -1!");
        }
        return b10;
    }

    private void c() {
        synchronized (this) {
            try {
                Socket socket = this.f5853j;
                if (socket != null) {
                    socket.close();
                    this.f5853j = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    private boolean d() {
        Socket socket = this.f5853j;
        return (socket == null || !socket.isConnected() || this.f5853j.isClosed()) ? false : true;
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f5845g == null) {
                f5845g = new d();
            }
            dVar = f5845g;
        }
        return dVar;
    }

    private void a(c cVar, c.a aVar) {
        com.anythink.core.common.k.b.a.a().a((com.anythink.core.common.k.b.b) new AnonymousClass1(cVar, aVar), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(c cVar) {
        Socket socket = this.f5853j;
        if (!((socket == null || !socket.isConnected() || this.f5853j.isClosed()) ? false : true)) {
            synchronized (this) {
                if (this.f5853j == null) {
                    Socket socket2 = new Socket();
                    this.f5853j = socket2;
                    socket2.setSoTimeout(w.f22171t);
                }
                com.anythink.core.c.a b10 = com.anythink.core.c.b.a(n.a().g()).b(n.a().p());
                if (b10 != null) {
                    this.f5851h = b10.v();
                    this.f5852i = b10.w();
                    this.f5853j.connect(new InetSocketAddress(this.f5851h, this.f5852i), 30000);
                }
            }
        }
        byte[] e10 = cVar.e();
        if (e10 != null) {
            int length = e10.length;
            if (e10.length == 0) {
                return;
            }
            int i10 = length + 7;
            byte[] bArr = this.f5846a;
            if (bArr == null || bArr.length < i10) {
                this.f5846a = new byte[i10];
            }
            byte[] bArr2 = this.f5846a;
            bArr2[0] = 0;
            bArr2[1] = 3;
            bArr2[2] = (byte) cVar.c();
            byte[] bArr3 = this.f5846a;
            bArr3[3] = (byte) ((length >>> 24) & p.f9095b);
            bArr3[4] = (byte) ((length >>> 16) & p.f9095b);
            bArr3[5] = (byte) ((length >>> 8) & p.f9095b);
            bArr3[6] = (byte) ((length >>> 0) & p.f9095b);
            System.arraycopy(e10, 0, bArr3, 7, e10.length);
            OutputStream outputStream = this.f5853j.getOutputStream();
            outputStream.write(this.f5846a, 0, i10);
            outputStream.flush();
        }
    }

    public static /* synthetic */ void b(d dVar) {
        synchronized (dVar) {
            try {
                Socket socket = dVar.f5853j;
                if (socket != null) {
                    socket.close();
                    dVar.f5853j = null;
                }
            } catch (Exception unused) {
            }
        }
    }
}
