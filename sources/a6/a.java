package a6;

import a6.f;
import d6.g0;
import d6.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import r5.a;

/* compiled from: Mp4WebvttDecoder.java */
/* loaded from: classes2.dex */
public final class a extends r5.f {

    /* renamed from: m, reason: collision with root package name */
    public final w f299m = new w();

    @Override // r5.f
    public final r5.g g(byte[] bArr, int i10, boolean z10) throws r5.i {
        r5.a a10;
        w wVar = this.f299m;
        wVar.C(i10, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i11 = wVar.f27386c - wVar.f27385b;
            if (i11 > 0) {
                if (i11 >= 8) {
                    int d10 = wVar.d();
                    if (wVar.d() == 1987343459) {
                        int i12 = d10 - 8;
                        CharSequence charSequence = null;
                        a.C0471a c0471a = null;
                        while (i12 > 0) {
                            if (i12 >= 8) {
                                int d11 = wVar.d();
                                int d12 = wVar.d();
                                int i13 = d11 - 8;
                                byte[] bArr2 = wVar.f27384a;
                                int i14 = wVar.f27385b;
                                int i15 = g0.f27302a;
                                String str = new String(bArr2, i14, i13, i7.c.f29202c);
                                wVar.F(i13);
                                i12 = (i12 - 8) - i13;
                                if (d12 == 1937011815) {
                                    f.d dVar = new f.d();
                                    f.e(str, dVar);
                                    c0471a = dVar.a();
                                } else if (d12 == 1885436268) {
                                    charSequence = f.f(null, str.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new r5.i("Incomplete vtt cue box header found.");
                            }
                        }
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (c0471a != null) {
                            c0471a.f34901a = charSequence;
                            a10 = c0471a.a();
                        } else {
                            Pattern pattern = f.f323a;
                            f.d dVar2 = new f.d();
                            dVar2.f338c = charSequence;
                            a10 = dVar2.a().a();
                        }
                        arrayList.add(a10);
                    } else {
                        wVar.F(d10 - 8);
                    }
                } else {
                    throw new r5.i("Incomplete Mp4Webvtt Top Level box header found.");
                }
            } else {
                return new b(arrayList);
            }
        }
    }
}
