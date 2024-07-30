package c6;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: UdpDataSource.java */
/* loaded from: classes2.dex */
public final class i0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final int f3361e;
    public final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f3362g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f3363h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f3364i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f3365j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f3366k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3367l;

    /* renamed from: m, reason: collision with root package name */
    public int f3368m;

    /* compiled from: UdpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends k {
        public a(Exception exc, int i10) {
            super(exc, i10);
        }
    }

    public i0() {
        super(true);
        this.f3361e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.f3362g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // c6.j
    public final void close() {
        this.f3363h = null;
        MulticastSocket multicastSocket = this.f3365j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f3366k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f3365j = null;
        }
        DatagramSocket datagramSocket = this.f3364i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3364i = null;
        }
        this.f3366k = null;
        this.f3368m = 0;
        if (this.f3367l) {
            this.f3367l = false;
            l();
        }
    }

    @Override // c6.j
    public final long f(m mVar) throws a {
        Uri uri = mVar.f3377a;
        this.f3363h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f3363h.getPort();
        m(mVar);
        try {
            this.f3366k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f3366k, port);
            if (this.f3366k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f3365j = multicastSocket;
                multicastSocket.joinGroup(this.f3366k);
                this.f3364i = this.f3365j;
            } else {
                this.f3364i = new DatagramSocket(inetSocketAddress);
            }
            this.f3364i.setSoTimeout(this.f3361e);
            this.f3367l = true;
            n(mVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // c6.j
    public final Uri getUri() {
        return this.f3363h;
    }

    @Override // c6.h
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f3368m;
        DatagramPacket datagramPacket = this.f3362g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f3364i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f3368m = length;
                k(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f3368m;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f, length2 - i13, bArr, i10, min);
        this.f3368m -= min;
        return min;
    }
}
