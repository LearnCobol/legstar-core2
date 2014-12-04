package com.legstar.jaxb.converter.gen;

import com.legstar.base.type.composite.CobolComplexType;
import com.legstar.base.visitor.InvalidComplexTypeFieldIndex;
import com.legstar.base.visitor.InvalidComplexTypeName;
import com.legstar.jaxb.converter.JaxbWrapper;
import com.legstar.jaxb.converter.JaxbWrapperFactory;

public class Stru01RecordJaxbFactory implements JaxbWrapperFactory {

    public JaxbWrapper<?> create(CobolComplexType type) {
        if ("Stru01Record".equals(type.getName())) {
            return new Stru01RecordWrapper();
        } else if("ComSubRecord".equals(type.getName())) {
            return new ComSubRecordWrapper();
        } else {
            throw new InvalidComplexTypeName(type.getName());
        }
    }

    public JaxbWrapper < ? > create(CobolComplexType type, Object jaxb) {
        if ("Stru01Record".equals(type.getName())) {
            return new Stru01RecordWrapper((legstar.test.jaxb.stru01.Stru01Record) jaxb);
        } else if("ComSubRecord".equals(type.getName())) {
            return new ComSubRecordWrapper((legstar.test.jaxb.stru01.ComSubRecord) jaxb);
        } else {
            throw new InvalidComplexTypeName(type.getName());
        }
    }

    public class Stru01RecordWrapper extends JaxbWrapper<legstar.test.jaxb.stru01.Stru01Record> {

        public Stru01RecordWrapper() {
            this(new legstar.test.jaxb.stru01.Stru01Record());
        }

        public Stru01RecordWrapper(legstar.test.jaxb.stru01.Stru01Record jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value) {
            switch (index) {
            case 0:
                getJaxb().setComNumber(((Number) value).longValue());
                break;
            case 1:
                getJaxb().setComName((String) value);
                break;
            case 2:
                getJaxb().setComAmount((java.math.BigDecimal) value);
                break;
            case 3:
                getJaxb().setComSubRecord(((ComSubRecordWrapper) value).getJaxb());
                break;
            default:
                throw new InvalidComplexTypeFieldIndex("Stru01Record", index);
            }
        }

        public Object get(int index) {
            switch (index) {
            case 0:
                return Long.valueOf(getJaxb().getComNumber());
            case 1:
                return getJaxb().getComName();
            case 2:
                return getJaxb().getComAmount();
             case 3:
                return new ComSubRecordWrapper(getJaxb().getComSubRecord());
            default:
                throw new InvalidComplexTypeFieldIndex("Stru01Record", index);
            }
        }
        

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("comNumber=");
            builder.append(getJaxb().getComNumber());
            builder.append(", ");
            builder.append("comName=");
            builder.append(getJaxb().getComName());
            builder.append(", ");
            builder.append("comAmount=");
            builder.append(getJaxb().getComAmount());
            builder.append(", ");
            builder.append("comSubRecord=");
            builder.append(new ComSubRecordWrapper(getJaxb().getComSubRecord()));
            builder.append("}");
            return builder.toString();
        }

    }

    public class ComSubRecordWrapper extends JaxbWrapper<legstar.test.jaxb.stru01.ComSubRecord> {

        public ComSubRecordWrapper() {
            this(new legstar.test.jaxb.stru01.ComSubRecord());
        }

        public ComSubRecordWrapper(legstar.test.jaxb.stru01.ComSubRecord jaxb) {
            super(jaxb);
        }

        public void set(int index, Object value) {

            switch (index) {
            case 0:
                getJaxb().setComItem1((Short) value);
                break;
            case 1:
                getJaxb().setComItem2((String) value);
                break;
            default:
                throw new InvalidComplexTypeFieldIndex("ComSubRecord", index);
            }

        }

        public Object get(int index) {
            switch (index) {
            case 0:
                return Long.valueOf(getJaxb().getComItem1());
            case 1:
                return getJaxb().getComItem2();
            default:
                throw new InvalidComplexTypeFieldIndex("ComSubRecord", index);
            }
        }

        @Override
        public String toString() {
            if (getJaxb() == null) {
                return "{}";
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append("comItem1=");
            builder.append(getJaxb().getComItem1());
            builder.append(", ");
            builder.append("comItem2=");
            builder.append(getJaxb().getComItem2());
            builder.append("}");
            return builder.toString();
        }   

    }
}
