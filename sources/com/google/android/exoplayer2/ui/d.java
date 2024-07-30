package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.hamkho.livefoot.R;
import d6.r;
import k4.i0;

/* compiled from: DefaultTrackNameProvider.java */
/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f20343a;

    public d(Resources resources) {
        resources.getClass();
        this.f20343a = resources;
    }

    @Override // com.google.android.exoplayer2.ui.j
    public final String a(i0 i0Var) {
        String c10;
        int i10 = r.i(i0Var.D);
        int i11 = i0Var.Q;
        int i12 = i0Var.J;
        int i13 = i0Var.I;
        if (i10 == -1) {
            String str = i0Var.A;
            if (r.j(str) == null) {
                if (r.b(str) == null) {
                    if (i13 == -1 && i12 == -1) {
                        if (i11 == -1 && i0Var.R == -1) {
                            i10 = -1;
                        }
                    }
                }
                i10 = 1;
            }
            i10 = 2;
        }
        String str2 = "";
        Resources resources = this.f20343a;
        if (i10 == 2) {
            String[] strArr = new String[3];
            strArr[0] = d(i0Var);
            if (i13 != -1 && i12 != -1) {
                str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i13), Integer.valueOf(i12));
            }
            strArr[1] = str2;
            strArr[2] = b(i0Var);
            c10 = e(strArr);
        } else if (i10 == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = c(i0Var);
            if (i11 != -1 && i11 >= 1) {
                str2 = i11 != 1 ? i11 != 2 ? (i11 == 6 || i11 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i11 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono);
            }
            strArr2[1] = str2;
            strArr2[2] = b(i0Var);
            c10 = e(strArr2);
        } else {
            c10 = c(i0Var);
        }
        if (c10.length() == 0) {
            return resources.getString(R.string.exo_track_unknown);
        }
        return c10;
    }

    public final String b(i0 i0Var) {
        int i10 = i0Var.f30524z;
        if (i10 == -1) {
            return "";
        }
        return this.f20343a.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(k4.i0 r10) {
        /*
            r9 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = r10.f30520u
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            java.lang.String r4 = ""
            r5 = 0
            if (r2 != 0) goto L63
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L18
            goto L63
        L18:
            int r2 = d6.g0.f27302a
            r6 = 21
            if (r2 < r6) goto L23
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            goto L29
        L23:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r1)
            r1 = r6
        L29:
            r6 = 24
            if (r2 < r6) goto L34
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            goto L38
        L34:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L38:
            java.lang.String r1 = r1.getDisplayName(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L43
            goto L63
        L43:
            int r6 = r1.offsetByCodePoints(r5, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L64
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r8 = r1.substring(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r2 = r8.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r2 = r1.substring(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            r7.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L64
            java.lang.String r1 = r7.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L64
            goto L64
        L63:
            r1 = r4
        L64:
            r0[r5] = r1
            java.lang.String r1 = r9.d(r10)
            r0[r3] = r1
            java.lang.String r0 = r9.e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L81
            java.lang.String r10 = r10.f30519t
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L7f
            goto L80
        L7f:
            r4 = r10
        L80:
            r0 = r4
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.d.c(k4.i0):java.lang.String");
    }

    public final String d(i0 i0Var) {
        String str;
        int i10 = i0Var.f30522w & 2;
        Resources resources = this.f20343a;
        if (i10 != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        int i11 = i0Var.f30522w;
        if ((i11 & 4) != 0) {
            str = e(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i11 & 8) != 0) {
            str = e(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i11 & 1088) != 0) {
            return e(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public final String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f20343a.getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }
}
