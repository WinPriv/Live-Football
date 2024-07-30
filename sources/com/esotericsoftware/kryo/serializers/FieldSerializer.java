package com.esotericsoftware.kryo.serializers;

import a3.l;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.NotNull;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializerUnsafeUtil;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FieldSerializer<T> extends Serializer<T> implements Comparator<CachedField> {
    static CachedFieldFactory asmFieldFactory;
    static CachedFieldFactory objectFieldFactory;
    static Method sortFieldsByOffsetMethod;
    static boolean unsafeAvailable;
    static CachedFieldFactory unsafeFieldFactory;
    static Class<?> unsafeUtilClass;
    Object access;
    private FieldSerializerAnnotationsUtil annotationsUtil;
    final Class componentType;
    protected final FieldSerializerConfig config;
    private CachedField[] fields;
    private Class[] generics;
    private Generics genericsScope;
    private FieldSerializerGenericsUtil genericsUtil;
    private boolean hasObjectFields;
    final Kryo kryo;
    protected HashSet<CachedField> removedFields;
    private CachedField[] transientFields;
    final Class type;
    final TypeVariable[] typeParameters;
    private FieldSerializerUnsafeUtil unsafeUtil;
    private boolean useMemRegions;
    private boolean varIntsEnabled;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Bind {
        Class<? extends Serializer> value();
    }

    /* loaded from: classes.dex */
    public interface CachedFieldFactory {
        CachedField createCachedField(Class cls, Field field, FieldSerializer fieldSerializer);
    }

    /* loaded from: classes.dex */
    public interface CachedFieldNameStrategy {
        public static final CachedFieldNameStrategy DEFAULT = new CachedFieldNameStrategy() { // from class: com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldNameStrategy.1
            @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldNameStrategy
            public String getName(CachedField cachedField) {
                return cachedField.field.getName();
            }
        };
        public static final CachedFieldNameStrategy EXTENDED = new CachedFieldNameStrategy() { // from class: com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldNameStrategy.2
            @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldNameStrategy
            public String getName(CachedField cachedField) {
                return cachedField.field.getDeclaringClass().getSimpleName() + "." + cachedField.field.getName();
            }
        };

        String getName(CachedField cachedField);
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Optional {
        String value();
    }

    static {
        try {
            Class<?> loadClass = FieldSerializer.class.getClassLoader().loadClass("com.esotericsoftware.kryo.util.UnsafeUtil");
            unsafeUtilClass = loadClass;
            Method method = loadClass.getMethod("unsafe", new Class[0]);
            sortFieldsByOffsetMethod = unsafeUtilClass.getMethod("sortFieldsByOffset", List.class);
            if (method.invoke(null, new Object[0]) != null) {
                unsafeAvailable = true;
            }
        } catch (Throwable unused) {
            if (Log.TRACE) {
                Log.trace("kryo", "sun.misc.Unsafe is unavailable.");
            }
        }
    }

    public FieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, null);
    }

    private List<Field> buildValidFields(boolean z10, List<Field> list, ObjectMap objectMap, IntArray intArray) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Field field = list.get(i10);
            int modifiers = field.getModifiers();
            if (Modifier.isTransient(modifiers) == z10 && !Modifier.isStatic(modifiers) && (!field.isSynthetic() || !this.config.isIgnoreSyntheticFields())) {
                int i11 = 1;
                if (!field.isAccessible()) {
                    if (this.config.isSetFieldsAsAccessible()) {
                        try {
                            field.setAccessible(true);
                        } catch (AccessControlException unused) {
                        }
                    }
                }
                Optional optional = (Optional) field.getAnnotation(Optional.class);
                if (optional == null || objectMap.containsKey(optional.value())) {
                    arrayList.add(field);
                    if (Modifier.isFinal(modifiers) || !Modifier.isPublic(modifiers) || !Modifier.isPublic(field.getType().getModifiers())) {
                        i11 = 0;
                    }
                    intArray.add(i11);
                }
            }
        }
        return arrayList;
    }

    private List<Field> buildValidFieldsFromCachedFields(CachedField[] cachedFieldArr, IntArray intArray) {
        int i10;
        ArrayList arrayList = new ArrayList(cachedFieldArr.length);
        for (CachedField cachedField : cachedFieldArr) {
            arrayList.add(cachedField.field);
            if (cachedField.accessIndex > -1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            intArray.add(i10);
        }
        return arrayList;
    }

    private void createCachedFields(IntArray intArray, List<Field> list, List<CachedField> list2, int i10) {
        int i11;
        if (!this.config.isUseAsm() && this.useMemRegions) {
            this.unsafeUtil.createUnsafeCacheFieldsAndRegions(list, list2, i10, intArray);
            return;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Field field = list.get(i12);
            if (this.access != null && intArray.get(i10 + i12) == 1) {
                i11 = ((FieldAccess) this.access).getIndex(field.getName());
            } else {
                i11 = -1;
            }
            list2.add(newCachedField(field, list2.size(), i11));
        }
    }

    private CachedFieldFactory getAsmFieldFactory() {
        if (asmFieldFactory == null) {
            asmFieldFactory = new AsmCachedFieldFactory();
        }
        return asmFieldFactory;
    }

    private CachedFieldFactory getObjectFieldFactory() {
        if (objectFieldFactory == null) {
            objectFieldFactory = new ObjectCachedFieldFactory();
        }
        return objectFieldFactory;
    }

    private CachedFieldFactory getUnsafeFieldFactory() {
        if (unsafeFieldFactory == null) {
            try {
                unsafeFieldFactory = (CachedFieldFactory) getClass().getClassLoader().loadClass("com.esotericsoftware.kryo.serializers.UnsafeCachedFieldFactory").newInstance();
            } catch (Exception e10) {
                throw new RuntimeException("Cannot create UnsafeFieldFactory", e10);
            }
        }
        return unsafeFieldFactory;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t10) {
        T createCopy = createCopy(kryo, t10);
        kryo.reference(createCopy);
        if (this.config.isCopyTransient()) {
            int length = this.transientFields.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.transientFields[i10].copy(t10, createCopy);
            }
        }
        int length2 = this.fields.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.fields[i11].copy(t10, createCopy);
        }
        return createCopy;
    }

    public T create(Kryo kryo, Input input, Class<T> cls) {
        return (T) kryo.newInstance(cls);
    }

    public T createCopy(Kryo kryo, T t10) {
        return (T) kryo.newInstance(t10.getClass());
    }

    public String getCachedFieldName(CachedField cachedField) {
        return this.config.getCachedFieldNameStrategy().getName(cachedField);
    }

    public boolean getCopyTransient() {
        return this.config.isCopyTransient();
    }

    public CachedField getField(String str) {
        for (CachedField cachedField : this.fields) {
            if (getCachedFieldName(cachedField).equals(str)) {
                return cachedField;
            }
        }
        StringBuilder s10 = l.s("Field \"", str, "\" not found on class: ");
        s10.append(this.type.getName());
        throw new IllegalArgumentException(s10.toString());
    }

    public CachedField[] getFields() {
        return this.fields;
    }

    public Class[] getGenerics() {
        return this.generics;
    }

    public final Generics getGenericsScope() {
        return this.genericsScope;
    }

    public Kryo getKryo() {
        return this.kryo;
    }

    public boolean getSerializeTransient() {
        return this.config.isSerializeTransient();
    }

    public CachedField[] getTransientFields() {
        return this.transientFields;
    }

    public Class getType() {
        return this.type;
    }

    public boolean getUseAsmEnabled() {
        return this.config.isUseAsm();
    }

    public boolean getUseMemRegions() {
        return this.useMemRegions;
    }

    public CachedField newCachedField(Field field, int i10, int i11) {
        Type type;
        CachedField newMatchingCachedField;
        boolean z10 = true;
        Class[] clsArr = {field.getType()};
        if (this.config.isOptimizedGenerics()) {
            type = field.getGenericType();
        } else {
            type = null;
        }
        Type type2 = type;
        if (this.config.isOptimizedGenerics() && type2 != clsArr[0]) {
            newMatchingCachedField = this.genericsUtil.newCachedFieldOfGenericType(field, i11, clsArr, type2);
        } else {
            if (Log.TRACE) {
                Log.trace("kryo", "Field " + field.getName() + ": " + clsArr[0]);
            }
            newMatchingCachedField = newMatchingCachedField(field, i11, clsArr[0], type2, null);
        }
        if (newMatchingCachedField instanceof ObjectField) {
            this.hasObjectFields = true;
        }
        newMatchingCachedField.field = field;
        newMatchingCachedField.varIntsEnabled = this.varIntsEnabled;
        if (!this.config.isUseAsm()) {
            newMatchingCachedField.offset = this.unsafeUtil.getObjectFieldOffset(field);
        }
        newMatchingCachedField.access = (FieldAccess) this.access;
        newMatchingCachedField.accessIndex = i11;
        if (!this.config.isFieldsCanBeNull() || clsArr[0].isPrimitive() || field.isAnnotationPresent(NotNull.class)) {
            z10 = false;
        }
        newMatchingCachedField.canBeNull = z10;
        if (this.kryo.isFinal(clsArr[0]) || this.config.isFixedFieldTypes()) {
            newMatchingCachedField.valueClass = clsArr[0];
        }
        return newMatchingCachedField;
    }

    public CachedField newMatchingCachedField(Field field, int i10, Class cls, Type type, Class[] clsArr) {
        if (i10 != -1) {
            return getAsmFieldFactory().createCachedField(cls, field, this);
        }
        if (!this.config.isUseAsm()) {
            return getUnsafeFieldFactory().createCachedField(cls, field, this);
        }
        CachedField createCachedField = getObjectFieldFactory().createCachedField(cls, field, this);
        if (this.config.isOptimizedGenerics()) {
            if (clsArr != null) {
                ((ObjectField) createCachedField).generics = clsArr;
                return createCachedField;
            }
            if (type != null) {
                Class[] generics = FieldSerializerGenericsUtil.getGenerics(type, this.kryo);
                ((ObjectField) createCachedField).generics = generics;
                if (Log.TRACE) {
                    Log.trace("kryo", "Field generics: " + Arrays.toString(generics));
                    return createCachedField;
                }
                return createCachedField;
            }
            return createCachedField;
        }
        return createCachedField;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<T> cls) {
        try {
            if (this.config.isOptimizedGenerics()) {
                if (this.typeParameters != null && this.generics != null) {
                    rebuildCachedFields();
                }
                if (this.genericsScope != null) {
                    kryo.getGenericsResolver().pushScope(cls, this.genericsScope);
                }
            }
            T create = create(kryo, input, cls);
            kryo.reference(create);
            for (CachedField cachedField : this.fields) {
                cachedField.read(input, create);
            }
            if (this.config.isSerializeTransient()) {
                int length = this.transientFields.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.transientFields[i10].read(input, create);
                }
            }
            return create;
        } finally {
            if (this.config.isOptimizedGenerics() && this.genericsScope != null && kryo.getGenericsResolver() != null) {
                kryo.getGenericsResolver().popScope();
            }
        }
    }

    public void rebuildCachedFields() {
        rebuildCachedFields(false);
    }

    public void removeField(String str) {
        int i10 = 0;
        while (true) {
            CachedField[] cachedFieldArr = this.fields;
            if (i10 < cachedFieldArr.length) {
                CachedField cachedField = cachedFieldArr[i10];
                if (getCachedFieldName(cachedField).equals(str)) {
                    CachedField[] cachedFieldArr2 = this.fields;
                    int length = cachedFieldArr2.length - 1;
                    CachedField[] cachedFieldArr3 = new CachedField[length];
                    System.arraycopy(cachedFieldArr2, 0, cachedFieldArr3, 0, i10);
                    System.arraycopy(this.fields, i10 + 1, cachedFieldArr3, i10, length - i10);
                    this.fields = cachedFieldArr3;
                    this.removedFields.add(cachedField);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (true) {
                    CachedField[] cachedFieldArr4 = this.transientFields;
                    if (i11 < cachedFieldArr4.length) {
                        CachedField cachedField2 = cachedFieldArr4[i11];
                        if (getCachedFieldName(cachedField2).equals(str)) {
                            CachedField[] cachedFieldArr5 = this.transientFields;
                            int length2 = cachedFieldArr5.length - 1;
                            CachedField[] cachedFieldArr6 = new CachedField[length2];
                            System.arraycopy(cachedFieldArr5, 0, cachedFieldArr6, 0, i11);
                            System.arraycopy(this.transientFields, i11 + 1, cachedFieldArr6, i11, length2 - i11);
                            this.transientFields = cachedFieldArr6;
                            this.removedFields.add(cachedField2);
                            return;
                        }
                        i11++;
                    } else {
                        StringBuilder s10 = l.s("Field \"", str, "\" not found on class: ");
                        s10.append(this.type.getName());
                        throw new IllegalArgumentException(s10.toString());
                    }
                }
            }
        }
    }

    public void setCopyTransient(boolean z10) {
        this.config.setCopyTransient(z10);
    }

    public void setFieldsAsAccessible(boolean z10) {
        this.config.setFieldsAsAccessible(z10);
        rebuildCachedFields();
    }

    public void setFieldsCanBeNull(boolean z10) {
        this.config.setFieldsCanBeNull(z10);
        rebuildCachedFields();
    }

    public void setFixedFieldTypes(boolean z10) {
        this.config.setFixedFieldTypes(z10);
        rebuildCachedFields();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void setGenerics(Kryo kryo, Class[] clsArr) {
        if (!this.config.isOptimizedGenerics()) {
            return;
        }
        this.generics = clsArr;
        TypeVariable[] typeVariableArr = this.typeParameters;
        if (typeVariableArr != null && typeVariableArr.length > 0) {
            rebuildCachedFields(true);
        }
    }

    public void setIgnoreSyntheticFields(boolean z10) {
        this.config.setIgnoreSyntheticFields(z10);
        rebuildCachedFields();
    }

    public void setOptimizedGenerics(boolean z10) {
        this.config.setOptimizedGenerics(z10);
        rebuildCachedFields();
    }

    public void setSerializeTransient(boolean z10) {
        this.config.setSerializeTransient(z10);
    }

    public void setUseAsm(boolean z10) {
        this.config.setUseAsm(z10);
        rebuildCachedFields();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        if (Log.TRACE) {
            Log.trace("kryo", "FieldSerializer.write fields of class: ".concat(t10.getClass().getName()));
        }
        if (this.config.isOptimizedGenerics()) {
            if (this.typeParameters != null && this.generics != null) {
                rebuildCachedFields();
            }
            if (this.genericsScope != null) {
                kryo.getGenericsResolver().pushScope(this.type, this.genericsScope);
            }
        }
        for (CachedField cachedField : this.fields) {
            cachedField.write(output, t10);
        }
        if (this.config.isSerializeTransient()) {
            int length = this.transientFields.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.transientFields[i10].write(output, t10);
            }
        }
        if (this.config.isOptimizedGenerics() && this.genericsScope != null) {
            kryo.getGenericsResolver().popScope();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class CachedField<X> {
        FieldAccess access;
        boolean canBeNull;
        Field field;
        Serializer serializer;
        Class valueClass;
        int accessIndex = -1;
        long offset = -1;
        boolean varIntsEnabled = true;

        public abstract void copy(Object obj, Object obj2);

        public Field getField() {
            return this.field;
        }

        public Serializer getSerializer() {
            return this.serializer;
        }

        public abstract void read(Input input, Object obj);

        public void setCanBeNull(boolean z10) {
            this.canBeNull = z10;
        }

        public void setClass(Class cls) {
            this.valueClass = cls;
            this.serializer = null;
        }

        public void setSerializer(Serializer serializer) {
            this.serializer = serializer;
        }

        public String toString() {
            return this.field.getName();
        }

        public abstract void write(Output output, Object obj);

        public void setClass(Class cls, Serializer serializer) {
            this.valueClass = cls;
            this.serializer = serializer;
        }
    }

    public FieldSerializer(Kryo kryo, Class cls, Class[] clsArr) {
        this(kryo, cls, clsArr, kryo.getFieldSerializerConfig().mo2clone());
    }

    @Override // java.util.Comparator
    public int compare(CachedField cachedField, CachedField cachedField2) {
        return getCachedFieldName(cachedField).compareTo(getCachedFieldName(cachedField2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.esotericsoftware.kryo.serializers.FieldSerializer, java.util.Comparator, com.esotericsoftware.kryo.serializers.FieldSerializer<T>] */
    public void rebuildCachedFields(boolean z10) {
        List<Field> buildValidFieldsFromCachedFields;
        List<Field> buildValidFieldsFromCachedFields2;
        if (Log.TRACE && this.generics != null) {
            Log.trace("kryo", "Generic type parameters: " + Arrays.toString(this.generics));
        }
        if (this.type.isInterface()) {
            this.fields = new CachedField[0];
            return;
        }
        this.hasObjectFields = false;
        if (this.config.isOptimizedGenerics()) {
            Generics buildGenericsScope = this.genericsUtil.buildGenericsScope(this.type, this.generics);
            this.genericsScope = buildGenericsScope;
            if (buildGenericsScope != null) {
                this.kryo.getGenericsResolver().pushScope(this.type, this.genericsScope);
            }
        }
        IntArray intArray = new IntArray();
        if (!z10) {
            ArrayList arrayList = new ArrayList();
            for (Class cls = this.type; cls != Object.class; cls = cls.getSuperclass()) {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields != null) {
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                }
            }
            ObjectMap context = this.kryo.getContext();
            ArrayList arrayList2 = arrayList;
            if (this.useMemRegions) {
                arrayList2 = arrayList;
                if (!this.config.isUseAsm()) {
                    arrayList2 = arrayList;
                    if (unsafeAvailable) {
                        try {
                            arrayList2 = Arrays.asList((Field[]) sortFieldsByOffsetMethod.invoke(null, arrayList));
                        } catch (Exception e10) {
                            throw new RuntimeException("Cannot invoke UnsafeUtil.sortFieldsByOffset()", e10);
                        }
                    }
                }
            }
            buildValidFieldsFromCachedFields = buildValidFields(false, arrayList2, context, intArray);
            buildValidFieldsFromCachedFields2 = buildValidFields(true, arrayList2, context, intArray);
            if (this.config.isUseAsm() && !Util.IS_ANDROID && Modifier.isPublic(this.type.getModifiers()) && intArray.indexOf(1) != -1) {
                try {
                    this.access = FieldAccess.get(this.type);
                } catch (RuntimeException unused) {
                }
            }
        } else {
            buildValidFieldsFromCachedFields = buildValidFieldsFromCachedFields(this.fields, intArray);
            buildValidFieldsFromCachedFields2 = buildValidFieldsFromCachedFields(this.transientFields, intArray);
        }
        ArrayList arrayList3 = new ArrayList(buildValidFieldsFromCachedFields.size());
        ArrayList arrayList4 = new ArrayList(buildValidFieldsFromCachedFields2.size());
        createCachedFields(intArray, buildValidFieldsFromCachedFields, arrayList3, 0);
        createCachedFields(intArray, buildValidFieldsFromCachedFields2, arrayList4, buildValidFieldsFromCachedFields.size());
        Collections.sort(arrayList3, this);
        this.fields = (CachedField[]) arrayList3.toArray(new CachedField[arrayList3.size()]);
        Collections.sort(arrayList4, this);
        this.transientFields = (CachedField[]) arrayList4.toArray(new CachedField[arrayList4.size()]);
        initializeCachedFields();
        if (this.genericsScope != null) {
            this.kryo.getGenericsResolver().popScope();
        }
        if (!z10) {
            Iterator<CachedField> it = this.removedFields.iterator();
            while (it.hasNext()) {
                removeField(it.next());
            }
        }
        this.annotationsUtil.processAnnotatedFields(this);
    }

    public FieldSerializer(Kryo kryo, Class cls, Class[] clsArr, FieldSerializerConfig fieldSerializerConfig) {
        this.fields = new CachedField[0];
        this.transientFields = new CachedField[0];
        this.removedFields = new HashSet<>();
        this.useMemRegions = false;
        this.hasObjectFields = false;
        this.varIntsEnabled = true;
        if (Log.TRACE) {
            Log.trace("kryo", "Optimize ints: " + this.varIntsEnabled);
        }
        this.config = fieldSerializerConfig;
        this.kryo = kryo;
        this.type = cls;
        this.generics = clsArr;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        this.typeParameters = typeParameters;
        if (typeParameters != null && typeParameters.length != 0) {
            this.componentType = null;
        } else {
            this.componentType = cls.getComponentType();
        }
        this.genericsUtil = new FieldSerializerGenericsUtil(this);
        this.unsafeUtil = FieldSerializerUnsafeUtil.Factory.getInstance(this);
        this.annotationsUtil = new FieldSerializerAnnotationsUtil(this);
        rebuildCachedFields();
    }

    public void initializeCachedFields() {
    }

    public void removeField(CachedField cachedField) {
        int i10 = 0;
        while (true) {
            CachedField[] cachedFieldArr = this.fields;
            if (i10 < cachedFieldArr.length) {
                CachedField cachedField2 = cachedFieldArr[i10];
                if (cachedField2 == cachedField) {
                    int length = cachedFieldArr.length - 1;
                    CachedField[] cachedFieldArr2 = new CachedField[length];
                    System.arraycopy(cachedFieldArr, 0, cachedFieldArr2, 0, i10);
                    System.arraycopy(this.fields, i10 + 1, cachedFieldArr2, i10, length - i10);
                    this.fields = cachedFieldArr2;
                    this.removedFields.add(cachedField2);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (true) {
                    CachedField[] cachedFieldArr3 = this.transientFields;
                    if (i11 < cachedFieldArr3.length) {
                        CachedField cachedField3 = cachedFieldArr3[i11];
                        if (cachedField3 == cachedField) {
                            int length2 = cachedFieldArr3.length - 1;
                            CachedField[] cachedFieldArr4 = new CachedField[length2];
                            System.arraycopy(cachedFieldArr3, 0, cachedFieldArr4, 0, i11);
                            System.arraycopy(this.transientFields, i11 + 1, cachedFieldArr4, i11, length2 - i11);
                            this.transientFields = cachedFieldArr4;
                            this.removedFields.add(cachedField3);
                            return;
                        }
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Field \"" + cachedField + "\" not found on class: " + this.type.getName());
                    }
                }
            }
        }
    }
}
