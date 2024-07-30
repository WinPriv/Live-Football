package com.esotericsoftware.kryo;

import a3.k;
import a3.l;
import com.esotericsoftware.kryo.factories.PseudoSerializerFactory;
import com.esotericsoftware.kryo.factories.ReflectionSerializerFactory;
import com.esotericsoftware.kryo.factories.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.ClosureSerializer;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers;
import com.esotericsoftware.kryo.serializers.DefaultSerializers;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializerConfig;
import com.esotericsoftware.kryo.serializers.GenericsResolver;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.esotericsoftware.kryo.serializers.OptionalSerializers;
import com.esotericsoftware.kryo.serializers.TaggedFieldSerializerConfig;
import com.esotericsoftware.kryo.serializers.TimeSerializers;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.esotericsoftware.kryo.util.DefaultStreamFactory;
import com.esotericsoftware.kryo.util.IdentityMap;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.kryo.util.MapReferenceResolver;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import md.a;

/* loaded from: classes.dex */
public class Kryo {
    public static final byte NOT_NULL = 1;
    private static final int NO_REF = -2;
    public static final byte NULL = 0;
    private static final int REF = -1;
    private boolean autoReset;
    private ClassLoader classLoader;
    private final ClassResolver classResolver;
    private ObjectMap context;
    private int copyDepth;
    private boolean copyReferences;
    private boolean copyShallow;
    private SerializerFactory defaultSerializer;
    private final ArrayList<DefaultSerializerEntry> defaultSerializers;
    private int depth;
    private FieldSerializerConfig fieldSerializerConfig;
    private GenericsResolver genericsResolver;
    private ObjectMap graphContext;
    private final int lowPriorityDefaultSerializerCount;
    private int maxDepth;
    private Object needsCopyReference;
    private int nextRegisterID;
    private IdentityMap originalToCopy;
    private Object readObject;
    private final IntArray readReferenceIds;
    private ReferenceResolver referenceResolver;
    private boolean references;
    private boolean registrationRequired;
    private a strategy;
    private StreamFactory streamFactory;
    private TaggedFieldSerializerConfig taggedFieldSerializerConfig;
    private volatile Thread thread;
    private boolean warnUnregisteredClasses;

    /* loaded from: classes.dex */
    public static class DefaultInstantiatorStrategy implements a {
        private a fallbackStrategy;

        public DefaultInstantiatorStrategy() {
        }

        public a getFallbackInstantiatorStrategy() {
            return this.fallbackStrategy;
        }

        @Override // md.a
        public id.a newInstantiatorOf(final Class cls) {
            final Constructor declaredConstructor;
            boolean z10;
            if (!Util.IS_ANDROID) {
                if (cls.getEnclosingClass() != null && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    try {
                        final ConstructorAccess constructorAccess = ConstructorAccess.get(cls);
                        return new id.a() { // from class: com.esotericsoftware.kryo.Kryo.DefaultInstantiatorStrategy.1
                            @Override // id.a
                            public Object newInstance() {
                                try {
                                    return constructorAccess.newInstance();
                                } catch (Exception e10) {
                                    throw new KryoException("Error constructing instance of class: " + Util.className(cls), e10);
                                }
                            }
                        };
                    } catch (Exception unused) {
                    }
                }
            }
            try {
                try {
                    declaredConstructor = cls.getConstructor(null);
                } catch (Exception unused2) {
                    declaredConstructor = cls.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                }
                return new id.a() { // from class: com.esotericsoftware.kryo.Kryo.DefaultInstantiatorStrategy.2
                    @Override // id.a
                    public Object newInstance() {
                        try {
                            return declaredConstructor.newInstance(new Object[0]);
                        } catch (Exception e10) {
                            throw new KryoException("Error constructing instance of class: " + Util.className(cls), e10);
                        }
                    }
                };
            } catch (Exception unused3) {
                a aVar = this.fallbackStrategy;
                if (aVar == null) {
                    if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                        throw new KryoException("Class cannot be created (non-static member class): " + Util.className(cls));
                    }
                    StringBuilder sb2 = new StringBuilder("Class cannot be created (missing no-arg constructor): " + Util.className(cls));
                    if (cls.getSimpleName().equals("")) {
                        sb2.append("\n\tThis is an anonymous class, which is not serializable by default in Kryo. Possible solutions: 1. Remove uses of anonymous classes, including double brace initialization, from the containing class. This is the safest solution, as anonymous classes don't have predictable names for serialization.\n\t2. Register a FieldSerializer for the containing class and call FieldSerializer#setIgnoreSyntheticFields(false) on it. This is not safe but may be sufficient temporarily. Use at your own risk.");
                    }
                    throw new KryoException(sb2.toString());
                }
                return aVar.newInstantiatorOf(cls);
            }
        }

        public void setFallbackInstantiatorStrategy(a aVar) {
            this.fallbackStrategy = aVar;
        }

        public DefaultInstantiatorStrategy(a aVar) {
            this.fallbackStrategy = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultSerializerEntry {
        final SerializerFactory serializerFactory;
        final Class type;

        public DefaultSerializerEntry(Class cls, SerializerFactory serializerFactory) {
            this.type = cls;
            this.serializerFactory = serializerFactory;
        }
    }

    public Kryo() {
        this(new DefaultClassResolver(), new MapReferenceResolver(), new DefaultStreamFactory());
    }

    private void beginObject() {
        if (Log.DEBUG) {
            if (this.depth == 0) {
                this.thread = Thread.currentThread();
            } else if (this.thread != Thread.currentThread()) {
                throw new ConcurrentModificationException("Kryo must not be accessed concurrently by multiple threads.");
            }
        }
        int i10 = this.depth;
        if (i10 != this.maxDepth) {
            this.depth = i10 + 1;
        } else {
            throw new KryoException("Max depth exceeded: " + this.depth);
        }
    }

    public void addDefaultSerializer(Class cls, Serializer serializer) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer != null) {
            DefaultSerializerEntry defaultSerializerEntry = new DefaultSerializerEntry(cls, new PseudoSerializerFactory(serializer));
            ArrayList<DefaultSerializerEntry> arrayList = this.defaultSerializers;
            arrayList.add(arrayList.size() - this.lowPriorityDefaultSerializerCount, defaultSerializerEntry);
            return;
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public <T> T copy(T t10) {
        T t11;
        if (t10 == null) {
            return null;
        }
        if (this.copyShallow) {
            return t10;
        }
        this.copyDepth++;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t12 = (T) this.originalToCopy.get(t10);
            if (t12 != null) {
                return t12;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            if (t10 instanceof KryoCopyable) {
                t11 = (T) ((KryoCopyable) t10).copy(this);
            } else {
                t11 = (T) getSerializer(t10.getClass()).copy(this, t10);
            }
            if (this.needsCopyReference != null) {
                reference(t11);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t11);
            }
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
            return t11;
        } finally {
            int i11 = this.copyDepth - 1;
            this.copyDepth = i11;
            if (i11 == 0) {
                reset();
            }
        }
    }

    public <T> T copyShallow(T t10) {
        T t11;
        if (t10 == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t12 = (T) this.originalToCopy.get(t10);
            if (t12 != null) {
                return t12;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            if (t10 instanceof KryoCopyable) {
                t11 = (T) ((KryoCopyable) t10).copy(this);
            } else {
                t11 = (T) getSerializer(t10.getClass()).copy(this, t10);
            }
            if (this.needsCopyReference != null) {
                reference(t11);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t11);
            }
            this.copyShallow = false;
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
            return t11;
        } finally {
            this.copyShallow = false;
            int i11 = this.copyDepth - 1;
            this.copyDepth = i11;
            if (i11 == 0) {
                reset();
            }
        }
    }

    @Deprecated
    public boolean getAsmEnabled() {
        return this.fieldSerializerConfig.isUseAsm();
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public ClassResolver getClassResolver() {
        return this.classResolver;
    }

    public ObjectMap getContext() {
        if (this.context == null) {
            this.context = new ObjectMap();
        }
        return this.context;
    }

    public Serializer getDefaultSerializer(Class cls) {
        if (cls != null) {
            Serializer defaultSerializerForAnnotatedType = getDefaultSerializerForAnnotatedType(cls);
            if (defaultSerializerForAnnotatedType != null) {
                return defaultSerializerForAnnotatedType;
            }
            int size = this.defaultSerializers.size();
            for (int i10 = 0; i10 < size; i10++) {
                DefaultSerializerEntry defaultSerializerEntry = this.defaultSerializers.get(i10);
                if (defaultSerializerEntry.type.isAssignableFrom(cls)) {
                    return defaultSerializerEntry.serializerFactory.makeSerializer(this, cls);
                }
            }
            return newDefaultSerializer(cls);
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public Serializer getDefaultSerializerForAnnotatedType(Class cls) {
        if (cls.isAnnotationPresent(DefaultSerializer.class)) {
            return ReflectionSerializerFactory.makeSerializer(this, ((DefaultSerializer) cls.getAnnotation(DefaultSerializer.class)).value(), cls);
        }
        return null;
    }

    public int getDepth() {
        return this.depth;
    }

    public FieldSerializerConfig getFieldSerializerConfig() {
        return this.fieldSerializerConfig;
    }

    public GenericsResolver getGenericsResolver() {
        return this.genericsResolver;
    }

    public ObjectMap getGraphContext() {
        if (this.graphContext == null) {
            this.graphContext = new ObjectMap();
        }
        return this.graphContext;
    }

    public a getInstantiatorStrategy() {
        return this.strategy;
    }

    public int getNextRegistrationId() {
        while (true) {
            int i10 = this.nextRegisterID;
            if (i10 != -2) {
                if (this.classResolver.getRegistration(i10) == null) {
                    return this.nextRegisterID;
                }
                this.nextRegisterID++;
            } else {
                throw new KryoException("No registration IDs are available.");
            }
        }
    }

    public IdentityMap getOriginalToCopyMap() {
        return this.originalToCopy;
    }

    public ReferenceResolver getReferenceResolver() {
        return this.referenceResolver;
    }

    public boolean getReferences() {
        return this.references;
    }

    public Registration getRegistration(Class cls) {
        if (cls != null) {
            Registration registration = this.classResolver.getRegistration(cls);
            if (registration != null) {
                return registration;
            }
            if (Proxy.isProxyClass(cls)) {
                registration = getRegistration(InvocationHandler.class);
            } else if (!cls.isEnum() && Enum.class.isAssignableFrom(cls)) {
                registration = getRegistration(cls.getEnclosingClass());
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                registration = this.classResolver.getRegistration(EnumSet.class);
            } else if (isClosure(cls)) {
                registration = this.classResolver.getRegistration(ClosureSerializer.Closure.class);
            }
            if (registration != null) {
                return registration;
            }
            if (!this.registrationRequired) {
                if (this.warnUnregisteredClasses) {
                    Log.warn(unregisteredClassMessage(cls));
                }
                return this.classResolver.registerImplicit(cls);
            }
            throw new IllegalArgumentException(unregisteredClassMessage(cls));
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public Serializer getSerializer(Class cls) {
        return getRegistration(cls).getSerializer();
    }

    public StreamFactory getStreamFactory() {
        return this.streamFactory;
    }

    public TaggedFieldSerializerConfig getTaggedFieldSerializerConfig() {
        return this.taggedFieldSerializerConfig;
    }

    public boolean isClosure(Class cls) {
        if (cls != null) {
            if (cls.getName().indexOf(47) >= 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public boolean isFinal(Class cls) {
        if (cls != null) {
            if (cls.isArray()) {
                return Modifier.isFinal(Util.getElementClass(cls).getModifiers());
            }
            return Modifier.isFinal(cls.getModifiers());
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public boolean isRegistrationRequired() {
        return this.registrationRequired;
    }

    public boolean isWarnUnregisteredClasses() {
        return this.warnUnregisteredClasses;
    }

    public Serializer newDefaultSerializer(Class cls) {
        return this.defaultSerializer.makeSerializer(this, cls);
    }

    public <T> T newInstance(Class<T> cls) {
        Registration registration = getRegistration(cls);
        id.a instantiator = registration.getInstantiator();
        if (instantiator == null) {
            instantiator = newInstantiator(cls);
            registration.setInstantiator(instantiator);
        }
        return (T) instantiator.newInstance();
    }

    public id.a newInstantiator(Class cls) {
        return this.strategy.newInstantiatorOf(cls);
    }

    public Registration readClass(Input input) {
        if (input != null) {
            try {
                return this.classResolver.readClass(input);
            } finally {
                if (this.depth == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("input cannot be null.");
    }

    public Object readClassAndObject(Input input) {
        Object read;
        if (input != null) {
            beginObject();
            try {
                Registration readClass = readClass(input);
                if (readClass == null) {
                    return null;
                }
                Class type = readClass.getType();
                if (this.references) {
                    readClass.getSerializer().setGenerics(this, null);
                    int readReferenceOrNull = readReferenceOrNull(input, type, false);
                    if (readReferenceOrNull == -1) {
                        Object obj = this.readObject;
                        int i10 = this.depth - 1;
                        this.depth = i10;
                        if (i10 == 0 && this.autoReset) {
                            reset();
                        }
                        return obj;
                    }
                    read = readClass.getSerializer().read(this, input, type);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(read);
                    }
                } else {
                    read = readClass.getSerializer().read(this, input, type);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", read);
                }
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                }
                return read;
            } finally {
                int i12 = this.depth - 1;
                this.depth = i12;
                if (i12 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("input cannot be null.");
    }

    public <T> T readObject(Input input, Class<T> cls) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls != null) {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, false);
                    if (readReferenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t10 = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(t10);
                    }
                } else {
                    t10 = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t10);
                }
                int i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
                return t10;
            } finally {
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls != null) {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, true);
                    if (readReferenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t10 = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(t10);
                    }
                } else {
                    Serializer serializer = getRegistration(cls).getSerializer();
                    if (!serializer.getAcceptsNull() && input.readByte() == 0) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Read", null);
                        }
                        int i10 = this.depth - 1;
                        this.depth = i10;
                        if (i10 == 0 && this.autoReset) {
                            reset();
                        }
                        return null;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t10);
                }
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                }
                return t10;
            } finally {
                int i12 = this.depth - 1;
                this.depth = i12;
                if (i12 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public int readReferenceOrNull(Input input, Class cls, boolean z10) {
        int readVarInt;
        if (cls.isPrimitive()) {
            cls = Util.getWrapperClass(cls);
        }
        boolean useReferences = this.referenceResolver.useReferences(cls);
        if (z10) {
            readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", null);
                }
                this.readObject = null;
                return -1;
            }
            if (!useReferences) {
                this.readReferenceIds.add(-2);
                return this.readReferenceIds.size;
            }
        } else {
            if (!useReferences) {
                this.readReferenceIds.add(-2);
                return this.readReferenceIds.size;
            }
            readVarInt = input.readVarInt(true);
        }
        if (readVarInt == 1) {
            int nextReadId = this.referenceResolver.nextReadId(cls);
            if (Log.TRACE) {
                StringBuilder n10 = k.n("Read initial object reference ", nextReadId, ": ");
                n10.append(Util.className(cls));
                Log.trace("kryo", n10.toString());
            }
            this.readReferenceIds.add(nextReadId);
            return this.readReferenceIds.size;
        }
        int i10 = readVarInt - 2;
        this.readObject = this.referenceResolver.getReadObject(cls, i10);
        if (Log.DEBUG) {
            StringBuilder n11 = k.n("Read object reference ", i10, ": ");
            n11.append(Util.string(this.readObject));
            Log.debug("kryo", n11.toString());
        }
        return -1;
    }

    public void reference(Object obj) {
        int pop;
        if (this.copyDepth > 0) {
            Object obj2 = this.needsCopyReference;
            if (obj2 != null) {
                if (obj != null) {
                    this.originalToCopy.put(obj2, obj);
                    this.needsCopyReference = null;
                    return;
                }
                throw new IllegalArgumentException("object cannot be null.");
            }
            return;
        }
        if (this.references && obj != null && (pop = this.readReferenceIds.pop()) != -2) {
            this.referenceResolver.setReadObject(pop, obj);
        }
    }

    public Registration register(Class cls) {
        Registration registration = this.classResolver.getRegistration(cls);
        return registration != null ? registration : register(cls, getDefaultSerializer(cls));
    }

    public void reset() {
        this.depth = 0;
        ObjectMap objectMap = this.graphContext;
        if (objectMap != null) {
            objectMap.clear();
        }
        this.classResolver.reset();
        if (this.references) {
            this.referenceResolver.reset();
            this.readObject = null;
        }
        this.copyDepth = 0;
        IdentityMap identityMap = this.originalToCopy;
        if (identityMap != null) {
            identityMap.clear(2048);
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Object graph complete.");
        }
    }

    @Deprecated
    public void setAsmEnabled(boolean z10) {
        this.fieldSerializerConfig.setUseAsm(z10);
    }

    public void setAutoReset(boolean z10) {
        this.autoReset = z10;
    }

    public void setClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            this.classLoader = classLoader;
            return;
        }
        throw new IllegalArgumentException("classLoader cannot be null.");
    }

    public void setCopyReferences(boolean z10) {
        this.copyReferences = z10;
    }

    public void setDefaultSerializer(SerializerFactory serializerFactory) {
        if (serializerFactory != null) {
            this.defaultSerializer = serializerFactory;
            return;
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public void setInstantiatorStrategy(a aVar) {
        this.strategy = aVar;
    }

    public void setMaxDepth(int i10) {
        if (i10 > 0) {
            this.maxDepth = i10;
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0.");
    }

    public void setReferenceResolver(ReferenceResolver referenceResolver) {
        if (referenceResolver != null) {
            this.references = true;
            this.referenceResolver = referenceResolver;
            if (Log.TRACE) {
                Log.trace("kryo", "Reference resolver: ".concat(referenceResolver.getClass().getName()));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("referenceResolver cannot be null.");
    }

    public boolean setReferences(boolean z10) {
        if (z10 == this.references) {
            return z10;
        }
        this.references = z10;
        if (z10 && this.referenceResolver == null) {
            this.referenceResolver = new MapReferenceResolver();
        }
        if (Log.TRACE) {
            Log.trace("kryo", "References: " + z10);
        }
        return !z10;
    }

    public void setRegistrationRequired(boolean z10) {
        this.registrationRequired = z10;
        if (Log.TRACE) {
            Log.trace("kryo", "Registration required: " + z10);
        }
    }

    public void setStreamFactory(StreamFactory streamFactory) {
        this.streamFactory = streamFactory;
    }

    public void setWarnUnregisteredClasses(boolean z10) {
        this.warnUnregisteredClasses = z10;
        if (Log.TRACE) {
            Log.trace("kryo", "Warn unregistered classes: " + z10);
        }
    }

    public String unregisteredClassMessage(Class cls) {
        return "Class is not registered: " + Util.className(cls) + "\nNote: To register this class use: kryo.register(" + Util.className(cls) + ".class);";
    }

    public Registration writeClass(Output output, Class cls) {
        if (output != null) {
            try {
                return this.classResolver.writeClass(output, cls);
            } finally {
                if (this.depth == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("output cannot be null.");
    }

    public void writeClassAndObject(Output output, Object obj) {
        int i10;
        boolean z10;
        if (output != null) {
            beginObject();
            try {
                if (obj == null) {
                    writeClass(output, null);
                    if (i10 == 0) {
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                Registration writeClass = writeClass(output, obj.getClass());
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    writeClass.getSerializer().setGenerics(this, null);
                    int i11 = this.depth - 1;
                    this.depth = i11;
                    if (i11 == 0 && this.autoReset) {
                        reset();
                        return;
                    }
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                writeClass.getSerializer().write(this, output, obj);
                int i12 = this.depth - 1;
                this.depth = i12;
                if (i12 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("output cannot be null.");
    }

    public void writeObject(Output output, Object obj) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        if (obj != null) {
            beginObject();
            try {
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    getRegistration(obj.getClass()).getSerializer().setGenerics(this, null);
                    if (i10 == 0) {
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                getRegistration(obj.getClass()).getSerializer().write(this, output, obj);
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("object cannot be null.");
    }

    public void writeObjectOrNull(Output output, Object obj, Class cls) {
        int i10;
        boolean z10;
        if (output != null) {
            beginObject();
            try {
                Serializer serializer = getRegistration(cls).getSerializer();
                if (this.references) {
                    if (writeReferenceOrNull(output, obj, true)) {
                        serializer.setGenerics(this, null);
                        if (i10 == 0) {
                            if (z10) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else if (!serializer.getAcceptsNull()) {
                    if (obj == null) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Write", obj);
                        }
                        output.writeByte((byte) 0);
                        int i11 = this.depth - 1;
                        this.depth = i11;
                        if (i11 == 0 && this.autoReset) {
                            reset();
                            return;
                        }
                        return;
                    }
                    output.writeByte((byte) 1);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                serializer.write(this, output, obj);
                int i12 = this.depth - 1;
                this.depth = i12;
                if (i12 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("output cannot be null.");
    }

    public boolean writeReferenceOrNull(Output output, Object obj, boolean z10) {
        if (obj == null) {
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", null);
            }
            output.writeVarInt(0, true);
            return true;
        }
        if (!this.referenceResolver.useReferences(obj.getClass())) {
            if (z10) {
                output.writeVarInt(1, true);
            }
            return false;
        }
        int writtenId = this.referenceResolver.getWrittenId(obj);
        if (writtenId != -1) {
            if (Log.DEBUG) {
                StringBuilder n10 = k.n("Write object reference ", writtenId, ": ");
                n10.append(Util.string(obj));
                Log.debug("kryo", n10.toString());
            }
            output.writeVarInt(writtenId + 2, true);
            return true;
        }
        int addWrittenObject = this.referenceResolver.addWrittenObject(obj);
        output.writeVarInt(1, true);
        if (Log.TRACE) {
            StringBuilder n11 = k.n("Write initial object reference ", addWrittenObject, ": ");
            n11.append(Util.string(obj));
            Log.trace("kryo", n11.toString());
        }
        return false;
    }

    public Kryo(ReferenceResolver referenceResolver) {
        this(new DefaultClassResolver(), referenceResolver, new DefaultStreamFactory());
    }

    public Kryo(ClassResolver classResolver, ReferenceResolver referenceResolver) {
        this(classResolver, referenceResolver, new DefaultStreamFactory());
    }

    public Registration register(Class cls, int i10) {
        Registration registration = this.classResolver.getRegistration(cls);
        return registration != null ? registration : register(cls, getDefaultSerializer(cls), i10);
    }

    public void setDefaultSerializer(Class<? extends Serializer> cls) {
        if (cls != null) {
            this.defaultSerializer = new ReflectionSerializerFactory(cls);
            return;
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public Kryo(ClassResolver classResolver, ReferenceResolver referenceResolver, StreamFactory streamFactory) {
        this.defaultSerializer = new ReflectionSerializerFactory(FieldSerializer.class);
        ArrayList<DefaultSerializerEntry> arrayList = new ArrayList<>(33);
        this.defaultSerializers = arrayList;
        this.classLoader = getClass().getClassLoader();
        this.strategy = new DefaultInstantiatorStrategy();
        this.maxDepth = Integer.MAX_VALUE;
        this.autoReset = true;
        this.readReferenceIds = new IntArray(0);
        this.copyReferences = true;
        this.genericsResolver = new GenericsResolver();
        this.fieldSerializerConfig = new FieldSerializerConfig();
        this.taggedFieldSerializerConfig = new TaggedFieldSerializerConfig();
        if (classResolver != null) {
            this.classResolver = classResolver;
            classResolver.setKryo(this);
            this.streamFactory = streamFactory;
            streamFactory.setKryo(this);
            this.referenceResolver = referenceResolver;
            if (referenceResolver != null) {
                referenceResolver.setKryo(this);
                this.references = true;
            }
            addDefaultSerializer(byte[].class, DefaultArraySerializers.ByteArraySerializer.class);
            addDefaultSerializer(char[].class, DefaultArraySerializers.CharArraySerializer.class);
            addDefaultSerializer(short[].class, DefaultArraySerializers.ShortArraySerializer.class);
            addDefaultSerializer(int[].class, DefaultArraySerializers.IntArraySerializer.class);
            addDefaultSerializer(long[].class, DefaultArraySerializers.LongArraySerializer.class);
            addDefaultSerializer(float[].class, DefaultArraySerializers.FloatArraySerializer.class);
            addDefaultSerializer(double[].class, DefaultArraySerializers.DoubleArraySerializer.class);
            addDefaultSerializer(boolean[].class, DefaultArraySerializers.BooleanArraySerializer.class);
            addDefaultSerializer(String[].class, DefaultArraySerializers.StringArraySerializer.class);
            addDefaultSerializer(Object[].class, DefaultArraySerializers.ObjectArraySerializer.class);
            addDefaultSerializer(KryoSerializable.class, DefaultSerializers.KryoSerializableSerializer.class);
            addDefaultSerializer(BigInteger.class, DefaultSerializers.BigIntegerSerializer.class);
            addDefaultSerializer(BigDecimal.class, DefaultSerializers.BigDecimalSerializer.class);
            addDefaultSerializer(Class.class, DefaultSerializers.ClassSerializer.class);
            addDefaultSerializer(Date.class, DefaultSerializers.DateSerializer.class);
            addDefaultSerializer(Enum.class, DefaultSerializers.EnumSerializer.class);
            addDefaultSerializer(EnumSet.class, DefaultSerializers.EnumSetSerializer.class);
            addDefaultSerializer(Currency.class, DefaultSerializers.CurrencySerializer.class);
            addDefaultSerializer(StringBuffer.class, DefaultSerializers.StringBufferSerializer.class);
            addDefaultSerializer(StringBuilder.class, DefaultSerializers.StringBuilderSerializer.class);
            addDefaultSerializer(Collections.EMPTY_LIST.getClass(), DefaultSerializers.CollectionsEmptyListSerializer.class);
            addDefaultSerializer(Collections.EMPTY_MAP.getClass(), DefaultSerializers.CollectionsEmptyMapSerializer.class);
            addDefaultSerializer(Collections.EMPTY_SET.getClass(), DefaultSerializers.CollectionsEmptySetSerializer.class);
            addDefaultSerializer(Collections.singletonList(null).getClass(), DefaultSerializers.CollectionsSingletonListSerializer.class);
            addDefaultSerializer(Collections.singletonMap(null, null).getClass(), DefaultSerializers.CollectionsSingletonMapSerializer.class);
            addDefaultSerializer(Collections.singleton(null).getClass(), DefaultSerializers.CollectionsSingletonSetSerializer.class);
            addDefaultSerializer(TreeSet.class, DefaultSerializers.TreeSetSerializer.class);
            addDefaultSerializer(Collection.class, CollectionSerializer.class);
            addDefaultSerializer(TreeMap.class, DefaultSerializers.TreeMapSerializer.class);
            addDefaultSerializer(Map.class, MapSerializer.class);
            addDefaultSerializer(TimeZone.class, DefaultSerializers.TimeZoneSerializer.class);
            addDefaultSerializer(Calendar.class, DefaultSerializers.CalendarSerializer.class);
            addDefaultSerializer(Locale.class, DefaultSerializers.LocaleSerializer.class);
            addDefaultSerializer(Charset.class, DefaultSerializers.CharsetSerializer.class);
            addDefaultSerializer(URL.class, DefaultSerializers.URLSerializer.class);
            OptionalSerializers.addDefaultSerializers(this);
            TimeSerializers.addDefaultSerializers(this);
            this.lowPriorityDefaultSerializerCount = arrayList.size();
            register(Integer.TYPE, new DefaultSerializers.IntSerializer());
            register(String.class, new DefaultSerializers.StringSerializer());
            register(Float.TYPE, new DefaultSerializers.FloatSerializer());
            register(Boolean.TYPE, new DefaultSerializers.BooleanSerializer());
            register(Byte.TYPE, new DefaultSerializers.ByteSerializer());
            register(Character.TYPE, new DefaultSerializers.CharSerializer());
            register(Short.TYPE, new DefaultSerializers.ShortSerializer());
            register(Long.TYPE, new DefaultSerializers.LongSerializer());
            register(Double.TYPE, new DefaultSerializers.DoubleSerializer());
            register(Void.TYPE, new DefaultSerializers.VoidSerializer());
            return;
        }
        throw new IllegalArgumentException("classResolver cannot be null.");
    }

    public void addDefaultSerializer(Class cls, SerializerFactory serializerFactory) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializerFactory != null) {
            DefaultSerializerEntry defaultSerializerEntry = new DefaultSerializerEntry(cls, serializerFactory);
            ArrayList<DefaultSerializerEntry> arrayList = this.defaultSerializers;
            arrayList.add(arrayList.size() - this.lowPriorityDefaultSerializerCount, defaultSerializerEntry);
            return;
        }
        throw new IllegalArgumentException("serializerFactory cannot be null.");
    }

    public Registration register(Class cls, Serializer serializer) {
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            registration.setSerializer(serializer);
            return registration;
        }
        return this.classResolver.register(new Registration(cls, serializer, getNextRegistrationId()));
    }

    public Registration register(Class cls, Serializer serializer, int i10) {
        if (i10 >= 0) {
            return register(new Registration(cls, serializer, i10));
        }
        throw new IllegalArgumentException(l.i("id must be >= 0: ", i10));
    }

    public void addDefaultSerializer(Class cls, Class<? extends Serializer> cls2) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (cls2 != null) {
            DefaultSerializerEntry defaultSerializerEntry = new DefaultSerializerEntry(cls, new ReflectionSerializerFactory(cls2));
            ArrayList<DefaultSerializerEntry> arrayList = this.defaultSerializers;
            arrayList.add(arrayList.size() - this.lowPriorityDefaultSerializerCount, defaultSerializerEntry);
            return;
        }
        throw new IllegalArgumentException("serializerClass cannot be null.");
    }

    public void writeObject(Output output, Object obj, Serializer serializer) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    serializer.setGenerics(this, null);
                    if (i10 == 0) {
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                serializer.write(this, output, obj);
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public <T> T copy(T t10, Serializer serializer) {
        T t11;
        if (t10 == null) {
            return null;
        }
        if (this.copyShallow) {
            return t10;
        }
        this.copyDepth++;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t12 = (T) this.originalToCopy.get(t10);
            if (t12 != null) {
                return t12;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            if (t10 instanceof KryoCopyable) {
                t11 = (T) ((KryoCopyable) t10).copy(this);
            } else {
                t11 = (T) serializer.copy(this, t10);
            }
            if (this.needsCopyReference != null) {
                reference(t11);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t11);
            }
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
            return t11;
        } finally {
            int i11 = this.copyDepth - 1;
            this.copyDepth = i11;
            if (i11 == 0) {
                reset();
            }
        }
    }

    public <T> T readObject(Input input, Class<T> cls, Serializer serializer) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, false);
                    if (readReferenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(t10);
                    }
                } else {
                    t10 = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t10);
                }
                int i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
                return t10;
            } finally {
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public Registration getRegistration(int i10) {
        return this.classResolver.getRegistration(i10);
    }

    public Registration register(Registration registration) {
        int id2 = registration.getId();
        if (id2 >= 0) {
            Registration registration2 = getRegistration(registration.getId());
            if (Log.DEBUG && registration2 != null && registration2.getType() != registration.getType()) {
                Log.debug("An existing registration with a different type already uses ID: " + registration.getId() + "\nExisting registration: " + registration2 + "\nis now overwritten with: " + registration);
            }
            return this.classResolver.register(registration);
        }
        throw new IllegalArgumentException(l.i("id must be > 0: ", id2));
    }

    public void writeObjectOrNull(Output output, Object obj, Serializer serializer) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    if (writeReferenceOrNull(output, obj, true)) {
                        serializer.setGenerics(this, null);
                        if (i10 == 0) {
                            if (z10) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else if (!serializer.getAcceptsNull()) {
                    if (obj == null) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Write", null);
                        }
                        output.writeByte((byte) 0);
                        int i11 = this.depth - 1;
                        this.depth = i11;
                        if (i11 == 0 && this.autoReset) {
                            reset();
                            return;
                        }
                        return;
                    }
                    output.writeByte((byte) 1);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj);
                }
                serializer.write(this, output, obj);
                int i12 = this.depth - 1;
                this.depth = i12;
                if (i12 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public <T> T copyShallow(T t10, Serializer serializer) {
        T t11;
        if (t10 == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t12 = (T) this.originalToCopy.get(t10);
            if (t12 != null) {
                return t12;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            if (t10 instanceof KryoCopyable) {
                t11 = (T) ((KryoCopyable) t10).copy(this);
            } else {
                t11 = (T) serializer.copy(this, t10);
            }
            if (this.needsCopyReference != null) {
                reference(t11);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t11);
            }
            this.copyShallow = false;
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
            return t11;
        } finally {
            this.copyShallow = false;
            int i11 = this.copyDepth - 1;
            this.copyDepth = i11;
            if (i11 == 0) {
                reset();
            }
        }
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls, Serializer serializer) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    int readReferenceOrNull = readReferenceOrNull(input, cls, true);
                    if (readReferenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                    if (readReferenceOrNull == this.readReferenceIds.size) {
                        reference(t10);
                    }
                } else {
                    if (!serializer.getAcceptsNull() && input.readByte() == 0) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Read", null);
                        }
                        int i10 = this.depth - 1;
                        this.depth = i10;
                        if (i10 == 0 && this.autoReset) {
                            reset();
                        }
                        return null;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t10);
                }
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                }
                return t10;
            } finally {
                int i12 = this.depth - 1;
                this.depth = i12;
                if (i12 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }
}
