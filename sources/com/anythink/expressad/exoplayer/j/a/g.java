package com.anythink.expressad.exoplayer.j.a;

import com.anythink.expressad.exoplayer.j.a.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int f8751c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8752d = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final int f8753a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8754b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8756g;
    private l f = l.f8773b;

    /* renamed from: e, reason: collision with root package name */
    private final TreeSet<n> f8755e = new TreeSet<>();

    public g(int i10, String str) {
        this.f8753a = i10;
        this.f8754b = str;
    }

    public static g a(int i10, DataInputStream dataInputStream) {
        g gVar = new g(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
            long readLong = dataInputStream.readLong();
            k kVar = new k();
            j.a(kVar, readLong);
            gVar.a(kVar);
        } else {
            gVar.f = l.a(dataInputStream);
        }
        return gVar;
    }

    public final boolean b() {
        return this.f8756g;
    }

    public final TreeSet<n> c() {
        return this.f8755e;
    }

    public final boolean d() {
        return this.f8755e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f8753a == gVar.f8753a && this.f8754b.equals(gVar.f8754b) && this.f8755e.equals(gVar.f8755e) && this.f.equals(gVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8755e.hashCode() + (a(Integer.MAX_VALUE) * 31);
    }

    public final n b(n nVar) {
        com.anythink.expressad.exoplayer.k.a.b(this.f8755e.remove(nVar));
        n a10 = nVar.a(this.f8753a);
        if (nVar.f8746e.renameTo(a10.f8746e)) {
            this.f8755e.add(a10);
            return a10;
        }
        throw new a.C0114a("Renaming of " + nVar.f8746e + " to " + a10.f8746e + " failed.");
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f8753a);
        dataOutputStream.writeUTF(this.f8754b);
        this.f.a(dataOutputStream);
    }

    public final i a() {
        return this.f;
    }

    public final boolean a(k kVar) {
        l lVar = this.f;
        l a10 = lVar.a(kVar);
        this.f = a10;
        return !a10.equals(lVar);
    }

    public final void a(boolean z10) {
        this.f8756g = z10;
    }

    public final void a(n nVar) {
        this.f8755e.add(nVar);
    }

    public final n a(long j10) {
        n a10 = n.a(this.f8754b, j10);
        n floor = this.f8755e.floor(a10);
        if (floor != null && floor.f8743b + floor.f8744c > j10) {
            return floor;
        }
        n ceiling = this.f8755e.ceiling(a10);
        if (ceiling == null) {
            return n.b(this.f8754b, j10);
        }
        return n.a(this.f8754b, j10, ceiling.f8743b - j10);
    }

    public final long a(long j10, long j11) {
        n a10 = a(j10);
        if (a10.b()) {
            return -Math.min(a10.a() ? Long.MAX_VALUE : a10.f8744c, j11);
        }
        long j12 = j10 + j11;
        long j13 = a10.f8743b + a10.f8744c;
        if (j13 < j12) {
            for (n nVar : this.f8755e.tailSet(a10, false)) {
                long j14 = nVar.f8743b;
                if (j14 > j13) {
                    break;
                }
                j13 = Math.max(j13, j14 + nVar.f8744c);
                if (j13 >= j12) {
                    break;
                }
            }
        }
        return Math.min(j13 - j10, j11);
    }

    public final boolean a(e eVar) {
        if (!this.f8755e.remove(eVar)) {
            return false;
        }
        eVar.f8746e.delete();
        return true;
    }

    public final int a(int i10) {
        int hashCode = this.f8754b.hashCode() + (this.f8753a * 31);
        if (i10 < 2) {
            long a10 = j.a(this.f);
            return (hashCode * 31) + ((int) (a10 ^ (a10 >>> 32)));
        }
        return (hashCode * 31) + this.f.hashCode();
    }
}
