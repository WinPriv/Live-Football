package l2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f32341c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f32342a;

    /* renamed from: b, reason: collision with root package name */
    public f f32343b;

    public e(String... strArr) {
        this.f32342a = Arrays.asList(strArr);
    }

    public final boolean a(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        List<String> list = this.f32342a;
        if (i10 >= list.size()) {
            return false;
        }
        if (i10 == list.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = list.get(i10);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z12 = false;
            } else {
                z12 = true;
            }
            if ((!z10 && (i10 != list.size() - 2 || !list.get(list.size() - 1).equals("**"))) || !z12) {
                return false;
            }
            return true;
        }
        if (!z10 && list.get(i10 + 1).equals(str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 != list.size() - 2 && (i10 != list.size() - 3 || !list.get(list.size() - 1).equals("**"))) {
                return false;
            }
            return true;
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < list.size() - 1) {
            return false;
        }
        return list.get(i11).equals(str);
    }

    public final int b(int i10, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f32342a;
        if (!list.get(i10).equals("**")) {
            return 1;
        }
        if (i10 == list.size() - 1 || !list.get(i10 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f32342a;
        if (i10 >= list.size()) {
            return false;
        }
        if (list.get(i10).equals(str) || list.get(i10).equals("**") || list.get(i10).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f32342a;
        if (i10 < list.size() - 1 || list.get(i10).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f32342a.equals(eVar.f32342a)) {
            return false;
        }
        f fVar = this.f32343b;
        f fVar2 = eVar.f32343b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f32342a.hashCode() * 31;
        f fVar = this.f32343b;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f32342a);
        sb2.append(",resolved=");
        if (this.f32343b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f32342a = new ArrayList(eVar.f32342a);
        this.f32343b = eVar.f32343b;
    }
}
