package e0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f27618a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f27619b;

    /* renamed from: c, reason: collision with root package name */
    public int f27620c;

    public c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f27618a = shader;
        this.f27619b = colorStateList;
        this.f27620c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        if (r8.size() <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        r0 = new e0.e(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018a, code lost:
    
        if (r19 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018c, code lost:
    
        r0 = new e0.e(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0192, code lost:
    
        r0 = new e0.e(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0198, code lost:
    
        if (r11 == 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019b, code lost:
    
        if (r11 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019d, code lost:
    
        r4 = r0.f27631a;
        r0 = r0.f27632b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a3, code lost:
    
        if (r7 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a5, code lost:
    
        if (r7 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a7, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01af, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0203, code lost:
    
        return new e0.c(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01aa, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ad, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c0, code lost:
    
        r3 = new android.graphics.SweepGradient(r7, r9, r0.f27631a, r0.f27632b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d5, code lost:
    
        if (r8 <= com.huawei.hms.ads.gl.Code) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d7, code lost:
    
        r1 = r0.f27631a;
        r0 = r0.f27632b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01de, code lost:
    
        if (r7 == 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e1, code lost:
    
        if (r7 == 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e3, code lost:
    
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01eb, code lost:
    
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e6, code lost:
    
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e9, code lost:
    
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):e0.c");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        if (this.f27618a == null && (colorStateList = this.f27619b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }
}
