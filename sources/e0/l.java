package e0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* loaded from: classes.dex */
public final class l {
    public static c a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        c cVar;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new c(null, null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c(null, null, 0);
    }

    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f) {
        if (!d(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i10, f);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        if (!d(xmlPullParser, str)) {
            return i11;
        }
        return typedArray.getInt(i10, i11);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
