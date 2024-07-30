package d6;

import android.os.SystemClock;
import c6.b0;
import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: SntpClient.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f27390a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f27391b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f27392c;

    /* renamed from: d, reason: collision with root package name */
    public static long f27393d;

    /* compiled from: SntpClient.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public static long a() throws IOException {
        DatagramSocket datagramSocket;
        synchronized (f27391b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = Ascii.ESC;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j10 = currentTimeMillis / 1000;
                long j11 = currentTimeMillis - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                bArr[40] = (byte) (j12 >> 24);
                bArr[41] = (byte) (j12 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j12 >> 8);
                    bArr[43] = (byte) (j12 >> 0);
                    long j13 = (j11 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j13 >> 24);
                    bArr[45] = (byte) (j13 >> 16);
                    bArr[46] = (byte) (j13 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
            byte b10 = bArr[0];
            int i10 = bArr[1] & DefaultClassResolver.NAME;
            long d10 = d(24, bArr);
            long d11 = d(32, bArr);
            long d12 = d(40, bArr);
            b((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, d12);
            long j15 = (j14 + (((d12 - j14) + (d11 - d10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j15;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(a3.l.i("SNTP: Untrusted mode: ", b11));
            }
            if (i10 != 0 && i10 <= 15) {
                if (j10 != 0) {
                    return;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            }
            throw new IOException(a3.l.i("SNTP: Untrusted stratum: ", i10));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static long c(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & com.anythink.expressad.video.module.a.a.R) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & com.anythink.expressad.video.module.a.a.R) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & com.anythink.expressad.video.module.a.a.R) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & com.anythink.expressad.video.module.a.a.R) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long d(int i10, byte[] bArr) {
        long c10 = c(i10, bArr);
        long c11 = c(i10 + 4, bArr);
        if (c10 == 0 && c11 == 0) {
            return 0L;
        }
        return ((c11 * 1000) / 4294967296L) + ((c10 - 2208988800L) * 1000);
    }

    /* compiled from: SntpClient.java */
    /* loaded from: classes2.dex */
    public static final class c implements b0.d {
        @Override // c6.b0.d
        public final void load() throws IOException {
            synchronized (y.f27390a) {
                Object obj = y.f27391b;
                synchronized (obj) {
                    try {
                        if (y.f27392c) {
                            return;
                        }
                        long a10 = y.a();
                        synchronized (obj) {
                            y.f27393d = a10;
                            y.f27392c = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // c6.b0.d
        public final void a() {
        }
    }

    /* compiled from: SntpClient.java */
    /* loaded from: classes2.dex */
    public static final class b implements b0.a<b0.d> {

        /* renamed from: s, reason: collision with root package name */
        public final a f27394s;

        public b(DashMediaSource.a aVar) {
            this.f27394s = aVar;
        }

        @Override // c6.b0.a
        public final void g(b0.d dVar, long j10, long j11) {
            boolean z10;
            long j12;
            a aVar = this.f27394s;
            if (aVar != null) {
                Object obj = y.f27391b;
                synchronized (obj) {
                    z10 = y.f27392c;
                }
                if (!z10) {
                    IOException iOException = new IOException(new ConcurrentModificationException());
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    dashMediaSource.getClass();
                    p.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                    dashMediaSource.A(true);
                    return;
                }
                DashMediaSource dashMediaSource2 = DashMediaSource.this;
                synchronized (obj) {
                    if (y.f27392c) {
                        j12 = y.f27393d;
                    } else {
                        j12 = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                }
                dashMediaSource2.f20124f0 = j12;
                dashMediaSource2.A(true);
            }
        }

        @Override // c6.b0.a
        public final b0.b n(b0.d dVar, long j10, long j11, IOException iOException, int i10) {
            a aVar = this.f27394s;
            if (aVar != null) {
                DashMediaSource dashMediaSource = DashMediaSource.this;
                dashMediaSource.getClass();
                p.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                dashMediaSource.A(true);
            }
            return c6.b0.f3297e;
        }

        @Override // c6.b0.a
        public final void q(b0.d dVar, long j10, long j11, boolean z10) {
        }
    }
}
