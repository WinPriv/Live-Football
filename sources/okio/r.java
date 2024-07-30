package okio;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

/* compiled from: Options.java */
/* loaded from: classes2.dex */
public final class r extends AbstractList<e> implements RandomAccess {

    /* renamed from: s, reason: collision with root package name */
    public final e[] f33862s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f33863t;

    public r(e[] eVarArr, int[] iArr) {
        this.f33862s = eVarArr;
        this.f33863t = iArr;
    }

    public static void a(long j10, b bVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        b bVar2;
        if (i11 < i12) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (((e) arrayList.get(i18)).A() < i10) {
                    throw new AssertionError();
                }
            }
            e eVar = (e) arrayList.get(i11);
            e eVar2 = (e) arrayList.get(i12 - 1);
            if (i10 == eVar.A()) {
                int i19 = i11 + 1;
                i14 = i19;
                i13 = ((Integer) arrayList2.get(i11)).intValue();
                eVar = (e) arrayList.get(i19);
            } else {
                i13 = -1;
                i14 = i11;
            }
            long j11 = 4;
            if (eVar.q(i10) != eVar2.q(i10)) {
                int i20 = 1;
                for (int i21 = i14 + 1; i21 < i12; i21++) {
                    if (((e) arrayList.get(i21 - 1)).q(i10) != ((e) arrayList.get(i21)).q(i10)) {
                        i20++;
                    }
                }
                long j12 = j10 + ((int) (bVar.f33824t / 4)) + 2 + (i20 * 2);
                bVar.c0(i20);
                bVar.c0(i13);
                for (int i22 = i14; i22 < i12; i22++) {
                    byte q10 = ((e) arrayList.get(i22)).q(i10);
                    if (i22 == i14 || q10 != ((e) arrayList.get(i22 - 1)).q(i10)) {
                        bVar.c0(q10 & DefaultClassResolver.NAME);
                    }
                }
                b bVar3 = new b();
                int i23 = i14;
                while (i23 < i12) {
                    byte q11 = ((e) arrayList.get(i23)).q(i10);
                    int i24 = i23 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i12) {
                            if (q11 != ((e) arrayList.get(i25)).q(i10)) {
                                i16 = i25;
                                break;
                            }
                            i25++;
                        } else {
                            i16 = i12;
                            break;
                        }
                    }
                    if (i24 == i16 && i10 + 1 == ((e) arrayList.get(i23)).A()) {
                        bVar.c0(((Integer) arrayList2.get(i23)).intValue());
                        i17 = i16;
                        bVar2 = bVar3;
                    } else {
                        bVar.c0((int) ((((int) (bVar3.f33824t / j11)) + j12) * (-1)));
                        i17 = i16;
                        bVar2 = bVar3;
                        a(j12, bVar3, i10 + 1, arrayList, i23, i16, arrayList2);
                    }
                    bVar3 = bVar2;
                    i23 = i17;
                    j11 = 4;
                }
                b bVar4 = bVar3;
                bVar.write(bVar4, bVar4.f33824t);
                return;
            }
            int min = Math.min(eVar.A(), eVar2.A());
            int i26 = 0;
            for (int i27 = i10; i27 < min && eVar.q(i27) == eVar2.q(i27); i27++) {
                i26++;
            }
            long j13 = 1 + j10 + ((int) (bVar.f33824t / 4)) + 2 + i26;
            bVar.c0(-i26);
            bVar.c0(i13);
            int i28 = i10;
            while (true) {
                i15 = i10 + i26;
                if (i28 >= i15) {
                    break;
                }
                bVar.c0(eVar.q(i28) & DefaultClassResolver.NAME);
                i28++;
            }
            if (i14 + 1 == i12) {
                if (i15 == ((e) arrayList.get(i14)).A()) {
                    bVar.c0(((Integer) arrayList2.get(i14)).intValue());
                    return;
                }
                throw new AssertionError();
            }
            b bVar5 = new b();
            bVar.c0((int) ((((int) (bVar5.f33824t / 4)) + j13) * (-1)));
            a(j13, bVar5, i15, arrayList, i14, i12, arrayList2);
            bVar.write(bVar5, bVar5.f33824t);
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okio.r b(okio.e... r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.r.b(okio.e[]):okio.r");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f33862s[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33862s.length;
    }
}
