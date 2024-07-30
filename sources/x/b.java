package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import q.e;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36210a;

    /* renamed from: b, reason: collision with root package name */
    public int f36211b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f36212c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<a> f36213d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.a> f36214e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f36215a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<C0502b> f36216b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final int f36217c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.constraintlayout.widget.a f36218d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f36217c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e.H);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f36215a = obtainStyledAttributes.getResourceId(index, this.f36215a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f36217c);
                    this.f36217c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f36218d = aVar;
                        aVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: x.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0502b {

        /* renamed from: a, reason: collision with root package name */
        public final float f36219a;

        /* renamed from: b, reason: collision with root package name */
        public final float f36220b;

        /* renamed from: c, reason: collision with root package name */
        public final float f36221c;

        /* renamed from: d, reason: collision with root package name */
        public final float f36222d;

        /* renamed from: e, reason: collision with root package name */
        public final int f36223e;
        public final androidx.constraintlayout.widget.a f;

        public C0502b(Context context, XmlResourceParser xmlResourceParser) {
            this.f36219a = Float.NaN;
            this.f36220b = Float.NaN;
            this.f36221c = Float.NaN;
            this.f36222d = Float.NaN;
            this.f36223e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e.J);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f36223e);
                    this.f36223e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f = aVar;
                        aVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f36222d = obtainStyledAttributes.getDimension(index, this.f36222d);
                } else if (index == 2) {
                    this.f36220b = obtainStyledAttributes.getDimension(index, this.f36220b);
                } else if (index == 3) {
                    this.f36221c = obtainStyledAttributes.getDimension(index, this.f36221c);
                } else if (index == 4) {
                    this.f36219a = obtainStyledAttributes.getDimension(index, this.f36219a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f10) {
            float f11 = this.f36219a;
            if (!Float.isNaN(f11) && f < f11) {
                return false;
            }
            float f12 = this.f36220b;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f36221c;
            if (!Float.isNaN(f13) && f > f13) {
                return false;
            }
            float f14 = this.f36222d;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            return true;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f36210a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c10 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c10 = 2;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c10 = 0;
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c10 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c10 = 65535;
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    if (c10 == 4) {
                                        a(context, xml);
                                    }
                                } else {
                                    C0502b c0502b = new C0502b(context, xml);
                                    if (aVar != null) {
                                        aVar.f36216b.add(c0502b);
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xml);
                                this.f36213d.put(aVar2.f36215a, aVar2);
                                aVar = aVar2;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0139. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
