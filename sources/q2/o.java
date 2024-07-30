package q2;

import android.graphics.Color;
import android.graphics.PointF;
import com.huawei.hms.ads.gl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: GradientColorParser.java */
/* loaded from: classes.dex */
public final class o implements k0<n2.c> {

    /* renamed from: a, reason: collision with root package name */
    public int f34602a;

    public o(int i10) {
        this.f34602a = i10;
    }

    @Override // q2.k0
    public final n2.c a(r2.c cVar, float f) throws IOException {
        boolean z10;
        int i10;
        float f10;
        int i11;
        int i12;
        int argb;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        if (cVar.l() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.b();
        }
        while (cVar.g()) {
            arrayList.add(Float.valueOf((float) cVar.i()));
        }
        int i15 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(gl.Code));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f34602a = 2;
        }
        if (z10) {
            cVar.d();
        }
        if (this.f34602a == -1) {
            this.f34602a = arrayList.size() / 4;
        }
        int i16 = this.f34602a;
        float[] fArr = new float[i16];
        int[] iArr = new int[i16];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i10 = this.f34602a * i15;
            if (i17 >= i10) {
                break;
            }
            int i20 = i17 / 4;
            double floatValue = ((Float) arrayList.get(i17)).floatValue();
            int i21 = i17 % 4;
            if (i21 != 0) {
                if (i21 != i14) {
                    if (i21 != 2) {
                        if (i21 == 3) {
                            iArr[i20] = Color.argb(com.anythink.expressad.exoplayer.k.p.f9095b, i18, i19, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i19 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i18 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i20 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i20 - 1] >= f11) {
                        fArr[i20] = f11 + 0.01f;
                    }
                }
                fArr[i20] = (float) floatValue;
            }
            i17++;
            i14 = 1;
            i15 = 4;
        }
        n2.c cVar2 = new n2.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i22 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    fArr2[i22] = ((Float) arrayList.get(i10)).floatValue();
                } else {
                    fArr3[i22] = ((Float) arrayList.get(i10)).floatValue();
                    i22++;
                }
                i10++;
            }
            float[] fArr4 = cVar2.f33221a;
            if (fArr4.length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int length = fArr4.length + size;
                float[] fArr5 = new float[length];
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                for (int i26 = 0; i26 < length; i26++) {
                    float f12 = Float.NaN;
                    if (i24 < fArr4.length) {
                        f10 = fArr4[i24];
                    } else {
                        f10 = Float.NaN;
                    }
                    if (i25 < size) {
                        f12 = fArr2[i25];
                    }
                    if (!Float.isNaN(f12) && f10 >= f12) {
                        if (!Float.isNaN(f10) && f12 >= f10) {
                            fArr5[i26] = f10;
                            i24++;
                            i25++;
                            i23++;
                        } else {
                            fArr5[i26] = f12;
                            i25++;
                        }
                    } else {
                        fArr5[i26] = f10;
                        i24++;
                    }
                }
                if (i23 == 0) {
                    fArr4 = fArr5;
                } else {
                    fArr4 = Arrays.copyOf(fArr5, length - i23);
                }
            }
            int length2 = fArr4.length;
            int[] iArr2 = new int[length2];
            int i27 = 0;
            while (i27 < length2) {
                float f13 = fArr4[i27];
                int binarySearch = Arrays.binarySearch(fArr, f13);
                int binarySearch2 = Arrays.binarySearch(fArr2, f13);
                int[] iArr3 = cVar2.f33222b;
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i28 = iArr3[binarySearch];
                    if (size >= 2 && f13 > fArr2[0]) {
                        for (int i29 = 1; i29 < size; i29++) {
                            float f14 = fArr2[i29];
                            if (f14 >= f13 || i29 == size - 1) {
                                if (f14 <= f13) {
                                    i13 = (int) (fArr3[i29] * 255.0f);
                                } else {
                                    int i30 = i29 - 1;
                                    float f15 = fArr2[i30];
                                    float f16 = (f13 - f15) / (f14 - f15);
                                    float f17 = fArr3[i30];
                                    float f18 = fArr3[i29];
                                    PointF pointF = s2.f.f35110a;
                                    i13 = (int) ((((f18 - f17) * f16) + f17) * 255.0f);
                                }
                                argb = Color.argb(i13, Color.red(i28), Color.green(i28), Color.blue(i28));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    argb = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i28), Color.green(i28), Color.blue(i28));
                    iArr2[i27] = argb;
                    i11 = i16;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f19 = fArr3[binarySearch2];
                    if (iArr3.length >= 2 && f13 != fArr[0]) {
                        for (int i31 = 1; i31 < i16; i31++) {
                            float f20 = fArr[i31];
                            if (f20 >= f13 || i31 == i16 - 1) {
                                int i32 = i31 - 1;
                                float f21 = fArr[i32];
                                float f22 = (f13 - f21) / (f20 - f21);
                                int i33 = iArr3[i31];
                                int i34 = iArr3[i32];
                                i11 = i16;
                                i12 = Color.argb((int) (f19 * 255.0f), androidx.activity.n.u0(f22, Color.red(i34), Color.red(i33)), androidx.activity.n.u0(f22, Color.green(i34), Color.green(i33)), androidx.activity.n.u0(f22, Color.blue(i34), Color.blue(i33)));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    i11 = i16;
                    i12 = iArr3[0];
                    iArr2[i27] = i12;
                }
                i27++;
                i16 = i11;
            }
            return new n2.c(fArr4, iArr2);
        }
        return cVar2;
    }
}
