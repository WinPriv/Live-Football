package n0;

import android.R;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public class v0 implements o8.s {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f33133a = {R.attr.minWidth, R.attr.minHeight, com.hamkho.livefoot.R.attr.cardBackgroundColor, com.hamkho.livefoot.R.attr.cardCornerRadius, com.hamkho.livefoot.R.attr.cardElevation, com.hamkho.livefoot.R.attr.cardMaxElevation, com.hamkho.livefoot.R.attr.cardPreventCornerOverlap, com.hamkho.livefoot.R.attr.cardUseCompatPadding, com.hamkho.livefoot.R.attr.contentPadding, com.hamkho.livefoot.R.attr.contentPaddingBottom, com.hamkho.livefoot.R.attr.contentPaddingLeft, com.hamkho.livefoot.R.attr.contentPaddingRight, com.hamkho.livefoot.R.attr.contentPaddingTop};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f33134b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f33135c = {R.attr.orientation};

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f33136d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e, reason: collision with root package name */
    public static final v0 f33137e = new v0();
    public static final int[] f = {com.hamkho.livefoot.R.attr.keylines, com.hamkho.livefoot.R.attr.statusBarBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f33138g = {R.attr.layout_gravity, com.hamkho.livefoot.R.attr.layout_anchor, com.hamkho.livefoot.R.attr.layout_anchorGravity, com.hamkho.livefoot.R.attr.layout_behavior, com.hamkho.livefoot.R.attr.layout_dodgeInsetEdges, com.hamkho.livefoot.R.attr.layout_insetEdge, com.hamkho.livefoot.R.attr.layout_keyline};

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f33139h = new Object[0];

    public /* synthetic */ v0() {
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (int i10 = 0; i10 < digest.length; i10++) {
                char[] cArr = f33134b;
                sb2.append(cArr[(digest[i10] & 240) >>> 4]);
                sb2.append(cArr[digest[i10] & Ascii.SI]);
            }
            return sb2.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Object[] f(Collection collection) {
        zc.d.d(collection, "collection");
        int size = collection.size();
        Object[] objArr = f33139h;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i12 = ((i11 * 3) + 1) >>> 1;
                            if (i12 <= i11) {
                                i12 = 2147483645;
                                if (i11 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i12);
                            zc.d.c(objArr2, "copyOf(result, newSize)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        zc.d.c(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] g(Collection collection, Object[] objArr) {
        Object[] objArr2;
        zc.d.d(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            if (newInstance != null) {
                objArr2 = (Object[]) newInstance;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                zc.d.e(nullPointerException);
                throw nullPointerException;
            }
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                zc.d.c(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                zc.d.c(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    @Override // o8.s
    public Object a() {
        return new LinkedHashSet();
    }

    public void d(boolean z10) {
        throw null;
    }

    public void e(p.a aVar, float f10) {
        float f11;
        CardView.a aVar2 = (CardView.a) aVar;
        p.b bVar = (p.b) aVar2.f1308a;
        boolean useCompatPadding = aVar2.f1309b.getUseCompatPadding();
        CardView cardView = aVar2.f1309b;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != bVar.f34221e || bVar.f != useCompatPadding || bVar.f34222g != preventCornerOverlap) {
            bVar.f34221e = f10;
            bVar.f = useCompatPadding;
            bVar.f34222g = preventCornerOverlap;
            bVar.c(null);
            bVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            aVar2.a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = aVar2.f1308a;
        float f12 = ((p.b) drawable).f34221e;
        float f13 = ((p.b) drawable).f34217a;
        if (cardView.getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - p.c.f34227a) * f13) + f12);
        } else {
            int i10 = p.c.f34228b;
            f11 = f12;
        }
        int ceil = (int) Math.ceil(f11);
        int ceil2 = (int) Math.ceil(p.c.a(f12, f13, cardView.getPreventCornerOverlap()));
        aVar2.a(ceil, ceil2, ceil, ceil2);
    }

    public /* synthetic */ v0(p5.f fVar) {
        new p5.d(fVar.f34447a, fVar.f34448b, fVar.f34431e, fVar.f, fVar.f34432g, fVar.f34433h, fVar.f34434i, fVar.f34435j, fVar.f34436k, fVar.f34449c, fVar.f34437l, fVar.f34438m);
    }

    public void c(boolean z10) {
    }
}
