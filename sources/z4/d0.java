package z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.z0;

/* compiled from: TsPayloadReader.java */
/* loaded from: classes2.dex */
public interface d0 {

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f37042a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f37043b;

        public a(String str, byte[] bArr) {
            this.f37042a = str;
            this.f37043b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f37044a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f37045b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f37046c;

        public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
            List<a> unmodifiableList;
            this.f37044a = str;
            if (arrayList == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            this.f37045b = unmodifiableList;
            this.f37046c = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public interface c {
        d0 a(int i10, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f37047a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37048b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37049c;

        /* renamed from: d, reason: collision with root package name */
        public int f37050d;

        /* renamed from: e, reason: collision with root package name */
        public String f37051e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public final void a() {
            int i10;
            int i11 = this.f37050d;
            if (i11 == Integer.MIN_VALUE) {
                i10 = this.f37048b;
            } else {
                i10 = i11 + this.f37049c;
            }
            this.f37050d = i10;
            this.f37051e = this.f37047a + this.f37050d;
        }

        public final void b() {
            if (this.f37050d != Integer.MIN_VALUE) {
            } else {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f37047a = str;
            this.f37048b = i11;
            this.f37049c = i12;
            this.f37050d = Integer.MIN_VALUE;
            this.f37051e = "";
        }
    }

    void a();

    void b(d6.d0 d0Var, p4.j jVar, d dVar);

    void c(int i10, d6.w wVar) throws z0;
}
