package okio;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.java */
/* loaded from: classes2.dex */
public final class k implements z {

    /* renamed from: t, reason: collision with root package name */
    public final u f33848t;

    /* renamed from: u, reason: collision with root package name */
    public final Inflater f33849u;

    /* renamed from: v, reason: collision with root package name */
    public final l f33850v;

    /* renamed from: s, reason: collision with root package name */
    public int f33847s = 0;

    /* renamed from: w, reason: collision with root package name */
    public final CRC32 f33851w = new CRC32();

    public k(z zVar) {
        if (zVar != null) {
            Inflater inflater = new Inflater(true);
            this.f33849u = inflater;
            Logger logger = q.f33861a;
            u uVar = new u(zVar);
            this.f33848t = uVar;
            this.f33850v = new l(uVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public static void b(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public final void c(long j10, b bVar, long j11) {
        v vVar = bVar.f33823s;
        while (true) {
            int i10 = vVar.f33879c;
            int i11 = vVar.f33878b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            vVar = vVar.f;
        }
        while (j11 > 0) {
            int min = (int) Math.min(vVar.f33879c - r5, j11);
            this.f33851w.update(vVar.f33877a, (int) (vVar.f33878b + j10), min);
            j11 -= min;
            vVar = vVar.f;
            j10 = 0;
        }
    }

    @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33850v.close();
    }

    @Override // okio.z
    public final long read(b bVar, long j10) throws IOException {
        u uVar;
        boolean z10;
        b bVar2;
        long j11;
        if (j10 >= 0) {
            if (j10 == 0) {
                return 0L;
            }
            int i10 = this.f33847s;
            CRC32 crc32 = this.f33851w;
            u uVar2 = this.f33848t;
            if (i10 == 0) {
                uVar2.T(10L);
                b bVar3 = uVar2.f33873s;
                byte f = bVar3.f(3L);
                if (((f >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    bVar2 = bVar3;
                    c(0L, uVar2.f33873s, 10L);
                } else {
                    bVar2 = bVar3;
                }
                b(8075, uVar2.readShort(), "ID1ID2");
                uVar2.skip(8L);
                if (((f >> 2) & 1) == 1) {
                    uVar2.T(2L);
                    if (z10) {
                        c(0L, uVar2.f33873s, 2L);
                    }
                    short readShort = bVar2.readShort();
                    Charset charset = b0.f33832a;
                    int i11 = readShort & 65535;
                    long j12 = (short) (((i11 & com.anythink.expressad.exoplayer.k.p.f9095b) << 8) | ((i11 & 65280) >>> 8));
                    uVar2.T(j12);
                    if (z10) {
                        c(0L, uVar2.f33873s, j12);
                        j11 = j12;
                    } else {
                        j11 = j12;
                    }
                    uVar2.skip(j11);
                }
                if (((f >> 3) & 1) == 1) {
                    uVar = uVar2;
                    long b10 = uVar2.b(0L, Long.MAX_VALUE, (byte) 0);
                    if (b10 != -1) {
                        if (z10) {
                            c(0L, uVar.f33873s, b10 + 1);
                        }
                        uVar.skip(b10 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    uVar = uVar2;
                }
                if (((f >> 4) & 1) == 1) {
                    long b11 = uVar.b(0L, Long.MAX_VALUE, (byte) 0);
                    if (b11 != -1) {
                        if (z10) {
                            c(0L, uVar.f33873s, b11 + 1);
                        }
                        uVar.skip(b11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    uVar.T(2L);
                    short readShort2 = bVar2.readShort();
                    Charset charset2 = b0.f33832a;
                    int i12 = readShort2 & 65535;
                    b((short) (((i12 & com.anythink.expressad.exoplayer.k.p.f9095b) << 8) | ((65280 & i12) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f33847s = 1;
            } else {
                uVar = uVar2;
            }
            if (this.f33847s == 1) {
                long j13 = bVar.f33824t;
                long read = this.f33850v.read(bVar, j10);
                if (read != -1) {
                    c(j13, bVar, read);
                    return read;
                }
                this.f33847s = 2;
            }
            if (this.f33847s == 2) {
                uVar.T(4L);
                int readInt = uVar.f33873s.readInt();
                Charset charset3 = b0.f33832a;
                b(((readInt & com.anythink.expressad.exoplayer.k.p.f9095b) << 24) | ((readInt & (-16777216)) >>> 24) | ((readInt & 16711680) >>> 8) | ((65280 & readInt) << 8), (int) crc32.getValue(), "CRC");
                uVar.T(4L);
                int readInt2 = uVar.f33873s.readInt();
                b(((readInt2 & com.anythink.expressad.exoplayer.k.p.f9095b) << 24) | ((readInt2 & (-16777216)) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((65280 & readInt2) << 8), (int) this.f33849u.getBytesWritten(), "ISIZE");
                this.f33847s = 3;
                if (!uVar.u()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(a3.k.k("byteCount < 0: ", j10));
    }

    @Override // okio.z
    public final a0 timeout() {
        return this.f33848t.timeout();
    }
}
