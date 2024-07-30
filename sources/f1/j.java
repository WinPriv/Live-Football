package f1;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public final class j implements j1.d, Closeable {
    public static final TreeMap<Integer, j> A = new TreeMap<>();

    /* renamed from: s, reason: collision with root package name */
    public volatile String f27976s;

    /* renamed from: t, reason: collision with root package name */
    public final long[] f27977t;

    /* renamed from: u, reason: collision with root package name */
    public final double[] f27978u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f27979v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[][] f27980w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f27981x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public int f27982z;

    public j(int i10) {
        this.y = i10;
        int i11 = i10 + 1;
        this.f27981x = new int[i11];
        this.f27977t = new long[i11];
        this.f27978u = new double[i11];
        this.f27979v = new String[i11];
        this.f27980w = new byte[i11];
    }

    public static j c(int i10, String str) {
        TreeMap<Integer, j> treeMap = A;
        synchronized (treeMap) {
            Map.Entry<Integer, j> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                j value = ceilingEntry.getValue();
                value.f27976s = str;
                value.f27982z = i10;
                return value;
            }
            j jVar = new j(i10);
            jVar.f27976s = str;
            jVar.f27982z = i10;
            return jVar;
        }
    }

    @Override // j1.d
    public final void b(k1.d dVar) {
        for (int i10 = 1; i10 <= this.f27982z; i10++) {
            int i11 = this.f27981x[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                dVar.b(i10, this.f27980w[i10]);
                            }
                        } else {
                            dVar.f(i10, this.f27979v[i10]);
                        }
                    } else {
                        dVar.c(this.f27978u[i10], i10);
                    }
                } else {
                    dVar.d(i10, this.f27977t[i10]);
                }
            } else {
                dVar.e(i10);
            }
        }
    }

    public final void d(int i10, long j10) {
        this.f27981x[i10] = 2;
        this.f27977t[i10] = j10;
    }

    public final void e(int i10) {
        this.f27981x[i10] = 1;
    }

    public final void f(int i10, String str) {
        this.f27981x[i10] = 4;
        this.f27979v[i10] = str;
    }

    @Override // j1.d
    public final String m() {
        return this.f27976s;
    }

    public final void release() {
        TreeMap<Integer, j> treeMap = A;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.y), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
