package f0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.huawei.openalliance.ad.constant.ag;
import e0.d;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public final class j extends l {
    public static Font g(FontFamily fontFamily, int i10) {
        int i11;
        int i12;
        if ((i10 & 1) != 0) {
            i11 = 700;
        } else {
            i11 = ag.f21998i;
        }
        if ((i10 & 2) != 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        FontStyle fontStyle = new FontStyle(i11, i12);
        Font font = fontFamily.getFont(0);
        int h10 = h(fontStyle, font.getStyle());
        for (int i13 = 1; i13 < fontFamily.getSize(); i13++) {
            Font font2 = fontFamily.getFont(i13);
            int h11 = h(fontStyle, font2.getStyle());
            if (h11 < h10) {
                font = font2;
                h10 = h11;
            }
        }
        return font;
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i10;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return abs + i10;
    }

    @Override // f0.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        int i11;
        try {
            FontFamily.Builder builder = null;
            for (d.C0365d c0365d : cVar.f27621a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, c0365d.f).setWeight(c0365d.f27623b);
                    if (c0365d.f27624c) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    Font build = weight.setSlant(i11).setTtcIndex(c0365d.f27626e).setFontVariationSettings(c0365d.f27625d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // f0.l
    public final Typeface b(Context context, k0.m[] mVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        int i11;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (k0.m mVar : mVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(mVar.f30274a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(mVar.f30276c);
                        if (mVar.f30277d) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        Font build = weight.setSlant(i11).setTtcIndex(mVar.f30275b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // f0.l
    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // f0.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // f0.l
    public final k0.m f(int i10, k0.m[] mVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
