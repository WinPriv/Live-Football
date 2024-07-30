package i;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.x;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f28990e;
    public static final Class<?>[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f28991a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f28992b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f28993c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28994d;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f28995c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public final Object f28996a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f28997b;

        public a(Object obj, String str) {
            this.f28996a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f28997b = cls.getMethod(str, f28995c);
            } catch (Exception e10) {
                StringBuilder s10 = l.s("Couldn't resolve menu item onClick handler ", str, " in class ");
                s10.append(cls.getName());
                InflateException inflateException = new InflateException(s10.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f28997b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f28996a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f28998a;

        /* renamed from: h, reason: collision with root package name */
        public boolean f29004h;

        /* renamed from: i, reason: collision with root package name */
        public int f29005i;

        /* renamed from: j, reason: collision with root package name */
        public int f29006j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f29007k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f29008l;

        /* renamed from: m, reason: collision with root package name */
        public int f29009m;

        /* renamed from: n, reason: collision with root package name */
        public char f29010n;
        public int o;

        /* renamed from: p, reason: collision with root package name */
        public char f29011p;

        /* renamed from: q, reason: collision with root package name */
        public int f29012q;

        /* renamed from: r, reason: collision with root package name */
        public int f29013r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f29014s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f29015t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f29016u;

        /* renamed from: v, reason: collision with root package name */
        public int f29017v;

        /* renamed from: w, reason: collision with root package name */
        public int f29018w;

        /* renamed from: x, reason: collision with root package name */
        public String f29019x;
        public String y;

        /* renamed from: z, reason: collision with root package name */
        public n0.b f29020z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b, reason: collision with root package name */
        public int f28999b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f29000c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f29001d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f29002e = 0;
        public boolean f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f29003g = true;

        public b(Menu menu) {
            this.f28998a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f28993c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f29014s).setVisible(this.f29015t).setEnabled(this.f29016u);
            boolean z11 = false;
            if (this.f29013r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f29008l).setIcon(this.f29009m);
            int i10 = this.f29017v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.f28993c.isRestricted()) {
                    if (fVar.f28994d == null) {
                        fVar.f28994d = f.a(fVar.f28993c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f28994d, this.y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f29013r >= 2) {
                if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    jVar.f862x = (jVar.f862x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    try {
                        Method method = menuItemWrapperICS.f753e;
                        h0.b bVar = menuItemWrapperICS.f752d;
                        if (method == null) {
                            menuItemWrapperICS.f753e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.f753e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str2 = this.f29019x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f28990e, fVar.f28991a));
                z11 = true;
            }
            int i11 = this.f29018w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            n0.b bVar2 = this.f29020z;
            if (bVar2 != null) {
                if (menuItem instanceof h0.b) {
                    ((h0.b) menuItem).a(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z12 = menuItem instanceof h0.b;
            if (z12) {
                ((h0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.l.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z12) {
                ((h0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.l.m(menuItem, charSequence2);
            }
            char c10 = this.f29010n;
            int i12 = this.o;
            if (z12) {
                ((h0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.l.g(menuItem, c10, i12);
            }
            char c11 = this.f29011p;
            int i13 = this.f29012q;
            if (z12) {
                ((h0.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.l.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((h0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    n0.l.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z12) {
                    ((h0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    n0.l.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f28990e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f28993c = context;
        Object[] objArr = {context};
        this.f28991a = objArr;
        this.f28992b = objArr;
    }

    public static Object a(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                Menu menu2 = bVar.f28998a;
                z11 = z11;
                z11 = z11;
                if (eventType != i10) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            z12 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.f28999b = 0;
                            bVar.f29000c = 0;
                            bVar.f29001d = 0;
                            bVar.f29002e = 0;
                            bVar.f = true;
                            bVar.f29003g = true;
                            z11 = z11;
                        } else if (name2.equals("item")) {
                            z11 = z11;
                            if (!bVar.f29004h) {
                                n0.b bVar2 = bVar.f29020z;
                                if (bVar2 != null && bVar2.a()) {
                                    bVar.f29004h = true;
                                    bVar.b(menu2.addSubMenu(bVar.f28999b, bVar.f29005i, bVar.f29006j, bVar.f29007k).getItem());
                                    z11 = z11;
                                } else {
                                    bVar.f29004h = true;
                                    bVar.b(menu2.add(bVar.f28999b, bVar.f29005i, bVar.f29006j, bVar.f29007k));
                                    z11 = z11;
                                }
                            }
                        } else {
                            z11 = z11;
                            if (name2.equals("menu")) {
                                z11 = true;
                            }
                        }
                    }
                } else if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.f28993c.obtainStyledAttributes(attributeSet, a0.a.R);
                        bVar.f28999b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f29000c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f29001d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f29002e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f29003g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z11 = z11;
                    } else if (name3.equals("item")) {
                        Context context = fVar.f28993c;
                        m0 m0Var = new m0(context, context.obtainStyledAttributes(attributeSet, a0.a.S));
                        bVar.f29005i = m0Var.i(2, 0);
                        bVar.f29006j = (m0Var.h(5, bVar.f29000c) & (-65536)) | (m0Var.h(6, bVar.f29001d) & 65535);
                        bVar.f29007k = m0Var.k(7);
                        bVar.f29008l = m0Var.k(8);
                        bVar.f29009m = m0Var.i(0, 0);
                        String j10 = m0Var.j(9);
                        if (j10 == null) {
                            charAt = 0;
                        } else {
                            charAt = j10.charAt(0);
                        }
                        bVar.f29010n = charAt;
                        bVar.o = m0Var.h(16, 4096);
                        String j11 = m0Var.j(10);
                        if (j11 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j11.charAt(0);
                        }
                        bVar.f29011p = charAt2;
                        bVar.f29012q = m0Var.h(20, 4096);
                        if (m0Var.l(11)) {
                            bVar.f29013r = m0Var.a(11, false) ? 1 : 0;
                        } else {
                            bVar.f29013r = bVar.f29002e;
                        }
                        bVar.f29014s = m0Var.a(3, false);
                        bVar.f29015t = m0Var.a(4, bVar.f);
                        bVar.f29016u = m0Var.a(1, bVar.f29003g);
                        bVar.f29017v = m0Var.h(21, -1);
                        bVar.y = m0Var.j(12);
                        bVar.f29018w = m0Var.i(13, 0);
                        bVar.f29019x = m0Var.j(15);
                        String j12 = m0Var.j(14);
                        if (j12 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && bVar.f29018w == 0 && bVar.f29019x == null) {
                            bVar.f29020z = (n0.b) bVar.a(j12, f, fVar.f28992b);
                        } else {
                            if (z10) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f29020z = null;
                        }
                        bVar.A = m0Var.k(17);
                        bVar.B = m0Var.k(22);
                        if (m0Var.l(19)) {
                            bVar.D = x.c(m0Var.h(19, -1), bVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.D = null;
                        }
                        if (m0Var.l(18)) {
                            bVar.C = m0Var.b(18);
                        } else {
                            bVar.C = colorStateList;
                        }
                        m0Var.n();
                        bVar.f29004h = false;
                    } else if (name3.equals("menu")) {
                        bVar.f29004h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(bVar.f28999b, bVar.f29005i, bVar.f29006j, bVar.f29007k);
                        bVar.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z12 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i10 = 2;
                z11 = z11;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof h0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f28993c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
