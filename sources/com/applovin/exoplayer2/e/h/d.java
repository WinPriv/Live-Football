package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final e f14500a = new e();

    /* renamed from: b, reason: collision with root package name */
    private final y f14501b = new y(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f14502c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f14503d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14504e;

    public void a() {
        this.f14500a.a();
        this.f14501b.a(0);
        this.f14502c = -1;
        this.f14504e = false;
    }

    public e b() {
        return this.f14500a;
    }

    public y c() {
        return this.f14501b;
    }

    public void d() {
        if (this.f14501b.d().length == 65025) {
            return;
        }
        y yVar = this.f14501b;
        yVar.a(Arrays.copyOf(yVar.d(), Math.max(65025, this.f14501b.b())), this.f14501b.b());
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10;
        com.applovin.exoplayer2.l.a.b(iVar != null);
        if (this.f14504e) {
            this.f14504e = false;
            this.f14501b.a(0);
        }
        while (!this.f14504e) {
            if (this.f14502c < 0) {
                if (!this.f14500a.a(iVar) || !this.f14500a.a(iVar, true)) {
                    return false;
                }
                e eVar = this.f14500a;
                int i11 = eVar.f14511h;
                if ((eVar.f14506b & 1) == 1 && this.f14501b.b() == 0) {
                    i11 += a(0);
                    i10 = this.f14503d + 0;
                } else {
                    i10 = 0;
                }
                if (!k.a(iVar, i11)) {
                    return false;
                }
                this.f14502c = i10;
            }
            int a10 = a(this.f14502c);
            int i12 = this.f14502c + this.f14503d;
            if (a10 > 0) {
                y yVar = this.f14501b;
                yVar.b(yVar.b() + a10);
                if (!k.b(iVar, this.f14501b.d(), this.f14501b.b(), a10)) {
                    return false;
                }
                y yVar2 = this.f14501b;
                yVar2.c(yVar2.b() + a10);
                this.f14504e = this.f14500a.f14513j[i12 + (-1)] != 255;
            }
            if (i12 == this.f14500a.f14510g) {
                i12 = -1;
            }
            this.f14502c = i12;
        }
        return true;
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f14503d = 0;
        do {
            int i13 = this.f14503d;
            int i14 = i10 + i13;
            e eVar = this.f14500a;
            if (i14 >= eVar.f14510g) {
                break;
            }
            int[] iArr = eVar.f14513j;
            this.f14503d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }
}
