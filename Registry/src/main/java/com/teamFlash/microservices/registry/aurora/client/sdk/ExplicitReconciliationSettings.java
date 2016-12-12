/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.teamFlash.microservices.registry.aurora.client.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-10")
public class ExplicitReconciliationSettings implements org.apache.thrift.TBase<ExplicitReconciliationSettings, ExplicitReconciliationSettings._Fields>, java.io.Serializable, Cloneable, Comparable<ExplicitReconciliationSettings> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExplicitReconciliationSettings");

  private static final org.apache.thrift.protocol.TField BATCH_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("batchSize", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExplicitReconciliationSettingsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExplicitReconciliationSettingsTupleSchemeFactory());
  }

  public int batchSize; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BATCH_SIZE((short)1, "batchSize");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BATCH_SIZE
          return BATCH_SIZE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BATCHSIZE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BATCH_SIZE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BATCH_SIZE, new org.apache.thrift.meta_data.FieldMetaData("batchSize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExplicitReconciliationSettings.class, metaDataMap);
  }

  public ExplicitReconciliationSettings() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExplicitReconciliationSettings(ExplicitReconciliationSettings other) {
    __isset_bitfield = other.__isset_bitfield;
    this.batchSize = other.batchSize;
  }

  public ExplicitReconciliationSettings deepCopy() {
    return new ExplicitReconciliationSettings(this);
  }

  @Override
  public void clear() {
    setBatchSizeIsSet(false);
    this.batchSize = 0;
  }

  public int getBatchSize() {
    return this.batchSize;
  }

  public ExplicitReconciliationSettings setBatchSize(int batchSize) {
    this.batchSize = batchSize;
    setBatchSizeIsSet(true);
    return this;
  }

  public void unsetBatchSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BATCHSIZE_ISSET_ID);
  }

  /** Returns true if field batchSize is set (has been assigned a value) and false otherwise */
  public boolean isSetBatchSize() {
    return EncodingUtils.testBit(__isset_bitfield, __BATCHSIZE_ISSET_ID);
  }

  public void setBatchSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BATCHSIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BATCH_SIZE:
      if (value == null) {
        unsetBatchSize();
      } else {
        setBatchSize((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BATCH_SIZE:
      return getBatchSize();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BATCH_SIZE:
      return isSetBatchSize();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExplicitReconciliationSettings)
      return this.equals((ExplicitReconciliationSettings)that);
    return false;
  }

  public boolean equals(ExplicitReconciliationSettings that) {
    if (that == null)
      return false;

    boolean this_present_batchSize = true && this.isSetBatchSize();
    boolean that_present_batchSize = true && that.isSetBatchSize();
    if (this_present_batchSize || that_present_batchSize) {
      if (!(this_present_batchSize && that_present_batchSize))
        return false;
      if (this.batchSize != that.batchSize)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_batchSize = true && (isSetBatchSize());
    list.add(present_batchSize);
    if (present_batchSize)
      list.add(batchSize);

    return list.hashCode();
  }

  @Override
  public int compareTo(ExplicitReconciliationSettings other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBatchSize()).compareTo(other.isSetBatchSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBatchSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.batchSize, other.batchSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExplicitReconciliationSettings(");
    boolean first = true;

    if (isSetBatchSize()) {
      sb.append("batchSize:");
      sb.append(this.batchSize);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExplicitReconciliationSettingsStandardSchemeFactory implements SchemeFactory {
    public ExplicitReconciliationSettingsStandardScheme getScheme() {
      return new ExplicitReconciliationSettingsStandardScheme();
    }
  }

  private static class ExplicitReconciliationSettingsStandardScheme extends StandardScheme<ExplicitReconciliationSettings> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExplicitReconciliationSettings struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BATCH_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.batchSize = iprot.readI32();
              struct.setBatchSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExplicitReconciliationSettings struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBatchSize()) {
        oprot.writeFieldBegin(BATCH_SIZE_FIELD_DESC);
        oprot.writeI32(struct.batchSize);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExplicitReconciliationSettingsTupleSchemeFactory implements SchemeFactory {
    public ExplicitReconciliationSettingsTupleScheme getScheme() {
      return new ExplicitReconciliationSettingsTupleScheme();
    }
  }

  private static class ExplicitReconciliationSettingsTupleScheme extends TupleScheme<ExplicitReconciliationSettings> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExplicitReconciliationSettings struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBatchSize()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBatchSize()) {
        oprot.writeI32(struct.batchSize);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExplicitReconciliationSettings struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.batchSize = iprot.readI32();
        struct.setBatchSizeIsSet(true);
      }
    }
  }

}
