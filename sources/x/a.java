package x;

import a3.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.huawei.hms.ads.gl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import q.e;
import s.f;

/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36204b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36205c;

    /* renamed from: d, reason: collision with root package name */
    public int f36206d;

    /* renamed from: e, reason: collision with root package name */
    public float f36207e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36208g;

    /* renamed from: h, reason: collision with root package name */
    public int f36209h;

    public a(String str, int i10, Object obj, boolean z10) {
        this.f36203a = false;
        this.f36204b = str;
        this.f36205c = i10;
        this.f36203a = z10;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e.C);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        Object obj = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            int i12 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i13 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i13 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, gl.Code), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, gl.Code));
                        } else {
                            i13 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i12 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i10 = i12;
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i13;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i10, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0038. Please report as an issue. */
    public static void b(View view, HashMap<String, a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            a aVar = hashMap.get(str2);
            if (!aVar.f36203a) {
                str = f.b("set", str2);
            } else {
                str = str2;
            }
            try {
                switch (f.c(aVar.f36205c)) {
                    case 0:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f36206d));
                        break;
                    case 1:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f36207e));
                        break;
                    case 2:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f36209h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f36209h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, aVar.f);
                        break;
                    case 5:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f36208g));
                        break;
                    case 6:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(aVar.f36207e));
                        break;
                    case 7:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f36206d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                StringBuilder s10 = l.s(" Custom Attribute \"", str2, "\" not found on ");
                s10.append(cls.getName());
                Log.e("TransitionLayout", s10.toString());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
            } catch (InvocationTargetException e12) {
                StringBuilder s11 = l.s(" Custom Attribute \"", str2, "\" not found on ");
                s11.append(cls.getName());
                Log.e("TransitionLayout", s11.toString());
                e12.printStackTrace();
            }
        }
    }

    public final void c(Object obj) {
        switch (f.c(this.f36205c)) {
            case 0:
            case 7:
                this.f36206d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f36207e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f36209h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (String) obj;
                return;
            case 5:
                this.f36208g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f36207e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f36203a = false;
        this.f36204b = aVar.f36204b;
        this.f36205c = aVar.f36205c;
        c(obj);
    }
}
