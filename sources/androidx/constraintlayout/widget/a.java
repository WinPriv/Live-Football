package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.huawei.hms.ads.gl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1433d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1434e;
    public static final SparseIntArray f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, x.a> f1435a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1436b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<Integer, C0014a> f1437c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0014a {

        /* renamed from: a, reason: collision with root package name */
        public int f1438a;

        /* renamed from: b, reason: collision with root package name */
        public final d f1439b = new d();

        /* renamed from: c, reason: collision with root package name */
        public final c f1440c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f1441d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f1442e = new e();
        public HashMap<String, x.a> f = new HashMap<>();

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0015a {

            /* renamed from: a, reason: collision with root package name */
            public int[] f1443a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            public int[] f1444b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            public int f1445c = 0;

            /* renamed from: d, reason: collision with root package name */
            public int[] f1446d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            public float[] f1447e = new float[10];
            public int f = 0;

            /* renamed from: g, reason: collision with root package name */
            public int[] f1448g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            public String[] f1449h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            public int f1450i = 0;

            /* renamed from: j, reason: collision with root package name */
            public int[] f1451j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            public boolean[] f1452k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            public int f1453l = 0;

            public final void a(float f, int i10) {
                int i11 = this.f;
                int[] iArr = this.f1446d;
                if (i11 >= iArr.length) {
                    this.f1446d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1447e;
                    this.f1447e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1446d;
                int i12 = this.f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1447e;
                this.f = i12 + 1;
                fArr2[i12] = f;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f1445c;
                int[] iArr = this.f1443a;
                if (i12 >= iArr.length) {
                    this.f1443a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1444b;
                    this.f1444b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1443a;
                int i13 = this.f1445c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1444b;
                this.f1445c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f1450i;
                int[] iArr = this.f1448g;
                if (i11 >= iArr.length) {
                    this.f1448g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1449h;
                    this.f1449h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1448g;
                int i12 = this.f1450i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1449h;
                this.f1450i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f1453l;
                int[] iArr = this.f1451j;
                if (i11 >= iArr.length) {
                    this.f1451j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1452k;
                    this.f1452k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1451j;
                int i12 = this.f1453l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1452k;
                this.f1453l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            b bVar = this.f1441d;
            aVar.f1378e = bVar.f1468h;
            aVar.f = bVar.f1470i;
            aVar.f1381g = bVar.f1472j;
            aVar.f1383h = bVar.f1474k;
            aVar.f1385i = bVar.f1476l;
            aVar.f1387j = bVar.f1478m;
            aVar.f1389k = bVar.f1480n;
            aVar.f1391l = bVar.o;
            aVar.f1393m = bVar.f1483p;
            aVar.f1395n = bVar.f1484q;
            aVar.o = bVar.f1485r;
            aVar.f1403s = bVar.f1486s;
            aVar.f1404t = bVar.f1487t;
            aVar.f1405u = bVar.f1488u;
            aVar.f1406v = bVar.f1489v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.I;
            aVar.A = bVar.R;
            aVar.B = bVar.Q;
            aVar.f1408x = bVar.N;
            aVar.f1409z = bVar.P;
            aVar.E = bVar.f1490w;
            aVar.F = bVar.f1491x;
            aVar.f1398p = bVar.f1492z;
            aVar.f1400q = bVar.A;
            aVar.f1402r = bVar.B;
            aVar.G = bVar.y;
            aVar.T = bVar.C;
            aVar.U = bVar.D;
            aVar.I = bVar.T;
            aVar.H = bVar.U;
            aVar.K = bVar.W;
            aVar.J = bVar.V;
            aVar.W = bVar.f1477l0;
            aVar.X = bVar.f1479m0;
            aVar.L = bVar.X;
            aVar.M = bVar.Y;
            aVar.P = bVar.Z;
            aVar.Q = bVar.f1456a0;
            aVar.N = bVar.f1458b0;
            aVar.O = bVar.f1460c0;
            aVar.R = bVar.f1462d0;
            aVar.S = bVar.f1464e0;
            aVar.V = bVar.E;
            aVar.f1374c = bVar.f;
            aVar.f1370a = bVar.f1461d;
            aVar.f1372b = bVar.f1463e;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.f1457b;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.f1459c;
            String str = bVar.f1475k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f1482o0;
            aVar.setMarginStart(bVar.K);
            aVar.setMarginEnd(bVar.J);
            aVar.a();
        }

        public final void b(int i10, ConstraintLayout.a aVar) {
            this.f1438a = i10;
            int i11 = aVar.f1378e;
            b bVar = this.f1441d;
            bVar.f1468h = i11;
            bVar.f1470i = aVar.f;
            bVar.f1472j = aVar.f1381g;
            bVar.f1474k = aVar.f1383h;
            bVar.f1476l = aVar.f1385i;
            bVar.f1478m = aVar.f1387j;
            bVar.f1480n = aVar.f1389k;
            bVar.o = aVar.f1391l;
            bVar.f1483p = aVar.f1393m;
            bVar.f1484q = aVar.f1395n;
            bVar.f1485r = aVar.o;
            bVar.f1486s = aVar.f1403s;
            bVar.f1487t = aVar.f1404t;
            bVar.f1488u = aVar.f1405u;
            bVar.f1489v = aVar.f1406v;
            bVar.f1490w = aVar.E;
            bVar.f1491x = aVar.F;
            bVar.y = aVar.G;
            bVar.f1492z = aVar.f1398p;
            bVar.A = aVar.f1400q;
            bVar.B = aVar.f1402r;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.E = aVar.V;
            bVar.f = aVar.f1374c;
            bVar.f1461d = aVar.f1370a;
            bVar.f1463e = aVar.f1372b;
            bVar.f1457b = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.f1459c = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.L = aVar.D;
            bVar.T = aVar.I;
            bVar.U = aVar.H;
            bVar.W = aVar.K;
            bVar.V = aVar.J;
            bVar.f1477l0 = aVar.W;
            bVar.f1479m0 = aVar.X;
            bVar.X = aVar.L;
            bVar.Y = aVar.M;
            bVar.Z = aVar.P;
            bVar.f1456a0 = aVar.Q;
            bVar.f1458b0 = aVar.N;
            bVar.f1460c0 = aVar.O;
            bVar.f1462d0 = aVar.R;
            bVar.f1464e0 = aVar.S;
            bVar.f1475k0 = aVar.Y;
            bVar.N = aVar.f1408x;
            bVar.P = aVar.f1409z;
            bVar.M = aVar.f1407w;
            bVar.O = aVar.y;
            bVar.R = aVar.A;
            bVar.Q = aVar.B;
            bVar.S = aVar.C;
            bVar.f1482o0 = aVar.Z;
            bVar.J = aVar.getMarginEnd();
            bVar.K = aVar.getMarginStart();
        }

        public final void c(int i10, Constraints.a aVar) {
            b(i10, aVar);
            this.f1439b.f1504c = aVar.f1419r0;
            float f = aVar.f1422u0;
            e eVar = this.f1442e;
            eVar.f1507a = f;
            eVar.f1508b = aVar.f1423v0;
            eVar.f1509c = aVar.f1424w0;
            eVar.f1510d = aVar.f1425x0;
            eVar.f1511e = aVar.y0;
            eVar.f = aVar.f1426z0;
            eVar.f1512g = aVar.A0;
            eVar.f1514i = aVar.B0;
            eVar.f1515j = aVar.C0;
            eVar.f1516k = aVar.D0;
            eVar.f1518m = aVar.f1421t0;
            eVar.f1517l = aVar.f1420s0;
        }

        public final Object clone() throws CloneNotSupportedException {
            C0014a c0014a = new C0014a();
            b bVar = c0014a.f1441d;
            bVar.getClass();
            b bVar2 = this.f1441d;
            bVar.f1455a = bVar2.f1455a;
            bVar.f1457b = bVar2.f1457b;
            bVar.f1459c = bVar2.f1459c;
            bVar.f1461d = bVar2.f1461d;
            bVar.f1463e = bVar2.f1463e;
            bVar.f = bVar2.f;
            bVar.f1466g = bVar2.f1466g;
            bVar.f1468h = bVar2.f1468h;
            bVar.f1470i = bVar2.f1470i;
            bVar.f1472j = bVar2.f1472j;
            bVar.f1474k = bVar2.f1474k;
            bVar.f1476l = bVar2.f1476l;
            bVar.f1478m = bVar2.f1478m;
            bVar.f1480n = bVar2.f1480n;
            bVar.o = bVar2.o;
            bVar.f1483p = bVar2.f1483p;
            bVar.f1484q = bVar2.f1484q;
            bVar.f1485r = bVar2.f1485r;
            bVar.f1486s = bVar2.f1486s;
            bVar.f1487t = bVar2.f1487t;
            bVar.f1488u = bVar2.f1488u;
            bVar.f1489v = bVar2.f1489v;
            bVar.f1490w = bVar2.f1490w;
            bVar.f1491x = bVar2.f1491x;
            bVar.y = bVar2.y;
            bVar.f1492z = bVar2.f1492z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f1456a0 = bVar2.f1456a0;
            bVar.f1458b0 = bVar2.f1458b0;
            bVar.f1460c0 = bVar2.f1460c0;
            bVar.f1462d0 = bVar2.f1462d0;
            bVar.f1464e0 = bVar2.f1464e0;
            bVar.f1465f0 = bVar2.f1465f0;
            bVar.f1467g0 = bVar2.f1467g0;
            bVar.f1469h0 = bVar2.f1469h0;
            bVar.f1475k0 = bVar2.f1475k0;
            int[] iArr = bVar2.f1471i0;
            if (iArr != null && bVar2.f1473j0 == null) {
                bVar.f1471i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f1471i0 = null;
            }
            bVar.f1473j0 = bVar2.f1473j0;
            bVar.f1477l0 = bVar2.f1477l0;
            bVar.f1479m0 = bVar2.f1479m0;
            bVar.f1481n0 = bVar2.f1481n0;
            bVar.f1482o0 = bVar2.f1482o0;
            c cVar = c0014a.f1440c;
            cVar.getClass();
            c cVar2 = this.f1440c;
            cVar2.getClass();
            cVar.f1494a = cVar2.f1494a;
            cVar.f1496c = cVar2.f1496c;
            cVar.f1498e = cVar2.f1498e;
            cVar.f1497d = cVar2.f1497d;
            d dVar = c0014a.f1439b;
            dVar.getClass();
            d dVar2 = this.f1439b;
            dVar2.getClass();
            dVar.f1502a = dVar2.f1502a;
            dVar.f1504c = dVar2.f1504c;
            dVar.f1505d = dVar2.f1505d;
            dVar.f1503b = dVar2.f1503b;
            e eVar = c0014a.f1442e;
            eVar.getClass();
            e eVar2 = this.f1442e;
            eVar2.getClass();
            eVar.f1507a = eVar2.f1507a;
            eVar.f1508b = eVar2.f1508b;
            eVar.f1509c = eVar2.f1509c;
            eVar.f1510d = eVar2.f1510d;
            eVar.f1511e = eVar2.f1511e;
            eVar.f = eVar2.f;
            eVar.f1512g = eVar2.f1512g;
            eVar.f1513h = eVar2.f1513h;
            eVar.f1514i = eVar2.f1514i;
            eVar.f1515j = eVar2.f1515j;
            eVar.f1516k = eVar2.f1516k;
            eVar.f1517l = eVar2.f1517l;
            eVar.f1518m = eVar2.f1518m;
            c0014a.f1438a = this.f1438a;
            return c0014a;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: p0, reason: collision with root package name */
        public static final SparseIntArray f1454p0;

        /* renamed from: b, reason: collision with root package name */
        public int f1457b;

        /* renamed from: c, reason: collision with root package name */
        public int f1459c;

        /* renamed from: i0, reason: collision with root package name */
        public int[] f1471i0;

        /* renamed from: j0, reason: collision with root package name */
        public String f1473j0;

        /* renamed from: k0, reason: collision with root package name */
        public String f1475k0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1455a = false;

        /* renamed from: d, reason: collision with root package name */
        public int f1461d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f1463e = -1;
        public float f = -1.0f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1466g = true;

        /* renamed from: h, reason: collision with root package name */
        public int f1468h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f1470i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f1472j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f1474k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f1476l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f1478m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f1480n = -1;
        public int o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f1483p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f1484q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f1485r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f1486s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f1487t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f1488u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f1489v = -1;

        /* renamed from: w, reason: collision with root package name */
        public float f1490w = 0.5f;

        /* renamed from: x, reason: collision with root package name */
        public float f1491x = 0.5f;
        public String y = null;

        /* renamed from: z, reason: collision with root package name */
        public int f1492z = -1;
        public int A = 0;
        public float B = gl.Code;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f1456a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f1458b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f1460c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public float f1462d0 = 1.0f;

        /* renamed from: e0, reason: collision with root package name */
        public float f1464e0 = 1.0f;

        /* renamed from: f0, reason: collision with root package name */
        public int f1465f0 = -1;

        /* renamed from: g0, reason: collision with root package name */
        public int f1467g0 = 0;

        /* renamed from: h0, reason: collision with root package name */
        public int f1469h0 = -1;

        /* renamed from: l0, reason: collision with root package name */
        public boolean f1477l0 = false;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f1479m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f1481n0 = true;

        /* renamed from: o0, reason: collision with root package name */
        public int f1482o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1454p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.D);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f1454p0;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.f1483p = a.f(obtainStyledAttributes, index, this.f1483p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.o = a.f(obtainStyledAttributes, index, this.o);
                        break;
                    case 4:
                        this.f1480n = a.f(obtainStyledAttributes, index, this.f1480n);
                        break;
                    case 5:
                        this.y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f1489v = a.f(obtainStyledAttributes, index, this.f1489v);
                        break;
                    case 10:
                        this.f1488u = a.f(obtainStyledAttributes, index, this.f1488u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f1461d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1461d);
                        break;
                    case 18:
                        this.f1463e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1463e);
                        break;
                    case 19:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 20:
                        this.f1490w = obtainStyledAttributes.getFloat(index, this.f1490w);
                        break;
                    case 21:
                        this.f1459c = obtainStyledAttributes.getLayoutDimension(index, this.f1459c);
                        break;
                    case 22:
                        this.f1457b = obtainStyledAttributes.getLayoutDimension(index, this.f1457b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f1468h = a.f(obtainStyledAttributes, index, this.f1468h);
                        break;
                    case 25:
                        this.f1470i = a.f(obtainStyledAttributes, index, this.f1470i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f1472j = a.f(obtainStyledAttributes, index, this.f1472j);
                        break;
                    case 29:
                        this.f1474k = a.f(obtainStyledAttributes, index, this.f1474k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f1486s = a.f(obtainStyledAttributes, index, this.f1486s);
                        break;
                    case 32:
                        this.f1487t = a.f(obtainStyledAttributes, index, this.f1487t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f1478m = a.f(obtainStyledAttributes, index, this.f1478m);
                        break;
                    case 35:
                        this.f1476l = a.f(obtainStyledAttributes, index, this.f1476l);
                        break;
                    case 36:
                        this.f1491x = obtainStyledAttributes.getFloat(index, this.f1491x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        a.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        a.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f1492z = a.f(obtainStyledAttributes, index, this.f1492z);
                                break;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1462d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1464e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1465f0 = obtainStyledAttributes.getInt(index, this.f1465f0);
                                        break;
                                    case 73:
                                        this.f1467g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1467g0);
                                        break;
                                    case 74:
                                        this.f1473j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1481n0 = obtainStyledAttributes.getBoolean(index, this.f1481n0);
                                        break;
                                    case 76:
                                        this.f1482o0 = obtainStyledAttributes.getInt(index, this.f1482o0);
                                        break;
                                    case 77:
                                        this.f1484q = a.f(obtainStyledAttributes, index, this.f1484q);
                                        break;
                                    case 78:
                                        this.f1485r = a.f(obtainStyledAttributes, index, this.f1485r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f1456a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1456a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f1460c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1460c0);
                                        break;
                                    case 86:
                                        this.f1458b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1458b0);
                                        break;
                                    case 87:
                                        this.f1477l0 = obtainStyledAttributes.getBoolean(index, this.f1477l0);
                                        break;
                                    case 88:
                                        this.f1479m0 = obtainStyledAttributes.getBoolean(index, this.f1479m0);
                                        break;
                                    case 89:
                                        this.f1475k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1466g = obtainStyledAttributes.getBoolean(index, this.f1466g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: j, reason: collision with root package name */
        public static final SparseIntArray f1493j;

        /* renamed from: a, reason: collision with root package name */
        public int f1494a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f1495b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f1496c = -1;

        /* renamed from: d, reason: collision with root package name */
        public float f1497d = Float.NaN;

        /* renamed from: e, reason: collision with root package name */
        public float f1498e = Float.NaN;
        public float f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public int f1499g = -1;

        /* renamed from: h, reason: collision with root package name */
        public String f1500h = null;

        /* renamed from: i, reason: collision with root package name */
        public int f1501i = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1493j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.E);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1493j.get(index)) {
                    case 1:
                        this.f1498e = obtainStyledAttributes.getFloat(index, this.f1498e);
                        break;
                    case 2:
                        this.f1496c = obtainStyledAttributes.getInt(index, this.f1496c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = t.a.f35326b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1494a = a.f(obtainStyledAttributes, index, this.f1494a);
                        break;
                    case 6:
                        this.f1495b = obtainStyledAttributes.getInteger(index, this.f1495b);
                        break;
                    case 7:
                        this.f1497d = obtainStyledAttributes.getFloat(index, this.f1497d);
                        break;
                    case 8:
                        this.f1499g = obtainStyledAttributes.getInteger(index, this.f1499g);
                        break;
                    case 9:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            this.f1501i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1500h = string;
                            if (string.indexOf("/") > 0) {
                                this.f1501i = obtainStyledAttributes.getResourceId(index, -1);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, this.f1501i);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f1502a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f1503b = 0;

        /* renamed from: c, reason: collision with root package name */
        public float f1504c = 1.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f1505d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.G);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1504c = obtainStyledAttributes.getFloat(index, this.f1504c);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1502a);
                    this.f1502a = i11;
                    this.f1502a = a.f1433d[i11];
                } else if (index == 4) {
                    this.f1503b = obtainStyledAttributes.getInt(index, this.f1503b);
                } else if (index == 3) {
                    this.f1505d = obtainStyledAttributes.getFloat(index, this.f1505d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f1506n;

        /* renamed from: a, reason: collision with root package name */
        public float f1507a = gl.Code;

        /* renamed from: b, reason: collision with root package name */
        public float f1508b = gl.Code;

        /* renamed from: c, reason: collision with root package name */
        public float f1509c = gl.Code;

        /* renamed from: d, reason: collision with root package name */
        public float f1510d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1511e = 1.0f;
        public float f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f1512g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f1513h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f1514i = gl.Code;

        /* renamed from: j, reason: collision with root package name */
        public float f1515j = gl.Code;

        /* renamed from: k, reason: collision with root package name */
        public float f1516k = gl.Code;

        /* renamed from: l, reason: collision with root package name */
        public boolean f1517l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f1518m = gl.Code;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1506n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.I);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1506n.get(index)) {
                    case 1:
                        this.f1507a = obtainStyledAttributes.getFloat(index, this.f1507a);
                        break;
                    case 2:
                        this.f1508b = obtainStyledAttributes.getFloat(index, this.f1508b);
                        break;
                    case 3:
                        this.f1509c = obtainStyledAttributes.getFloat(index, this.f1509c);
                        break;
                    case 4:
                        this.f1510d = obtainStyledAttributes.getFloat(index, this.f1510d);
                        break;
                    case 5:
                        this.f1511e = obtainStyledAttributes.getFloat(index, this.f1511e);
                        break;
                    case 6:
                        this.f = obtainStyledAttributes.getDimension(index, this.f);
                        break;
                    case 7:
                        this.f1512g = obtainStyledAttributes.getDimension(index, this.f1512g);
                        break;
                    case 8:
                        this.f1514i = obtainStyledAttributes.getDimension(index, this.f1514i);
                        break;
                    case 9:
                        this.f1515j = obtainStyledAttributes.getDimension(index, this.f1515j);
                        break;
                    case 10:
                        this.f1516k = obtainStyledAttributes.getDimension(index, this.f1516k);
                        break;
                    case 11:
                        this.f1517l = true;
                        this.f1518m = obtainStyledAttributes.getDimension(index, this.f1518m);
                        break;
                    case 12:
                        this.f1513h = a.f(obtainStyledAttributes, index, this.f1513h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1434e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i10;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Integer num = null;
            try {
                i10 = x.d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.E) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.E.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i10 = num.intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x05d9. Please report as an issue. */
    public static C0014a d(Context context, AttributeSet attributeSet, boolean z10) {
        String str;
        String[] strArr;
        String str2;
        C0014a.C0015a c0015a;
        C0014a c0014a = new C0014a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? q.e.A : q.e.y);
        String[] strArr2 = t.a.f35326b;
        int[] iArr = f1433d;
        SparseIntArray sparseIntArray = f1434e;
        d dVar = c0014a.f1439b;
        e eVar = c0014a.f1442e;
        c cVar = c0014a.f1440c;
        b bVar = c0014a.f1441d;
        String str3 = "unused attribute 0x";
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            C0014a.C0015a c0015a2 = new C0014a.C0015a();
            cVar.getClass();
            bVar.getClass();
            dVar.getClass();
            eVar.getClass();
            int i10 = 0;
            while (i10 < indexCount) {
                int i11 = indexCount;
                int index = obtainStyledAttributes.getIndex(i10);
                int i12 = i10;
                switch (f.get(index)) {
                    case 2:
                        strArr = strArr2;
                        c0015a2.b(2, obtainStyledAttributes.getDimensionPixelSize(index, bVar.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        StringBuilder sb2 = new StringBuilder(str2);
                        c0015a = c0015a2;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        continue;
                    case 5:
                        strArr = strArr2;
                        c0015a2.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        strArr = strArr2;
                        c0015a2.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, bVar.C));
                        break;
                    case 7:
                        strArr = strArr2;
                        c0015a2.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, bVar.D));
                        break;
                    case 8:
                        strArr = strArr2;
                        c0015a2.b(8, obtainStyledAttributes.getDimensionPixelSize(index, bVar.J));
                        break;
                    case 11:
                        strArr = strArr2;
                        c0015a2.b(11, obtainStyledAttributes.getDimensionPixelSize(index, bVar.P));
                        break;
                    case 12:
                        strArr = strArr2;
                        c0015a2.b(12, obtainStyledAttributes.getDimensionPixelSize(index, bVar.Q));
                        break;
                    case 13:
                        strArr = strArr2;
                        c0015a2.b(13, obtainStyledAttributes.getDimensionPixelSize(index, bVar.M));
                        break;
                    case 14:
                        strArr = strArr2;
                        c0015a2.b(14, obtainStyledAttributes.getDimensionPixelSize(index, bVar.O));
                        break;
                    case 15:
                        strArr = strArr2;
                        c0015a2.b(15, obtainStyledAttributes.getDimensionPixelSize(index, bVar.R));
                        break;
                    case 16:
                        strArr = strArr2;
                        c0015a2.b(16, obtainStyledAttributes.getDimensionPixelSize(index, bVar.N));
                        break;
                    case 17:
                        strArr = strArr2;
                        c0015a2.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f1461d));
                        break;
                    case 18:
                        strArr = strArr2;
                        c0015a2.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f1463e));
                        break;
                    case 19:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, bVar.f), 19);
                        break;
                    case 20:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, bVar.f1490w), 20);
                        break;
                    case 21:
                        strArr = strArr2;
                        c0015a2.b(21, obtainStyledAttributes.getLayoutDimension(index, bVar.f1459c));
                        break;
                    case 22:
                        strArr = strArr2;
                        c0015a2.b(22, iArr[obtainStyledAttributes.getInt(index, dVar.f1502a)]);
                        break;
                    case 23:
                        strArr = strArr2;
                        c0015a2.b(23, obtainStyledAttributes.getLayoutDimension(index, bVar.f1457b));
                        break;
                    case 24:
                        strArr = strArr2;
                        c0015a2.b(24, obtainStyledAttributes.getDimensionPixelSize(index, bVar.F));
                        break;
                    case 27:
                        strArr = strArr2;
                        c0015a2.b(27, obtainStyledAttributes.getInt(index, bVar.E));
                        break;
                    case 28:
                        strArr = strArr2;
                        c0015a2.b(28, obtainStyledAttributes.getDimensionPixelSize(index, bVar.G));
                        break;
                    case 31:
                        strArr = strArr2;
                        c0015a2.b(31, obtainStyledAttributes.getDimensionPixelSize(index, bVar.K));
                        break;
                    case 34:
                        strArr = strArr2;
                        c0015a2.b(34, obtainStyledAttributes.getDimensionPixelSize(index, bVar.H));
                        break;
                    case 37:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, bVar.f1491x), 37);
                        break;
                    case 38:
                        strArr = strArr2;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0014a.f1438a);
                        c0014a.f1438a = resourceId;
                        c0015a2.b(38, resourceId);
                        break;
                    case 39:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, bVar.U), 39);
                        break;
                    case 40:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, bVar.T), 40);
                        break;
                    case 41:
                        strArr = strArr2;
                        c0015a2.b(41, obtainStyledAttributes.getInt(index, bVar.V));
                        break;
                    case 42:
                        strArr = strArr2;
                        c0015a2.b(42, obtainStyledAttributes.getInt(index, bVar.W));
                        break;
                    case 43:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, dVar.f1504c), 43);
                        break;
                    case 44:
                        strArr = strArr2;
                        c0015a2.d(44, true);
                        c0015a2.a(obtainStyledAttributes.getDimension(index, eVar.f1518m), 44);
                        break;
                    case 45:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, eVar.f1508b), 45);
                        break;
                    case 46:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, eVar.f1509c), 46);
                        break;
                    case 47:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, eVar.f1510d), 47);
                        break;
                    case 48:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, eVar.f1511e), 48);
                        break;
                    case 49:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getDimension(index, eVar.f), 49);
                        break;
                    case 50:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getDimension(index, eVar.f1512g), 50);
                        break;
                    case 51:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getDimension(index, eVar.f1514i), 51);
                        break;
                    case 52:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getDimension(index, eVar.f1515j), 52);
                        break;
                    case 53:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getDimension(index, eVar.f1516k), 53);
                        break;
                    case 54:
                        strArr = strArr2;
                        c0015a2.b(54, obtainStyledAttributes.getInt(index, bVar.X));
                        break;
                    case 55:
                        strArr = strArr2;
                        c0015a2.b(55, obtainStyledAttributes.getInt(index, bVar.Y));
                        break;
                    case 56:
                        strArr = strArr2;
                        c0015a2.b(56, obtainStyledAttributes.getDimensionPixelSize(index, bVar.Z));
                        break;
                    case 57:
                        strArr = strArr2;
                        c0015a2.b(57, obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1456a0));
                        break;
                    case 58:
                        strArr = strArr2;
                        c0015a2.b(58, obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1458b0));
                        break;
                    case 59:
                        strArr = strArr2;
                        c0015a2.b(59, obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1460c0));
                        break;
                    case 60:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, eVar.f1507a), 60);
                        break;
                    case 62:
                        strArr = strArr2;
                        c0015a2.b(62, obtainStyledAttributes.getDimensionPixelSize(index, bVar.A));
                        break;
                    case 63:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, bVar.B), 63);
                        break;
                    case 64:
                        strArr = strArr2;
                        c0015a2.b(64, f(obtainStyledAttributes, index, cVar.f1494a));
                        break;
                    case 65:
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c0015a2.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            c0015a2.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        strArr = strArr2;
                        c0015a2.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, cVar.f1498e), 67);
                        break;
                    case 68:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, dVar.f1505d), 68);
                        break;
                    case 69:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        strArr = strArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        c0015a2.b(72, obtainStyledAttributes.getInt(index, bVar.f1465f0));
                        break;
                    case 73:
                        strArr = strArr2;
                        c0015a2.b(73, obtainStyledAttributes.getDimensionPixelSize(index, bVar.f1467g0));
                        break;
                    case 74:
                        strArr = strArr2;
                        c0015a2.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        strArr = strArr2;
                        c0015a2.d(75, obtainStyledAttributes.getBoolean(index, bVar.f1481n0));
                        break;
                    case 76:
                        strArr = strArr2;
                        c0015a2.b(76, obtainStyledAttributes.getInt(index, cVar.f1496c));
                        break;
                    case 77:
                        strArr = strArr2;
                        c0015a2.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        strArr = strArr2;
                        c0015a2.b(78, obtainStyledAttributes.getInt(index, dVar.f1503b));
                        break;
                    case 79:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, cVar.f1497d), 79);
                        break;
                    case 80:
                        strArr = strArr2;
                        c0015a2.d(80, obtainStyledAttributes.getBoolean(index, bVar.f1477l0));
                        break;
                    case 81:
                        strArr = strArr2;
                        c0015a2.d(81, obtainStyledAttributes.getBoolean(index, bVar.f1479m0));
                        break;
                    case 82:
                        strArr = strArr2;
                        c0015a2.b(82, obtainStyledAttributes.getInteger(index, cVar.f1495b));
                        break;
                    case 83:
                        strArr = strArr2;
                        c0015a2.b(83, f(obtainStyledAttributes, index, eVar.f1513h));
                        break;
                    case 84:
                        strArr = strArr2;
                        c0015a2.b(84, obtainStyledAttributes.getInteger(index, cVar.f1499g));
                        break;
                    case 85:
                        strArr = strArr2;
                        c0015a2.a(obtainStyledAttributes.getFloat(index, cVar.f), 85);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i13 = obtainStyledAttributes.peekValue(index).type;
                        if (i13 != 1) {
                            if (i13 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                cVar.f1500h = string;
                                c0015a2.c(90, string);
                                if (cVar.f1500h.indexOf("/") > 0) {
                                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f1501i = resourceId2;
                                    c0015a2.b(89, resourceId2);
                                    c0015a2.b(88, -2);
                                    break;
                                } else {
                                    c0015a2.b(88, -1);
                                    break;
                                }
                            } else {
                                c0015a2.b(88, obtainStyledAttributes.getInteger(index, cVar.f1501i));
                                break;
                            }
                        } else {
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                            cVar.f1501i = resourceId3;
                            c0015a2.b(89, resourceId3);
                            if (cVar.f1501i != -1) {
                                c0015a2.b(88, -2);
                                break;
                            }
                        }
                        break;
                    case 87:
                        strArr = strArr2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        c0015a2.b(93, obtainStyledAttributes.getDimensionPixelSize(index, bVar.L));
                        break;
                    case 94:
                        strArr = strArr2;
                        c0015a2.b(94, obtainStyledAttributes.getDimensionPixelSize(index, bVar.S));
                        break;
                    case 95:
                        strArr = strArr2;
                        g(c0015a2, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        strArr = strArr2;
                        g(c0015a2, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        strArr = strArr2;
                        c0015a2.b(97, obtainStyledAttributes.getInt(index, bVar.f1482o0));
                        break;
                    case 98:
                        int i14 = MotionLayout.f1310j0;
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            c0014a.f1438a = obtainStyledAttributes.getResourceId(index, c0014a.f1438a);
                            break;
                        }
                    case 99:
                        c0015a2.d(99, obtainStyledAttributes.getBoolean(index, bVar.f1466g));
                        strArr = strArr2;
                        break;
                }
                str2 = str4;
                c0015a = c0015a2;
                indexCount = i11;
                c0015a2 = c0015a;
                str4 = str2;
                i10 = i12 + 1;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i15 = 0;
            while (i15 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                int i16 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        cVar.getClass();
                        bVar.getClass();
                        dVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        bVar.f1483p = f(obtainStyledAttributes, index2, bVar.f1483p);
                        break;
                    case 2:
                        str = str3;
                        bVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.I);
                        break;
                    case 3:
                        str = str3;
                        bVar.o = f(obtainStyledAttributes, index2, bVar.o);
                        break;
                    case 4:
                        str = str3;
                        bVar.f1480n = f(obtainStyledAttributes, index2, bVar.f1480n);
                        break;
                    case 5:
                        str = str3;
                        bVar.y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str3;
                        bVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar.C);
                        break;
                    case 7:
                        str = str3;
                        bVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar.D);
                        break;
                    case 8:
                        str = str3;
                        bVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.J);
                        break;
                    case 9:
                        str = str3;
                        bVar.f1489v = f(obtainStyledAttributes, index2, bVar.f1489v);
                        break;
                    case 10:
                        str = str3;
                        bVar.f1488u = f(obtainStyledAttributes, index2, bVar.f1488u);
                        break;
                    case 11:
                        str = str3;
                        bVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.P);
                        break;
                    case 12:
                        str = str3;
                        bVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.Q);
                        break;
                    case 13:
                        str = str3;
                        bVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.M);
                        break;
                    case 14:
                        str = str3;
                        bVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.O);
                        break;
                    case 15:
                        str = str3;
                        bVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.R);
                        break;
                    case 16:
                        str = str3;
                        bVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.N);
                        break;
                    case 17:
                        str = str3;
                        bVar.f1461d = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f1461d);
                        break;
                    case 18:
                        str = str3;
                        bVar.f1463e = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar.f1463e);
                        break;
                    case 19:
                        str = str3;
                        bVar.f = obtainStyledAttributes.getFloat(index2, bVar.f);
                        break;
                    case 20:
                        str = str3;
                        bVar.f1490w = obtainStyledAttributes.getFloat(index2, bVar.f1490w);
                        break;
                    case 21:
                        str = str3;
                        bVar.f1459c = obtainStyledAttributes.getLayoutDimension(index2, bVar.f1459c);
                        break;
                    case 22:
                        str = str3;
                        dVar.f1502a = iArr[obtainStyledAttributes.getInt(index2, dVar.f1502a)];
                        break;
                    case 23:
                        str = str3;
                        bVar.f1457b = obtainStyledAttributes.getLayoutDimension(index2, bVar.f1457b);
                        break;
                    case 24:
                        str = str3;
                        bVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.F);
                        break;
                    case 25:
                        str = str3;
                        bVar.f1468h = f(obtainStyledAttributes, index2, bVar.f1468h);
                        break;
                    case 26:
                        str = str3;
                        bVar.f1470i = f(obtainStyledAttributes, index2, bVar.f1470i);
                        break;
                    case 27:
                        str = str3;
                        bVar.E = obtainStyledAttributes.getInt(index2, bVar.E);
                        break;
                    case 28:
                        str = str3;
                        bVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.G);
                        break;
                    case 29:
                        str = str3;
                        bVar.f1472j = f(obtainStyledAttributes, index2, bVar.f1472j);
                        break;
                    case 30:
                        str = str3;
                        bVar.f1474k = f(obtainStyledAttributes, index2, bVar.f1474k);
                        break;
                    case 31:
                        str = str3;
                        bVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.K);
                        break;
                    case 32:
                        str = str3;
                        bVar.f1486s = f(obtainStyledAttributes, index2, bVar.f1486s);
                        break;
                    case 33:
                        str = str3;
                        bVar.f1487t = f(obtainStyledAttributes, index2, bVar.f1487t);
                        break;
                    case 34:
                        str = str3;
                        bVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.H);
                        break;
                    case 35:
                        str = str3;
                        bVar.f1478m = f(obtainStyledAttributes, index2, bVar.f1478m);
                        break;
                    case 36:
                        str = str3;
                        bVar.f1476l = f(obtainStyledAttributes, index2, bVar.f1476l);
                        break;
                    case 37:
                        str = str3;
                        bVar.f1491x = obtainStyledAttributes.getFloat(index2, bVar.f1491x);
                        break;
                    case 38:
                        str = str3;
                        c0014a.f1438a = obtainStyledAttributes.getResourceId(index2, c0014a.f1438a);
                        break;
                    case 39:
                        str = str3;
                        bVar.U = obtainStyledAttributes.getFloat(index2, bVar.U);
                        break;
                    case 40:
                        str = str3;
                        bVar.T = obtainStyledAttributes.getFloat(index2, bVar.T);
                        break;
                    case 41:
                        str = str3;
                        bVar.V = obtainStyledAttributes.getInt(index2, bVar.V);
                        break;
                    case 42:
                        str = str3;
                        bVar.W = obtainStyledAttributes.getInt(index2, bVar.W);
                        break;
                    case 43:
                        str = str3;
                        dVar.f1504c = obtainStyledAttributes.getFloat(index2, dVar.f1504c);
                        break;
                    case 44:
                        str = str3;
                        eVar.f1517l = true;
                        eVar.f1518m = obtainStyledAttributes.getDimension(index2, eVar.f1518m);
                        break;
                    case 45:
                        str = str3;
                        eVar.f1508b = obtainStyledAttributes.getFloat(index2, eVar.f1508b);
                        break;
                    case 46:
                        str = str3;
                        eVar.f1509c = obtainStyledAttributes.getFloat(index2, eVar.f1509c);
                        break;
                    case 47:
                        str = str3;
                        eVar.f1510d = obtainStyledAttributes.getFloat(index2, eVar.f1510d);
                        break;
                    case 48:
                        str = str3;
                        eVar.f1511e = obtainStyledAttributes.getFloat(index2, eVar.f1511e);
                        break;
                    case 49:
                        str = str3;
                        eVar.f = obtainStyledAttributes.getDimension(index2, eVar.f);
                        break;
                    case 50:
                        str = str3;
                        eVar.f1512g = obtainStyledAttributes.getDimension(index2, eVar.f1512g);
                        break;
                    case 51:
                        str = str3;
                        eVar.f1514i = obtainStyledAttributes.getDimension(index2, eVar.f1514i);
                        break;
                    case 52:
                        str = str3;
                        eVar.f1515j = obtainStyledAttributes.getDimension(index2, eVar.f1515j);
                        break;
                    case 53:
                        str = str3;
                        eVar.f1516k = obtainStyledAttributes.getDimension(index2, eVar.f1516k);
                        break;
                    case 54:
                        str = str3;
                        bVar.X = obtainStyledAttributes.getInt(index2, bVar.X);
                        break;
                    case 55:
                        str = str3;
                        bVar.Y = obtainStyledAttributes.getInt(index2, bVar.Y);
                        break;
                    case 56:
                        str = str3;
                        bVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.Z);
                        break;
                    case 57:
                        str = str3;
                        bVar.f1456a0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.f1456a0);
                        break;
                    case 58:
                        str = str3;
                        bVar.f1458b0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.f1458b0);
                        break;
                    case 59:
                        str = str3;
                        bVar.f1460c0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.f1460c0);
                        break;
                    case 60:
                        str = str3;
                        eVar.f1507a = obtainStyledAttributes.getFloat(index2, eVar.f1507a);
                        break;
                    case 61:
                        str = str3;
                        bVar.f1492z = f(obtainStyledAttributes, index2, bVar.f1492z);
                        break;
                    case 62:
                        str = str3;
                        bVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.A);
                        break;
                    case 63:
                        str = str3;
                        bVar.B = obtainStyledAttributes.getFloat(index2, bVar.B);
                        break;
                    case 64:
                        str = str3;
                        cVar.f1494a = f(obtainStyledAttributes, index2, cVar.f1494a);
                        break;
                    case 65:
                        str = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            cVar.getClass();
                            break;
                        } else {
                            String str5 = strArr2[obtainStyledAttributes.getInteger(index2, 0)];
                            cVar.getClass();
                            break;
                        }
                    case 66:
                        str = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        break;
                    case 67:
                        str = str3;
                        cVar.f1498e = obtainStyledAttributes.getFloat(index2, cVar.f1498e);
                        break;
                    case 68:
                        str = str3;
                        dVar.f1505d = obtainStyledAttributes.getFloat(index2, dVar.f1505d);
                        break;
                    case 69:
                        str = str3;
                        bVar.f1462d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str3;
                        bVar.f1464e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str3;
                        bVar.f1465f0 = obtainStyledAttributes.getInt(index2, bVar.f1465f0);
                        break;
                    case 73:
                        str = str3;
                        bVar.f1467g0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.f1467g0);
                        break;
                    case 74:
                        str = str3;
                        bVar.f1473j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str3;
                        bVar.f1481n0 = obtainStyledAttributes.getBoolean(index2, bVar.f1481n0);
                        break;
                    case 76:
                        str = str3;
                        cVar.f1496c = obtainStyledAttributes.getInt(index2, cVar.f1496c);
                        break;
                    case 77:
                        str = str3;
                        bVar.f1475k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str3;
                        dVar.f1503b = obtainStyledAttributes.getInt(index2, dVar.f1503b);
                        break;
                    case 79:
                        str = str3;
                        cVar.f1497d = obtainStyledAttributes.getFloat(index2, cVar.f1497d);
                        break;
                    case 80:
                        str = str3;
                        bVar.f1477l0 = obtainStyledAttributes.getBoolean(index2, bVar.f1477l0);
                        break;
                    case 81:
                        str = str3;
                        bVar.f1479m0 = obtainStyledAttributes.getBoolean(index2, bVar.f1479m0);
                        break;
                    case 82:
                        str = str3;
                        cVar.f1495b = obtainStyledAttributes.getInteger(index2, cVar.f1495b);
                        break;
                    case 83:
                        str = str3;
                        eVar.f1513h = f(obtainStyledAttributes, index2, eVar.f1513h);
                        break;
                    case 84:
                        str = str3;
                        cVar.f1499g = obtainStyledAttributes.getInteger(index2, cVar.f1499g);
                        break;
                    case 85:
                        str = str3;
                        cVar.f = obtainStyledAttributes.getFloat(index2, cVar.f);
                        break;
                    case 86:
                        str = str3;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 != 1) {
                            if (i17 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                cVar.f1500h = string2;
                                if (string2.indexOf("/") > 0) {
                                    cVar.f1501i = obtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, cVar.f1501i);
                            }
                            break;
                        } else {
                            cVar.f1501i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                    case 87:
                        StringBuilder sb3 = new StringBuilder(str3);
                        str = str3;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str3;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        bVar.f1484q = f(obtainStyledAttributes, index2, bVar.f1484q);
                        str = str3;
                        break;
                    case 92:
                        bVar.f1485r = f(obtainStyledAttributes, index2, bVar.f1485r);
                        str = str3;
                        break;
                    case 93:
                        bVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.L);
                        str = str3;
                        break;
                    case 94:
                        bVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, bVar.S);
                        str = str3;
                        break;
                    case 95:
                        g(bVar, obtainStyledAttributes, index2, 0);
                        str = str3;
                        break;
                    case 96:
                        g(bVar, obtainStyledAttributes, index2, 1);
                        str = str3;
                        break;
                    case 97:
                        bVar.f1482o0 = obtainStyledAttributes.getInt(index2, bVar.f1482o0);
                        str = str3;
                        break;
                }
                i15++;
                indexCount2 = i16;
                str3 = str;
            }
            if (bVar.f1473j0 != null) {
                bVar.f1471i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0014a;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i10, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > gl.Code && parseFloat2 > gl.Code) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i10);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, C0014a> hashMap = this.f1437c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + w.a.c(childAt));
            } else {
                if (this.f1436b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        C0014a c0014a = hashMap.get(Integer.valueOf(id2));
                        if (c0014a != null) {
                            if (childAt instanceof Barrier) {
                                b bVar = c0014a.f1441d;
                                bVar.f1469h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(bVar.f1465f0);
                                barrier.setMargin(bVar.f1467g0);
                                barrier.setAllowsGoneWidget(bVar.f1481n0);
                                int[] iArr = bVar.f1471i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1473j0;
                                    if (str != null) {
                                        int[] c10 = c(barrier, str);
                                        bVar.f1471i0 = c10;
                                        barrier.setReferencedIds(c10);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar.a();
                            c0014a.a(aVar);
                            x.a.b(childAt, c0014a.f);
                            childAt.setLayoutParams(aVar);
                            d dVar = c0014a.f1439b;
                            if (dVar.f1503b == 0) {
                                childAt.setVisibility(dVar.f1502a);
                            }
                            childAt.setAlpha(dVar.f1504c);
                            e eVar = c0014a.f1442e;
                            childAt.setRotation(eVar.f1507a);
                            childAt.setRotationX(eVar.f1508b);
                            childAt.setRotationY(eVar.f1509c);
                            childAt.setScaleX(eVar.f1510d);
                            childAt.setScaleY(eVar.f1511e);
                            if (eVar.f1513h != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.f1513h) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f)) {
                                    childAt.setPivotX(eVar.f);
                                }
                                if (!Float.isNaN(eVar.f1512g)) {
                                    childAt.setPivotY(eVar.f1512g);
                                }
                            }
                            childAt.setTranslationX(eVar.f1514i);
                            childAt.setTranslationY(eVar.f1515j);
                            childAt.setTranslationZ(eVar.f1516k);
                            if (eVar.f1517l) {
                                childAt.setElevation(eVar.f1518m);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0014a c0014a2 = hashMap.get(num);
            if (c0014a2 != null) {
                b bVar2 = c0014a2.f1441d;
                if (bVar2.f1469h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.f1471i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1473j0;
                        if (str2 != null) {
                            int[] c11 = c(barrier2, str2);
                            bVar2.f1471i0 = c11;
                            barrier2.setReferencedIds(c11);
                        }
                    }
                    barrier2.setType(bVar2.f1465f0);
                    barrier2.setMargin(bVar2.f1467g0);
                    androidx.constraintlayout.widget.b bVar3 = ConstraintLayout.H;
                    ConstraintLayout.a aVar2 = new ConstraintLayout.a();
                    barrier2.o();
                    c0014a2.a(aVar2);
                    constraintLayout.addView(barrier2, aVar2);
                }
                if (bVar2.f1455a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    androidx.constraintlayout.widget.b bVar4 = ConstraintLayout.H;
                    ConstraintLayout.a aVar3 = new ConstraintLayout.a();
                    c0014a2.a(aVar3);
                    constraintLayout.addView(guideline, aVar3);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).h(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        a aVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, C0014a> hashMap = aVar.f1437c;
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (aVar.f1436b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new C0014a());
            }
            C0014a c0014a = hashMap.get(Integer.valueOf(id2));
            if (c0014a == null) {
                i10 = childCount;
            } else {
                HashMap<String, x.a> hashMap2 = aVar.f1435a;
                HashMap<String, x.a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    x.a aVar3 = hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        i11 = childCount;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        i11 = childCount;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        i11 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new x.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i11 = childCount;
                        try {
                            hashMap3.put(str, new x.a(aVar3, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e13) {
                            e = e13;
                            e.printStackTrace();
                            childCount = i11;
                        } catch (NoSuchMethodException e14) {
                            e = e14;
                            e.printStackTrace();
                            childCount = i11;
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                            childCount = i11;
                        }
                        childCount = i11;
                    }
                }
                i10 = childCount;
                c0014a.f = hashMap3;
                c0014a.b(id2, aVar2);
                int visibility = childAt.getVisibility();
                d dVar = c0014a.f1439b;
                dVar.f1502a = visibility;
                dVar.f1504c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = c0014a.f1442e;
                eVar.f1507a = rotation;
                eVar.f1508b = childAt.getRotationX();
                eVar.f1509c = childAt.getRotationY();
                eVar.f1510d = childAt.getScaleX();
                eVar.f1511e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f = pivotX;
                    eVar.f1512g = pivotY;
                }
                eVar.f1514i = childAt.getTranslationX();
                eVar.f1515j = childAt.getTranslationY();
                eVar.f1516k = childAt.getTranslationZ();
                if (eVar.f1517l) {
                    eVar.f1518m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    b bVar = c0014a.f1441d;
                    bVar.f1481n0 = allowsGoneWidget;
                    bVar.f1471i0 = barrier.getReferencedIds();
                    bVar.f1465f0 = barrier.getType();
                    bVar.f1467g0 = barrier.getMargin();
                }
            }
            i12++;
            aVar = this;
            childCount = i10;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        C0014a d10 = d(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            d10.f1441d.f1455a = true;
                        }
                        this.f1437c.put(Integer.valueOf(d10.f1438a), d10);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
