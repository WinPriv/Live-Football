package n5;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import d6.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DashManifest.java */
/* loaded from: classes2.dex */
public final class c implements i5.b<c> {

    /* renamed from: a, reason: collision with root package name */
    public final long f33354a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33355b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33356c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33357d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33358e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33359g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33360h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.appcompat.widget.g f33361i;

    /* renamed from: j, reason: collision with root package name */
    public final l f33362j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f33363k;

    /* renamed from: l, reason: collision with root package name */
    public final h f33364l;

    /* renamed from: m, reason: collision with root package name */
    public final List<g> f33365m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, androidx.appcompat.widget.g gVar, l lVar, Uri uri, ArrayList arrayList) {
        this.f33354a = j10;
        this.f33355b = j11;
        this.f33356c = j12;
        this.f33357d = z10;
        this.f33358e = j13;
        this.f = j14;
        this.f33359g = j15;
        this.f33360h = j16;
        this.f33364l = hVar;
        this.f33361i = gVar;
        this.f33363k = uri;
        this.f33362j = lVar;
        this.f33365m = arrayList;
    }

    @Override // i5.b
    public final c a(List list) {
        long j10;
        c cVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (i10 < c()) {
            if (((StreamKey) linkedList.peek()).f20116s != i10) {
                long d10 = cVar.d(i10);
                if (d10 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j11 += d10;
                }
            } else {
                g b10 = cVar.b(i10);
                List<a> list2 = b10.f33388c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i11 = streamKey.f20116s;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = streamKey.f20117t;
                    a aVar = list2.get(i12);
                    List<j> list3 = aVar.f33347c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(streamKey.f20118u));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f20116s != i11) {
                            break;
                        }
                    } while (streamKey.f20117t == i12);
                    List<a> list4 = list2;
                    arrayList2.add(new a(aVar.f33345a, aVar.f33346b, arrayList3, aVar.f33348d, aVar.f33349e, aVar.f));
                    if (streamKey.f20116s != i11) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new g(b10.f33386a, b10.f33387b - j11, arrayList2, b10.f33389d));
            }
            i10++;
            cVar = this;
        }
        long j12 = cVar.f33355b;
        if (j12 != com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = j12 - j11;
        } else {
            j10 = -9223372036854775807L;
        }
        return new c(cVar.f33354a, j10, cVar.f33356c, cVar.f33357d, cVar.f33358e, cVar.f, cVar.f33359g, cVar.f33360h, cVar.f33364l, cVar.f33361i, cVar.f33362j, cVar.f33363k, arrayList);
    }

    public final g b(int i10) {
        return this.f33365m.get(i10);
    }

    public final int c() {
        return this.f33365m.size();
    }

    public final long d(int i10) {
        long j10;
        long j11;
        List<g> list = this.f33365m;
        if (i10 == list.size() - 1) {
            j10 = this.f33355b;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return com.anythink.expressad.exoplayer.b.f7291b;
            }
            j11 = list.get(i10).f33387b;
        } else {
            j10 = list.get(i10 + 1).f33387b;
            j11 = list.get(i10).f33387b;
        }
        return j10 - j11;
    }

    public final long e(int i10) {
        return g0.J(d(i10));
    }
}
