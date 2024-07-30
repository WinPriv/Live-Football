package ka;

import android.util.Log;

/* loaded from: classes2.dex */
public final class r7 extends b3.c {
    public r7() {
        super(2);
    }

    @Override // b3.c
    public final b3.c a(String str, String str2) {
        Object obj = this.f2858a;
        if (((b3.c) obj) != null) {
            ((b3.c) obj).a(str, str2);
        }
        return this;
    }

    @Override // b3.c
    public final void b(u7 u7Var, int i10, String str) {
        if (u7Var == null) {
            return;
        }
        String str2 = " " + ((CharSequence) u7Var.f31932g);
        if (str2 != null) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            Log.e(str, str2);
                        }
                    } else {
                        Log.w(str, str2);
                    }
                }
                Log.i(str, str2);
            } else {
                Log.d(str, str2);
            }
        }
        b3.c cVar = (b3.c) this.f2858a;
        if (cVar != null) {
            cVar.b(u7Var, i10, str);
        }
    }
}
