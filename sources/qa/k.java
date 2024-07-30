package qa;

import ka.n7;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final a f34745a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f34746a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f34747b;

        /* renamed from: c, reason: collision with root package name */
        public int f34748c;

        /* renamed from: d, reason: collision with root package name */
        public long f34749d;

        /* renamed from: e, reason: collision with root package name */
        public long f34750e;
    }

    public k(b bVar) {
        boolean z10;
        int i10;
        a aVar = new a();
        this.f34745a = aVar;
        Integer num = bVar.f;
        if (num != null && num.intValue() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.f34747b = z10;
        if (z10) {
            i10 = 100;
        } else {
            i10 = 256000;
        }
        aVar.f34746a = i10;
        Integer num2 = bVar.f;
        aVar.f34748c = num2 != null ? num2.intValue() : 0;
        aVar.f34749d = System.currentTimeMillis();
        aVar.f34750e = 0L;
    }

    public final void a(int i10) {
        int i11;
        a aVar = this.f34745a;
        aVar.f34750e += i10;
        if (aVar.f34747b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - aVar.f34749d;
            if (j10 >= 10) {
                n7.c("DownloadWorker.SpeedAdjuster", "totalReadLengthDuringCheckPoints: %d checkDuration: %d", Long.valueOf(aVar.f34750e), Long.valueOf(j10));
                aVar.f34749d = currentTimeMillis;
                long j11 = (((aVar.f34750e * 100) * 1000) / j10) / 100;
                long abs = Math.abs(j11 - aVar.f34748c);
                n7.c("DownloadWorker.SpeedAdjuster", "current speed: %d target speed: %d diff: %d maxReadDSize: %d", Long.valueOf(j11), Integer.valueOf(aVar.f34748c), Long.valueOf(abs), Integer.valueOf(aVar.f34746a));
                if (abs > 1024) {
                    if (j11 > aVar.f34748c) {
                        int i12 = aVar.f34746a;
                        if (i12 <= 1) {
                            long j12 = (((j10 * abs) * 100) / j11) / 100;
                            if (j12 > 120000) {
                                j12 = 120000;
                            }
                            n7.c("DownloadWorker.SpeedAdjuster", "sleep time: %d", Long.valueOf(j12));
                            try {
                                Thread.sleep(j12);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            i11 = i12 - 30;
                            aVar.f34746a = i11;
                            if (i11 < 1) {
                                i11 = 1;
                            }
                        }
                    } else {
                        i11 = aVar.f34746a + 30;
                        aVar.f34746a = i11;
                        if (i11 > 256000) {
                            i11 = 256000;
                        }
                    }
                    aVar.f34746a = i11;
                }
                n7.c("DownloadWorker.SpeedAdjuster", "max read size: %d", Integer.valueOf(aVar.f34746a));
                aVar.f34750e = 0L;
            }
        }
    }
}
