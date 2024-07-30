package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class ab extends e {

    /* renamed from: a, reason: collision with root package name */
    private final int f16057a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16058b;

    /* renamed from: c, reason: collision with root package name */
    private final DatagramPacket f16059c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f16060d;

    /* renamed from: e, reason: collision with root package name */
    private DatagramSocket f16061e;
    private MulticastSocket f;

    /* renamed from: g, reason: collision with root package name */
    private InetAddress f16062g;

    /* renamed from: h, reason: collision with root package name */
    private InetSocketAddress f16063h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16064i;

    /* renamed from: j, reason: collision with root package name */
    private int f16065j;

    /* loaded from: classes.dex */
    public static final class a extends j {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public ab() {
        this(2000);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        Uri uri = lVar.f16095a;
        this.f16060d = uri;
        String host = uri.getHost();
        int port = this.f16060d.getPort();
        b(lVar);
        try {
            this.f16062g = InetAddress.getByName(host);
            this.f16063h = new InetSocketAddress(this.f16062g, port);
            if (this.f16062g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f16063h);
                this.f = multicastSocket;
                multicastSocket.joinGroup(this.f16062g);
                this.f16061e = this.f;
            } else {
                this.f16061e = new DatagramSocket(this.f16063h);
            }
            this.f16061e.setSoTimeout(this.f16057a);
            this.f16064i = true;
            c(lVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        this.f16060d = null;
        MulticastSocket multicastSocket = this.f;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f16062g);
            } catch (IOException unused) {
            }
            this.f = null;
        }
        DatagramSocket datagramSocket = this.f16061e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f16061e = null;
        }
        this.f16062g = null;
        this.f16063h = null;
        this.f16065j = 0;
        if (this.f16064i) {
            this.f16064i = false;
            d();
        }
    }

    public ab(int i10) {
        this(i10, 8000);
    }

    public ab(int i10, int i11) {
        super(true);
        this.f16057a = i11;
        byte[] bArr = new byte[i10];
        this.f16058b = bArr;
        this.f16059c = new DatagramPacket(bArr, 0, i10);
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f16065j == 0) {
            try {
                this.f16061e.receive(this.f16059c);
                int length = this.f16059c.getLength();
                this.f16065j = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f16059c.getLength();
        int i12 = this.f16065j;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f16058b, length2 - i12, bArr, i10, min);
        this.f16065j -= min;
        return min;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f16060d;
    }
}
