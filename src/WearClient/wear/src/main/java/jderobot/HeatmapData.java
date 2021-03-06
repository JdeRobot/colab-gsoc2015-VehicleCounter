// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `heatmap.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public class HeatmapData extends Ice.ObjectImpl
{
    public HeatmapData()
    {
    }

    public HeatmapData(boolean state, int curcp, float curvel, int curfreq)
    {
        this.state = state;
        this.curcp = curcp;
        this.curvel = curvel;
        this.curfreq = curfreq;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new HeatmapData();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::HeatmapData"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.writeBool(state);
        __os.writeInt(curcp);
        __os.writeFloat(curvel);
        __os.writeInt(curfreq);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        state = __is.readBool();
        curcp = __is.readInt();
        curvel = __is.readFloat();
        curfreq = __is.readInt();
        __is.endReadSlice();
    }

    public boolean state;

    public int curcp;

    public float curvel;

    public int curfreq;

    public static final long serialVersionUID = -5618650668647027531L;
}
