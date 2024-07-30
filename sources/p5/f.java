package p5;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.i0;

/* compiled from: HlsMultivariantPlaylist.java */
/* loaded from: classes2.dex */
public class f extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final f f34429n = new f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f34430d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f34431e;
    public final List<a> f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f34432g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f34433h;

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f34434i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f34435j;

    /* renamed from: k, reason: collision with root package name */
    public final List<i0> f34436k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, String> f34437l;

    /* renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f34438m;

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f34439a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f34440b;

        /* renamed from: c, reason: collision with root package name */
        public final String f34441c;

        public a(Uri uri, i0 i0Var, String str) {
            this.f34439a = uri;
            this.f34440b = i0Var;
            this.f34441c = str;
        }
    }

    /* compiled from: HlsMultivariantPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f34442a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f34443b;

        /* renamed from: c, reason: collision with root package name */
        public final String f34444c;

        /* renamed from: d, reason: collision with root package name */
        public final String f34445d;

        /* renamed from: e, reason: collision with root package name */
        public final String f34446e;
        public final String f;

        public b(Uri uri, i0 i0Var, String str, String str2, String str3, String str4) {
            this.f34442a = uri;
            this.f34443b = i0Var;
            this.f34444c = str;
            this.f34445d = str2;
            this.f34446e = str3;
            this.f = str4;
        }
    }

    public f(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, i0 i0Var, List<i0> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        List<i0> list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = list2.get(i10).f34442a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f34430d = Collections.unmodifiableList(arrayList);
        this.f34431e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.f34432g = Collections.unmodifiableList(list4);
        this.f34433h = Collections.unmodifiableList(list5);
        this.f34434i = Collections.unmodifiableList(list6);
        this.f34435j = i0Var;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f34436k = list9;
        this.f34437l = Collections.unmodifiableMap(map);
        this.f34438m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f34439a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i12);
                    if (streamKey.f20117t == i10 && streamKey.f20118u == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // i5.b
    public final g a(List list) {
        return new f(this.f34447a, this.f34448b, c(this.f34431e, 0, list), Collections.emptyList(), c(this.f34432g, 1, list), c(this.f34433h, 2, list), Collections.emptyList(), this.f34435j, this.f34436k, this.f34449c, this.f34437l, this.f34438m);
    }
}
